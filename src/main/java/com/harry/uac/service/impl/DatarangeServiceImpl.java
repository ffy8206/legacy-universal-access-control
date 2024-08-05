package com.harry.uac.service.impl;

import java.util.Date;
import java.util.List;

import com.harry.uac.dao.AuthDatarangeMapper;
import com.harry.uac.persistence.AuthDatarange;
import com.harry.uac.persistence.AuthDatarangeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.service.IDatarangeService;

@Service("datarangeService")
public class DatarangeServiceImpl implements IDatarangeService {

    @Autowired
    private AuthDatarangeMapper datarangeDAO;

    @Override
    public void insertDatarange(AuthDatarange datarangeInfo) {
	datarangeInfo.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
	datarangeInfo.setCreateTime(new Date());
	datarangeInfo.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	datarangeInfo.setUpdateTime(new Date());
	datarangeDAO.insert(datarangeInfo);
    }

    @Override
    public void deleteDatarange(Long datarangeId) {
	datarangeDAO.deleteByPrimaryKey(datarangeId);
    }

    @Override
    public void updateDatarange(AuthDatarange datarangeInfo) {
	datarangeInfo.setCreateUserId(100000999L);
	datarangeInfo.setCreateTime(new Date());
	datarangeInfo.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	datarangeInfo.setUpdateTime(new Date());
	datarangeDAO.updateByPrimaryKey(datarangeInfo);
    }

    @Override
    public OnePage<AuthDatarange> onePageDatarange(AuthDatarangeExample criteria) {
	int count = datarangeDAO.countByExample(criteria);
	List<AuthDatarange> data = datarangeDAO.selectPaginationByExample(criteria);
	OnePage<AuthDatarange> onepage = new OnePage<AuthDatarange>();
	criteria.getPage().setCount(count);
	onepage.setPage(criteria.getPage());
	onepage.setDataList(data);
	return onepage;
    }

    @Override
    public AuthDatarange findSingleDatarange(Long datarangeId) {
	return datarangeDAO.selectByPrimaryKey(datarangeId);
    }

}
