package com.harry.uac.service;

public interface IGroupRoleService {
    void saveGroupRoleInfo(Long groupId, String roles_sel, String roles_del);

    void saveGroupRoleDatarangeInfo(Long groupId, Long roleId, String drs_sel, String drs_del);
}
