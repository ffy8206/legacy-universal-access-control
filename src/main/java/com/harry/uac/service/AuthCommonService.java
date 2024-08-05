package com.harry.uac.service;

import java.util.List;

import javax.annotation.PostConstruct;

import com.harry.uac.dao.AuthCommonMapper;
import com.harry.uac.dao.AuthUserMapper;
import com.harry.uac.vo.UserAuthInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.persistence.AuthDatarange;
import com.harry.uac.persistence.AuthGroup;
import com.harry.uac.persistence.AuthOrg;
import com.harry.uac.persistence.AuthPrivilege;
import com.harry.uac.persistence.AuthRole;
import com.harry.uac.persistence.AuthUser;
import com.harry.uac.persistence.GroupRoleMisc;
import com.harry.uac.persistence.UserGroupMisc;
import com.harry.uac.persistence.UserPrivilege;
import com.harry.uac.persistence.UserRoleMisc;

/**
 * 
 * @author xm
 * 
 */
@Service("authCommonService")
public class AuthCommonService {

    @Autowired
    private AuthCommonMapper authCommonMapper;
    @Autowired
    private AuthUserMapper authUserMapper;
    
    @PostConstruct
    public void init() {
	authCommonDAO = authCommonMapper;
	authUserDAO = authUserMapper;
    }
    
    private static AuthCommonMapper authCommonDAO;
    private static AuthUserMapper authUserDAO;

    /**
     * get existing privileges for role 获取角色已分配的权限
     * 
     * @param roleId
     * @return
     */
    public static List<AuthPrivilege> getExistingPrivilegesForRole(Long roleId) {
	List<AuthPrivilege> privileges = authCommonDAO.existingPrivilegesForRole(roleId);
	return privileges;
    }

    /**
     * get other privileges for role 获取角色未分配权限
     * 
     * @param roleId
     * @return
     */
    public static List<AuthPrivilege> getOtherPrivilegesForRole(Long roleId) {
	List<AuthPrivilege> privileges = authCommonDAO.otherPrivilegesForRole(roleId);
	return privileges;
    }

    /**
     * get user orgs(from ORG_USER) 获取用户所属的组织列表
     * 
     * @param userId
     * @return
     */
    public static List<AuthOrg> selectOrgsForUser(Long userId) {
	List<AuthOrg> orgs = authCommonDAO.selectOrgsForUser(userId);
	return orgs;
    }

    /**
     * get user groups(from USER_GROUP) 获取用户所属的用户组列表(包含所有应用)
     * 
     * @param userId
     * @return
     */
    public static List<AuthGroup> selectGroupsForUser(Long userId) {
	List<AuthGroup> groups = authCommonDAO.selectGroupsForUser(userId);
	return groups;
    }

    /**
     * get user groups(from USER_GROUP ,with application) 根据应用获取用户所属的用户组列表
     * 
     * @param applicationId
     * @param userId
     * @return
     */
    public static List<AuthGroup> selectApplictionGroupsForUser(Long applicationId, Long userId) {
	List<AuthGroup> groups = authCommonDAO.selectApplictionGroupsForUser(applicationId, userId);
	return groups;
    }

    /**
     * get user roles(from USER_ROLE) 根据用户-角色对应关系 获取用户所属的角色列表(包含所有应用,但不是完整的用户所属角色,缺少从用户组中获得的角色)
     * 
     * @param userId
     * @return
     */
    public static List<AuthRole> selectRolesFromUserRoleForUser(Long userId) {
	List<AuthRole> roles = authCommonDAO.selectRolesFromUserRoleForUser(userId);
	return roles;
    }

    /**
     * get user roles(from USER_ROLE ,with application) 按应用根据用户-角色对应关系 获取用户所属的角色列表(不是完整的用户所属角色,缺少从用户组中获得的角色)
     * 
     * @param applicationId
     * @param userId
     * @return
     */
    public static List<AuthRole> selectApplictionRolesFromUserRoleForUser(Long applicationId, Long userId) {
	List<AuthRole> roles = authCommonDAO.selectApplictionRolesFromUserRoleForUser(applicationId, userId);
	return roles;
    }

    /**
     * get user roles(from USER_ROLE,GROUP_ROLE) 获取用户所属的角色列表(包含所有应用,完整的用户所属角色,包含了用户组)
     * 
     * @param userId
     * @return
     */
    public static List<AuthRole> selectRolesForUser(Long userId) {
	List<AuthRole> roles = authCommonDAO.selectRolesForUser(userId);
	return roles;
    }

    /**
     * get user roles(from USER_ROLE,GROUP_ROLE ,with application) 按应用获取用户所属的角色列表(包含指定应用,完整的用户所属角色,包含了用户组)
     * 
     * @param applicationId
     * @param userId
     * @return
     */
    public static List<AuthRole> selectApplictionRolesForUser(Long applicationId, Long userId) {
	List<AuthRole> roles = authCommonDAO.selectApplictionRolesForUser(applicationId, userId);
	return roles;
    }

    /**
     * get user roles(from GROUP_ROLE) 获取用户组对应的角色列表(包含所有应用)
     * 
     * @param groupId
     * @return
     */
    public static List<AuthRole> selectRolesForGroup(Long groupId) {
	List<AuthRole> roles = authCommonDAO.selectRolesForGroup(groupId);
	return roles;
    }

    /**
     * get user roles(from GROUP_ROLE ,with application) 根据应用获取用户组对应的角色列表
     * 
     * @param applicationId
     * @param groupId
     * @return
     */
    public static List<AuthRole> selectApplictionRolesForGroup(Long applicationId, Long groupId) {
	List<AuthRole> roles = authCommonDAO.selectApplictionRolesForGroup(applicationId, groupId);
	return roles;
    }

    /**
     * get user roles(from GROUP_ROLE ,with application) 根据应用获取用户组未分配的角色列表
     * 
     * @param applicationId
     * @param groupId
     * @return
     */
    public static List<AuthRole> selectApplictionRemainingRolesForGroup(Long applicationId, Long groupId) {
	List<AuthRole> roles = authCommonDAO.selectApplictionRemainingRolesForGroup(applicationId, groupId);
	return roles;
    }

    /**
     * get user roles(from GROUP_ROLE ,with application) 根据应用获取用户组已分配的用户组与角色信息列表，包含了数据范围数量
     * 
     * @param applicationId
     * @param groupId
     * @return
     */
    public static List<GroupRoleMisc> selectApplictionGroupRoleMiscsForGroup(Long applicationId, Long groupId) {
	List<GroupRoleMisc> list = authCommonDAO.selectApplictionGroupRoleMiscForGroup(applicationId, groupId);
	return list;
    }

    /**
     * get user PrivilegeDataranges(include all application) 获取用户所有的权限(包含所有的应用),注意UserPrivilege中的datarangeList中包含权限的数据范围
     * 
     * @param groupId
     * @return
     */
    public static List<UserPrivilege> selectPrivilegesForUser(Long userId) {
	List<UserPrivilege> userPrivilegeList = authCommonDAO.selectUserPrivileges(userId);
	if (userPrivilegeList != null && userPrivilegeList.size() > 0) {
	    for (int i = 0; i < userPrivilegeList.size(); i++) {
		List<AuthDatarange> datarangeList = authCommonDAO.selectPrivilegeDataranges(userPrivilegeList.get(i)
		                .getPrivilegeId(), userId);
		userPrivilegeList.get(i).setDatarangeList(datarangeList);
	    }
	}
	return userPrivilegeList;
    }

    /**
     * get user PrivilegeDataranges(with application) 按应用获取用户所有的权限,注意UserPrivilege中的datarangeList中包含权限的数据范围
     * 
     * @param groupId
     * @return
     */
    public static List<UserPrivilege> selectApplictionPrivilegesForUser(Long applicationId, Long userId) {
	List<UserPrivilege> userPrivilegeList = authCommonDAO.selectApplictionUserPrivileges(applicationId, userId);
	if (userPrivilegeList != null && userPrivilegeList.size() > 0) {
	    for (int i = 0; i < userPrivilegeList.size(); i++) {
		List<AuthDatarange> datarangeList = authCommonDAO.selectPrivilegeDataranges(userPrivilegeList.get(i)
		                .getPrivilegeId(), userId);
		userPrivilegeList.get(i).setDatarangeList(datarangeList);
	    }
	}
	return userPrivilegeList;
    }
    
    /**
     * get user PrivilegeDataranges(with application) By dataranges 按应用获取用户所有的权限,注意UserPrivilege中的datarangeList中包含权限的数据范围
     * 
     * @param groupId
     * @return
     */
    public static List<UserPrivilege> selectApplictionPrivilegesForUserByDatarange(Long applicationId, Long userId, Long datarangeId) {
	List<UserPrivilege> userPrivilegeList = authCommonDAO.selectApplictionUserPrivilegesByDatarange(applicationId, userId, datarangeId);
	if (userPrivilegeList != null && userPrivilegeList.size() > 0) {
	    for (int i = 0; i < userPrivilegeList.size(); i++) {
		List<AuthDatarange> datarangeList = authCommonDAO.selectPrivilegeDataranges(userPrivilegeList.get(i)
		                .getPrivilegeId(), userId);
		userPrivilegeList.get(i).setDatarangeList(datarangeList);
	    }
	}
	return userPrivilegeList;
    }
    
    /**
     * get user authinfo(include all application) 获取用户相关所有的身份,权限等信息(包含用户基本信息,组织信息列表,所有应用系统的:角色列表,用户组列表,权限列表[权限中包含数据范围])
     * 
     * @param userId
     * @return
     */
    public static UserAuthInfo getUserAuthInfo(Long userId) {
	UserAuthInfo userAuthInfo = new UserAuthInfo();
	AuthUser user = authUserDAO.selectByPrimaryKey(userId);
	userAuthInfo.setUser(user);
	userAuthInfo.setUesrOrgsList(selectOrgsForUser(userId));
	userAuthInfo.setUserGroupsList(selectGroupsForUser(userId));
	userAuthInfo.setUserRolesList(selectRolesForUser(userId));
	userAuthInfo.setUserPrivilegeList(selectPrivilegesForUser(userId));
	return userAuthInfo;
    }

    /**
     * get user authinfo(from application) 根据应用获取用户相关所有的身份,权限等信息(包含用户基本信息,组织信息列表,指定应用系统的:角色列表,用户组列表,权限列表[权限中包含数据范围])
     * 
     * @param applicationId
     * @param userId
     * @return
     */
    public static UserAuthInfo getUserApplicationAuthInfo(Long applicationId, Long userId) {
	UserAuthInfo userAuthInfo = new UserAuthInfo();
	AuthUser user = authUserDAO.selectByPrimaryKey(userId);
	userAuthInfo.setUser(user);
	userAuthInfo.setUesrOrgsList(selectOrgsForUser(userId));
	userAuthInfo.setUserGroupsList(selectApplictionGroupsForUser(applicationId, userId));
	userAuthInfo.setUserRolesList(selectApplictionRolesForUser(applicationId, userId));
	userAuthInfo.setUserPrivilegeList(selectApplictionPrivilegesForUser(applicationId, userId));
	return userAuthInfo;
    }

    /**
     * get group-role Dataranges 获取用户组-角色设置的数据范围
     * 
     * @param groupId
     * @return
     */
    public static List<AuthDatarange> selectGroupRoleDataranges(Long groupId, Long roleId) {
	List<AuthDatarange> list = authCommonDAO.selectGroupRoleDataranges(groupId, roleId);
	return list;
    }

    /**
     * get Remaining group-role Dataranges 根据应用获取用户组-角色未设置的数据范围
     * 
     * @param groupId
     * @return
     */
    public static List<AuthDatarange> selectApplictionRemainingGroupRoleDataranges(Long applicationId, Long groupId,
	            Long roleId) {
	List<AuthDatarange> list = authCommonDAO.selectApplictionRemainingGroupRoleDataranges(applicationId, groupId,
	                roleId);
	return list;
    }

    /**
     * get user remaining roles(from USER_ROLE ,with application) 根据应用获取用户未分配的角色列表
     * 
     * @param applicationId
     * @param userId
     * @return
     */
    public static List<AuthRole> selectApplictionRemainingRolesForUser(Long applicationId, Long userId) {
	List<AuthRole> roles = authCommonDAO.selectApplictionRemainingRolesForUser(applicationId, userId);
	return roles;
    }

    /**
     * get user roles(from USER_ROLE ,with application) 根据应用获取用户已分配的用户与角色信息列表，包含了数据范围数量
     * 
     * @param applicationId
     * @param groupId
     * @return
     */
    public static List<UserRoleMisc> selectApplictionUserRoleMiscsForUser(Long applicationId, Long userId) {
	List<UserRoleMisc> list = authCommonDAO.selectApplictionUserRoleMiscForUser(applicationId, userId);
	return list;
    }

    /**
     * get user-role Dataranges 获取用户-角色设置的数据范围
     * 
     * @param groupId
     * @return
     */
    public static List<AuthDatarange> selectUserRoleDataranges(Long userId, Long roleId) {
	List<AuthDatarange> list = authCommonDAO.selectUserRoleDataranges(userId, roleId);
	return list;
    }

    /**
     * get Remaining user-role Dataranges 根据应用获取用户-角色未设置的数据范围
     * 
     * @param groupId
     * @return
     */
    public static List<AuthDatarange> selectApplictionRemainingUserRoleDataranges(Long applicationId, Long userId,
	            Long roleId) {
	List<AuthDatarange> list = authCommonDAO.selectApplictionRemainingUserRoleDataranges(applicationId, userId,
	                roleId);
	return list;
    }

    public static List<UserGroupMisc> selectApplictionUserGroupMiscsForUser(Long applicationId, Long userId) {
	List<UserGroupMisc> list = authCommonDAO.selectApplictionUserGroupMiscForUser(applicationId, userId);
	return list;
    }

    public static List<AuthGroup> selectApplictionRemainingGroupsForUser(Long applicationId, Long userId) {
	List<AuthGroup> groups = authCommonDAO.selectApplictionRemainingGroupsForUser(applicationId, userId);
	return groups;
    }
}
