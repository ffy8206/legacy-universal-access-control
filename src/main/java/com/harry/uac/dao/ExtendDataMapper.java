package com.harry.uac.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.harry.uac.persistence.ExtendData;
import com.harry.uac.persistence.ExtendDataExample;
@MyBatisRepository
public interface ExtendDataMapper {
    int countByExample(ExtendDataExample example);

    int deleteByExample(ExtendDataExample example);

    int deleteByPrimaryKey(Long extendDataId);

    int insert(ExtendData record);

    int insertSelective(ExtendData record);

    List<ExtendData> selectByExample(ExtendDataExample example);

    ExtendData selectByPrimaryKey(Long extendDataId);

    int updateByExampleSelective(@Param("record") ExtendData record, @Param("example") ExtendDataExample example);

    int updateByExample(@Param("record") ExtendData record, @Param("example") ExtendDataExample example);

    int updateByPrimaryKeySelective(ExtendData record);

    int updateByPrimaryKey(ExtendData record);
    
    List<Map<String, Object>> checkExtendDataExist(Map<String, String> map);
}