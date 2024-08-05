package com.harry.uac.persistence;

public class UserGroupMisc {

	private Long userId;

	private Long applicationId;
	
	private Long groupId;
	
	private String groupName;
	
	private String groupDescription;

	private Integer groupType;
	
	private String groupRule;
	
	private String groupRemark;

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

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public Integer getGroupType() {
		return groupType;
	}

	public void setGroupType(Integer groupType) {
		this.groupType = groupType;
	}

	public String getGroupRule() {
		return groupRule;
	}

	public void setGroupRule(String groupRule) {
		this.groupRule = groupRule;
	}

	public String getGroupRemark() {
		return groupRemark;
	}

	public void setGroupRemark(String groupRemark) {
		this.groupRemark = groupRemark;
	}
	
}
