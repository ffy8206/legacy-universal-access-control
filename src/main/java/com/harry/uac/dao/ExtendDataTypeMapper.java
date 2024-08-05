package com.harry.uac.dao;

import com.harry.uac.persistence.ExtendDataType;
import com.harry.uac.persistence.ExtendDataTypeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
@MyBatisRepository
public interface ExtendDataTypeMapper {
    int countByExample(ExtendDataTypeExample example);

    int deleteByExample(ExtendDataTypeExample example);

    int deleteByPrimaryKey(Long extendDataTypeId);

    int insert(ExtendDataType record);

    int insertSelective(ExtendDataType record);

    List<ExtendDataType> selectByExample(ExtendDataTypeExample example);

    ExtendDataType selectByPrimaryKey(Long extendDataTypeId);

    int updateByExampleSelective(@Param("record") ExtendDataType record, @Param("example") ExtendDataTypeExample example);

    int updateByExample(@Param("record") ExtendDataType record, @Param("example") ExtendDataTypeExample example);

    int updateByPrimaryKeySelective(ExtendDataType record);

    int updateByPrimaryKey(ExtendDataType record);
}