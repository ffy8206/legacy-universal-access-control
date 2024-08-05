package com.harry.uac.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.harry.uac.dao.DictMapper;
import com.harry.uac.persistence.Dict;
import com.harry.uac.persistence.DictExample;
import com.harry.uac.persistence.SysParameter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * dict util
 * 
 * @author
 * 
 */
@Component("dictUtil")
public class DictUtil implements ApplicationContextAware {
    private static ApplicationContext context = null;
    private static DictUtil dictUitl = null;
    private static final String SYS_PARAMETER_DICT = "DICT";
    private static Map<String, List<Dict>> dictMap;

    public synchronized static DictUtil getInstance() {
	if (dictUitl == null) {
	    dictUitl = new DictUtil();
	    dictUitl.initDictUtil();
	}
	return dictUitl;
    }

    public void initDictUtil() {
	List<SysParameter> dictTableList = SysParameterUtil.getInstance().getParameterList(SYS_PARAMETER_DICT);
	DictMapper dictDAO = (DictMapper) context.getBean("dictMapper");
	DictExample example = new DictExample();
	dictMap = new HashMap<String, List<Dict>>();
	for (SysParameter para: dictTableList) {
	    List<Dict> list = dictDAO.selectByExample(example, para.getParameterValue());
	    if (list != null) {
		dictMap.put(para.getParameterValue().toUpperCase(), list);
	    }
	}
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	context = applicationContext;
    }

    public Map<String, List<Dict>> getDictMap() {
	return dictMap;
    }

    /**
     * get dict result list By dict table name <br>
     * DictUtil.getDictListByDictTableName("dict_POLITY")
     * 
     * @param tableName
     * @return
     */
    public static List<Dict> getDictListByDictTableName(String tableName) {
	getInstance();
	List<Dict> list = new ArrayList<Dict>();
	if (StringUtils.isNotEmpty(tableName)) {
	    list = dictMap.get(tableName.toUpperCase());
	}
	return list;
    }

    /**
     * get dict display text By dict table name,code <br>
     * DictUtil.getDictDisplayText("DICT_POLITY", "13")
     * 
     * @param tableName
     * @param code
     * @return
     */
    public static String getDictDisplayText(String tableName, String code) {
	getInstance();
	String displayText = "";
	if (StringUtils.isNotEmpty(tableName) && StringUtils.isNotEmpty(code)) {
	    List<Dict> list = dictMap.get(tableName.toUpperCase());
	    if (list != null) {
		for (Dict d: list) {
		    if (d.getCode().equals(code)) {
			displayText = d.getValue();
			break;
		    }
		}
	    }
	}
	return displayText;
    }
}
