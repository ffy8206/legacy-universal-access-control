package com.harry.uac.service;

public interface IUserGroupService {

    void saveUserGroupInfo(Long groupId, String users_sel, String users_del);

    void saveUserSetGroupInfo(Long userId, String groups_sel, String groups_del);
}
