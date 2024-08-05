package com.harry.uac.service;

import com.harry.uac.common.util.OnePage;
import com.harry.uac.persistence.AuthGroup;
import com.harry.uac.persistence.AuthGroupExample;

public interface IGroupService {

    void insertGroup(AuthGroup groupInfo);

    void deleteGroup(Long groupId);

    void updateGroup(AuthGroup groupInfo);

    OnePage<AuthGroup> onePageGroup(AuthGroupExample criteria);

    AuthGroup findSingleGroup(Long groupId);

    int deleteGroupWithValidator(Long groupId);
}
