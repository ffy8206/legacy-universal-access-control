package com.harry.uac.action.role;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.harry.uac.action.ActionBase;
import com.harry.uac.common.Consts;
import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.util.CommonUtil;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.common.util.Page;
import com.harry.uac.service.AuthCommonService;
import com.harry.uac.service.IApplicationService;
import com.harry.uac.service.IRolePrivilegeService;
import com.harry.uac.service.IRoleService;
import com.harry.uac.vo.AjaxDone;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.harry.uac.persistence.AuditLog;
import com.harry.uac.persistence.AuthApplication;
import com.harry.uac.persistence.AuthApplicationExample;
import com.harry.uac.persistence.AuthPrivilege;
import com.harry.uac.persistence.AuthRole;
import com.harry.uac.persistence.AuthRoleExample;

public class RoleAction extends ActionBase {

    @Autowired
    IRoleService roleService;
    @Autowired
    IRolePrivilegeService rolePrivilegeService;
    private AuthRole role;
    private AuthApplication application;
    private String message;
    private String actionName;
    private String rel;
    private int val = 0;
    private String jsonResult;
    private List<AuthApplication> applicationList;
    OnePage<AuthRole> pageData;

    @Action(value = "queryRoleInfo", results = { @Result(name = "queryRoleInfo", location = "role_list.jsp") })
    public String queryRoleInfo() {
	loadPerPage();
	AuthRoleExample criteria = searchCondition();
	pageData = roleService.onePageRole(criteria);
	return "queryRoleInfo";
    }

    /**
     * display add/update jsp
     * 
     * @return
     */
    @Action(value = "displayRole", results = { @Result(name = "displayRole", location = "role_add.jsp") })
    public String displayRole() {
	String roleId = (String) getParameterValue("roleId");
	if (roleId != null) {
	    role = roleService.findSingleRole(Long.valueOf(roleId));
	    this.rel = "role_list";
	    this.actionName = "updateRole";
	} else {
	    this.rel = "role_list";
	    this.actionName = "saveRole";
	}
	return "displayRole";
    }

    @Action(value = "saveRole")
    public String saveRole() {
	role.setApplicationId(application.getApplicationId());
	roleService.insertRole(role);
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_INSERT, Consts.AUDIT_OBJECT_ROLE,
	                Consts.AUDIT_LEVEL_NORMAL, "新增角色[" + role.getRoleName() + "]成功！", AppContextHolder.getContext()
	                                .getUser().getUserId(), role.getCreateTime(), new Date(), new Date());
	CommonUtil.authLog(auditInfo);
	String navTab = (String) getParameterValue("navTabId");
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "save ok").navTabId(navTab)
	                .forwardUrl("../role/queryRoleInfo?application.applicationId=" + role.getApplicationId())
	                .build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * update role action
     * 
     * @return
     */
    @Action(value = "updateRole")
    public String updateRole() {
	roleService.updateRole(role);
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_UPDATE, Consts.AUDIT_OBJECT_ROLE,
	                Consts.AUDIT_LEVEL_NORMAL, "修改角色[" + role.getRoleName() + "]成功！", AppContextHolder.getContext()
	                                .getUser().getUserId(), new Date(), new Date(), new Date());
	CommonUtil.authLog(auditInfo);
	String navTab = (String) getParameterValue("navTabId");
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "update ok").navTabId(navTab)
	                .forwardUrl("../role/queryRoleInfo?application.applicationId=" + role.getApplicationId())
	                .build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * delete action
     * 
     * @return
     */
    @Action(value = "deleteRole")
    public String deleteRole() {
	String roleId = (String) getParameterValue("roleId");
	role = roleService.findSingleRole(Long.valueOf(roleId));
	if (roleId == null) {
	    AjaxDone errorAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "delete error").build();
	    return ajaxForward(errorAjaxDone);
	}
	// roleService.deleteRole(Long.valueOf(roleId));
	val = roleService.deleteRoleWithValidator(Long.valueOf(roleId));
	AjaxDone parameAjaxDone = null;
	if (val == 0) {
	    AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_DELETE, Consts.AUDIT_OBJECT_ROLE,
		            Consts.AUDIT_LEVEL_NORMAL, "删除角色[" + role.getRoleName() + "]失败，失败原因：存在与角色关联的数据，无法删除！",
		            AppContextHolder.getContext().getUser().getUserId(), new Date(), new Date(), new Date());
	    CommonUtil.authLog(auditInfo);
	    parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_ERROR, getText("role.request.error")).navTabId(
		            "role_list").build();
	} else {
	    AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_DELETE, Consts.AUDIT_OBJECT_ROLE,
		            Consts.AUDIT_LEVEL_NORMAL, "删除角色[" + role.getRoleName() + "]成功！", AppContextHolder
		                            .getContext().getUser().getUserId(), new Date(), new Date(), new Date());
	    CommonUtil.authLog(auditInfo);
	    parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, getText("global.delete.success"))
		            .navTabId("role_list")
		            .forwardUrl("../role/queryRoleInfo?application.applicationId="
		                            + application.getApplicationId()).callBackType("forward").build();
	}
	return ajaxForward(parameAjaxDone);
    }

    /**
     * initialize search condition and page parameter
     * 
     * @return AuthRoleExample criteria
     */
    private AuthRoleExample searchCondition() {
	AuthRoleExample criteria = new AuthRoleExample();
	// initialize search condition
	AuthRoleExample.Criteria c = criteria.createCriteria();
	// if (getParameterValue("criteria_roleName") != null) {
	// c.andRoleNameLike((String) getParameterValue("criteria_roleName"));
	// }
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

    @Action(value = "queryRolePrivileges", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String queryRolePrivileges() {
	String roleId = (String) getParameterValue("roleId");
	// exclude attribute
	JsonConfig config = new JsonConfig();
	config.setExcludes(new String[] { "applicationId", "createUserId", "createTime", "updateUserId", "updateTime",
	        "privilegeDescription", "privilegeRemark" });
	// existing privileges
	List<AuthPrivilege> existingPrivileges = AuthCommonService.getExistingPrivilegesForRole(Long.parseLong(roleId));

	// other privileges
	List<AuthPrivilege> otherPrivileges = AuthCommonService.getOtherPrivilegesForRole(Long.parseLong(roleId));
	// join list
	Map<String, List<AuthPrivilege>> map = new HashMap<String, List<AuthPrivilege>>();
	map.put("existingPrivileges", existingPrivileges);
	map.put("otherPrivileges", otherPrivileges);
	// to json
	this.jsonResult = JSONObject.fromObject(map, config).toString();
	return SUCCESS;
    }

    @Action(value = "saveRolePrivileges", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String saveRolePrivileges() {
	String roleId = (String) getParameterValue("roleId");
	String privilegesId = (String) getParameterValue("privilegesId");
	rolePrivilegeService.insertRolePrivilege(Long.parseLong(roleId), privilegesId);
	this.jsonResult = "{}";
	return SUCCESS;
    }

    public AuthRole getRole() {
	return role;
    }

    public void setRole(AuthRole role) {
	this.role = role;
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

    public OnePage<AuthRole> getPageData() {
	return pageData;
    }

    public void setPageData(OnePage<AuthRole> pageData) {
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

    public AuthApplication getApplication() {
	return application;
    }

    public void setApplication(AuthApplication application) {
	this.application = application;
    }

    public String getJsonResult() {
	return jsonResult;
    }

    public void setJsonResult(String jsonResult) {
	this.jsonResult = jsonResult;
    }

    public int getVal() {
	return val;
    }

    public void setVal(int val) {
	this.val = val;
    }

    private static final long serialVersionUID = 5297446761283565951L;

}
