package com.harry.uac.service.impl;

import java.util.Date;

import com.harry.uac.dao.AuthRolePrivilegeMapper;
import com.harry.uac.persistence.AuthRolePrivilege;
import com.harry.uac.persistence.AuthRolePrivilegeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.service.IRolePrivilegeService;

@Service("roleOperationService")
public class RoleOperationServiceImpl implements IRolePrivilegeService {

    @Autowired
    private AuthRolePrivilegeMapper rolePrivilegeDAO;

    @Override
    public void insertRolePrivilege(Long roleId, String privilegesId) {
	AuthRolePrivilegeExample criteria = new AuthRolePrivilegeExample();
	AuthRolePrivilegeExample.Criteria c = criteria.createCriteria();
	c.andRoleIdEqualTo(roleId);
	rolePrivilegeDAO.deleteByExample(criteria);
	if (privilegesId != null && !privilegesId.equals("")) {
	    String[] array = privilegesId.split(",");
	    for (int i = 0; i < array.length; i++) {
		// TODO: user
		AuthRolePrivilege o = new AuthRolePrivilege();
		o.setRoleId(roleId);
		o.setPrivilegeId(Long.parseLong(array[i]));
		o.setCreateUserId(100000999L);
		o.setCreateTime(new Date());
		rolePrivilegeDAO.insert(o);
	    }
	}
    }
}
