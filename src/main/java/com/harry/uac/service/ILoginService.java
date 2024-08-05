package com.harry.uac.service;

import com.harry.uac.common.exception.AppException;
import com.harry.uac.persistence.AuthUser;

public interface ILoginService {
    
    public AuthUser checkUserPassword(String uid, String pwd) throws AppException;
    
}
