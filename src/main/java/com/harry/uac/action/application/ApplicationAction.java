package com.harry.uac.action.application;

import java.util.Date;

import com.harry.uac.action.ActionBase;
import com.harry.uac.common.Consts;
import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.util.CommonUtil;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.common.util.Page;
import com.harry.uac.persistence.AuditLog;
import com.harry.uac.persistence.AuthApplication;
import com.harry.uac.persistence.AuthApplicationExample;
import com.harry.uac.service.IApplicationService;
import com.harry.uac.vo.AjaxDone;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

public class ApplicationAction extends ActionBase {

    @Autowired
    private IApplicationService applicationService;
    private AuthApplication application;
    private String message;
    private String actionName;
    private String rel;
    private int val = 0;
    private String searchApplicationName;
    OnePage<AuthApplication> pageData;

    @Action(value = "queryApplicationInfo", results = { @Result(name = "queryApplicationInfo", location = "application_list.jsp") })
    public String queryApplicationInfo() {
	loadPerPage();
	AuthApplicationExample criteria = searchCondition();
	pageData = applicationService.onePageApplication(criteria);
	return "queryApplicationInfo";
    }

    /**
     * display add/update jsp
     * 
     * @return
     */
    @Action(value = "displayApplication", results = { @Result(name = "displayApplication", location = "application_add.jsp") })
    public String displayApplication() {
	String applicationId = (String) getParameterValue("applicationId");
	if (applicationId != null) {
	    application = applicationService.findSingleApplication(Long.valueOf(applicationId));
	    this.rel = "application_list";
	    this.actionName = "updateApplication";
	} else {
	    this.rel = "application_list";
	    this.actionName = "saveApplication";
	}
	return "displayApplication";
    }

    @Action(value = "saveApplication")
    public String saveApplication() {
	applicationService.insertApplication(application);
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_INSERT, Consts.AUDIT_OBJECT_APPLICATION,
	                Consts.AUDIT_LEVEL_NORMAL, "新增应用[" + application.getApplicationName() + "]成功！",
	                AppContextHolder.getContext().getUser().getUserId(), application.getCreateTime(), new Date(),
	                new Date());
	CommonUtil.authLog(auditInfo);
	String navTab = (String) getParameterValue("navTabId");
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "save ok").navTabId(navTab)
	                .forwardUrl("../application/queryApplicationInfo").build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * update application action
     * 
     * @return
     */
    @Action(value = "updateApplication")
    public String updateApplication() {
	applicationService.updateApplication(application);
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_UPDATE, Consts.AUDIT_OBJECT_APPLICATION,
	                Consts.AUDIT_LEVEL_NORMAL, "修改应用[" + application.getApplicationName() + "]成功！",
	                AppContextHolder.getContext().getUser().getUserId(), new Date(), new Date(), new Date());
	CommonUtil.authLog(auditInfo);
	String navTab = (String) getParameterValue("navTabId");
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "update ok").navTabId(navTab)
	                .forwardUrl("../application/queryApplicationInfo").build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * delete action
     * 
     * @return
     */
    @Action(value = "deleteApplications")
    public String deleteApplication() {
	String applicationId = (String) getParameterValue("applicationId");
	if (applicationId == null) {
	    AjaxDone errorAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "delete error").build();
	    return ajaxForward(errorAjaxDone);
	}
	application = applicationService.findSingleApplication(Long.valueOf(applicationId));
	val = applicationService.deleteApplicationWithValidator(Long.valueOf(applicationId));
	AjaxDone parameAjaxDone = null;
	if (val == 0) {
	    AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_DELETE, Consts.AUDIT_OBJECT_APPLICATION,
		            Consts.AUDIT_LEVEL_WARN, "删除应用[" + application.getApplicationName()
		                            + "]失败，失败原因：存在与应用相关联的数据，无法删除！", AppContextHolder.getContext().getUser()
		                            .getUserId(), application.getCreateTime(), new Date(), new Date());
	    CommonUtil.authLog(auditInfo);
	    parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_ERROR, getText("application.request.error")).navTabId(
		            "application_list").build();
	} else {
	    AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_DELETE, Consts.AUDIT_OBJECT_APPLICATION,
		            Consts.AUDIT_LEVEL_NORMAL, "删除应用[" + application.getApplicationName() + "]成功！",
		            AppContextHolder.getContext().getUser().getUserId(), application.getCreateTime(),
		            new Date(), new Date());
	    CommonUtil.authLog(auditInfo);
	    parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, getText("global.delete.success")).navTabId(
		            "application_list").build();
	}
	// applicationService.deleteApplication(Long.valueOf(applicationId));
	// AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK,
	// "delete ok").navTabId("application_list").build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * initialize search condition and page parameter
     * 
     * @return AuthApplicationExample criteria
     */
    private AuthApplicationExample searchCondition() {
	AuthApplicationExample criteria = new AuthApplicationExample();
	// initialize search condition
	AuthApplicationExample.Criteria c = criteria.createCriteria();
	if (getParameterValue("criteria_applicationName") != null) {
	    c.andApplicationNameLike("%" + ((String) getParameterValue("criteria_applicationName")).trim() + "%");
	    searchApplicationName = ((String) getParameterValue("criteria_applicationName")).trim();
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

    public OnePage<AuthApplication> getPageData() {
	return pageData;
    }

    public void setPageData(OnePage<AuthApplication> pageData) {
	this.pageData = pageData;
    }

    public int getVal() {
	return val;
    }

    public void setVal(int val) {
	this.val = val;
    }

    public String getSearchApplicationName() {
	return searchApplicationName;
    }

    private static final long serialVersionUID = 5297446761283565951L;

}
