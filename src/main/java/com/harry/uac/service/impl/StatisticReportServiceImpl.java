package com.harry.uac.service.impl;

import java.util.List;

import com.harry.uac.dao.SyncIncStatusMapper;
import com.harry.uac.persistence.SyncIncStatus;
import com.harry.uac.persistence.SyncIncStatusExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.util.OnePage;
import com.harry.uac.service.IStatisticReportService;

@Service("statisticReportService")
public class StatisticReportServiceImpl implements IStatisticReportService {
    
    @Autowired
    private SyncIncStatusMapper syncIncStatusDAO;

    @Override
    public OnePage<SyncIncStatus> selectPaginationOnePageSyncStatus(SyncIncStatusExample example) {
	// TODO Auto-generated method stub
	int count = syncIncStatusDAO.countByExample(example);
	List<SyncIncStatus> data = syncIncStatusDAO.selectPaginationOnePageSyncStatus(example);
	OnePage<SyncIncStatus> onepage = new OnePage<SyncIncStatus>();
	example.getPage().setCount(count);
	onepage.setPage(example.getPage());
	onepage.setDataList(data);
	return onepage;
    }

}
