package com.harry.uac.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.harry.uac.persistence.AuthOrgUser;
import com.harry.uac.persistence.AuthOrgUserExample;
import com.harry.uac.persistence.AuthOrgUserKey;
@MyBatisRepository
public interface AuthOrgUserMapper {
    int countByExample(AuthOrgUserExample example);

    int deleteByExample(AuthOrgUserExample example);

    int deleteByPrimaryKey(AuthOrgUserKey key);

    int insert(AuthOrgUser record);

    int insertSelective(AuthOrgUser record);

    List<AuthOrgUser> selectByExample(AuthOrgUserExample example);

    AuthOrgUser selectByPrimaryKey(AuthOrgUserKey key);

    int updateByExampleSelective(@Param("record") AuthOrgUser record, @Param("example") AuthOrgUserExample example);

    int updateByExample(@Param("record") AuthOrgUser record, @Param("example") AuthOrgUserExample example);

    int updateByPrimaryKeySelective(AuthOrgUser record);

    int updateByPrimaryKey(AuthOrgUser record);
    
    List<AuthOrgUser> selectByUserId(@Param("userId") Long userId);
}