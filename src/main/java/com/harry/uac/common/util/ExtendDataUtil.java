package com.harry.uac.common.util;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.exception.BusinessException;
import com.harry.uac.dao.ExtendDataMapper;
import com.harry.uac.dao.ExtendDataTypeMapper;
import com.harry.uac.persistence.ExtendData;
import com.harry.uac.persistence.ExtendDataExample;
import com.harry.uac.persistence.ExtendDataType;
import com.harry.uac.persistence.ExtendDataTypeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.harry.uac.common.Consts;

@Component
public class ExtendDataUtil {

    private static ExtendDataMapper extenDataDAO;
    private static ExtendDataTypeMapper extendDataTypeDAO;

    @Autowired
    private ExtendDataMapper extendDataMapper;

    @Autowired
    private ExtendDataTypeMapper extendDataTypeMapper;

    @PostConstruct
    public void init() {
	extenDataDAO = extendDataMapper;
	extendDataTypeDAO = extendDataTypeMapper;
    }

    // private static ExtendDataMapper getExtenDataDAO() {
    // if (null == extenDataDAO) {
    // extenDataDAO = (ExtendDataMapper) ContextUtils.getBean("extendDataMapper");
    // }
    // return extenDataDAO;
    // }
    //
    // private static ExtendDataTypeMapper getExtendDataTypeDAO() {
    // if (null == extendDataTypeDAO) {
    // extendDataTypeDAO = (ExtendDataTypeMapper) ContextUtils.getBean("extendDataTypeMapper");
    // }
    // return extendDataTypeDAO;
    // }

    /**
     * 检查扩展数据是否存在
     * 
     * @param extend_data_type 数组 EXTEND_DATA_TYPE(扩展数据类型) 0： typeName,(扩展数据类型) 1：typeSource,(扩展数据类型来源) 2: typeCode,
     *            (扩展数据类型编码) 3:typeStyle (扩展数据类型分类)
     * 
     * @param value EXTEND_DATA_SOURCEID(扩展数据源ID) EXTEND_DATA(扩展数据)
     * 
     * @return 目前返回 MAP 返回以下key的 (EXTEND_DATA_ID,EXTEND_DATA_VALUE)
     */
    public static List<Map<String, Object>> selectExtendData(String[] extend_data_type, String value) {
	Map<String, String> map = new HashMap<String, String>();
	map.put("typeName", extend_data_type[0]);
	map.put("typeSource", extend_data_type[1]);
	map.put("typeCode", extend_data_type[2]);
	map.put("typeStyle", extend_data_type[3]);
	map.put("sourceId", value);
	return extenDataDAO.checkExtendDataExist(map);
    }

    /**
     * 插入扩展数据类型表 EXTEND_DATA_TYPE(扩展数据类型) EXTEND_DATA(扩展数据)
     * 
     * @param extend_data_type EXTEND_DATA_TYPE(扩展数据类型) 0： typeName,(扩展数据类型) 1：typeSource,(扩展数据类型来源) 2: typeCode,
     *            (扩展数据类型编码) 3:typeStyle (扩展数据类型分类)
     */
    public static Long selectOrInsertDataExtendType(String[] extend_data_type) {
	ExtendDataTypeExample example = new ExtendDataTypeExample();
	ExtendDataTypeExample.Criteria c = example.createCriteria();
	c.andExtendDataTypeNameEqualTo(extend_data_type[0]);
	c.andExtendDataTypeSourceEqualTo(extend_data_type[1]);
	c.andExtendDataTypeCodeEqualTo(extend_data_type[2]);
	c.andExtendDataTypeStyleEqualTo(Integer.valueOf(extend_data_type[3]));
	List<ExtendDataType> dataTypeList = extendDataTypeDAO.selectByExample(example);
	ExtendDataType record = new ExtendDataType();
	// check exists
	if (dataTypeList.size() == 0) {
	    // insert data type only one time
	    record.setExtendDataTypeName(extend_data_type[0]);
	    record.setExtendDataTypeSource(extend_data_type[1]);
	    record.setExtendDataTypeCode(extend_data_type[2]);
	    record.setExtendDataTypeStyle(Integer.valueOf(extend_data_type[3]));
	    record.setCreateTime(new Date());
	    record.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
	    record.setUpdateTime(new Date());
	    record.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	    extendDataTypeDAO.insert(record);
	} else if (dataTypeList.size() == 1) {
	    record.setExtendDataTypeId(dataTypeList.get(0).getExtendDataTypeId());
	} else {
	    throw new BusinessException("扩展数据类型错误");
	}
	return record.getExtendDataTypeId();
    }

    /**
     * @param value EXTEND_DATA(扩展数据) map支持以下key (DATA_SOURCEID, DATA_VALUE, DISPLAY_ORDER,DATA_REMARK)
     */
    public static void insertExtendData(Map<String, String> value) {
	ExtendData data = new ExtendData();
	data.setExtendDataTypeId(Long.valueOf(value.get(Consts.EXTEND_DATA_KEY_DATATYPEID)));
	String source = value.get(Consts.EXTEND_DATA_KEY_SOURCEID);
	data.setExtendDataSourceid(Long.valueOf(source == null ? "0": source));
	data.setExtendDataValue(value.get(Consts.EXTEND_DATA_KEY_VALUE));
	String order = value.get(Consts.EXTEND_DATA_KEY_ORDER);
	data.setExtendDataDisplayOrder(Integer.valueOf(order == null ? "0": order));
	data.setExtendDataRemark(value.get(Consts.EXTEND_DATA_KEY_REMARK));
	data.setCreateTime(new Date());
	data.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
	data.setUpdateTime(new Date());
	data.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	extenDataDAO.insert(data);
    }

    /**
     * 更新扩展数据
     * 
     * @param extendId 扩展数据的主键
     * @param value EXTEND_DATA(扩展数据) map支持以下key (DATA_SOURCEID, DATA_VALUE, DISPLAY_ORDER,DATA_REMARK)
     */
    public static void updateExtendData(Long extendId, Map<String, String> value) {
	ExtendData upd = new ExtendData();
	String source = value.get(Consts.EXTEND_DATA_KEY_SOURCEID);
	upd.setExtendDataSourceid(Long.valueOf(source == null ? "0": source));
	upd.setExtendDataValue(value.get(Consts.EXTEND_DATA_KEY_VALUE));
	String order = value.get(Consts.EXTEND_DATA_KEY_ORDER);
	upd.setExtendDataDisplayOrder(Integer.valueOf(order == null ? "0": order));
	upd.setExtendDataRemark(Consts.EXTEND_DATA_KEY_REMARK);
	upd.setExtendDataId(extendId);
	upd.setUpdateTime(new Date());
	upd.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	extenDataDAO.updateByPrimaryKeySelective(upd);
    }

    public static void deleteExtendData(Map<String, Long> value) {
	ExtendDataExample example = new ExtendDataExample();
	ExtendDataExample.Criteria c = example.createCriteria();
	c.andExtendDataTypeIdEqualTo(value.get(Consts.EXTEND_DATA_KEY_DATATYPEID));
	c.andExtendDataSourceidEqualTo(value.get(Consts.EXTEND_DATA_KEY_SOURCEID));
	extenDataDAO.deleteByExample(example);
    }
}
