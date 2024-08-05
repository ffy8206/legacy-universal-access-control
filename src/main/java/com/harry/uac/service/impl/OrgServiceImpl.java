package com.harry.uac.service.impl;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import com.harry.uac.dao.AuthOrgMapper;
import com.harry.uac.dao.SyncIncFieldsInfoMapper;
import com.harry.uac.dao.SyncIncInfoMapper;
import com.harry.uac.persistence.AuthOrg;
import com.harry.uac.persistence.AuthOrgExample;
import com.harry.uac.persistence.SyncIncFieldsInfo;
import com.harry.uac.persistence.SyncIncInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.Consts;
import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.exception.BusinessException;
import com.harry.uac.common.util.CommonUtil;
import com.harry.uac.common.util.ExtendDataUtil;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.service.IOrgService;

@Service("orgService")
public class OrgServiceImpl implements IOrgService {

    @Autowired
    private AuthOrgMapper orgDAO;

    @Autowired
    private SyncIncInfoMapper syncInfoDAO;

    @Autowired
    private SyncIncFieldsInfoMapper syncIncFieldsDAO;

    @Override
    public List<AuthOrg> findAll(AuthOrgExample criteria) {
	return orgDAO.selectByExample(criteria);
    }

    @Override
    public void insertOrg(AuthOrg orgInfo) {
	// insertAddSyncInfo(orgInfo);
	// add layer code
	orgInfo.setOrgLayerCode(calcOrgLayerCode(orgInfo.getOrgParentId()));
	orgInfo.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
	orgInfo.setCreateTime(new Date());
	orgInfo.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	orgInfo.setUpdateTime(new Date());
	orgDAO.insert(orgInfo);
	deletAndinsertTag(orgInfo);
	// CommonUtil.generateAuditInfo(Consts.AUDIT_TYPE_INSERT, Consts.AUDIT_LEVEL_NORMAL,
	// "新增组织["+orgInfo.getOrgName()+"]成功！");
    }

    @Override
    public int deleteOrg(Long orgId) {
	// insertDeleteSyncInfo(orgId);
	return orgDAO.deleteByPrimaryKey(orgId);
	// CommonUtil.generateAuditInfo(Consts.AUDIT_TYPE_DELETE,Consts.AUDIT_LEVEL_NORMAL, "删除组织["+
	// orgOldInfo.getOrgName()+"]成功！");
    }

    @Override
    public void updateOrg(AuthOrg orgInfo) {
	AuthOrg orgOldInfo = orgDAO.selectByPrimaryKey(orgInfo.getOrgId());
	// insertUpdateSyncInfo(orgInfo, orgOldInfo);
	if (StringUtils.isNotBlank(orgInfo.getOrgParentId())
	                && !orgInfo.getOrgParentId().equals(orgOldInfo.getOrgParentId())) {
	    orgInfo.setOrgLayerCode(calcOrgLayerCode(orgInfo.getOrgParentId()));
	}
	orgInfo.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	orgInfo.setUpdateTime(new Date());
	orgDAO.updateByPrimaryKeySelective(orgInfo);
	deletAndinsertTag(orgInfo);
	// CommonUtil.generateAuditInfo(Consts.AUDIT_TYPE_UPDATE, Consts.AUDIT_LEVEL_NORMAL,
	// "修改组织["+orgInfo.getOrgName()+"]成功！");
    }

    @Override
    public AuthOrg findSingleOrg(Long orgId) {
	AuthOrg org = orgDAO.selectByPrimaryKey(orgId);

	List<Map<String, Object>> tags = ExtendDataUtil.selectExtendData(Consts.EXTEND_DATA_TYPE_ORG_TAG,
	                orgId.toString());
	String delim = "";
	StringBuffer sb = new StringBuffer();
	for (Map<String, Object> tagMap: tags) {
	    sb.append(delim).append(tagMap.get(Consts.EXTEND_DATA_KEY_VALUE));
	    delim = ",";
	}
	org.setTag(sb.toString());
	return org;
    }

    @Override
    public OnePage<AuthOrg> onePageOrg(AuthOrgExample criteria) {
	int count = orgDAO.countByExample(criteria);
	List<AuthOrg> data = orgDAO.selectPaginationByExample(criteria);
	OnePage<AuthOrg> onepage = new OnePage<AuthOrg>();
	criteria.getPage().setCount(count);
	onepage.setPage(criteria.getPage());
	onepage.setDataList(data);
	return onepage;
    }

    /**
     * calculate org_layer_code from parentCode
     * 
     * @param parentCode
     * @return current available layer_code
     */
    private String calcOrgLayerCode(String parentCode) {
	// 根节点
	if (StringUtils.isBlank(parentCode)) {
	    String likeParam = "____";
	    String currentRootMax = orgDAO.maxLayerCode(likeParam);
	    if (currentRootMax == null) {
		return "0001";
	    } else {
		return String.format("%04d", Integer.parseInt(currentRootMax) + 1);
	    }
	}
	AuthOrgExample example = new AuthOrgExample();
	AuthOrgExample.Criteria c = example.createCriteria();
	c.andOrgCodeEqualTo(parentCode);
	List<AuthOrg> orgList = orgDAO.selectByExample(example);
	if (orgList.size() != 1) {
	    throw new BusinessException("上级组织编码不唯一");
	}
	AuthOrg o = orgList.get(0);
	String likeParam = o.getOrgLayerCode() + "____";
	String currentMax = orgDAO.maxLayerCode(likeParam);
	if (currentMax == null) {
	    // the first child
	    return o.getOrgLayerCode() + "0001";
	} else {
	    Integer val = Integer.valueOf(currentMax.substring(currentMax.length() - 4, currentMax.length())) + 1;
	    String parentLayer = currentMax.substring(0, currentMax.length() - 4);
	    String currentLayer = String.format("%04d", val);
	    return parentLayer + currentLayer;
	}
    }

    /**
     * insert tag
     * 
     * @param org
     */
    private void deletAndinsertTag(AuthOrg org) {
	StringTokenizer st = new StringTokenizer(org.getTag(), ",");
	Long typeId = ExtendDataUtil.selectOrInsertDataExtendType(Consts.EXTEND_DATA_TYPE_ORG_TAG);
	Map<String, Long> delMap = new HashMap<String, Long>();
	delMap.put(Consts.EXTEND_DATA_KEY_SOURCEID, org.getOrgId());
	delMap.put(Consts.EXTEND_DATA_KEY_DATATYPEID, typeId);
	ExtendDataUtil.deleteExtendData(delMap);
	while (st.hasMoreElements()) {
	    // delete exists tag
	    // insert
	    Map<String, String> value = new HashMap<String, String>();
	    value.put(Consts.EXTEND_DATA_KEY_DATATYPEID, typeId.toString());
	    value.put(Consts.EXTEND_DATA_KEY_SOURCEID, org.getOrgId().toString());// ORG_ID
	    value.put(Consts.EXTEND_DATA_KEY_VALUE, (String) st.nextElement());
	    ExtendDataUtil.insertExtendData(value);
	}
    }

    private void insertAddSyncInfo(AuthOrg orgInfo) {
	SyncIncInfo record = new SyncIncInfo();
	record.setOperateObjectId(orgInfo.getOrgId());
	record.setOperateObject("AUTH_ORG");
	record.setOperateType(Short.valueOf(Consts.SYNC_CONSTS_ADD));
	record.setCreateTime(new Date());
	syncInfoDAO.insert(record);
    }

    private void insertUpdateSyncInfo(AuthOrg orgInfo, AuthOrg orgOldInfo) {
	SyncIncInfo record = new SyncIncInfo();
	record.setOperateObjectId(orgInfo.getOrgId());
	record.setOperateObject("AUTH_ORG");
	record.setOperateType(Short.valueOf(Consts.SYNC_CONSTS_ADD));
	record.setCreateTime(new Date());
	syncInfoDAO.insert(record);
	insertSyncFileds(orgInfo, orgOldInfo, record.getSyncId(), Consts.SYNC_CONSTS_UPDATE);
    }

    private void insertDeleteSyncInfo(Long orgId) {
	SyncIncInfo record = new SyncIncInfo();
	record.setOperateObjectId(orgId);
	record.setOperateObject("AUTH_ORG");
	record.setOperateType(Short.valueOf(Consts.SYNC_CONSTS_DELETE));
	record.setCreateTime(new Date());
	syncInfoDAO.insert(record);
    }

    /**
     * insert into sync_inc_fields_info
     * 
     * @param orgInfo current org
     * @param oldOrgInfo old org
     * @param syncId syncId
     * @param type operateType
     */
    private void insertSyncFileds(AuthOrg orgInfo, AuthOrg oldOrgInfo, Long syncId, String type) {
	// SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date currentDate = new Date();
	Field[] orgfields = orgInfo.getClass().getDeclaredFields();
	try {
	    for (int i = 0; i < orgfields.length; i++) {
		if (orgfields[i].getName().equals("tag") || orgfields[i].getName().equals("createUserId")
		                || orgfields[i].getName().equals("createTime")
		                || orgfields[i].getName().equals("updateUserId")
		                || orgfields[i].getName().equals("updateTime")
		                || orgfields[i].getName().equals("orgLayerCode")) {
		    continue;
		}
		orgfields[i].setAccessible(true);
		SyncIncFieldsInfo field1 = new SyncIncFieldsInfo();
		if (Consts.SYNC_CONSTS_ADD.equals(type)) {
		    field1.setSyncFieldsPreValue(null);
		} else if (Consts.SYNC_CONSTS_UPDATE.equals(type)) {
		    if (!CommonUtil.compareTwoObject(orgfields[i].get(orgInfo), orgfields[i].get(oldOrgInfo))) {
			if (orgfields[i].get(oldOrgInfo) != null) {
			    String preVal = "";
			    if (orgfields[i].get(oldOrgInfo) instanceof Date) {
				preVal = Consts.sFormat.format((Date) orgfields[i].get(oldOrgInfo));
			    } else {
				preVal = orgfields[i].get(oldOrgInfo).toString();
			    }
			    field1.setSyncFieldsPreValue(preVal);
			} else {
			    field1.setSyncFieldsPreValue(null);
			}
		    } else {
			continue;
		    }
		}
		field1.setSyncId(syncId);
		field1.setSyncFieldsName(Consts.orgColumnBeanMap.get(orgfields[i].getName()));
		if (orgfields[i].get(orgInfo) == null) {
		    field1.setSyncFieldsCurValue(null);
		} else {
		    String curVal = "";
		    if (orgfields[i].get(orgInfo) instanceof Date) {
			curVal = Consts.sFormat.format((Date) orgfields[i].get(orgInfo));
		    } else {
			curVal = orgfields[i].get(orgInfo).toString();
		    }
		    field1.setSyncFieldsCurValue(curVal);
		}
		field1.setSyncFieldsType(Short.valueOf(Consts.SYNC_CONSTS_ADD));
		field1.setSyncFiledsTable("AUTH_ORG");
		field1.setCreateTime(currentDate);
		syncIncFieldsDAO.insert(field1);
	    }
	} catch (IllegalAccessException e) {
	    throw new BusinessException("非法访问对象异常！", e);
	}
    }

}
