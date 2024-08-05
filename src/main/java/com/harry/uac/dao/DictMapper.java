package com.harry.uac.dao;

import com.harry.uac.persistence.Dict;
import com.harry.uac.persistence.DictExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
@MyBatisRepository
public interface DictMapper {
    int deleteByPrimaryKey(@Param("code")String code, @Param("table") String table);

    int insert(@Param("record") Dict record, @Param("table") String table);

    List<Dict> selectByExample(@Param("example") DictExample example, @Param("table") String table);

    Dict selectByPrimaryKey(@Param("code") String code, @Param("table") String table);

    int updateByPrimaryKey(@Param("record") Dict record, @Param("table") String table);
}