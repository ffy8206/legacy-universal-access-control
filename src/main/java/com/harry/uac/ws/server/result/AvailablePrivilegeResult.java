package com.harry.uac.ws.server.result;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.harry.uac.ws.server.WsConstants;
import com.harry.uac.ws.server.base.WSResult;
import com.harry.uac.ws.server.dto.AuthPrivilegeDTO;

@XmlType(name = "AuthorizeResult", namespace = WsConstants.NS)
public class AvailablePrivilegeResult extends WSResult {

    private List<AuthPrivilegeDTO> privilegeList;

    @XmlElementWrapper(name = "privilegeList")
    @XmlElement(name = "privilege")
    public List<AuthPrivilegeDTO> getPrivilegeList() {
        return privilegeList;
    }

    public void setPrivilegeList(List<AuthPrivilegeDTO> privilegeList) {
        this.privilegeList = privilegeList;
    }
    
    public AvailablePrivilegeResult() {
    }

    public AvailablePrivilegeResult(List<AuthPrivilegeDTO> privilegeList) {
	super();
	this.privilegeList = privilegeList;
    }

}
