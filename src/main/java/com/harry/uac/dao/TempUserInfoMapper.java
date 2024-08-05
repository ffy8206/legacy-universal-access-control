package com.harry.uac.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.harry.uac.persistence.SyncDisplayInfo;
import com.harry.uac.persistence.TempUserInfo;
import com.harry.uac.persistence.TempUserInfoExample;
@MyBatisRepository
public interface TempUserInfoMapper {

    int countByExample(TempUserInfoExample example);

    List<TempUserInfo> selectByExample(TempUserInfoExample example);

    List<TempUserInfo> selectPaginationByExample(TempUserInfoExample example);

    TempUserInfo selectByPrimaryKey(Long id);

    int updateIsSyncedStatus(@Param("userList") List<String> userList);

    int disableSyncUsers(@Param("userList") List<String> userList);

    int insertSelective(TempUserInfo record);

    int updateByPrimaryKeySelective(TempUserInfo record);

    int selectWaitSyncUserCount();

    List<SyncDisplayInfo> selectWaitSyncUserPagination(TempUserInfoExample example);
}