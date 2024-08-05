package com.harry.uac.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import com.harry.uac.dao.AuthApplicationMapper;
import com.harry.uac.persistence.AuthApplication;
import com.harry.uac.persistence.AuthApplicationExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.Consts;
import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.util.ExtendDataUtil;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.service.IApplicationService;

@Service("applicationService")
public class ApplicationServiceImpl implements IApplicationService {

    @Autowired
    private AuthApplicationMapper applicationDAO;

    @Override
    public void insertApplication(AuthApplication applicationInfo) {
	applicationInfo.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
	applicationInfo.setCreateTime(new Date());
	applicationInfo.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	applicationInfo.setUpdateTime(new Date());
	applicationDAO.insert(applicationInfo);
	deletAndinsertTag(applicationInfo);
    }

    @Override
    public void deleteApplication(Long applicationId) {
	applicationDAO.deleteByPrimaryKey(applicationId);
    }

    @Override
    public int deleteApplicationWithValidator(Long applicationId) {
	return applicationDAO.deleteByPrimaryKeyWithValidator(applicationId);
    }

    @Override
    public void updateApplication(AuthApplication applicationInfo) {
	// TODO: delete test data
	applicationInfo.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	applicationInfo.setUpdateTime(new Date());
	applicationDAO.updateByPrimaryKey(applicationInfo);
	deletAndinsertTag(applicationInfo);
    }

    @Override
    public OnePage<AuthApplication> onePageApplication(AuthApplicationExample criteria) {
	int count = applicationDAO.countByExample(criteria);
	List<AuthApplication> data = applicationDAO.selectPaginationByExample(criteria);
	OnePage<AuthApplication> onepage = new OnePage<AuthApplication>();
	// page.setTotalCnt(count);
	criteria.getPage().setCount(count);
	onepage.setPage(criteria.getPage());
	onepage.setDataList(data);
	return onepage;
    }

    @Override
    public AuthApplication findSingleApplication(Long applicationId) {
	AuthApplication application = applicationDAO.selectByPrimaryKey(applicationId);
	List<Map<String, Object>> tags = ExtendDataUtil.selectExtendData(Consts.EXTEND_DATA_TYPE_APPLICATION_TAG,
	                applicationId.toString());
	String delim = "";
	StringBuffer sb = new StringBuffer();
	for (Map<String, Object> tagMap: tags) {
	    sb.append(delim).append(tagMap.get(Consts.EXTEND_DATA_KEY_VALUE));
	    delim = ",";
	}
	application.setTag(sb.toString());
	return application;
    }

    @Override
    public List<AuthApplication> findAllApplication(AuthApplicationExample criteria) {
	return applicationDAO.selectByExample(criteria);
    }

    /**
     * insert tag
     * 
     * @param org
     */
    private void deletAndinsertTag(AuthApplication application) {
	StringTokenizer st = new StringTokenizer(application.getTag(), ",");
	Long typeId = ExtendDataUtil.selectOrInsertDataExtendType(Consts.EXTEND_DATA_TYPE_APPLICATION_TAG);
	Map<String, Long> delMap = new HashMap<String, Long>();
	delMap.put(Consts.EXTEND_DATA_KEY_SOURCEID, application.getApplicationId());
	delMap.put(Consts.EXTEND_DATA_KEY_DATATYPEID, typeId);
	ExtendDataUtil.deleteExtendData(delMap);
	while (st.hasMoreElements()) {
	    // delete exists tag
	    // insert
	    Map<String, String> value = new HashMap<String, String>();
	    value.put(Consts.EXTEND_DATA_KEY_DATATYPEID, typeId.toString());
	    value.put(Consts.EXTEND_DATA_KEY_SOURCEID, application.getApplicationId().toString());// ORG_ID
	    value.put(Consts.EXTEND_DATA_KEY_VALUE, (String) st.nextElement());
	    ExtendDataUtil.insertExtendData(value);
	}
    }

}
