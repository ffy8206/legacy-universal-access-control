package com.harry.uac.action.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.harry.uac.action.ActionBase;
import com.harry.uac.persistence.AuthApplication;
import com.harry.uac.persistence.AuthGroup;
import com.harry.uac.persistence.AuthUser;
import com.harry.uac.persistence.UserGroupMisc;
import com.harry.uac.service.AuthCommonService;
import com.harry.uac.service.IUserGroupService;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

public class UserSetGroupAction extends ActionBase {
    
    @Autowired
    IUserGroupService userGroupService;
    private String jsonResult;
    AuthGroup group;
    AuthUser user;
    AuthApplication application;

    @Action(value = "userSetGroup", results = { @Result(name = "userSetGroup", location = "user_setgroup.jsp") })
    public String userSetGroup() {
	String userId = (String) getParameterValue("user.userId");
	if (userId != null && !getParameterValue("user.userId").equals("")) {
	    // userGroupService.
	}
	return "userSetGroup";
    }

    @Action(value = "queryUserGroupInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String queryUserGroupInfo() {
	Long userId = user.getUserId();
	Long applicationId = application.getApplicationId();
	String groupSetStatus = (String) getParameterValue("groupSetStatus");
	List<UserGroupMisc> existingGroupsList = new ArrayList<UserGroupMisc>();
	List<AuthGroup> remainingGroupsList = new ArrayList<AuthGroup>();
	if (groupSetStatus.equals("group-all")) {
	    existingGroupsList = AuthCommonService.selectApplictionUserGroupMiscsForUser(applicationId, userId);
	    remainingGroupsList = AuthCommonService.selectApplictionRemainingGroupsForUser(applicationId, userId);
	} else if (groupSetStatus.equals("group-existing")) {
	    existingGroupsList = AuthCommonService.selectApplictionUserGroupMiscsForUser(applicationId, userId);
	} else if (groupSetStatus.equals("group-noset")) {
	    remainingGroupsList = AuthCommonService.selectApplictionRemainingGroupsForUser(applicationId, userId);
	}
	JsonConfig config = new JsonConfig();
	config.setExcludes(new String[] { "createUserId", "createTime", "updateUserId", "updateTime", "groupType",
	        "groupRemark", "groupRule" });

	Map<String, List> map = new HashMap<String, List>();
	map.put("existingGroupsList", existingGroupsList);
	map.put("remainingGroupsList", remainingGroupsList);

	this.jsonResult = JSONObject.fromObject(map, config).toString();
	return SUCCESS;
    }

    @Action(value = "saveUserSetGroupInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String saveUserSetGroupInfo() {
	String userId = (String) getParameterValue("userId");
	String groups_del = (String) getParameterValue("groups_del");
	String groups_sel = (String) getParameterValue("groups_sel");
	userGroupService.saveUserSetGroupInfo(Long.parseLong(userId), groups_sel, groups_del);
	this.jsonResult = "{}";
	return SUCCESS;
    }

    public AuthGroup getGroup() {
	return group;
    }

    public void setGroup(AuthGroup group) {
	this.group = group;
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

    public String getJsonResult() {
	return jsonResult;
    }

    public void setJsonResult(String jsonResult) {
	this.jsonResult = jsonResult;
    }

    /**
	 * 
	 */
    private static final long serialVersionUID = -7668828476736188327L;

}
