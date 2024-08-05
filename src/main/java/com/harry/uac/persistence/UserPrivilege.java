package com.harry.uac.persistence;

import java.util.List;


public class UserPrivilege {
    private Long privilegeId;

    private Long applicationId;

    private String privilegeCode;

    private String privilegeName;

    private String privilegeDescription;

    private String privilegeRemark;

    private List<AuthDatarange> datarangeList;

    private AuthApplication application = null;

    public Long getPrivilegeId() {
	return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
	this.privilegeId = privilegeId;
    }

    public Long getApplicationId() {
	return applicationId;
    }

    public void setApplicationId(Long applicationId) {
	this.applicationId = applicationId;
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

    public List<AuthDatarange> getDatarangeList() {
	return datarangeList;
    }

    public void setDatarangeList(List<AuthDatarange> datarangeList) {
	this.datarangeList = datarangeList;
    }

    public AuthApplication getApplication() {
	return application;
    }

    public void setApplication(AuthApplication application) {
	this.application = application;
    }

}