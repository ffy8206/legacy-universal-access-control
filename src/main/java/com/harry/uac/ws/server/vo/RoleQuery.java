package com.harry.uac.ws.server.vo;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.harry.uac.ws.server.WsConstants;

@XmlRootElement
@XmlType(name = "RoleQuery", namespace = WsConstants.NS)
public class RoleQuery {

    private String roleName;

    private String roleDescription;

    public String getRoleName() {
	return roleName;
    }

    public void setRoleName(String roleName) {
	this.roleName = roleName;
    }

    public String getRoleDescription() {
	return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
	this.roleDescription = roleDescription;
    }

}