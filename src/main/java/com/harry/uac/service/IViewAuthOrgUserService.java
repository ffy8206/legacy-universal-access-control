package com.harry.uac.service;

import com.harry.uac.common.util.OnePage;
import com.harry.uac.persistence.ViewAuthOrgUser;
import com.harry.uac.persistence.ViewAuthOrgUserExample;


public interface IViewAuthOrgUserService {
    OnePage<ViewAuthOrgUser> onePageUsersForGroup(ViewAuthOrgUserExample example);

    OnePage<ViewAuthOrgUser> onePageRemainingUsersForGroup(ViewAuthOrgUserExample example);
}
