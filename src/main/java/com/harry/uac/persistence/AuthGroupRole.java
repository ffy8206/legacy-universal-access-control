package com.harry.uac.persistence;

import java.util.Date;

public class AuthGroupRole {
    private Long groupId;

    private Long roleId;

    private Long datarangeId;

    private Date createTime;

    private Long createUserId;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getDatarangeId() {
        return datarangeId;
    }

    public void setDatarangeId(Long datarangeId) {
        this.datarangeId = datarangeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }
}