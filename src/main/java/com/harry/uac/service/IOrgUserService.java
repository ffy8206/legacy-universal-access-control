package com.harry.uac.service;

import com.harry.uac.common.util.OnePage;
import com.harry.uac.persistence.AuthOrgUser;
import com.harry.uac.persistence.AuthOrgUserKey;
import com.harry.uac.persistence.ViewAuthOrgUser;
import com.harry.uac.persistence.ViewAuthOrgUserExample;

public interface IOrgUserService {

    OnePage<ViewAuthOrgUser> onePageOrgUser(ViewAuthOrgUserExample criteria);

    void insertOrgUser(AuthOrgUser orgUserInfo);

    void deleteOrgUser(AuthOrgUserKey orgUserKey);

    void updateOrgUser(AuthOrgUser OrgUserInfo);

    AuthOrgUser findSingleOrgUser(AuthOrgUserKey orgUserKey);

}
