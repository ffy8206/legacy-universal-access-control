package com.harry.uac.dao;

import com.harry.uac.persistence.TempUserAssign;
import com.harry.uac.persistence.TempUserAssignExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
@MyBatisRepository
public interface TempUserAssignMapper {
    int countByExample(TempUserAssignExample example);

    int deleteByExample(TempUserAssignExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TempUserAssign record);

    int insertSelective(TempUserAssign record);

    List<TempUserAssign> selectByExample(TempUserAssignExample example);

    TempUserAssign selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TempUserAssign record, @Param("example") TempUserAssignExample example);

    int updateByExample(@Param("record") TempUserAssign record, @Param("example") TempUserAssignExample example);

    int updateByPrimaryKeySelective(TempUserAssign record);

    int updateByPrimaryKey(TempUserAssign record);
    
    List<TempUserAssign> selectXMLSyncData();
}