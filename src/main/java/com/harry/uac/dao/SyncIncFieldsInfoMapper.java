package com.harry.uac.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.harry.uac.persistence.SyncIncFieldsInfo;
import com.harry.uac.persistence.SyncIncFieldsInfoExample;
@MyBatisRepository
public interface SyncIncFieldsInfoMapper {
    int countByExample(SyncIncFieldsInfoExample example);

    int deleteByExample(SyncIncFieldsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SyncIncFieldsInfo record);

    int insertSelective(SyncIncFieldsInfo record);

    List<SyncIncFieldsInfo> selectByExample(SyncIncFieldsInfoExample example);

    SyncIncFieldsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SyncIncFieldsInfo record, @Param("example") SyncIncFieldsInfoExample example);

    int updateByExample(@Param("record") SyncIncFieldsInfo record, @Param("example") SyncIncFieldsInfoExample example);

    int updateByPrimaryKeySelective(SyncIncFieldsInfo record);

    int updateByPrimaryKey(SyncIncFieldsInfo record);
    
    List<Map<String, String>> selectSyncIncData(@Param("appFields")List<String> appFields, @Param("begin")Date begin, @Param("end")Date end);
}