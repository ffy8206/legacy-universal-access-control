package com.harry.uac.action.org;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.harry.uac.action.ActionBase;
import com.harry.uac.common.Consts;
import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.util.CommonUtil;
import com.harry.uac.common.util.DictUtil;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.common.util.Page;
import com.harry.uac.persistence.AuditLog;
import com.harry.uac.persistence.AuthOrg;
import com.harry.uac.persistence.AuthOrgExample;
import com.harry.uac.persistence.Dict;
import com.harry.uac.service.IOrgService;
import com.harry.uac.vo.AjaxDone;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * org add, update, delete, query action
 * 
 * @author wangsg
 * 
 */
public class OrgAction extends ActionBase {

    @Autowired
    private IOrgService orgService;
    // for add or edit value
    private AuthOrg org;
    OnePage<AuthOrg> pageData;
    // private List<AbstractUser> userList;
    // current tab name, for refresh
    private String rel;
    // dynamic dispaly actinName
    private String actionName;
    private int val = 0;
    // search criteria
    // private AuthOrgExample criteria;
    private Map<Integer, String> orgStyleCombox = new ConcurrentHashMap<Integer, String>();
    private Map<Integer, String> orgStatusCombox = new ConcurrentHashMap<Integer, String>();

    /**
     * query action display org list.
     * 
     * @return
     */
    @Action(value = "queryOrgInfo", results = { @Result(name = "queryOrgInfo", location = "org_list.jsp") })
    public String queryOrgInfo() {
	loadSelect();
	AuthOrgExample criteria = searchCondition();
	pageData = orgService.onePageOrg(criteria);
	return "queryOrgInfo";
    }

    /**
     * display add/update jsp
     * 
     * @return
     */
    @Action(value = "displayOrg", results = { @Result(name = "displayOrg", location = "org_add.jsp") })
    public String displayOrg() {
	loadSelect();
	String oid = (String) getParameterValue("oid");
	if (oid != null) {
	    // get update data
	    org = orgService.findSingleOrg(Long.valueOf(oid));
	    this.rel = "org_list";
	    this.actionName = "updateOrg";
	} else {
	    // add page
	    this.rel = "org_list";
	    this.actionName = "saveOrg";
	}
	return "displayOrg";
    }

    /**
     * add org action json return identical to dwz.ajax.js { "statusCode":"301", "message":"", "navTabId":"", }
     * 
     * @return
     */
    @Action(value = "saveOrg")
    public String saveOrg() {
	orgService.insertOrg(org);
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_INSERT, Consts.AUDIT_OBJECT_ORG, Consts.AUDIT_LEVEL_NORMAL,
	                "新增组织[" + org.getOrgName() + "]成功！", AppContextHolder.getContext().getUser().getUserId(),
	                org.getCreateTime(), new Date(), new Date());
	CommonUtil.authLog(auditInfo);
	String navTab = (String) getParameterValue("navTabId");
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, getText("global.save.success")).navTabId(navTab)
	                .build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * delete action
     * 
     * @return
     */
    @Action(value = "deleteOrgs")
    public String deleteOrg() {
	if (getParameterValue("oid") == null) {
	    AjaxDone errorAjaxDone = new AjaxDone.Builder(Consts.AJAX_ERROR, getText("global.request.error")).build();
	    return ajaxForward(errorAjaxDone);
	}
	String orgId = (String) getParameterValue("oid");
	org = orgService.findSingleOrg(Long.valueOf(orgId));
	val = orgService.deleteOrg(Long.valueOf(orgId));
	AjaxDone parameAjaxDone = null;
	if (val == 0) {
	    AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_DELETE, Consts.AUDIT_OBJECT_ORG,
		            Consts.AUDIT_LEVEL_WARN, "删除组织[" + org.getOrgName() + "]失败，失败原因：存在与组织相关联的数据，无法删除！",
		            AppContextHolder.getContext().getUser().getUserId(), org.getCreateTime(), new Date(),
		            new Date());
	    CommonUtil.authLog(auditInfo);
	    parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_ERROR, getText("org.request.error")).navTabId("org_list")
		            .build();
	} else {
	    AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_DELETE, Consts.AUDIT_OBJECT_ORG,
		            Consts.AUDIT_LEVEL_NORMAL, "删除组织[" + org.getOrgName() + "]成功！", AppContextHolder
		                            .getContext().getUser().getUserId(), org.getCreateTime(), new Date(),
		            new Date());
	    CommonUtil.authLog(auditInfo);
	    parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, getText("global.delete.success"))
		            .navTabId("org_list").build();
	}
	return ajaxForward(parameAjaxDone);
    }

    /**
     * update org action
     * 
     * @return
     */
    @Action(value = "updateOrg")
    public String updateOrg() {
	orgService.updateOrg(org);
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_UPDATE, Consts.AUDIT_OBJECT_ORG, Consts.AUDIT_LEVEL_NORMAL,
	                "修改组织[" + org.getOrgName() + "]成功！", AppContextHolder.getContext().getUser().getUserId(),
	                new Date(), new Date(), new Date());
	CommonUtil.authLog(auditInfo);
	String navTab = (String) getParameterValue("navTabId");
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, getText("global.update.success")).navTabId(
	                navTab).build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * load select option data
     */
    private void loadSelect() {
	if (orgStatusCombox.size() == 0) {
	    List<Dict> orgTypeList = DictUtil.getDictListByDictTableName("DICT_ORG_TYPE");
	    for (Dict dict : orgTypeList) {
		orgStyleCombox.put(Integer.parseInt(dict.getCode()), dict.getValue());
	    }
	}
	if (orgStatusCombox.size() == 0) {
	    orgStatusCombox.put(Consts.ORG_STATUS_NORAML, getText("org.status.noraml"));
	    orgStatusCombox.put(Consts.ORG_STATUS_STOP, getText("org.status.stop"));
	}
	loadPerPage();
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
	if (getParameterValue("criteria_orgName") != null && !"".equals(getParameterValue("criteria_orgName"))) {
	    c.andOrgNameLike((String) getParameterValue("criteria_orgName"));
	}
	if (getParameterValue("criteria_orgCode") != null && !"".equals(getParameterValue("criteria_orgCode"))) {
	    c.andOrgCodeLike((String) getParameterValue("criteria_orgCode"));
	}

	if (getParameterValue("criteria_orgStatus") != null && !"".equals(getParameterValue("criteria_orgStatus"))) {
	    c.andOrgStatusEqualTo(Integer.valueOf((String) getParameterValue("criteria_orgStatus")));
	}
	if (getParameterValue("criteria_orgManager") != null && !"".equals(getParameterValue("criteria_orgManager"))) {
	    c.andOrgManagerUidEqualTo((String) getParameterValue("criteria_orgManager"));
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

    private static final long serialVersionUID = 3133282831111510829L;

    public AuthOrg getOrg() {
	return org;
    }

    public void setOrg(AuthOrg org) {
	this.org = org;
    }

    public String getActionName() {
	return actionName;
    }

    public void setActionName(String actionName) {
	this.actionName = actionName;
    }

    public String getRel() {
	return rel;
    }

    public void setRel(String rel) {
	this.rel = rel;
    }

    public Map<Integer, String> getOrgStyleCombox() {
	return orgStyleCombox;
    }

    public Map<Integer, String> getOrgStatusCombox() {
	return orgStatusCombox;
    }

    public OnePage<AuthOrg> getPageData() {
	return pageData;
    }

    public void setPageData(OnePage<AuthOrg> pageData) {
	this.pageData = pageData;
    }

    public int getVal() {
	return val;
    }

    public void setVal(int val) {
	this.val = val;
    }
}
