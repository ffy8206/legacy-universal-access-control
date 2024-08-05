package com.harry.uac.action.datarange;

import java.util.Date;
import java.util.List;

import com.harry.uac.action.ActionBase;
import com.harry.uac.common.Consts;
import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.util.CommonUtil;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.common.util.Page;
import com.harry.uac.service.IApplicationService;
import com.harry.uac.service.IDatarangeService;
import com.harry.uac.vo.AjaxDone;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.harry.uac.persistence.AuditLog;
import com.harry.uac.persistence.AuthApplication;
import com.harry.uac.persistence.AuthApplicationExample;
import com.harry.uac.persistence.AuthDatarange;
import com.harry.uac.persistence.AuthDatarangeExample;

public class DatarangeAction extends ActionBase {

    @Autowired
    private IDatarangeService datarangeService;
    private AuthDatarange datarange;
    private AuthApplication application;
    private String message;
    private String actionName;
    private String rel;
    private String searchDatarangeName;
    private String searchDatarangeCode;
    private List<AuthApplication> applicationList;
    OnePage<AuthDatarange> pageData;

    @Action(value = "queryDatarangeInfo", results = { @Result(name = "queryDatarangeInfo", location = "datarange_list.jsp") })
    public String queryDatarangeInfo() {
	loadPerPage();
	AuthDatarangeExample criteria = searchCondition();
	pageData = datarangeService.onePageDatarange(criteria);
	return "queryDatarangeInfo";
    }

    /**
     * display add/update jsp
     * 
     * @return
     */
    @Action(value = "displayDatarange", results = { @Result(name = "displayDatarange", location = "datarange_add.jsp") })
    public String displayDatarange() {
	String datarangeId = (String) getParameterValue("datarangeId");
	if (datarangeId != null) {
	    datarange = datarangeService.findSingleDatarange(Long.valueOf(datarangeId));
	    this.rel = "datarange_list";
	    this.actionName = "updateDatarange";
	} else {
	    this.rel = "datarange_list";
	    this.actionName = "saveDatarange";
	}
	return "displayDatarange";
    }

    @Action(value = "saveDatarange")
    public String saveDatarange() {
	datarange.setApplicationId(application.getApplicationId());
	datarangeService.insertDatarange(datarange);
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_INSERT, Consts.AUDIT_OBJECT_DATARANGE,
	                Consts.AUDIT_LEVEL_NORMAL, "新增数据范围[" + datarange.getDatarangeName() + "]成功！", AppContextHolder
	                                .getContext().getUser().getUserId(), datarange.getCreateTime(), new Date(),
	                new Date());
	CommonUtil.authLog(auditInfo);
	String navTab = (String) getParameterValue("navTabId");
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "save ok")
	                .navTabId(navTab)
	                .forwardUrl("../datarange/queryDatarangeInfo?application.applicationId="
	                                + datarange.getApplicationId()).build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * update datarange action
     * 
     * @return
     */
    @Action(value = "updateDatarange")
    public String updateDatarange() {
	datarangeService.updateDatarange(datarange);
	String navTab = (String) getParameterValue("navTabId");
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_UPDATE, Consts.AUDIT_OBJECT_DATARANGE,
	                Consts.AUDIT_LEVEL_NORMAL, "修改数据范围[" + datarange.getDatarangeName() + "]成功！", AppContextHolder
	                                .getContext().getUser().getUserId(), new Date(), new Date(), new Date());
	CommonUtil.authLog(auditInfo);
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "update ok")
	                .navTabId(navTab)
	                .forwardUrl("../datarange/queryDatarangeInfo?application.applicationId="
	                                + datarange.getApplicationId()).build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * delete action
     * 
     * @return
     */
    @Action(value = "deleteDatarange")
    public String deleteDatarange() {
	String datarangeId = (String) getParameterValue("datarangeId");
	datarange = datarangeService.findSingleDatarange(Long.valueOf(datarangeId));
	if (datarangeId == null) {
	    AjaxDone errorAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "delete error").build();
	    return ajaxForward(errorAjaxDone);
	}
	datarangeService.deleteDatarange(Long.valueOf(datarangeId));
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_DELETE, Consts.AUDIT_OBJECT_DATARANGE,
	                Consts.AUDIT_LEVEL_NORMAL, "删除数据范围[" + datarange.getDatarangeName() + "]成功！", AppContextHolder
	                                .getContext().getUser().getUserId(), new Date(), new Date(), new Date());
	CommonUtil.authLog(auditInfo);
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "delete ok")
	                .navTabId("datarange_list")
	                .forwardUrl("../datarange/queryDatarangeInfo?application.applicationId="
	                                + application.getApplicationId()).callBackType("forward").build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * initialize search condition and page parameter
     * 
     * @return AuthDatarangeExample criteria
     */
    private AuthDatarangeExample searchCondition() {
	AuthDatarangeExample criteria = new AuthDatarangeExample();
	// initialize search condition
	AuthDatarangeExample.Criteria c = criteria.createCriteria();
	if (getParameterValue("criteria_datarangeName") != null) {
	    c.andDatarangeNameLike("%" + ((String) getParameterValue("criteria_datarangeName")).trim() + "%");
	    searchDatarangeName = ((String) getParameterValue("criteria_datarangeName")).trim();
	}
	if (getParameterValue("criteria_datarangeCode") != null) {
	    c.andDatarangeCodeLike("%" + ((String) getParameterValue("criteria_datarangeCode")).trim() + "%");
	    searchDatarangeCode = ((String) getParameterValue("criteria_datarangeCode")).trim();
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

    public String getSearchDatarangeName() {
	return searchDatarangeName;
    }

    public void setSearchDatarangeName(String searchDatarangeName) {
	this.searchDatarangeName = searchDatarangeName;
    }

    public String getSearchDatarangeCode() {
	return searchDatarangeCode;
    }

    public void setSearchDatarangeCode(String searchDatarangeCode) {
	this.searchDatarangeCode = searchDatarangeCode;
    }

    public AuthDatarange getDatarange() {
	return datarange;
    }

    public void setDatarange(AuthDatarange datarange) {
	this.datarange = datarange;
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

    public OnePage<AuthDatarange> getPageData() {
	return pageData;
    }

    public void setPageData(OnePage<AuthDatarange> pageData) {
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
