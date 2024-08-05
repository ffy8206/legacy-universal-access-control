package com.harry.uac.dao;

import com.harry.uac.persistence.AuthUserGroup;
import com.harry.uac.persistence.AuthUserGroupExample;
import com.harry.uac.persistence.AuthUserGroupKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;
@MyBatisRepository
public interface AuthUserGroupMapper {
    int countByExample(AuthUserGroupExample example);

    int deleteByExample(AuthUserGroupExample example);

    int deleteByPrimaryKey(AuthUserGroupKey key);

    int insert(AuthUserGroup record);

    int insertSelective(AuthUserGroup record);

    List<AuthUserGroup> selectByExample(AuthUserGroupExample example);

    AuthUserGroup selectByPrimaryKey(AuthUserGroupKey key);

    int updateByExampleSelective(@Param("record") AuthUserGroup record, @Param("example") AuthUserGroupExample example);

    int updateByExample(@Param("record") AuthUserGroup record, @Param("example") AuthUserGroupExample example);

    int updateByPrimaryKeySelective(AuthUserGroup record);

    int updateByPrimaryKey(AuthUserGroup record);
    
    List<AuthUserGroup> selectByUserId(@Param("userId") Long userId);
}