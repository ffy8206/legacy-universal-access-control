package com.harry.uac.service.impl;

import java.util.Date;
import java.util.List;

import com.harry.uac.dao.AuthPrivilegeMapper;
import com.harry.uac.persistence.AuthPrivilege;
import com.harry.uac.persistence.AuthPrivilegeExample;
import com.harry.uac.service.IPrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.util.OnePage;

@Service("privilegeService")
public class PrivilegeServiceImpl implements IPrivilegeService {

    @Autowired
    private AuthPrivilegeMapper privilegeDAO;

    @Override
    public void insertPrivilege(AuthPrivilege privilegeInfo) {
	// TODO: delete test data
	privilegeInfo.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
	privilegeInfo.setCreateTime(new Date());
	privilegeInfo.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	privilegeInfo.setUpdateTime(new Date());
	privilegeDAO.insert(privilegeInfo);
    }

    @Override
    public void deletePrivilege(Long privilegeId) {
	privilegeDAO.deleteByPrimaryKey(privilegeId);
    }

    @Override
    public void updatePrivilege(AuthPrivilege privilegeInfo) {
	// TODO: delete test data
	privilegeInfo.setCreateUserId(100000999L);
	privilegeInfo.setCreateTime(new Date());
	privilegeInfo.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	privilegeInfo.setUpdateTime(new Date());
	privilegeDAO.updateByPrimaryKey(privilegeInfo);
    }

    @Override
    public OnePage<AuthPrivilege> onePagePrivilege(AuthPrivilegeExample criteria) {
	int count = privilegeDAO.countByExample(criteria);
	List<AuthPrivilege> data = privilegeDAO.selectPaginationByExample(criteria);
	OnePage<AuthPrivilege> onepage = new OnePage<AuthPrivilege>();
	// page.setTotalCnt(count);
	criteria.getPage().setCount(count);
	onepage.setPage(criteria.getPage());
	onepage.setDataList(data);
	return onepage;
    }

    @Override
    public AuthPrivilege findSinglePrivilege(Long privilegeId) {
	return privilegeDAO.selectByPrimaryKey(privilegeId);
    }

}
