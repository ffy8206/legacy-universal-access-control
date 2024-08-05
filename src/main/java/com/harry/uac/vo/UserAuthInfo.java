package com.harry.uac.vo;

import java.util.ArrayList;
import java.util.List;

import com.harry.uac.persistence.AuthGroup;
import com.harry.uac.persistence.AuthOrg;
import com.harry.uac.persistence.AuthRole;
import com.harry.uac.persistence.AuthUser;
import com.harry.uac.persistence.UserPrivilege;

public class UserAuthInfo {
    private AuthUser user;
    private List<AuthOrg> uesrOrgsList;
    private List<AuthGroup> userGroupsList;
    private List<AuthRole> userRolesList;
    private List<UserPrivilege> userPrivilegeList;

    public AuthUser getUser() {
	return user;
    }

    public void setUser(AuthUser user) {
	this.user = user;
    }

    public List<AuthOrg> getUesrOrgsList() {
	return uesrOrgsList;
    }

    public void setUesrOrgsList(List<AuthOrg> uesrOrgsList) {
	this.uesrOrgsList = uesrOrgsList;
    }

    public List<AuthGroup> getUserGroupsList() {
	return userGroupsList;
    }

    public List<AuthGroup> getUserGroupsListForApplication(Long applicationId) {
	List<AuthGroup> list = new ArrayList<AuthGroup>();
	for (int i = 0; i < userGroupsList.size(); i++) {
	    if (userGroupsList.get(i).getApplicationId() == applicationId) {
		list.add(userGroupsList.get(i));
	    }
	}
	return list;
    }

    public void setUserGroupsList(List<AuthGroup> userGroupsList) {
	this.userGroupsList = userGroupsList;
    }

    public List<AuthRole> getUserRolesList() {
	return userRolesList;
    }

    public List<AuthRole> getUserRolesListForApplication(Long applicationId) {
	List<AuthRole> list = new ArrayList<AuthRole>();
	for (int i = 0; i < userRolesList.size(); i++) {
	    if (userRolesList.get(i).getApplicationId() == applicationId) {
		list.add(userRolesList.get(i));
	    }
	}
	return list;
    }

    public void setUserRolesList(List<AuthRole> userRolesList) {
	this.userRolesList = userRolesList;
    }

    public List<UserPrivilege> getUserPrivilegeList() {
	return userPrivilegeList;
    }

    public void setUserPrivilegeList(List<UserPrivilege> userPrivilegeList) {
	this.userPrivilegeList = userPrivilegeList;
    }
}
