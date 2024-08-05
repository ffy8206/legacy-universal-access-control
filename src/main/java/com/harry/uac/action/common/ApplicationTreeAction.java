package com.harry.uac.action.common;

import java.util.List;

import com.harry.uac.action.ActionBase;
import com.harry.uac.dao.AuthApplicationMapper;
import com.harry.uac.persistence.AuthApplication;
import com.harry.uac.persistence.AuthApplicationExample;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Org Tree dialog generation Action
 * 
 * @author xm
 * 
 */
public class ApplicationTreeAction extends ActionBase {

    /**
	 * 
	 */
    private static final long serialVersionUID = -5014835502453289844L;
    
    @Autowired
    private AuthApplicationMapper applicationDAOBean;
    private String treeData;
    private final static String jsonZTreeTemplate = "{'id' : '{0}', 'pId' : '{1}', 'name' : '{2}', 'open' : '{3}', 'click' : \"appTreeNodeSel({4})\", 'isParent' : '{5}'}";

    @Action(value = "getAppZTreeJsonData", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "treeData" }) })
    public String getAppZTreeJsonData() {
	AuthApplicationExample example = new AuthApplicationExample();
	AuthApplicationExample.Criteria c = example.createCriteria();
	List<AuthApplication> appList = applicationDAOBean.selectByExample(example);
	StringBuilder strB = new StringBuilder(
	                "{'id' : '0', 'pId' : '0', 'name' : '应用系统选择', 'open' : 'true', 'click' : \"appTreeNodeSel('','','')\", 'isParent' : 'true'},");
	if (appList != null && appList.size() > 0) {
	    for (AuthApplication app: appList) {
		String pNode = strFormatter4Json(jsonZTreeTemplate, app.getApplicationId(), "0",
		                app.getApplicationName(), "false",
		                "'" + app.getApplicationId() + "','" + app.getApplicationName() + "'", "false");
		strB.append(pNode + ",");
	    }
	    strB.deleteCharAt(strB.length() - 1);// remove last comma
	}
	this.treeData = strB.toString();
	return SUCCESS;
    }

    /**
     * MessageFormat.format处理带有{符号的字符串有问题，故用此方法代替
     * 
     * @param str
     * @param object
     * @return
     */
    public static String strFormatter4Json(String str, Object... object) {
	for (int i = 0; i < object.length; i++) {
	    str = str.replace("{" + i + "}", object[i].toString());
	}
	return str;
    }

    public String getTreeData() {
	return treeData;
    }

    public void setTreeData(String treeData) {
	this.treeData = treeData;
    }

}
