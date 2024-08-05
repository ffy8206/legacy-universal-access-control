package com.harry.uac.service.impl;

import java.util.Date;

import com.harry.uac.dao.AuthGroupRoleMapper;
import com.harry.uac.persistence.AuthGroupRole;
import com.harry.uac.persistence.AuthGroupRoleExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.service.IGroupRoleService;

@Service("groupRoleService")
public class GroupRoleServiceImpl implements IGroupRoleService {
    
    @Autowired
    private AuthGroupRoleMapper groupRoleDAO;

    @Override
    public void saveGroupRoleInfo(Long groupId, String roles_sel, String roles_del) {
	// save
	if (StringUtils.isNotEmpty(roles_sel)) {
	    // 已选择的角色
	    String[] selArray = roles_sel.split(",");
	    for (int i = 0; i < selArray.length; i++) {
		// 判断是否存在，不存在时新增
		AuthGroupRoleExample example = new AuthGroupRoleExample();
		AuthGroupRoleExample.Criteria criteria = example.createCriteria();
		criteria.andGroupIdEqualTo(groupId);
		criteria.andRoleIdEqualTo(Long.parseLong(selArray[i]));
		int rsCount = groupRoleDAO.countByExample(example);
		if (rsCount <= 0) {
		    AuthGroupRole groupRole = new AuthGroupRole();
		    groupRole.setGroupId(groupId);
		    groupRole.setRoleId(Long.parseLong(selArray[i]));
		    groupRole.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
		    groupRole.setCreateTime(new Date());
		    groupRoleDAO.insert(groupRole);
		}
	    }
	}
	// del
	if (StringUtils.isNotEmpty(roles_del)) {
	    String[] delArray = roles_del.split(",");
	    // 未选择的角色
	    for (int i = 0; i < delArray.length; i++) {
		// 判断是否存在，存在时删除
		AuthGroupRoleExample example = new AuthGroupRoleExample();
		AuthGroupRoleExample.Criteria criteria = example.createCriteria();
		criteria.andGroupIdEqualTo(groupId);
		criteria.andRoleIdEqualTo(Long.parseLong(delArray[i]));
		int rsCount = groupRoleDAO.countByExample(example);
		if (rsCount >= 1) {
		    AuthGroupRole groupRole = new AuthGroupRole();
		    groupRole.setGroupId(groupId);
		    groupRole.setRoleId(Long.parseLong(delArray[i]));
		    groupRoleDAO.deleteByExample(example);
		}
	    }
	}

    }

    @Override
    public void saveGroupRoleDatarangeInfo(Long groupId, Long roleId, String drs_sel, String drs_del) {
	// save
	if (StringUtils.isNotEmpty(drs_sel)) {
	    // 已选择的角色
	    String[] selArray = drs_sel.split(",");
	    for (int i = 0; i < selArray.length; i++) {
		// 判断是否存在，不存在时新增
		AuthGroupRoleExample example = new AuthGroupRoleExample();
		AuthGroupRoleExample.Criteria criteria = example.createCriteria();
		criteria.andGroupIdEqualTo(groupId);
		criteria.andRoleIdEqualTo(roleId);
		criteria.andDatarangeIdEqualTo(Long.parseLong(selArray[i]));
		int rsCount = groupRoleDAO.countByExample(example);
		if (rsCount <= 0) {
		    AuthGroupRole groupRole = new AuthGroupRole();
		    groupRole.setGroupId(groupId);
		    groupRole.setRoleId(roleId);
		    groupRole.setDatarangeId(Long.parseLong(selArray[i]));
		    groupRole.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
		    groupRole.setCreateTime(new Date());
		    groupRoleDAO.insert(groupRole);
		}
	    }
	    // 删除datarangeId为空的记录
	    AuthGroupRoleExample example = new AuthGroupRoleExample();
	    AuthGroupRoleExample.Criteria criteria = example.createCriteria();
	    criteria.andGroupIdEqualTo(groupId);
	    criteria.andRoleIdEqualTo(roleId);
	    criteria.andDatarangeIdIsNull();
	    groupRoleDAO.deleteByExample(example);
	}
	// del
	if (StringUtils.isNotEmpty(drs_del)) {
	    String[] delArray = drs_del.split(",");
	    // 未选择的角色
	    for (int i = 0; i < delArray.length; i++) {
		// 判断是否存在，存在时删除
		AuthGroupRoleExample example = new AuthGroupRoleExample();
		AuthGroupRoleExample.Criteria criteria = example.createCriteria();
		criteria.andGroupIdEqualTo(groupId);
		criteria.andRoleIdEqualTo(roleId);
		criteria.andDatarangeIdEqualTo(Long.parseLong(delArray[i]));
		int rsCount = groupRoleDAO.countByExample(example);
		if (rsCount >= 1) {
		    AuthGroupRole groupRole = new AuthGroupRole();
		    groupRole.setGroupId(groupId);
		    groupRole.setRoleId(roleId);
		    groupRole.setDatarangeId(Long.parseLong(delArray[i]));
		    groupRoleDAO.deleteByExample(example);
		}
	    }
	    // 如果不存在groupId,roleId的记录，则增加一条
	    AuthGroupRoleExample example = new AuthGroupRoleExample();
	    AuthGroupRoleExample.Criteria criteria = example.createCriteria();
	    criteria.andGroupIdEqualTo(groupId);
	    criteria.andRoleIdEqualTo(roleId);
	    int rsCount = groupRoleDAO.countByExample(example);
	    if (rsCount <= 0) {
		AuthGroupRole groupRole = new AuthGroupRole();
		groupRole.setGroupId(groupId);
		groupRole.setRoleId(roleId);
		groupRole.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
		groupRole.setCreateTime(new Date());
		groupRoleDAO.insert(groupRole);
	    }
	}

    }
}
