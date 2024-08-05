package com.harry.uac.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.harry.uac.persistence.SyncIncStatus;
import com.harry.uac.persistence.SyncIncStatusExample;
@MyBatisRepository
public interface SyncIncStatusMapper {
    int countByExample(SyncIncStatusExample example);

    int deleteByExample(SyncIncStatusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SyncIncStatus record);

    int insertSelective(SyncIncStatus record);

    List<SyncIncStatus> selectByExample(SyncIncStatusExample example);

    SyncIncStatus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SyncIncStatus record, @Param("example") SyncIncStatusExample example);

    int updateByExample(@Param("record") SyncIncStatus record, @Param("example") SyncIncStatusExample example);

    int updateByPrimaryKeySelective(SyncIncStatus record);

    int updateByPrimaryKey(SyncIncStatus record);

    List<SyncIncStatus> selectPaginationOnePageSyncStatus(SyncIncStatusExample example);
}