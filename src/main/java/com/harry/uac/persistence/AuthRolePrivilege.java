package com.harry.uac.persistence;

import java.util.Date;

public class AuthRolePrivilege extends AuthRolePrivilegeKey {
    private Long createUserId;

    private Date createTime;

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}