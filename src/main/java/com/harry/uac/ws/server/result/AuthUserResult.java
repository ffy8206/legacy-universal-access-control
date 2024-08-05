package com.harry.uac.ws.server.result;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.harry.uac.ws.server.WsConstants;
import com.harry.uac.ws.server.base.WSResult;
import com.harry.uac.ws.server.dto.AuthUserDTO;

@XmlType(name = "AuthUserResult", namespace = WsConstants.NS)
public class AuthUserResult extends WSResult {

    private List<AuthUserDTO> userList;

    public AuthUserResult() {
    }

    public AuthUserResult(List<AuthUserDTO> userList) {
	this.userList = userList;
    }

    @XmlElementWrapper(name = "userList")
    @XmlElement(name = "user")
    public List<AuthUserDTO> getUserList() {
	return userList;
    }

    public void setUserList(List<AuthUserDTO> userList) {
	this.userList = userList;
    }

}
