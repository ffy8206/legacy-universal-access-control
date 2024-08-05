package com.harry.uac.service;

import java.util.Date;
import java.util.List;

import com.harry.uac.common.util.OnePage;
import com.harry.uac.persistence.SyncDisplayInfo;
import com.harry.uac.persistence.TempUserAssign;
import com.harry.uac.persistence.TempUserInfo;
import com.harry.uac.persistence.TempUserInfoExample;

public interface ISyncUserService {

    OnePage<SyncDisplayInfo> onePageTempUser(TempUserInfoExample criteria);

    // void syncTempUsers(List<String> userList);

    TempUserInfo syncTempUsers(String employeeNumber, Date syncDate);

    List<TempUserAssign> syncTempUserAssign(String employeeNumber, Date syncDate);

    void syncDisableUsers(List<String> userList);

}
