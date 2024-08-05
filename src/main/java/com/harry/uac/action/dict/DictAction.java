package com.harry.uac.action.dict;

import java.util.List;

import com.harry.uac.action.ActionBase;
import com.harry.uac.common.Consts;
import com.harry.uac.persistence.Dict;
import com.harry.uac.persistence.DictExample;
import com.harry.uac.service.IDictService;
import com.harry.uac.vo.AjaxDone;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

public class DictAction extends ActionBase {

    @Autowired
    private IDictService dictService;

    private List<Dict> dictList;

    private Dict dict;

    // current tab name, for refresh
    private String rel;
    // dynamic dispaly actinName
    private String actionName;

    private String optTable;

    @Action(value = "manageDict", results = { @Result(name = "success", location = "dict_manage.jsp") })
    public String manageDict() {
	return SUCCESS;
    }

    @Action(value = "queryDict", results = { @Result(name = "success", location = "dict_list.jsp") })
    public String queryDict() {
	if (getParameterValue("optTable") != null) {
	    optTable = (String) getParameterValue("optTable");
	    DictExample criteria = new DictExample();
	    dictList = dictService.findAllDict(criteria, mapTableName(optTable));
	    return SUCCESS;
	} else {
	    AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_ERROR, getText("global.request.error")).build();
	    return ajaxForward(parameAjaxDone);
	}

    }

    @Action(value = "displayDict", results = { @Result(name = "success", location = "dict_add.jsp") })
    public String displayDict() {
	if (getParameterValue("optTable") != null) {
	    optTable = (String) getParameterValue("optTable");
	    String did = (String) getParameterValue("did");
	    if (did != null) {
		// get update data
		dict = dictService.findDict(did, mapTableName(optTable));
		this.rel = "edit_dict";
		this.actionName = "updateDict";
	    } else {
		// add page
		this.rel = "add_dict";
		this.actionName = "saveDict";
	    }
	    return SUCCESS;
	} else {
	    AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_ERROR, getText("global.request.error")).build();
	    return ajaxForward(parameAjaxDone);
	}
    }

    @Action(value = "saveDict")
    public String saveDict() {
	optTable = (String) getParameterValue("optTable");
	if (dictService.findDict(dict.getCode(), mapTableName(optTable)) == null) {
	    dictService.addDict(dict, mapTableName(optTable));
	    String navTab = (String) getParameterValue("navTabId");
	    AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, getText("global.save.success")).navTabId(
		            navTab).build();
	    return ajaxForward(parameAjaxDone);
	} else {
	    AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_ERROR, getText("dict.error.duplicate")).build();
	    return ajaxForward(parameAjaxDone);
	}
    }

    @Action(value = "updateDict")
    public String updateDict() {
	optTable = (String) getParameterValue("optTable");
	dictService.updateDict(dict, mapTableName(optTable));
	String navTab = (String) getParameterValue("navTabId");
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, getText("global.save.success")).navTabId(navTab)
	                .build();
	return ajaxForward(parameAjaxDone);
    }

    @Action(value = "deleteDict")
    public String deleteDict() {
	if (getParameterValue("did") == null) {
	    AjaxDone errorAjaxDone = new AjaxDone.Builder(Consts.AJAX_ERROR, getText("global.request.error")).build();
	    return ajaxForward(errorAjaxDone);
	}
	String code = (String) getParameterValue("did");
	optTable = (String) getParameterValue("optTable");
	dictService.deleteDict(code, mapTableName(optTable));
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, getText("global.delete.success")).navTabId(
	                "dict_list").build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * @param val
     * @return
     */
    private String mapTableName(String val) {
	String tableName = null;
	switch (Integer.valueOf(val)) {
	    case 0:
		tableName = "DICT_ORG_LEVEL";
		break;
	    case 1:
		tableName = "DICT_POLITY";
		break;
	    case 2:
		tableName = "DICT_NATION";
		break;
	    case 3:
		tableName = "DICT_USER_LEVEL";
		break;
	    case 4:
		tableName = "DICT_USER_TYPE";
		break;
	    case 5:
		tableName = "DICT_POSITON_TITLE";
		break;
	    case 6:
		tableName = "DICT_BUSINESS";
		break;
	    default:
		break;
	}
	return tableName;
    }

    /**
	 * 
	 */
    private static final long serialVersionUID = -3876480781145090853L;

    public List<Dict> getDictList() {
	return dictList;
    }

    public void setDictList(List<Dict> dictList) {
	this.dictList = dictList;
    }

    public Dict getDict() {
	return dict;
    }

    public void setDict(Dict dict) {
	this.dict = dict;
    }

    public String getRel() {
	return rel;
    }

    public void setRel(String rel) {
	this.rel = rel;
    }

    public String getActionName() {
	return actionName;
    }

    public void setActionName(String actionName) {
	this.actionName = actionName;
    }

    public String getOptTable() {
	return optTable;
    }

    public void setOptTable(String optTable) {
	this.optTable = optTable;
    }

}
