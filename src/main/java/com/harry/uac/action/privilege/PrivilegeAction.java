package com.harry.uac.action.privilege;

import java.util.Date;
import java.util.List;

import com.harry.uac.action.ActionBase;
import com.harry.uac.common.Consts;
import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.util.CommonUtil;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.common.util.Page;
import com.harry.uac.service.IApplicationService;
import com.harry.uac.service.IPrivilegeService;
import com.harry.uac.vo.AjaxDone;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.harry.uac.persistence.AuditLog;
import com.harry.uac.persistence.AuthApplication;
import com.harry.uac.persistence.AuthApplicationExample;
import com.harry.uac.persistence.AuthPrivilege;
import com.harry.uac.persistence.AuthPrivilegeExample;

public class PrivilegeAction extends ActionBase {

    @Autowired
    IPrivilegeService privilegeService;
    private AuthPrivilege privilege;
    private AuthApplication application;
    private String message;
    private String actionName;
    private String rel;
    private String searchPrivilegeName;
    private String searchPrivilegeCode;
    private List<AuthApplication> applicationList;
    OnePage<AuthPrivilege> pageData;

    @Action(value = "queryPrivilegeInfo", results = { @Result(name = "queryPrivilegeInfo", location = "privilege_list.jsp") })
    public String queryPrivilegeInfo() {
	loadPerPage();
	AuthPrivilegeExample criteria = searchCondition();
	pageData = privilegeService.onePagePrivilege(criteria);
	return "queryPrivilegeInfo";
    }

    /**
     * display add/update jsp
     * 
     * @return
     */
    @Action(value = "displayPrivilege", results = { @Result(name = "displayPrivilege", location = "privilege_add.jsp") })
    public String displayPrivilege() {
	String privilegeId = (String) getParameterValue("privilegeId");
	if (privilegeId != null) {
	    privilege = privilegeService.findSinglePrivilege(Long.valueOf(privilegeId));
	    this.rel = "privilege_list";
	    this.actionName = "updatePrivilege";
	} else {
	    this.rel = "privilege_list";
	    this.actionName = "savePrivilege";
	}
	return "displayPrivilege";
    }

    @Action(value = "savePrivilege")
    public String savePrivilege() {
	privilege.setApplicationId(application.getApplicationId());
	privilegeService.insertPrivilege(privilege);
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_INSERT, Consts.AUDIT_OBJECT_PRIVILEGE,
	                Consts.AUDIT_LEVEL_NORMAL, "新增权限[" + privilege.getPrivilegeName() + "]成功！", AppContextHolder
	                                .getContext().getUser().getUserId(), privilege.getCreateTime(), new Date(),
	                new Date());
	CommonUtil.authLog(auditInfo);
	String navTab = (String) getParameterValue("navTabId");
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "save ok")
	                .navTabId(navTab)
	                .forwardUrl("../privilege/queryPrivilegeInfo?application.applicationId="
	                                + privilege.getApplicationId()).build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * update privilege action
     * 
     * @return
     */
    @Action(value = "updatePrivilege")
    public String updatePrivilege() {
	privilegeService.updatePrivilege(privilege);
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_UPDATE, Consts.AUDIT_OBJECT_PRIVILEGE,
	                Consts.AUDIT_LEVEL_NORMAL, "修改权限[" + privilege.getPrivilegeName() + "]成功！", AppContextHolder
	                                .getContext().getUser().getUserId(), new Date(), new Date(), new Date());
	CommonUtil.authLog(auditInfo);
	String navTab = (String) getParameterValue("navTabId");
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "update ok")
	                .navTabId(navTab)
	                .forwardUrl("../privilege/queryPrivilegeInfo?application.applicationId="
	                                + privilege.getApplicationId()).build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * delete action
     * 
     * @return
     */
    @Action(value = "deletePrivilege")
    public String deletePrivilege() {
	String privilegeId = (String) getParameterValue("privilegeId");
	privilege = privilegeService.findSinglePrivilege(Long.valueOf(privilegeId));
	if (privilegeId == null) {
	    AjaxDone errorAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "delete error").build();
	    return ajaxForward(errorAjaxDone);
	}
	privilegeService.deletePrivilege(Long.valueOf(privilegeId));
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_DELETE, Consts.AUDIT_OBJECT_PRIVILEGE,
	                Consts.AUDIT_LEVEL_NORMAL, "删除权限[" + privilege.getPrivilegeName() + "]成功！", AppContextHolder
	                                .getContext().getUser().getUserId(), new Date(), new Date(), new Date());
	CommonUtil.authLog(auditInfo);
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "delete ok")
	                .navTabId("privilege_list")
	                .forwardUrl("../privilege/queryPrivilegeInfo?application.applicationId="
	                                + application.getApplicationId()).callBackType("forward").build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * initialize search condition and page parameter
     * 
     * @return AuthPrivilegeExample criteria
     */
    private AuthPrivilegeExample searchCondition() {
	AuthPrivilegeExample criteria = new AuthPrivilegeExample();
	// initialize search condition
	AuthPrivilegeExample.Criteria c = criteria.createCriteria();
	if (getParameterValue("criteria_privilegeName") != "" && getParameterValue("criteria_privilegeName") != null) {
	    c.andPrivilegeNameLike("%" + ((String) getParameterValue("criteria_privilegeName")).trim() + "%");
	    searchPrivilegeName = ((String) getParameterValue("criteria_privilegeName")).trim();
	}
	if (getParameterValue("criteria_privilegeCode") != "" && getParameterValue("criteria_privilegeCode") != null) {
	    c.andPrivilegeCodeLike("%" + ((String) getParameterValue("criteria_privilegeCode")).trim() + "%");
	    searchPrivilegeCode = ((String) getParameterValue("criteria_privilegeCode")).trim();
	}
	if (application == null) {
	    c.andApplicationIdEqualTo(new Long(0));
	} else {
	    c.andApplicationIdEqualTo(application.getApplicationId());
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

    public String getSearchPrivilegeName() {
	return searchPrivilegeName;
    }

    public void setSearchPrivilegeName(String searchPrivilegeName) {
	this.searchPrivilegeName = searchPrivilegeName;
    }

    public String getSearchPrivilegeCode() {
	return searchPrivilegeCode;
    }

    public void setSearchPrivilegeCode(String searchPrivilegeCode) {
	this.searchPrivilegeCode = searchPrivilegeCode;
    }

    public AuthPrivilege getPrivilege() {
	return privilege;
    }

    public void setPrivilege(AuthPrivilege privilege) {
	this.privilege = privilege;
    }

    public AuthApplication getApplication() {
	return application;
    }

    public void setApplication(AuthApplication application) {
	this.application = application;
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
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

    public OnePage<AuthPrivilege> getPageData() {
	return pageData;
    }

    public void setPageData(OnePage<AuthPrivilege> pageData) {
	this.pageData = pageData;
    }

    public List<AuthApplication> getApplicationList() {
	WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
	IApplicationService applicationService = (IApplicationService) wac.getBean("applicationService");
	setApplicationList(applicationService.findAllApplication(new AuthApplicationExample()));
	return applicationList;
    }

    public void setApplicationList(List<AuthApplication> applicationList) {
	this.applicationList = applicationList;
    }

    private static final long serialVersionUID = 5297446761283565951L;
}
