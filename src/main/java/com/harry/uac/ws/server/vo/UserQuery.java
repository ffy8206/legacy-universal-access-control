package com.harry.uac.ws.server.vo;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.harry.uac.ws.server.WsConstants;

@XmlRootElement
@XmlType(name = "UserQuery", namespace = WsConstants.NS)
public class UserQuery {

    private String userName;

    private String userUid;

    private String userEmail;

    public String getUserName() {
	return userName;
    }

    public void setUserName(String userName) {
	this.userName = userName;
    }

    public String getUserUid() {
	return userUid;
    }

    public void setUserUid(String userUid) {
	this.userUid = userUid;
    }

    public String getUserEmail() {
	return userEmail;
    }

    public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
    }

}