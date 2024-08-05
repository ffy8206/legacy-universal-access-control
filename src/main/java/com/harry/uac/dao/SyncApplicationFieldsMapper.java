package com.harry.uac.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.harry.uac.persistence.SyncApplicationFields;
import com.harry.uac.persistence.SyncApplicationFieldsExample;
@MyBatisRepository
public interface SyncApplicationFieldsMapper {
    int countByExample(SyncApplicationFieldsExample example);

    int deleteByExample(SyncApplicationFieldsExample example);

    int insert(SyncApplicationFields record);

    int insertSelective(SyncApplicationFields record);

    List<SyncApplicationFields> selectByExample(SyncApplicationFieldsExample example);

    int updateByExampleSelective(@Param("record") SyncApplicationFields record,
	            @Param("example") SyncApplicationFieldsExample example);

    int updateByExample(@Param("record") SyncApplicationFields record,
	            @Param("example") SyncApplicationFieldsExample example);
}