package com.harry.uac.ws.server.impl;

import java.util.List;

import javax.jws.WebService;

import com.harry.uac.ws.server.dto.AuthOrgDTO;
import com.harry.uac.ws.server.dto.AuthPrivilegeDTO;
import com.harry.uac.ws.server.dto.AuthUserDTO;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springside.modules.mapper.BeanMapper;

import com.harry.uac.common.exception.AppException;
import com.harry.uac.component.AccountServiceHelper;
import com.harry.uac.persistence.AuthUser;
import com.harry.uac.service.ILoginService;
import com.harry.uac.ws.server.AuthorityService;
import com.harry.uac.ws.server.WsConstants;
import com.harry.uac.ws.server.base.WebServiceExceptionHandler;
import com.harry.uac.ws.server.dto.AuthDatarangeDTO;
import com.harry.uac.ws.server.dto.AuthUserRoleDTO;
import com.harry.uac.ws.server.result.AuthDataRangeResult;
import com.harry.uac.ws.server.result.AuthOrgResult;
import com.harry.uac.ws.server.result.AuthUserResult;
import com.harry.uac.ws.server.result.AuthUserRoleResult;
import com.harry.uac.ws.server.result.AuthoritySession;
import com.harry.uac.ws.server.result.AvailablePrivilegeResult;
import com.harry.uac.ws.server.result.OperationResult;

/**
 * WebService implementation.
 * 
 * @author wangding
 */
// serviceName points out <wsdl:service> <wsdl:binding> in WSDL,
// endpointInterface means full name of Interface Class.
@Service("authorityWebService")
@WebService(serviceName = "AuthorityService", endpointInterface = "com.harry.uac.ws.server.AuthorityService", targetNamespace = WsConstants.NS)
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private ILoginService loginService;

	@Autowired
	private AccountServiceHelper accountServiceHelper;

	@Override
	public AuthoritySession login(String appcode, String uid, String password) {
		AuthoritySession session = new AuthoritySession();
		try {
			Validate.notBlank(appcode, "appcode is null");
			Validate.notBlank(uid, "uid is null");
			Validate.notBlank(password, "password is null");

			AuthUser authUser = loginService.checkUserPassword(uid, password);
			if (null == authUser) {
				session.setError("501", "login failed");
				return session;
			}

			AuthUserDTO user = BeanMapper.map(authUser, AuthUserDTO.class);
			session.setUser(user);
			session.setAppcode(appcode);
			session.setPrivilegeList(accountServiceHelper
					.selectApplictionPrivileges(uid, appcode));
			return session;
		} catch (AppException e) {
			return WebServiceExceptionHandler.handleBusinessError(session, e);
		} catch (IllegalArgumentException e) {
			return WebServiceExceptionHandler.handleParameterError(session, e);
		} catch (RuntimeException e) {
			return WebServiceExceptionHandler.handleGeneralError(session, e);
		}
	}

	@Override
	public OperationResult check(AuthoritySession authoritySession,
                                 String privilegeCode, String dataRangeCode) {
		OperationResult authorizeResult = new OperationResult();
		boolean result = accountServiceHelper.check(authoritySession.getUser()
				.getUserUid(), authoritySession.getAppcode(), privilegeCode,
				dataRangeCode);
		authorizeResult.setResult(result);
		return authorizeResult;
	}

	@Override
	public AvailablePrivilegeResult getPrivilegeByDatarange(
			AuthoritySession authoritySession, String dataRangeCode) {
		AvailablePrivilegeResult result = new AvailablePrivilegeResult();
		List<AuthPrivilegeDTO> privileges = accountServiceHelper
				.selectApplictionPrivilegesByDatarange(authoritySession
						.getUser().getUserUid(), authoritySession.getAppcode(),
						dataRangeCode);
		result.setPrivilegeList(privileges);
		return result;
	}

	// need modified
	@Override
	public OperationResult saveUserRoleDatarange(String uid, String roleName,
			String dataRangeCode, String appCode) {
		OperationResult authorizeResult = new OperationResult();
		try {
			Validate.notBlank(appCode, "appcode is null");
			Validate.notBlank(uid, "userUid is null");
			Validate.notBlank(roleName, "roleName is null");
			Validate.notBlank(dataRangeCode, "dataRangeCode is null");

			accountServiceHelper.saveUserRoleDatarange(appCode, uid, roleName,
					dataRangeCode);
			authorizeResult.setResult(true);
			return authorizeResult;
		} catch (Exception e) {
			authorizeResult.setResult(false);
			return WebServiceExceptionHandler.handleGeneralError(
					authorizeResult, e);
		}
	}

	@Override
	public OperationResult saveUser(AuthUserDTO authUserDTO) {
		OperationResult operationResult = new OperationResult();
		try {
			AuthUser authUser = BeanMapper.map(authUserDTO, AuthUser.class);
			accountServiceHelper.insertUserWS(authUser);
			operationResult = new OperationResult();
			operationResult.setResult(true);
			return operationResult;
		} catch (Exception e) {
			operationResult.setResult(false);
			return WebServiceExceptionHandler.handleGeneralError(
					operationResult, e);
		}
	}

	@Override
	public AuthUserResult selectAuthUser(AuthUserDTO authUserDTO) {
		AuthUserResult result = new AuthUserResult();
		try {
			List<AuthUserDTO> authUserDTOList = accountServiceHelper
					.selectAuthUser(authUserDTO);
			result.setUserList(authUserDTOList);
			return result;
		} catch (Exception e) {
			return WebServiceExceptionHandler.handleGeneralError(result, e);
		}
	}

	@Override
	public AuthDataRangeResult selectDataRangeByUid(String uid, String appcode) {
		AuthDataRangeResult authDataRangeResult = null;
		try {
			authDataRangeResult = new AuthDataRangeResult();
			List<AuthDatarangeDTO> dataRangeList = accountServiceHelper
					.selectDataRangeByUid(uid, appcode);
			authDataRangeResult = new AuthDataRangeResult();
			authDataRangeResult.setDataRangeList(dataRangeList);
		} catch (Exception e) {
			return WebServiceExceptionHandler.handleGeneralError(
					authDataRangeResult, e);
		}
		return authDataRangeResult;
	}

	@Override
	public AuthUserRoleResult selectUserRole(AuthUserRoleDTO authUserRoleDTO) {
		Validate.notNull(authUserRoleDTO, "AuthUserRoleDTO is not null");
		List<AuthUserRoleDTO> userRoleDTOList = accountServiceHelper
				.selectUserRole(authUserRoleDTO);
		AuthUserRoleResult authUserRoleResult = new AuthUserRoleResult();
		authUserRoleResult.setAuthUserRoleDTOList(userRoleDTOList);
		return authUserRoleResult;
	}

	@Override
	public OperationResult saveDataRange(AuthDatarangeDTO authDatarangeDTO) {
		OperationResult operationResult = new OperationResult();
		try {
			accountServiceHelper.saveDatarange(authDatarangeDTO);
			operationResult.setResult(true);
			return operationResult;
		} catch (Exception e) {
			return WebServiceExceptionHandler.handleGeneralError(
					operationResult, e);
		}
	}

	@Override
	public AuthOrgResult selectOrg(String orgcode, boolean isDeep) {
		AuthOrgResult result = new AuthOrgResult();
		AuthOrgDTO orgDTO = new AuthOrgDTO();
		orgDTO.setOrgCode(orgcode);
		try {
			accountServiceHelper.selectOrg(orgDTO, isDeep);
		} catch (AppException e) {
			return WebServiceExceptionHandler.handleBusinessError(result, e);
		}
		result.setOrg(orgDTO);
		return result;
	}

	@Override
	public OperationResult deleteUserRoleDatarange(String dataRangeCode,
			String appcode, String roleName) {
		OperationResult operationResult = new OperationResult();
		try {
			Validate.notBlank(appcode, "appcode is null");
			Validate.notBlank(roleName, "roleName is null");
			Validate.notBlank(dataRangeCode, "dataRangeCode is null");
			accountServiceHelper.deleteUserRoleDatarange(appcode,
					dataRangeCode, roleName);
			operationResult.setResult(true);
		} catch (Exception e) {
			operationResult.setResult(false);
			return WebServiceExceptionHandler.handleGeneralError(
					operationResult, e);
		}
		return null;
	}

}
