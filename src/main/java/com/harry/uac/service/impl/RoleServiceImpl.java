package com.harry.uac.service.impl;

import java.util.Date;
import java.util.List;

import com.harry.uac.dao.AuthRoleMapper;
import com.harry.uac.persistence.AuthRole;
import com.harry.uac.persistence.AuthRoleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.service.IRoleService;

@Service("roleService")
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private AuthRoleMapper roleDAO;

    @Override
    public void insertRole(AuthRole roleInfo) {
	// TODO: delete test data
	roleInfo.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
	roleInfo.setCreateTime(new Date());
	roleInfo.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	roleInfo.setUpdateTime(new Date());
	roleDAO.insert(roleInfo);
    }

    @Override
    public void deleteRole(Long roleId) {
	roleDAO.deleteByPrimaryKey(roleId);
    }

    @Override
    public void updateRole(AuthRole roleInfo) {
	// TODO: delete test data
	roleInfo.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	roleInfo.setUpdateTime(new Date());
	roleDAO.updateByPrimaryKey(roleInfo);
    }

    @Override
    public OnePage<AuthRole> onePageRole(AuthRoleExample criteria) {
	int count = roleDAO.countByExample(criteria);
	List<AuthRole> data = roleDAO.selectPaginationByExample(criteria);
	OnePage<AuthRole> onepage = new OnePage<AuthRole>();
	// page.setTotalCnt(count);
	criteria.getPage().setCount(count);
	onepage.setPage(criteria.getPage());
	onepage.setDataList(data);
	return onepage;
    }

    @Override
    public AuthRole findSingleRole(Long roleId) {
	return roleDAO.selectByPrimaryKey(roleId);
    }

    public AuthRole findRoleByName(String roleName) {
	return roleDAO.selectByName(roleName);
    }

    @Override
    public int deleteRoleWithValidator(Long roleId) {
	return roleDAO.deleteByPrimaryKeyWithValidator(roleId);
    }

}
