package com.harry.uac.ws.server.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.harry.uac.ws.server.WsConstants;

@XmlRootElement
@XmlType(name = "AuthPrivilege", namespace = WsConstants.NS)
public class AuthPrivilegeDTO {

    private String appcode;

    private String privilegeCode;

    private String privilegeName;

    private String privilegeDescription;

    private String privilegeRemark;

    private List<AuthDatarangeDTO> dataRangeList;

    public String getAppcode() {
	return appcode;
    }

    public void setAppcode(String appcode) {
	this.appcode = appcode;
    }

    public String getPrivilegeCode() {
	return privilegeCode;
    }

    public void setPrivilegeCode(String privilegeCode) {
	this.privilegeCode = privilegeCode;
    }

    public String getPrivilegeName() {
	return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
	this.privilegeName = privilegeName;
    }

    public String getPrivilegeDescription() {
	return privilegeDescription;
    }

    public void setPrivilegeDescription(String privilegeDescription) {
	this.privilegeDescription = privilegeDescription;
    }

    public String getPrivilegeRemark() {
	return privilegeRemark;
    }

    public void setPrivilegeRemark(String privilegeRemark) {
	this.privilegeRemark = privilegeRemark;
    }

    @XmlElementWrapper(name = "dataRangeList")
    @XmlElement(name = "dataRange")
    public List<AuthDatarangeDTO> getDataRangeList() {
	return dataRangeList;
    }

    public void setDataRangeList(List<AuthDatarangeDTO> dataRangeList) {
	this.dataRangeList = dataRangeList;
    }

    /**
     * for log output
     */
    @Override
    public String toString() {
	return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((appcode == null) ? 0: appcode.hashCode());
	result = prime * result + ((privilegeCode == null) ? 0: privilegeCode.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	AuthPrivilegeDTO other = (AuthPrivilegeDTO) obj;
	if (appcode == null) {
	    if (other.appcode != null)
		return false;
	} else if (!appcode.equals(other.appcode))
	    return false;
	if (privilegeCode == null) {
	    if (other.privilegeCode != null)
		return false;
	} else if (!privilegeCode.equals(other.privilegeCode))
	    return false;
	return true;
    }

}