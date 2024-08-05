package com.harry.uac.service;

import java.util.List;

import com.harry.uac.common.util.OnePage;
import com.harry.uac.persistence.AuthApplication;
import com.harry.uac.persistence.AuthApplicationExample;

public interface IApplicationService {

    void insertApplication(AuthApplication applicationId);

    void deleteApplication(Long applicationId);

    void updateApplication(AuthApplication applicationId);

    OnePage<AuthApplication> onePageApplication(AuthApplicationExample criteria);

    AuthApplication findSingleApplication(Long applicationId);

    List<AuthApplication> findAllApplication(AuthApplicationExample criteria);

    int deleteApplicationWithValidator(Long applicationId);
}
