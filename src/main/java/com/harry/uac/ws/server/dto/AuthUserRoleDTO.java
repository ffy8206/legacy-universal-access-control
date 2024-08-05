package com.harry.uac.ws.server.dto;


public class AuthUserRoleDTO {
	private String appcode;

	private String uid;

	private String roleName;

	private String dataRange;

	private String createUserUid;


	public String getAppcode() {
		return appcode;
	}

	public void setAppcode(String appcode) {
		this.appcode = appcode;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDataRange() {
		return dataRange;
	}

	public void setDataRange(String dataRange) {
		this.dataRange = dataRange;
	}

	public String getCreateUserUid() {
		return createUserUid;
	}

	public void setCreateUserUid(String createUserUid) {
		this.createUserUid = createUserUid;
	}

}
