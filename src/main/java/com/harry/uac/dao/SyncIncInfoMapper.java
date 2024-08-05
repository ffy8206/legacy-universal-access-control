package com.harry.uac.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.harry.uac.persistence.SyncIncInfo;
import com.harry.uac.persistence.SyncIncInfoExample;
@MyBatisRepository
public interface SyncIncInfoMapper {
    int countByExample(SyncIncInfoExample example);

    int deleteByExample(SyncIncInfoExample example);

    int deleteByPrimaryKey(Long syncId);

    int insert(SyncIncInfo record);

    int insertSelective(SyncIncInfo record);

    List<SyncIncInfo> selectByExample(SyncIncInfoExample example);

    SyncIncInfo selectByPrimaryKey(Long syncId);

    int updateByExampleSelective(@Param("record") SyncIncInfo record, @Param("example") SyncIncInfoExample example);

    int updateByExample(@Param("record") SyncIncInfo record, @Param("example") SyncIncInfoExample example);

    int updateByPrimaryKeySelective(SyncIncInfo record);

    int updateByPrimaryKey(SyncIncInfo record);
}