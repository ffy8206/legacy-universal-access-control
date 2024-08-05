package com.harry.uac.dao;

import com.harry.uac.persistence.AuthGroupRole;
import com.harry.uac.persistence.AuthGroupRoleExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
@MyBatisRepository
public interface AuthGroupRoleMapper {
    int countByExample(AuthGroupRoleExample example);

    int deleteByExample(AuthGroupRoleExample example);

    int insert(AuthGroupRole record);

    int insertSelective(AuthGroupRole record);

    List<AuthGroupRole> selectByExample(AuthGroupRoleExample example);

    int updateByExampleSelective(@Param("record") AuthGroupRole record, @Param("example") AuthGroupRoleExample example);

    int updateByExample(@Param("record") AuthGroupRole record, @Param("example") AuthGroupRoleExample example);
}