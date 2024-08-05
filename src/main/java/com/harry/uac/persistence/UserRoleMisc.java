package com.harry.uac.persistence;

public class UserRoleMisc {
	private Long userId;

	private Long applicationId;

	private Long roleId;

	private String roleName;

	private Integer roleDisplayOrder;

	private String roleDescription;

	private String roleRemark;

	private Integer datarangeCount;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getRoleDisplayOrder() {
		return roleDisplayOrder;
	}

	public void setRoleDisplayOrder(Integer roleDisplayOrder) {
		this.roleDisplayOrder = roleDisplayOrder;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public String getRoleRemark() {
		return roleRemark;
	}

	public void setRoleRemark(String roleRemark) {
		this.roleRemark = roleRemark;
	}

	public Integer getDatarangeCount() {
		return datarangeCount;
	}

	public void setDatarangeCount(Integer datarangeCount) {
		this.datarangeCount = datarangeCount;
	}

}
