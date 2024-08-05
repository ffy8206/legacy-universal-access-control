package com.harry.uac.service.impl;

import java.util.Date;
import java.util.List;

import com.harry.uac.dao.AuthUserMapper;
import com.harry.uac.dao.TempUserAssignMapper;
import com.harry.uac.dao.TempUserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.exception.BusinessException;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.persistence.SyncDisplayInfo;
import com.harry.uac.persistence.TempUserAssign;
import com.harry.uac.persistence.TempUserAssignExample;
import com.harry.uac.persistence.TempUserInfo;
import com.harry.uac.persistence.TempUserInfoExample;
import com.harry.uac.service.ISyncUserService;

@Service("syncUserService")
public class SyncUserServiceImpl implements ISyncUserService {

    @Autowired
    private TempUserInfoMapper syncDAO;

    @Autowired
    private TempUserAssignMapper syncAssDAO;

    @Autowired
    private AuthUserMapper userDAO;

    @Override
    public OnePage<SyncDisplayInfo> onePageTempUser(TempUserInfoExample criteria) {
	// int count = syncDAO.countByExample(criteria);
	// List<TempUserInfo> data = syncDAO.selectPaginationByExample(criteria);
	// OnePage<TempUserInfo> onepage = new OnePage<TempUserInfo>();
	// criteria.getPage().setCount(count);
	// onepage.setPage(criteria.getPage());
	// onepage.setDataList(data);
	// return onepage;

	int count = syncDAO.selectWaitSyncUserCount();
	List<SyncDisplayInfo> data = syncDAO.selectWaitSyncUserPagination(criteria);
	OnePage<SyncDisplayInfo> onepage = new OnePage<SyncDisplayInfo>();
	criteria.getPage().setCount(count);
	onepage.setPage(criteria.getPage());
	onepage.setDataList(data);
	return onepage;
    }

    @Override
    public TempUserInfo syncTempUsers(String employeeNumber, Date syncDate) {
	TempUserInfoExample example = new TempUserInfoExample();
	TempUserInfoExample.Criteria c = example.createCriteria();
	c.andCreateTimeEqualTo(syncDate);
	c.andUserEmployeeNumberEqualTo(employeeNumber);
	List<TempUserInfo> ret = syncDAO.selectByExample(example);
	if (ret.size() == 1) {
	    return ret.get(0);
	} else if (ret.size() > 1) {
	    throw new BusinessException(syncDate + "同步数据出错，员工号不唯一");
	} else {
	    return null;
	}
	// userDAO.syncInsertToUser(userList);

	// userDAO.syncUpdateToUser(userList);

	// userDAO.syncDeleteToUser(userList);

	// syncDAO.updateIsSyncedStatus(userList);
    }

    @Override
    public List<TempUserAssign> syncTempUserAssign(String employeeNumber, Date syncDate) {
	TempUserAssignExample example = new TempUserAssignExample();
	TempUserAssignExample.Criteria c = example.createCriteria();
	c.andCreateTimeEqualTo(syncDate);
	c.andEmployeeNumberEqualTo(employeeNumber);

	return syncAssDAO.selectByExample(example);
    }

    @Override
    public void syncDisableUsers(List<String> userList) {
	syncDAO.disableSyncUsers(userList);
	syncDAO.updateIsSyncedStatus(userList);
    }

}
