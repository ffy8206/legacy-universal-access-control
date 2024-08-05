package com.harry.uac.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.harry.uac.service.IUserRoleService;

@Component("adminConfigHelper")
public class AdminConfigHelper {
    
    @Autowired
    private IUserRoleService IUserRoleService;

    
}
