package com.harry.uac.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.harry.uac.persistence.AuthUserRole;
import com.harry.uac.persistence.AuthUserRoleExample;
@MyBatisRepository
public interface AuthUserRoleMapper {
    int countByExample(AuthUserRoleExample example);

    int deleteByExample(AuthUserRoleExample example);

    int insert(AuthUserRole record);

    int insertSelective(AuthUserRole record);

    List<AuthUserRole> selectByExample(AuthUserRoleExample example);

    int updateByExampleSelective(@Param("record") AuthUserRole record, @Param("example") AuthUserRoleExample example);

    int updateByExample(@Param("record") AuthUserRole record, @Param("example") AuthUserRoleExample example);
    
    List<AuthUserRole> selectByUserId(@Param("userId") Long userId);
    
    List<Long> selectDataRangeByUserId(@Param("userId") Long userId);
}