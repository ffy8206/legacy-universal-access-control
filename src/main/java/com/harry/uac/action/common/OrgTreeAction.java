package com.harry.uac.action.common;

import java.util.List;

import com.harry.uac.action.ActionBase;
import com.harry.uac.common.util.Page;
import com.harry.uac.persistence.AuthOrg;
import com.harry.uac.persistence.AuthOrgExample;
import com.harry.uac.service.CommonService;
import com.harry.uac.service.IOrgService;
import net.sf.json.JSONArray;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Org Tree dialog generation Action
 * 
 * @author xm
 * 
 */
public class OrgTreeAction extends ActionBase {

    private String orgTreeData;// json data for org tree
    private String json4queriedOrgs;
    
    @Autowired
    private IOrgService orgService;
    // private LogUtil logger;
    // private String testjson =
    // "{'orgID':'-1','orgCodeNo':'','orgName':'中国移动设计院','children':[]}";
    private Long parentOrgId; // The id of the org that user wants to search
	                      // itself and its children

    @Action(value = "showOrgTreeDialog", results = { @Result(name = "showOrgTreeDialog", location = "orgTree.jsp") })
    public String showTreeDialog() {
	this.loadPerPage();
	// this.parentOrgId = Consts.PREDEFINED_ROOTORG_ID;
	if (this.getParameterValue("parentOrgId") != null)
	    parentOrgId = Long.parseLong(this.getParameterValue("parentOrgId").toString());
	return "showOrgTreeDialog";
    }

    @Action(value = "getOrgTreeJsonData", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "orgTreeData" }) })
    public String getOrgTreeJsonData() {
	// logger = LogUtil.getLogger(this.getClass());
	this.orgTreeData = CommonService.getOrgTreeJsonData(parentOrgId);
	// logger.logDebug(this.orgTreeData);
	// this.orgTreeData = testjson;
	return SUCCESS;
    }

    @Action(value = "queryOrgInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "json4queriedOrgs" }) })
    public String queryOrgInfo() {
	AuthOrgExample criteria = searchCondition();
	List<AuthOrg> orgs = orgService.onePageOrg(criteria).getDataList();
	JSONArray array = JSONArray.fromObject(orgs);
	this.json4queriedOrgs = array.toString();
	return SUCCESS;
    }

    @Action(value = "getOrgZTreeJsonData", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "orgTreeData" }) })
    public String getOrgZTreeJsonData() {
	if (StringUtils.isNotBlank(this.getParameterValue("parentOrgId").toString()))
	    parentOrgId = Long.parseLong(this.getParameterValue("parentOrgId").toString());
	this.orgTreeData = CommonService.getOrgZTreeJsonData(parentOrgId);
	return SUCCESS;
    }

    /**
     * initialize search condition and page parameter
     * 
     * @return AuthOrgExample criteria
     */
    private AuthOrgExample searchCondition() {
	AuthOrgExample criteria = new AuthOrgExample();
	// initialize search condition
	AuthOrgExample.Criteria c = criteria.createCriteria();
	if (getParameterValue("criteria_orgName") != null) {
	    c.andOrgNameEqualTo((String) getParameterValue("criteria_orgName"));
	}

	// initialize pagination parameter
	int pageNum = 1, numPerPage = 20;
	if (getParameterValue("pageNum") != null) {
	    pageNum = Integer.valueOf((String) getParameterValue("pageNum"));
	    numPerPage = Integer.valueOf((String) getParameterValue("numPerPage"));
	}
	Page page = new Page((pageNum - 1) * numPerPage + 1, numPerPage);
	criteria.setPage(page);
	return criteria;
    }

    public void setOrgTreeData(String orgTreeData) {
	this.orgTreeData = orgTreeData;
    }

    public String getOrgTreeData() {
	return orgTreeData;
    }

    public Long getParentOrgId() {
	return parentOrgId;
    }

    public void setParentOrgId(Long parentOrgId) {
	this.parentOrgId = parentOrgId;
    }

    public void setJson4queriedOrgs(String json4queriedOrgs) {
	this.json4queriedOrgs = json4queriedOrgs;
    }

    public String getJson4queriedOrgs() {
	return json4queriedOrgs;
    }

    /**
	 * 
	 */
    private static final long serialVersionUID = -2987666695540258915L;

}
