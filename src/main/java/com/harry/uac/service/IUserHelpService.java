package com.harry.uac.service;

import java.util.List;

import com.harry.uac.persistence.AuthUser;
import com.harry.uac.persistence.UserPrivilege;

public interface IUserHelpService {

    AuthUser findUser(Long userId);

    boolean savePassword(AuthUser user);

    List<UserPrivilege> findUserApplicationPrivileges();

}
