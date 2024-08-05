package com.harry.uac.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.harry.uac.persistence.AuthRole;
import com.harry.uac.persistence.AuthRoleExample;

@MyBatisRepository
public interface AuthRoleMapper {
    int countByExample(AuthRoleExample example);

    int deleteByExample(AuthRoleExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(AuthRole record);

    int insertSelective(AuthRole record);

    List<AuthRole> selectByExample(AuthRoleExample example);

    List<AuthRole> selectPaginationByExample(AuthRoleExample example);

    AuthRole selectByPrimaryKey(Long roleId);

    AuthRole selectByName(String roleName);

    int updateByExampleSelective(@Param("record") AuthRole record, @Param("example") AuthRoleExample example);

    int updateByExample(@Param("record") AuthRole record, @Param("example") AuthRoleExample example);

    int updateByPrimaryKeySelective(AuthRole record);

    int updateByPrimaryKey(AuthRole record);

    int deleteByPrimaryKeyWithValidator(Long roleId);
}