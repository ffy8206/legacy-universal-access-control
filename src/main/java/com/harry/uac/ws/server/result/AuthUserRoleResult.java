package com.harry.uac.ws.server.result;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import com.harry.uac.ws.server.WsConstants;
import com.harry.uac.ws.server.base.WSResult;
import com.harry.uac.ws.server.dto.AuthUserRoleDTO;

@XmlType(name = "AuthUserRoleResult", namespace = WsConstants.NS)
public class AuthUserRoleResult extends WSResult {

	private List<AuthUserRoleDTO> authUserRoleDTOList;

	public List<AuthUserRoleDTO> getAuthUserRoleDTOList() {
		return authUserRoleDTOList;
	}

	public void setAuthUserRoleDTOList(List<AuthUserRoleDTO> authUserRoleDTOList) {
		this.authUserRoleDTOList = authUserRoleDTOList;
	}
}
