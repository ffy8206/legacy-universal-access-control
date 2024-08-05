package com.harry.uac.service;

import com.harry.uac.common.util.OnePage;
import com.harry.uac.persistence.AuthRole;
import com.harry.uac.persistence.AuthRoleExample;

public interface IRoleService {

    void insertRole(AuthRole roleInfo);

    void deleteRole(Long roleId);

    void updateRole(AuthRole roleInfo);

    OnePage<AuthRole> onePageRole(AuthRoleExample criteria);

    AuthRole findSingleRole(Long roleId);

    AuthRole findRoleByName(String roleName);

    int deleteRoleWithValidator(Long roleId);
}
