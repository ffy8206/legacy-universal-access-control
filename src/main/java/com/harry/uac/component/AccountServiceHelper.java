package com.harry.uac.component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.harry.uac.ws.server.base.WSResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springside.modules.mapper.BeanMapper;
import com.harry.uac.common.exception.AppException;
import com.harry.uac.common.exception.BusinessException;
import com.harry.uac.common.util.DictUtil;
import com.harry.uac.dao.AuthApplicationMapper;
import com.harry.uac.dao.AuthDatarangeMapper;
import com.harry.uac.dao.AuthOrgMapper;
import com.harry.uac.dao.AuthRoleMapper;
import com.harry.uac.dao.AuthUserMapper;
import com.harry.uac.dao.AuthUserRoleMapper;
import com.harry.uac.dao.DictMapper;
import com.harry.uac.dao.ViewAuthOrgUserMapper;
import com.harry.uac.persistence.AuthApplication;
import com.harry.uac.persistence.AuthApplicationExample;
import com.harry.uac.persistence.AuthDatarange;
import com.harry.uac.persistence.AuthDatarangeExample;
import com.harry.uac.persistence.AuthOrg;
import com.harry.uac.persistence.AuthOrgExample;
import com.harry.uac.persistence.AuthRole;
import com.harry.uac.persistence.AuthRoleExample;
import com.harry.uac.persistence.AuthUser;
import com.harry.uac.persistence.AuthUserExample;
import com.harry.uac.persistence.AuthUserRole;
import com.harry.uac.persistence.AuthUserRoleExample;
import com.harry.uac.persistence.Dict;
import com.harry.uac.persistence.UserPrivilege;
import com.harry.uac.persistence.ViewAuthOrgUser;
import com.harry.uac.persistence.ViewAuthOrgUserExample;
import com.harry.uac.service.AuthCommonService;
import com.harry.uac.ws.server.dto.AuthDatarangeDTO;
import com.harry.uac.ws.server.dto.AuthOrgDTO;
import com.harry.uac.ws.server.dto.AuthPrivilegeDTO;
import com.harry.uac.ws.server.dto.AuthUserDTO;
import com.harry.uac.ws.server.dto.AuthUserRoleDTO;
import com.google.common.collect.Lists;

@Component("accountServiceHelper")
public class AccountServiceHelper {
    @Autowired
    private AuthApplicationMapper authApplicationMapper;
    @Autowired
    private AuthDatarangeMapper authDatarangeMapper;
    @Autowired
    private AuthUserMapper authUserMapper;
    @Autowired
    private AuthRoleMapper authRoleMapper;
    @Autowired
    private AuthUserRoleMapper authUserRoleMapper;
    @Autowired
    private AuthOrgMapper authOrgMapper;
    @Autowired
    private ViewAuthOrgUserMapper viewAuthOrgUserMapper;
    @Autowired
    private DictMapper dictMapper;

    public boolean check(String uid, String appcode, String privilege, String dataRange) {
	List<AuthPrivilegeDTO> AuthPrivilegeDTO = selectApplictionPrivileges(uid, appcode);
	AuthPrivilegeDTO privilegeDTO = null;
	for (AuthPrivilegeDTO authPrivilegeDTO: AuthPrivilegeDTO) {
	    if (authPrivilegeDTO.getPrivilegeCode().equalsIgnoreCase(privilege)) {
		privilegeDTO = authPrivilegeDTO;
		break;
	    }
	}
	if (null != privilegeDTO) {
	    for (AuthDatarangeDTO authDatarangeDTO: privilegeDTO.getDataRangeList()) {
		if (authDatarangeDTO.getDatarangeCode().equalsIgnoreCase(dataRange)) {
		    return true;
		}
	    }
	}
	return false;
    }

    public List<AuthPrivilegeDTO> selectApplictionPrivileges(String uid, String appcode) {
	Long appId = getAppIdByCode(appcode);
	Long userId = getUserIdByUid(uid);
	List<AuthPrivilegeDTO> privilegeDTOs = Lists.newArrayList();
	List<UserPrivilege> userPrivilegeList = AuthCommonService.selectApplictionPrivilegesForUser(appId, userId);
	for (UserPrivilege privilege: userPrivilegeList) {
	    AuthPrivilegeDTO privilegeDTO = BeanMapper.map(privilege, AuthPrivilegeDTO.class);
	    privilegeDTO.setAppcode(appcode);
	    List<AuthDatarangeDTO> datarangeDTOs = Lists.newArrayList();
	    for (AuthDatarange datarange: privilege.getDatarangeList()) {
		AuthDatarangeDTO authDatarangeDTO = BeanMapper.map(datarange, AuthDatarangeDTO.class);
		authDatarangeDTO.setAppcode(appcode);
		datarangeDTOs.add(authDatarangeDTO);
	    }
	    privilegeDTO.setDataRangeList(datarangeDTOs);
	    privilegeDTOs.add(privilegeDTO);
	}
	return privilegeDTOs;
    }

    public List<AuthPrivilegeDTO> selectApplictionPrivilegesByDatarange(String uid, String appcode, String datarangeCode) {
	Long appId = getAppIdByCode(appcode);
	Long userId = getUserIdByUid(uid);
	Long datarangeId = getDatarangeIdByCode(appId, datarangeCode);
	List<AuthPrivilegeDTO> privilegeDTOs = Lists.newArrayList();
	List<UserPrivilege> userPrivilegeList = AuthCommonService.selectApplictionPrivilegesForUserByDatarange(appId,
	                userId, datarangeId);
	for (UserPrivilege privilege: userPrivilegeList) {
	    AuthPrivilegeDTO privilegeDTO = BeanMapper.map(privilege, AuthPrivilegeDTO.class);
	    privilegeDTO.setAppcode(appcode);
	    List<AuthDatarangeDTO> datarangeDTOs = Lists.newArrayList();
	    for (AuthDatarange datarange: privilege.getDatarangeList()) {
		AuthDatarangeDTO authDatarangeDTO = BeanMapper.map(datarange, AuthDatarangeDTO.class);
		authDatarangeDTO.setAppcode(appcode);
		datarangeDTOs.add(authDatarangeDTO);
	    }
	    privilegeDTO.setDataRangeList(datarangeDTOs);
	    privilegeDTOs.add(privilegeDTO);
	}
	return privilegeDTOs;
    }

    public void saveUserRoleDatarange(String appcode, String uid, String roleName, String datarangeCodes)
	            throws AppException {
	Long appId = getAppIdByCode(appcode);
	Long userId = getUserIdByUid(uid);
	Long roleId = getRoleIdByName(appId, roleName);
	if (StringUtils.isNotEmpty(datarangeCodes)) {
	    String[] datarangeCodeArray = datarangeCodes.split(",");
	    for (int i = 0; i < datarangeCodeArray.length; i++) {
		Long datarangeId = getDatarangeIdByCode(appId, datarangeCodeArray[i]);
		// datarange does not exist, then add one
		if (0 == datarangeId) {
		    AuthDatarangeDTO dr = new AuthDatarangeDTO();
		    dr.setAppcode(appcode);
		    dr.setDatarangeCode(datarangeCodeArray[i]);
		    datarangeId = insertDatarange(dr);
		}
		// if user-role-datarange exist then add
		AuthUserRoleExample example = new AuthUserRoleExample();
		AuthUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andRoleIdEqualTo(roleId);
		criteria.andDatarangeIdEqualTo(datarangeId);
		int rsCount = authUserRoleMapper.countByExample(example);
		if (rsCount <= 0) {
		    AuthUserRole userRole = new AuthUserRole();
		    userRole.setUserId(userId);
		    userRole.setRoleId(roleId);
		    userRole.setDatarangeId(datarangeId);
		    userRole.setCreateTime(new Date());
		    authUserRoleMapper.insert(userRole);
		} else {
		    AuthUserRole userRole = new AuthUserRole();
		    userRole.setUserId(userId);
		    userRole.setRoleId(roleId);
		    userRole.setDatarangeId(datarangeId);
		    authUserRoleMapper.updateByExample(userRole, example);
		    // throw new BusinessException("user has been autorized",
		    // ExceptionConsts.USER_HAS_BEEN_AUTHORIZED);
		}
	    }
	    // 删除datarangeId为空的记录
	    AuthUserRoleExample example = new AuthUserRoleExample();
	    AuthUserRoleExample.Criteria criteria = example.createCriteria();
	    criteria.andUserIdEqualTo(userId);
	    criteria.andRoleIdEqualTo(roleId);
	    criteria.andDatarangeIdIsNull();
	    authUserRoleMapper.deleteByExample(example);
	}
    }

    public List<AuthDatarangeDTO> selectDataRangeByUid(String uid, String appcode) {
	List<AuthDatarangeDTO> dataRangeList = null;
	Long appId = getAppIdByCode(appcode);
	Long userId = getUserIdByUid(uid);
	AuthUserRoleExample example = new AuthUserRoleExample();
	AuthUserRoleExample.Criteria criteria = example.createCriteria();
	criteria.andUserIdEqualTo(userId);
	List<AuthUserRole> userRoleList = authUserRoleMapper.selectByExample(example);
	if (null != userRoleList && !userRoleList.isEmpty()) {
	    dataRangeList = new ArrayList<AuthDatarangeDTO>();
	    for (AuthUserRole userRole: userRoleList) {
		AuthDatarange dataRange = authDatarangeMapper.selectByPrimaryKey(userRole.getDatarangeId());
		if (appId == dataRange.getApplicationId()) {
		    dataRangeList.add(BeanMapper.map(dataRange, AuthDatarangeDTO.class));
		}
	    }
	}
	return dataRangeList;
    }

	public void deleteUserRoleDatarange(String appcode, String dataRangeCode, String roleName) {
		Long appId = getAppIdByCode(appcode);
		Long datarangeId = getDatarangeIdByCode(appId, dataRangeCode);
		Long roleId = getRoleIdByName(appId, roleName);
		AuthUserRoleExample example = new AuthUserRoleExample();
		AuthUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andDatarangeIdEqualTo(datarangeId);
		criteria.andRoleIdEqualTo(roleId);
		authUserRoleMapper.deleteByExample(example);
	}

    public Long saveDatarange(AuthDatarangeDTO datarange) throws AppException {
	Long appId = getAppIdByCode(datarange.getAppcode());
	Long datarangeId = getDatarangeIdByCode(appId, datarange.getDatarangeCode());
	// does not exist, then add one
	if (0 == datarangeId) {
	    return insertDatarange(datarange);
	} else {
	    return 1L;
	}
    }

    public Long insertDatarange(AuthDatarangeDTO datarange) {
	Long appId = getAppIdByCode(datarange.getAppcode());
	AuthDatarange dr = new AuthDatarange();
	dr.setApplicationId(appId);
	dr.setDatarangeCode(datarange.getDatarangeCode());
	dr.setDatarangeName(datarange.getDatarangeName());
	dr.setDatarangeValue(datarange.getDatarangeValue());
	dr.setDatarangeDescription(datarange.getDatarangeDescription());
	dr.setCreateTime(new Date());
	dr.setUpdateTime(new Date());
	return Long.valueOf(authDatarangeMapper.insert(dr));
    }

    public Long deleteDatarange(String appcode, String dataRangeCode) {
	Long appId = getAppIdByCode(appcode);
	AuthDatarangeExample example = new AuthDatarangeExample();
	AuthDatarangeExample.Criteria criteria = example.createCriteria();
	criteria.andApplicationIdEqualTo(appId);
	criteria.andDatarangeCodeEqualTo(dataRangeCode);
	return Long.valueOf(authDatarangeMapper.deleteByExample(example));
    }

    private Long getAppIdByCode(String appcode) {
	Long appId = Long.valueOf(0);
	AuthApplicationExample example = new AuthApplicationExample();
	AuthApplicationExample.Criteria criteria = example.createCriteria();
	criteria.andApplicationNameEqualTo(appcode);
	List<AuthApplication> appList = authApplicationMapper.selectByExample(example);
	if (appList.size() > 0) {
	    appId = appList.get(0).getApplicationId();
	}
	return appId;
    }

    private AuthApplication getAppByCode(String appcode) {
	AuthApplication app = null;
	AuthApplicationExample example = new AuthApplicationExample();
	AuthApplicationExample.Criteria criteria = example.createCriteria();
	criteria.andApplicationNameEqualTo(appcode);
	List<AuthApplication> appList = authApplicationMapper.selectByExample(example);
	if (appList.size() > 0) {
	    app = appList.get(0);
	}
	return app;
    }

    private AuthOrg getAuthOrgByOrgcode(String orgcode) {
	AuthOrg org = null;
	AuthOrgExample example = new AuthOrgExample();
	AuthOrgExample.Criteria criteria = example.createCriteria();
	criteria.andOrgCodeEqualTo(orgcode);
	List<AuthOrg> orgs = authOrgMapper.selectByExample(example);
	if (orgs.size() > 0) {
	    org = orgs.get(0);
	}
	return org;
    }

    private List<AuthOrg> getSubAuthOrg(String parentOrgCode) {
	AuthOrgExample example = new AuthOrgExample();
	AuthOrgExample.Criteria criteria = example.createCriteria();
	criteria.andOrgParentIdEqualTo(parentOrgCode);
	List<AuthOrg> orgs = authOrgMapper.selectByExample(example);
	return orgs;
    }

    private Long getDatarangeIdByCode(Long appId, String dararangeCode) {
	Long datarangeId = Long.valueOf(0);
	AuthDatarangeExample example = new AuthDatarangeExample();
	AuthDatarangeExample.Criteria criteria = example.createCriteria();
	criteria.andApplicationIdEqualTo(appId);
	criteria.andDatarangeCodeEqualTo(dararangeCode);
	List<AuthDatarange> datarangeList = authDatarangeMapper.selectByExample(example);
	if (datarangeList.size() > 0) {
	    datarangeId = datarangeList.get(0).getDatarangeId();
	}
	return datarangeId;
    }

    private AuthDatarange getDatarangeByCode(Long appId, String dararangeCode) {
	AuthDatarange datarange = null;
	AuthDatarangeExample example = new AuthDatarangeExample();
	AuthDatarangeExample.Criteria criteria = example.createCriteria();
	criteria.andApplicationIdEqualTo(appId);
	criteria.andDatarangeCodeEqualTo(dararangeCode);
	List<AuthDatarange> datarangeList = authDatarangeMapper.selectByExample(example);
	if (datarangeList.size() > 0) {
	    datarange = datarangeList.get(0);
	}
	return datarange;
    }

    private Long getRoleIdByName(Long appId, String roleName) {
	Long roleId = Long.valueOf(0);
	AuthRoleExample example = new AuthRoleExample();
	AuthRoleExample.Criteria criteria = example.createCriteria();
	criteria.andApplicationIdEqualTo(appId);
	criteria.andRoleNameEqualTo(roleName);
	List<AuthRole> roleList = authRoleMapper.selectByExample(example);
	if (roleList.size() > 0) {
	    roleId = roleList.get(0).getRoleId();
	}
	return roleId;
    }

    private AuthRole getRoleByName(Long appId, String roleName) {
	AuthRole role = null;
	AuthRoleExample example = new AuthRoleExample();
	AuthRoleExample.Criteria criteria = example.createCriteria();
	criteria.andApplicationIdEqualTo(appId);
	criteria.andRoleNameEqualTo(roleName);
	List<AuthRole> roleList = authRoleMapper.selectByExample(example);
	if (roleList.size() > 0) {
	    role = roleList.get(0);
	}
	return role;
    }

    private Long getUserIdByUid(String uid) {
	Long userId = Long.valueOf(0);
	AuthUserExample example = new AuthUserExample();
	AuthUserExample.Criteria criteria = example.createCriteria();
	criteria.andUserUidEqualTo(uid);
	List<AuthUser> users = authUserMapper.selectByExample(example);
	if (users.size() > 0) {
	    userId = users.get(0).getUserId();
	}
	return userId;
    }

    private AuthUser getUserByUid(String uid) {
	AuthUser user = null;
	AuthUserExample example = new AuthUserExample();
	AuthUserExample.Criteria criteria = example.createCriteria();
	criteria.andUserUidEqualTo(uid);
	List<AuthUser> users = authUserMapper.selectByExampleWithBLOBs(example);
	if (users.size() > 0) {
	    user = users.get(0);
	}
	return user;
    }

    public List<AuthUserRoleDTO> selectUserRole(AuthUserRoleDTO authUserRoleDTO) {
	AuthUserRoleExample example = new AuthUserRoleExample();
	AuthUserRoleExample.Criteria criteria = example.createCriteria();
	Long appId = getAppIdByCode(authUserRoleDTO.getAppcode());
	if (null != authUserRoleDTO.getUid()) {
	    Long userId = getUserIdByUid(authUserRoleDTO.getUid());
	    criteria.andUserIdEqualTo(userId);
	}
	if (null != authUserRoleDTO.getRoleName()) {
	    Long roleId = getRoleIdByName(appId, authUserRoleDTO.getRoleName());
	    criteria.andRoleIdEqualTo(roleId);
	}
	if (null != authUserRoleDTO.getDataRange()) {
	    Long datarangeId = getDatarangeIdByCode(appId, authUserRoleDTO.getDataRange());
	    criteria.andDatarangeIdEqualTo(datarangeId);
	}
	if (null != authUserRoleDTO.getCreateUserUid()) {
	    Long createUserId = getUserIdByUid(authUserRoleDTO.getCreateUserUid());
	    criteria.andCreateUserIdEqualTo(createUserId);
	}
	List<AuthUserRole> userRoleList = authUserRoleMapper.selectByExample(example);
	List<AuthUserRoleDTO> userRoleDTOList = null;
	if (null != userRoleList && !userRoleList.isEmpty()) {
	    userRoleDTOList = new ArrayList<AuthUserRoleDTO>();
	    for (AuthUserRole userRole: userRoleList) {
		AuthUserRoleDTO userDTO = new AuthUserRoleDTO();
		userDTO.setUid(authUserMapper.selectByPrimaryKey(userRole.getUserId()).getUserUid());
		if (null != userRole.getDatarangeId() && userRole.getDatarangeId() != 0) {
		    userDTO.setDataRange(authDatarangeMapper.selectByPrimaryKey(userRole.getDatarangeId())
			            .getDatarangeCode());
		}
		if (null != userRole.getRoleId() && userRole.getRoleId() != 0L) {
		    userDTO.setRoleName(authRoleMapper.selectByPrimaryKey(userRole.getRoleId()).getRoleName());
		}
		userRoleDTOList.add(userDTO);
	    }
	}
	return userRoleDTOList;
    }

    public int insertUserWS(AuthUser userInfo) {
	userInfo.setCreateTime(new Date());
	userInfo.setUpdateTime(new Date());
	return authUserMapper.insert(userInfo);
    }

    public List<AuthUserDTO> selectAuthUser(AuthUserDTO authUserDTO) {
	AuthUserExample example = new AuthUserExample();
	AuthUserExample.Criteria criteria = example.createCriteria();
	if (null != authUserDTO && null != authUserDTO.getUserName()) {
	    criteria.andUserNameLikeInsensitive("%" + authUserDTO.getUserName() + "%");
	}
	if (null != authUserDTO && null != authUserDTO.getUserUid()) {
	    criteria.andUserUidEqualTo(authUserDTO.getUserUid());
	}
	if (null != authUserDTO && null != authUserDTO.getUserEmail()) {
	    criteria.andUserEmailEqualTo(authUserDTO.getUserEmail());
	}
	List<AuthUser> authUserList = authUserMapper.selectByExampleWithBLOBs(example);
	List<AuthUserDTO> authUserDTOList = null;
	if (null != authUserList && !authUserList.isEmpty()) {
	    authUserDTOList = new ArrayList<AuthUserDTO>();
	    for (AuthUser authUser: authUserList) {
			authUserDTOList.add(BeanMapper.map(authUser, AuthUserDTO.class));
			if(authUser.getUserPositionLevelDict()!=null){
				AuthUserDTO tmpDTO = authUserDTOList.get(authUserDTOList.size()-1);
				Dict dict = dictMapper.selectByPrimaryKey(""+authUser.getUserPositionLevelDict(), "dict_positon_title");
				tmpDTO.setUserPositionLevelDisp(dict.getValue());
			}
	    }
	}
	return authUserDTOList;
    }
    
    private void fomartUserDTO(AuthUserDTO userDTO) {
	// gets photo
	AuthUser userEntity = getUserByUid(userDTO.getUserUid());
	if (null != userEntity.getUserPhoto()) {
	    userDTO.setUserPhoto(userEntity.getUserPhoto());
	}
	if (null != userDTO.getUserGender()) {
	    int gender = userDTO.getUserGender();
	    String genderDisp = "";
	    switch (gender) {
		case 1:
		    genderDisp = "male";
		    break;
		case 2:
		    genderDisp = "female";
		    break;
		default:
		    genderDisp = "unkown";
		    break;
	    }
	    userDTO.setUserGenderDisp(genderDisp);
	}
	if (null != userDTO.getUserPositionLevelDict())
	    userDTO.setUserPositionLevelDisp(DictUtil.getDictDisplayText("DICT_POSITON_TITLE", String.valueOf(userDTO.getUserPositionLevelDict())));
    }

    public void selectOrg(AuthOrgDTO parentOrgDTO, boolean isDeep) throws AppException {
	AuthOrg org = getAuthOrgByOrgcode(parentOrgDTO.getOrgCode());
	if (org == null) {
	    throw new BusinessException(WSResult.BUZ_ERROR_ORG_NOTFOUND);
	}
	BeanMapper.copy(org, parentOrgDTO);
	// gets manager
	if (!StringUtils.isBlank(org.getOrgManagerUid())) {
	    String managerUid = org.getOrgManagerUid();
	    AuthUser manager = getUserByUid(managerUid);
	    AuthUserDTO userDTO = BeanMapper.map(manager, AuthUserDTO.class);
	    fomartUserDTO(userDTO);
	    parentOrgDTO.setOrgManager(userDTO);
	}
	// gets orgusers
	List<ViewAuthOrgUser> authOrgUsers = Lists.newArrayList();
	ViewAuthOrgUserExample viewOrgUserExample = new ViewAuthOrgUserExample();
	ViewAuthOrgUserExample.Criteria viewOrgUserCriteria = viewOrgUserExample.createCriteria();
	viewOrgUserCriteria.andOrgIdEqualTo(org.getOrgId());
	authOrgUsers = viewAuthOrgUserMapper.selectByExample(viewOrgUserExample);
	List<AuthUserDTO> orguserDTOs = BeanMapper.mapList(authOrgUsers, AuthUserDTO.class);
	for (AuthUserDTO userDTO : orguserDTOs) {
	    fomartUserDTO(userDTO);
	}
	parentOrgDTO.setOrgUserList(orguserDTOs);

	// gets suborg
	List<AuthOrg> subOrgs = getSubAuthOrg(parentOrgDTO.getOrgCode());
	List<AuthOrgDTO> subOrgDTOs = BeanMapper.mapList(subOrgs, AuthOrgDTO.class);
	parentOrgDTO.setSubOrgList(subOrgDTOs);

	if (!isDeep)
	    return;
	for (int i = 0; i < subOrgDTOs.size(); i++) {
	    selectOrg(subOrgDTOs.get(i), true);
	}
    }

}
