package com.harry.uac.ws.server.result;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.harry.uac.ws.server.WsConstants;
import com.harry.uac.ws.server.base.WSResult;
import com.harry.uac.ws.server.dto.AuthPrivilegeDTO;
import com.harry.uac.ws.server.dto.AuthUserDTO;

@XmlType(name = "AuthoritySession", namespace = WsConstants.NS)
public class AuthoritySession extends WSResult {

    private String appcode;

    public String getAppcode() {
	return appcode;
    }

    public void setAppcode(String appcode) {
	this.appcode = appcode;
    }

    private AuthUserDTO user;

    public AuthUserDTO getUser() {
	return user;
    }

    public void setUser(AuthUserDTO user) {
	this.user = user;
    }
    
    private List<AuthPrivilegeDTO> privilegeList;

    @XmlElementWrapper(name = "privilegeList")
    @XmlElement(name = "privilege")
    public List<AuthPrivilegeDTO> getPrivilegeList() {
        return privilegeList;
    }

    public void setPrivilegeList(List<AuthPrivilegeDTO> privilegeList) {
        this.privilegeList = privilegeList;
    }

    public AuthoritySession() {
    }

    public AuthoritySession(String appcode, AuthUserDTO user, List<AuthPrivilegeDTO> privilegeList) {
	super();
	this.appcode = appcode;
	this.user = user;
	this.privilegeList = privilegeList;
    }

}
