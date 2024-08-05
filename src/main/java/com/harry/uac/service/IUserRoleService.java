package com.harry.uac.service;

public interface IUserRoleService {
    void saveUserRoleInfo(Long userId, String roles_sel, String roles_del);

    void saveUserRoleDatarangeInfo(Long userId, Long roleId, String drs_sel, String drs_del);
}
