package com.harry.uac.action.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.harry.uac.action.ActionBase;
import com.harry.uac.service.AuthCommonService;
import com.harry.uac.service.IUserRoleService;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.harry.uac.persistence.AuthApplication;
import com.harry.uac.persistence.AuthDatarange;
import com.harry.uac.persistence.AuthRole;
import com.harry.uac.persistence.AuthUser;
import com.harry.uac.persistence.UserRoleMisc;

public class UserSetRoleAction extends ActionBase {

    private String jsonResult;
    private AuthUser user;
    private AuthApplication application;

    @Autowired
    private IUserRoleService userRoleService;
    private AuthRole role;

    @Action(value = "userSetRole", results = { @Result(name = "userSetRole", location = "user_setrole.jsp") })
    public String userSetRole() {
	return "userSetRole";
    }

    @Action(value = "queryUserRoleInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String queryUserRoleInfo() {
	Long userId = user.getUserId();
	Long applicationId = application.getApplicationId();
	String roleSetStatus = (String) getParameterValue("roleSetStatus");
	List<UserRoleMisc> existingRolesList = new ArrayList<UserRoleMisc>();
	List<AuthRole> remainingRolesList = new ArrayList<AuthRole>();
	if (roleSetStatus.equals("role-all")) {
	    existingRolesList = AuthCommonService.selectApplictionUserRoleMiscsForUser(applicationId, userId);
	    remainingRolesList = AuthCommonService.selectApplictionRemainingRolesForUser(applicationId, userId);
	} else if (roleSetStatus.equals("role-existing")) {
	    existingRolesList = AuthCommonService.selectApplictionUserRoleMiscsForUser(applicationId, userId);
	} else if (roleSetStatus.equals("role-noset")) {
	    remainingRolesList = AuthCommonService.selectApplictionRemainingRolesForUser(applicationId, userId);
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

    @Action(value = "saveUserRoleInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String saveUserRoleInfo() {
	String roles_sel = (String) getParameterValue("roles_sel");
	String roles_del = (String) getParameterValue("roles_del");
	userRoleService.saveUserRoleInfo(user.getUserId(), roles_sel, roles_del);
	this.jsonResult = "{}";
	return SUCCESS;
    }

    @Action(value = "toSetDatarange", results = { @Result(name = "toSetDatarange", location = "datarangeSet_list.jsp") })
    public String toSetDatarange() {
	return "toSetDatarange";
    }

    @Action(value = "queryUserRoleDatarangeInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String queryGroupRoleDatarangeInfo() {
	String drSetStatus = (String) getParameterValue("drSetStatus");
	List<AuthDatarange> existingDrsList = new ArrayList<AuthDatarange>();
	List<AuthDatarange> remainingDrsList = new ArrayList<AuthDatarange>();
	if (drSetStatus.equals("dr-all")) {
	    existingDrsList = AuthCommonService.selectUserRoleDataranges(user.getUserId(), role.getRoleId());
	    remainingDrsList = AuthCommonService.selectApplictionRemainingUserRoleDataranges(
		            application.getApplicationId(), user.getUserId(), role.getRoleId());
	} else if (drSetStatus.equals("dr-existing")) {
	    existingDrsList = AuthCommonService.selectUserRoleDataranges(user.getUserId(), role.getRoleId());
	} else if (drSetStatus.equals("dr-noset")) {
	    remainingDrsList = AuthCommonService.selectApplictionRemainingUserRoleDataranges(
		            application.getApplicationId(), user.getUserId(), role.getRoleId());
	}
	JsonConfig config = new JsonConfig();
	config.setExcludes(new String[] { "createUserId", "createTime", "updateUserId", "updateTime" });

	Map<String, List<AuthDatarange>> map = new HashMap<String, List<AuthDatarange>>();
	map.put("existingDrsList", existingDrsList);
	map.put("remainingDrsList", remainingDrsList);

	this.jsonResult = JSONObject.fromObject(map, config).toString();
	return SUCCESS;
    }

    @Action(value = "saveUserRoleDatarangeInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String saveUserRoleDatarangeInfo() {
	String drs_sel = (String) getParameterValue("drs_sel");
	String drs_del = (String) getParameterValue("drs_del");
	userRoleService.saveUserRoleDatarangeInfo(user.getUserId(), role.getRoleId(), drs_sel, drs_del);
	this.jsonResult = "{}";
	return SUCCESS;
    }

    public String getJsonResult() {
	return jsonResult;
    }

    public void setJsonResult(String jsonResult) {
	this.jsonResult = jsonResult;
    }

    public AuthUser getUser() {
	return user;
    }

    public void setUser(AuthUser user) {
	this.user = user;
    }

    public AuthApplication getApplication() {
	return application;
    }

    public void setApplication(AuthApplication application) {
	this.application = application;
    }

    public AuthRole getRole() {
	return role;
    }

    public void setRole(AuthRole role) {
	this.role = role;
    }

    /**
	 * 
	 */
    private static final long serialVersionUID = 3437590531604181418L;

}
