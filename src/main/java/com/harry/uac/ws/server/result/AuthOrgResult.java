package com.harry.uac.ws.server.result;

import javax.xml.bind.annotation.XmlType;

import com.harry.uac.ws.server.WsConstants;
import com.harry.uac.ws.server.base.WSResult;
import com.harry.uac.ws.server.dto.AuthOrgDTO;

@XmlType(name = "AuthOrgResult", namespace = WsConstants.NS)
public class AuthOrgResult extends WSResult {
    
    private AuthOrgDTO org;

    public AuthOrgResult() {
    }
    
    public AuthOrgDTO getOrg() {
        return org;
    }

    public void setOrg(AuthOrgDTO org) {
        this.org = org;
    }

}
