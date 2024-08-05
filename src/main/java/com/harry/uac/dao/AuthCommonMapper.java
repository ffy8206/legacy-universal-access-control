package com.harry.uac.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.harry.uac.persistence.AuthDatarange;
import com.harry.uac.persistence.AuthGroup;
import com.harry.uac.persistence.AuthOrg;
import com.harry.uac.persistence.AuthPrivilege;
import com.harry.uac.persistence.AuthRole;
import com.harry.uac.persistence.GroupRoleMisc;
import com.harry.uac.persistence.UserGroupMisc;
import com.harry.uac.persistence.UserPrivilege;
import com.harry.uac.persistence.UserRoleMisc;
@MyBatisRepository
public interface AuthCommonMapper {

	List<AuthPrivilege> existingPrivilegesForRole(Long roleId);

	List<AuthPrivilege> otherPrivilegesForRole(Long roleId);

	// ------------------------------------------
	List<AuthOrg> selectOrgsForUser(Long userId);

	// ------------------------------------------
	List<AuthGroup> selectGroupsForUser(Long userId);

	List<AuthGroup> selectApplictionGroupsForUser(
			@Param("applicationId") Long applicationId,
			@Param("userId") Long userId);

	// ------------------------------------------
	List<AuthRole> selectRolesFromUserRoleForUser(Long userId);

	List<AuthRole> selectApplictionRolesFromUserRoleForUser(
			@Param("applicationId") Long applicationId,
			@Param("userId") Long userId);

	// ------------------------------------------
	List<AuthRole> selectRolesForUser(Long userId);

	List<AuthRole> selectApplictionRolesForUser(
			@Param("applicationId") Long applicationId,
			@Param("userId") Long userId);

	// ------------------------------------------
	List<AuthRole> selectRolesForGroup(Long groupId);

	List<AuthRole> selectApplictionRolesForGroup(
			@Param("applicationId") Long applicationId,
			@Param("groupId") Long groupId);

	List<AuthRole> selectApplictionRemainingRolesForGroup(
			@Param("applicationId") Long applicationId,
			@Param("groupId") Long groupId);

	List<GroupRoleMisc> selectApplictionGroupRoleMiscForGroup(
			@Param("applicationId") Long applicationId,
			@Param("groupId") Long groupId);

	// ------------------------------------------
	List<UserPrivilege> selectUserPrivileges(Long userId);

	List<UserPrivilege> selectApplictionUserPrivileges(
			@Param("applicationId") Long applicationId,
			@Param("userId") Long userId);
	
	List<UserPrivilege> selectApplictionUserPrivilegesByDatarange(
			@Param("applicationId") Long applicationId,
			@Param("userId") Long userId,
			@Param("datarangeId") Long datarangeId);

	List<AuthDatarange> selectPrivilegeDataranges(
			@Param("privilegeId") Long privilegeId, @Param("userId") Long userId);

	// ------------------------------------------
	List<AuthDatarange> selectGroupRoleDataranges(
			@Param("groupId") Long groupId, @Param("roleId") Long roleId);

	List<AuthDatarange> selectApplictionRemainingGroupRoleDataranges(
			@Param("applicationId") Long applicationId,
			@Param("groupId") Long groupId, @Param("roleId") Long roleId);

	// ------------------------------------------

	List<AuthRole> selectApplictionRemainingRolesForUser(
			@Param("applicationId") Long applicationId,
			@Param("userId") Long userId);

	List<UserRoleMisc> selectApplictionUserRoleMiscForUser(
			@Param("applicationId") Long applicationId,
			@Param("userId") Long groupId);

	// ------------------------------------------
	List<AuthDatarange> selectUserRoleDataranges(@Param("userId") Long userId,
			@Param("roleId") Long roleId);

	List<AuthDatarange> selectApplictionRemainingUserRoleDataranges(
			@Param("applicationId") Long applicationId,
			@Param("userId") Long userId, @Param("roleId") Long roleId);

	List<UserGroupMisc> selectApplictionUserGroupMiscForUser(
			@Param("applicationId") Long applicationId,
			@Param("userId") Long userId);

	List<AuthGroup> selectApplictionRemainingGroupsForUser(
			@Param("applicationId") Long applicationId,
			@Param("userId") Long userId);

}