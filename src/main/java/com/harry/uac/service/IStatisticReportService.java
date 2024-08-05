package com.harry.uac.service;

import com.harry.uac.common.util.OnePage;
import com.harry.uac.persistence.SyncIncStatus;
import com.harry.uac.persistence.SyncIncStatusExample;

public interface IStatisticReportService {
    public OnePage<SyncIncStatus> selectPaginationOnePageSyncStatus(SyncIncStatusExample example);
}
