package com.harry.uac.service;

import com.harry.uac.common.util.OnePage;
import com.harry.uac.persistence.AuthPrivilege;
import com.harry.uac.persistence.AuthPrivilegeExample;

public interface IPrivilegeService {

    void insertPrivilege(AuthPrivilege privilegeInfo);

    void deletePrivilege(Long privilegeId);

    void updatePrivilege(AuthPrivilege privilegeInfo);

    OnePage<AuthPrivilege> onePagePrivilege(AuthPrivilegeExample criteria);

    AuthPrivilege findSinglePrivilege(Long privilegeId);
}
