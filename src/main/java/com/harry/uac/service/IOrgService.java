package com.harry.uac.service;

import java.util.List;

import com.harry.uac.common.util.OnePage;
import com.harry.uac.persistence.AuthOrg;
import com.harry.uac.persistence.AuthOrgExample;

public interface IOrgService {

    List<AuthOrg> findAll(AuthOrgExample criteria);

    OnePage<AuthOrg> onePageOrg(AuthOrgExample criteria);

    AuthOrg findSingleOrg(Long orgId);

    void insertOrg(AuthOrg orgInfo);

    int deleteOrg(Long orgId);

    void updateOrg(AuthOrg orgInfo);
}
