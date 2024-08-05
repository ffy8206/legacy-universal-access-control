package com.harry.uac.action.group;

import java.util.ArrayList;
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
import com.harry.uac.dao.AuthGroupRoleMapper;
import com.harry.uac.vo.AjaxDone;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.harry.uac.persistence.AuditLog;
import com.harry.uac.persistence.AuthApplication;
import com.harry.uac.persistence.AuthApplicationExample;
import com.harry.uac.persistence.AuthDatarange;
import com.harry.uac.persistence.AuthGroup;
import com.harry.uac.persistence.AuthGroupExample;
import com.harry.uac.persistence.AuthOrg;
import com.harry.uac.persistence.AuthRole;
import com.harry.uac.persistence.AuthUser;
import com.harry.uac.persistence.GroupRoleMisc;
import com.harry.uac.persistence.ViewAuthOrgUser;
import com.harry.uac.persistence.ViewAuthOrgUserExample;
import com.harry.uac.service.AuthCommonService;
import com.harry.uac.service.IApplicationService;
import com.harry.uac.service.IGroupRoleService;
import com.harry.uac.service.IGroupService;
import com.harry.uac.service.IUserGroupService;
import com.harry.uac.service.IViewAuthOrgUserService;

public class GroupAction extends ActionBase {

    @Autowired
    IGroupService groupService;
    
    @Autowired
    AuthGroupRoleMapper groupRoleDAOBean;
    
    @Autowired
    IGroupRoleService groupRoleService;
    
    @Autowired
    IUserGroupService userGroupService;
    
    @Autowired
    IViewAuthOrgUserService viewAuthOrgUserService;
    
    private AuthGroup group;
    private AuthRole role;
    private AuthOrg org;
    private AuthUser user;
    private AuthApplication application;
    private String message;
    private String actionName;
    private String rel;
    private int val = 0;
    private String jsonResult;
    private List<AuthApplication> applicationList;
    OnePage<AuthGroup> pageData;
    OnePage<ViewAuthOrgUser> pageUserData;

    @Action(value = "queryGroupInfo", results = { @Result(name = "queryGroupInfo", location = "group_list.jsp") })
    public String queryGroupInfo() {
	return "queryGroupInfo";
    }

    @Action(value = "queryApplicationGroupInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String queryApplicationGroupInfo() {
	AuthGroupExample example = searchCondition();
	pageData = groupService.onePageGroup(example);
	Map<String, OnePage<AuthGroup>> map = new HashMap<String, OnePage<AuthGroup>>();
	map.put("pageData", pageData);
	this.jsonResult = JSONObject.fromObject(map).toString();
	return SUCCESS;
    }

    /**
     * display add/update jsp
     * 
     * @return
     */
    @Action(value = "displayGroup", results = { @Result(name = "displayGroup", location = "group_add.jsp") })
    public String displayGroup() {
	String groupId = (String) getParameterValue("groupId");
	if (groupId != null) {
	    group = groupService.findSingleGroup(Long.valueOf(groupId));
	    this.rel = "group_list";
	    this.actionName = "updateGroup";
	} else {
	    this.rel = "group_list";
	    this.actionName = "saveGroup";
	}
	return "displayGroup";
    }

    @Action(value = "saveGroup")
    public String saveGroup() {
	group.setApplicationId(application.getApplicationId());
	groupService.insertGroup(group);
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_INSERT, Consts.AUDIT_OBJECT_GROUP,
	                Consts.AUDIT_LEVEL_NORMAL, "新增用户组[" + group.getGroupName() + "]成功！", AppContextHolder
	                                .getContext().getUser().getUserId(), group.getCreateTime(), new Date(),
	                new Date());
	CommonUtil.authLog(auditInfo);
	String navTab = (String) getParameterValue("navTabId");
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "save ok").navTabId(navTab)
	                .forwardUrl("../group/queryGroupInfo?application.applicationId=" + group.getApplicationId())
	                .build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * update group action
     * 
     * @return
     */
    @Action(value = "updateGroup")
    public String updateGroup() {
	groupService.updateGroup(group);
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_UPDATE, Consts.AUDIT_OBJECT_GROUP,
	                Consts.AUDIT_LEVEL_NORMAL, "修改用户组[" + group.getGroupName() + "]成功！", AppContextHolder
	                                .getContext().getUser().getUserId(), new Date(), new Date(), new Date());
	CommonUtil.authLog(auditInfo);
	String navTab = (String) getParameterValue("navTabId");
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "update ok").navTabId(navTab)
	                .forwardUrl("../group/queryGroupInfo?application.applicationId=" + group.getApplicationId())
	                .build();
	return ajaxForward(parameAjaxDone);
    }

    /**
     * delete action
     * 
     * @return
     */
    @Action(value = "deleteGroups", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String deleteGroup() {
	String groupId = (String) getParameterValue("groupId");
	group = groupService.findSingleGroup(Long.valueOf(groupId));
	if (groupId == null) {
	    AjaxDone errorAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "delete error").build();
	    return ajaxForward(errorAjaxDone);
	}
	val = groupService.deleteGroupWithValidator(Long.valueOf(groupId));
	this.jsonResult = "{delCount:" + val + "}";
	if (val == 0) {
	    AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_DELETE, Consts.AUDIT_OBJECT_GROUP,
		            Consts.AUDIT_LEVEL_NORMAL, "删除用户组[" + group.getGroupName() + "]失败，失败原因：存在与用户相关联的数据，无法删除！",
		            AppContextHolder.getContext().getUser().getUserId(), new Date(), new Date(), new Date());
	    CommonUtil.authLog(auditInfo);
	} else {
	    AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_DELETE, Consts.AUDIT_OBJECT_GROUP,
		            Consts.AUDIT_LEVEL_NORMAL, "删除用户组[" + group.getGroupName() + "]成功！", AppContextHolder
		                            .getContext().getUser().getUserId(), new Date(), new Date(), new Date());
	    CommonUtil.authLog(auditInfo);
	}
	return SUCCESS;
    }

    @Action(value = "queryGroupRoleInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String queryGroupRoleInfo() {
	String groupId = (String) getParameterValue("groupId");
	String roleSetStatus = (String) getParameterValue("roleSetStatus");
	String applicationId = (String) getParameterValue("applicationId");
	List<GroupRoleMisc> existingRolesList = new ArrayList<GroupRoleMisc>();
	List<AuthRole> remainingRolesList = new ArrayList<AuthRole>();
	if (roleSetStatus.equals("role-all")) {
	    existingRolesList = AuthCommonService.selectApplictionGroupRoleMiscsForGroup(Long.parseLong(applicationId),
		            Long.parseLong(groupId));
	    remainingRolesList = AuthCommonService.selectApplictionRemainingRolesForGroup(
		            Long.parseLong(applicationId), Long.parseLong(groupId));
	} else if (roleSetStatus.equals("role-existing")) {
	    existingRolesList = AuthCommonService.selectApplictionGroupRoleMiscsForGroup(Long.parseLong(applicationId),
		            Long.parseLong(groupId));
	} else if (roleSetStatus.equals("role-noset")) {
	    remainingRolesList = AuthCommonService.selectApplictionRemainingRolesForGroup(
		            Long.parseLong(applicationId), Long.parseLong(groupId));
	}
	JsonConfig config = new JsonConfig();
	config.setExcludes(new String[] { "createUserId", "createTime", "updateUserId", "updateTime",
	        "roleDisplayOrder", "roleRemark" });

	Map<String, List> map = new HashMap<String, List>();
	map.put("existingRolesList", existingRolesList);
	map.put("remainingRolesList", remainingRolesList);

	this.jsonResult = JSONObject.fromObject(map, config).toString();
	return SUCCESS;
    }

    @Action(value = "saveGroupRoleInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String saveGroupRoleInfo() {
	String groupId = (String) getParameterValue("groupId");
	String roles_sel = (String) getParameterValue("roles_sel");
	String roles_del = (String) getParameterValue("roles_del");
	groupRoleService.saveGroupRoleInfo(Long.parseLong(groupId), roles_sel, roles_del);
	this.jsonResult = "{}";
	return SUCCESS;
    }

    @Action(value = "toSetDatarange", results = { @Result(name = "toSetDatarange", location = "datarangeSet_list.jsp") })
    public String toSetDatarange() {
	return "toSetDatarange";
    }

    @Action(value = "queryGroupRoleDatarangeInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String queryGroupRoleDatarangeInfo() {
	String drSetStatus = (String) getParameterValue("drSetStatus");
	List<AuthDatarange> existingDrsList = new ArrayList<AuthDatarange>();
	List<AuthDatarange> remainingDrsList = new ArrayList<AuthDatarange>();
	if (drSetStatus.equals("dr-all")) {
	    existingDrsList = AuthCommonService.selectGroupRoleDataranges(group.getGroupId(), role.getRoleId());
	    remainingDrsList = AuthCommonService.selectApplictionRemainingGroupRoleDataranges(
		            application.getApplicationId(), group.getGroupId(), role.getRoleId());
	} else if (drSetStatus.equals("dr-existing")) {
	    existingDrsList = AuthCommonService.selectGroupRoleDataranges(group.getGroupId(), role.getRoleId());
	} else if (drSetStatus.equals("dr-noset")) {
	    remainingDrsList = AuthCommonService.selectApplictionRemainingGroupRoleDataranges(
		            application.getApplicationId(), group.getGroupId(), role.getRoleId());
	}
	JsonConfig config = new JsonConfig();
	config.setExcludes(new String[] { "createUserId", "createTime", "updateUserId", "updateTime" });

	Map<String, List<AuthDatarange>> map = new HashMap<String, List<AuthDatarange>>();
	map.put("existingDrsList", existingDrsList);
	map.put("remainingDrsList", remainingDrsList);

	this.jsonResult = JSONObject.fromObject(map, config).toString();
	return SUCCESS;
    }

    @Action(value = "saveGroupRoleDatarangeInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String saveGroupRoleDatarangeInfo() {
	String drs_sel = (String) getParameterValue("drs_sel");
	String drs_del = (String) getParameterValue("drs_del");
	groupRoleService.saveGroupRoleDatarangeInfo(group.getGroupId(), role.getRoleId(), drs_sel, drs_del);
	this.jsonResult = "{}";
	return SUCCESS;
    }

    /**
     * initialize search condition and page parameter
     * 
     * @return AuthGroupExample criteria
     */
    private AuthGroupExample searchCondition() {
	AuthGroupExample example = new AuthGroupExample();
	// initialize search condition
	AuthGroupExample.Criteria c = example.createCriteria();
	// if (getParameterValue("criteria_groupName") != null) {
	// c.andGroupNameLike((String) getParameterValue("criteria_groupName"));
	// }
	if (application == null) {
	    c.andApplicationIdEqualTo(new Long(0));
	} else {
	    c.andApplicationIdEqualTo(application.getApplicationId());
	}
	// initialize pagination parameter
	int pageNum = 1, numPerPage = 100;
	if (getParameterValue("pageNum") != null) {
	    pageNum = Integer.valueOf((String) getParameterValue("pageNum"));
	    numPerPage = Integer.valueOf((String) getParameterValue("numPerPage"));
	}
	Page page = new Page((pageNum - 1) * numPerPage + 1, numPerPage);
	example.setPage(page);
	return example;
    }

    @Action(value = "queryGroupUserInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String queryGroupUserInfo() {
	String userSetStatus = (String) getParameterValue("userSetStatus");
	ViewAuthOrgUserExample example = new ViewAuthOrgUserExample();
	if (StringUtils.isNotEmpty(org.getOrgLayerCode())) {
	    org.setOrgLayerCode(org.getOrgLayerCode() + "%");
	    example.setOrg(org);
	}
	if (group.getGroupId() != null) {
	    example.setGroup(group);
	}
	if (StringUtils.isNotEmpty(user.getUserName())) {
	    user.setUserName("%" + user.getUserName() + "%");
	}
	example.setUser(user);

	int pageNum = 1, numPerPage = 20;
	if (getParameterValue("pageNum") != null) {
	    pageNum = Integer.valueOf((String) getParameterValue("pageNum"));
	    numPerPage = Integer.valueOf((String) getParameterValue("numPerPage"));
	}
	Page page = new Page((pageNum - 1) * numPerPage + 1, numPerPage);
	example.setPage(page);
	if (userSetStatus.equals("user-existing")) {
	    pageUserData = viewAuthOrgUserService.onePageUsersForGroup(example);
	} else if (userSetStatus.equals("user-noset")) {
	    pageUserData = viewAuthOrgUserService.onePageRemainingUsersForGroup(example);
	}

	Map<String, OnePage<ViewAuthOrgUser>> map = new HashMap<String, OnePage<ViewAuthOrgUser>>();
	map.put("pageUserData", pageUserData);
	this.jsonResult = JSONObject.fromObject(map).toString();
	return SUCCESS;
    }

    @Action(value = "saveGroupUserInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String saveGroupUserInfo() {
	String groupId = (String) getParameterValue("groupId");
	String users_del = (String) getParameterValue("users_del");
	String users_sel = (String) getParameterValue("users_sel");
	userGroupService.saveUserGroupInfo(Long.parseLong(groupId), users_sel, users_del);
	this.jsonResult = "{}";
	return SUCCESS;
    }

    public AuthGroup getGroup() {
	return group;
    }

    public void setGroup(AuthGroup group) {
	this.group = group;
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

    public OnePage<AuthGroup> getPageData() {
	return pageData;
    }

    public void setPageData(OnePage<AuthGroup> pageData) {
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

    public int getVal() {
	return val;
    }

    public void setVal(int val) {
	this.val = val;
    }

    public String getJsonResult() {
	return jsonResult;
    }

    public void setJsonResult(String jsonResult) {
	this.jsonResult = jsonResult;
    }

    public AuthRole getRole() {
	return role;
    }

    public void setRole(AuthRole role) {
	this.role = role;
    }

    public AuthOrg getOrg() {
	return org;
    }

    public void setOrg(AuthOrg org) {
	this.org = org;
    }

    public AuthUser getUser() {
	return user;
    }

    public void setUser(AuthUser user) {
	this.user = user;
    }

    public OnePage<ViewAuthOrgUser> getPageUserData() {
	return pageUserData;
    }

    public void setPageUserData(OnePage<ViewAuthOrgUser> pageUserData) {
	this.pageUserData = pageUserData;
    }

    private static final long serialVersionUID = 5297446761283565951L;

}
