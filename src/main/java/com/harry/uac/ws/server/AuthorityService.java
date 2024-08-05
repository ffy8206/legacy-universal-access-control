package com.harry.uac.ws.server;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.harry.uac.ws.server.dto.AuthDatarangeDTO;
import com.harry.uac.ws.server.dto.AuthUserDTO;
import com.harry.uac.ws.server.dto.AuthUserRoleDTO;
import com.harry.uac.ws.server.result.AuthDataRangeResult;
import com.harry.uac.ws.server.result.AuthOrgResult;
import com.harry.uac.ws.server.result.AuthUserResult;
import com.harry.uac.ws.server.result.AuthUserRoleResult;
import com.harry.uac.ws.server.result.AuthoritySession;
import com.harry.uac.ws.server.result.AvailablePrivilegeResult;
import com.harry.uac.ws.server.result.OperationResult;

/**
 * JAX-WS2.0 WebService.
 * 
 * uses JAX-WS2.0 annotation set definition WSDL. uses WSResult to return
 * result\ uses dto to pass object
 * 
 * @author wangding
 */
// name - wsdl <wsdl:portType> name
@WebService(name = "AuthorityService", targetNamespace = WsConstants.NS)
public interface AuthorityService {

	AuthoritySession login(@WebParam(name = "appcode") String appcode,
                           @WebParam(name = "uid") String uid,
                           @WebParam(name = "password") String password);

	OperationResult check(
			@WebParam(name = "authoritySession") AuthoritySession authoritySession,
			@WebParam(name = "privilegeCode") String privilegeCode,
			@WebParam(name = "dataRangeCode") String dataRangeCode);

	AvailablePrivilegeResult getPrivilegeByDatarange(
			@WebParam(name = "authoritySession") AuthoritySession authoritySession,
			@WebParam(name = "dataRangeCode") String dataRangeCode);

	OperationResult saveUserRoleDatarange(@WebParam(name = "uid") String uid,
			@WebParam(name = "roleName") String roleName,
			@WebParam(name = "dataRangeCode") String dataRangeCode,
			@WebParam(name = "appcode") String appcode);

	OperationResult deleteUserRoleDatarange(
			@WebParam(name = "dataRangeCode") String dataRangeCode,
			@WebParam(name = "appcode") String appcode,
			@WebParam(name = "roleName") String roleName);

	OperationResult saveUser(
			@WebParam(name = "authUserDTO") AuthUserDTO authUserDTO);

	AuthUserResult selectAuthUser(
			@WebParam(name = "authUserDTO") AuthUserDTO authUserDTO);

	AuthDataRangeResult selectDataRangeByUid(
			@WebParam(name = "uid") String uid,
			@WebParam(name = "appcode") String appcode);

	AuthUserRoleResult selectUserRole(
			@WebParam(name = "authUserRoleDTO") AuthUserRoleDTO authUserRoleDTO);

	OperationResult saveDataRange(
			@WebParam(name = "authDatarangeDTO") AuthDatarangeDTO authDatarangeDTO);

	AuthOrgResult selectOrg(@WebParam(name = "orgcode") String orgcode,
			@WebParam(name = "isDeep") boolean isDeep);

}
