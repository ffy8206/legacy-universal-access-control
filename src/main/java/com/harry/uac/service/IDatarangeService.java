package com.harry.uac.service;

import com.harry.uac.common.util.OnePage;
import com.harry.uac.persistence.AuthDatarange;
import com.harry.uac.persistence.AuthDatarangeExample;

public interface IDatarangeService {

    void insertDatarange(AuthDatarange datarangeInfo);

    void deleteDatarange(Long datarangeId);

    void updateDatarange(AuthDatarange datarangeInfo);

    OnePage<AuthDatarange> onePageDatarange(AuthDatarangeExample criteria);

    AuthDatarange findSingleDatarange(Long datarangeId);
}
