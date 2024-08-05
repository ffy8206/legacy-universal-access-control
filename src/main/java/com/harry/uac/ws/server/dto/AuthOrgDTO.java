package com.harry.uac.ws.server.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.harry.uac.ws.server.WsConstants;

/**
 * Web Service Org DTO.
 * 
 * Only transfer properties that external interface needed. uses JAXB 2.0 annotation to mark JAVA-XML mapping.
 * 
 * @author wangding
 */
@XmlRootElement
@XmlType(name = "AuthOrg", namespace = WsConstants.NS)
public class AuthOrgDTO {

    private String orgName;

    private String orgCode;

    private Integer orgStatus;

    private String orgParentId;

    private String orgLayerCode;

    private Integer orgLevelDict;

    private String orgLevelDisp;

    private String orgManagerUid;

    private AuthUserDTO orgManager;

    private List<AuthUserDTO> orgUserList;

    private List<AuthOrgDTO> subOrgList;

    @XmlElementWrapper(name = "orgUserList")
    @XmlElement(name = "user")
    public List<AuthUserDTO> getOrgUserList() {
	return orgUserList;
    }

    public void setOrgUserList(List<AuthUserDTO> orgUserList) {
	this.orgUserList = orgUserList;
    }

    @XmlElementWrapper(name = "subOrgList")
    @XmlElement(name = "org")
    public List<AuthOrgDTO> getSubOrgList() {
	return subOrgList;
    }

    public void setSubOrgList(List<AuthOrgDTO> subOrgList) {
	this.subOrgList = subOrgList;
    }

    public AuthUserDTO getOrgManager() {
	return orgManager;
    }

    public void setOrgManager(AuthUserDTO orgManager) {
	this.orgManager = orgManager;
    }

    public String getOrgName() {
	return orgName;
    }

    public void setOrgName(String orgName) {
	this.orgName = orgName;
    }

    public String getOrgCode() {
	return orgCode;
    }

    public void setOrgCode(String orgCode) {
	this.orgCode = orgCode;
    }

    public Integer getOrgStatus() {
	return orgStatus;
    }

    public void setOrgStatus(Integer orgStatus) {
	this.orgStatus = orgStatus;
    }

    public String getOrgParentId() {
	return orgParentId;
    }

    public void setOrgParentId(String orgParentId) {
	this.orgParentId = orgParentId;
    }

    public String getOrgLayerCode() {
	return orgLayerCode;
    }

    public void setOrgLayerCode(String orgLayerCode) {
	this.orgLayerCode = orgLayerCode;
    }

    public Integer getOrgLevelDict() {
	return orgLevelDict;
    }

    public void setOrgLevelDict(Integer orgLevelDict) {
	this.orgLevelDict = orgLevelDict;
    }

    public String getOrgLevelDisp() {
	return orgLevelDisp;
    }

    public void setOrgLevelDisp(String orgLevelDisp) {
	this.orgLevelDisp = orgLevelDisp;
    }

    public String getOrgManagerUid() {
	return orgManagerUid;
    }

    public void setOrgManagerUid(String orgManagerUid) {
	this.orgManagerUid = orgManagerUid;
    }

    /**
     * for log output
     */
    @Override
    public String toString() {
	return ToStringBuilder.reflectionToString(this);
    }

}
