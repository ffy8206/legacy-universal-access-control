package com.harry.uac.service.impl;

import java.util.Date;

import com.harry.uac.dao.AuthUserRoleMapper;
import com.harry.uac.persistence.AuthUserRole;
import com.harry.uac.persistence.AuthUserRoleExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.service.IUserRoleService;

@Service("userRoleService")
public class UserRoleServiceImpl implements IUserRoleService {

    @Autowired
    private AuthUserRoleMapper userRoleDAO;

    @Override
    public void saveUserRoleInfo(Long userId, String roles_sel, String roles_del) {

	// save
	if (StringUtils.isNotEmpty(roles_sel)) {
	    // 已选择的角色
	    String[] selArray = roles_sel.split(",");
	    for (int i = 0; i < selArray.length; i++) {
		// 判断是否存在，不存在时新增
		AuthUserRoleExample example = new AuthUserRoleExample();
		AuthUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andRoleIdEqualTo(Long.parseLong(selArray[i]));
		int rsCount = userRoleDAO.countByExample(example);
		if (rsCount <= 0) {
		    AuthUserRole userRole = new AuthUserRole();
		    userRole.setUserId(userId);
		    userRole.setRoleId(Long.parseLong(selArray[i]));
		    userRole.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
		    userRole.setCreateTime(new Date());
		    userRoleDAO.insert(userRole);
		}
	    }
	}
	// del
	if (StringUtils.isNotEmpty(roles_del)) {
	    String[] delArray = roles_del.split(",");
	    // 未选择的角色
	    for (int i = 0; i < delArray.length; i++) {
		// 判断是否存在，存在时删除
		AuthUserRoleExample example = new AuthUserRoleExample();
		AuthUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andRoleIdEqualTo(Long.parseLong(delArray[i]));
		int rsCount = userRoleDAO.countByExample(example);
		if (rsCount >= 1) {
		    AuthUserRole userRole = new AuthUserRole();
		    userRole.setUserId(userId);
		    userRole.setRoleId(Long.parseLong(delArray[i]));
		    userRoleDAO.deleteByExample(example);
		}
	    }
	}
    }

    @Override
    public void saveUserRoleDatarangeInfo(Long userId, Long roleId, String drs_sel, String drs_del) {
	// save
	if (StringUtils.isNotEmpty(drs_sel)) {
	    // 已选择的数据范围
	    String[] selArray = drs_sel.split(",");
	    for (int i = 0; i < selArray.length; i++) {
		// 判断是否存在，不存在时新增
		AuthUserRoleExample example = new AuthUserRoleExample();
		AuthUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andRoleIdEqualTo(roleId);
		criteria.andDatarangeIdEqualTo(Long.parseLong(selArray[i]));
		int rsCount = userRoleDAO.countByExample(example);
		if (rsCount <= 0) {
		    AuthUserRole userRole = new AuthUserRole();
		    userRole.setUserId(userId);
		    userRole.setRoleId(roleId);
		    userRole.setDatarangeId(Long.parseLong(selArray[i]));
		    userRole.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
		    userRole.setCreateTime(new Date());
		    userRoleDAO.insert(userRole);
		}
	    }
	    // 删除datarangeId为空的记录
	    AuthUserRoleExample example = new AuthUserRoleExample();
	    AuthUserRoleExample.Criteria criteria = example.createCriteria();
	    criteria.andUserIdEqualTo(userId);
	    criteria.andRoleIdEqualTo(roleId);
	    criteria.andDatarangeIdIsNull();
	    userRoleDAO.deleteByExample(example);
	}
	// del
	if (StringUtils.isNotEmpty(drs_del)) {
	    String[] delArray = drs_del.split(",");
	    // 未选择的数据范围
	    for (int i = 0; i < delArray.length; i++) {
		// 判断是否存在，存在时删除
		AuthUserRoleExample example = new AuthUserRoleExample();
		AuthUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andRoleIdEqualTo(roleId);
		criteria.andDatarangeIdEqualTo(Long.parseLong(delArray[i]));
		int rsCount = userRoleDAO.countByExample(example);
		if (rsCount >= 1) {
		    AuthUserRole userRole = new AuthUserRole();
		    userRole.setUserId(userId);
		    userRole.setRoleId(roleId);
		    userRole.setDatarangeId(Long.parseLong(delArray[i]));
		    userRoleDAO.deleteByExample(example);
		}
	    }
	    // 如果不存在userId,roleId的记录，则增加一条
	    AuthUserRoleExample example = new AuthUserRoleExample();
	    AuthUserRoleExample.Criteria criteria = example.createCriteria();
	    criteria.andUserIdEqualTo(userId);
	    criteria.andRoleIdEqualTo(roleId);
	    int rsCount = userRoleDAO.countByExample(example);
	    if (rsCount <= 0) {
		AuthUserRole userRole = new AuthUserRole();
		userRole.setUserId(userId);
		userRole.setRoleId(roleId);
		userRole.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
		userRole.setCreateTime(new Date());
		userRoleDAO.insert(userRole);
	    }
	}
    }

}
