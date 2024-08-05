package com.harry.uac.dao;

import com.harry.uac.persistence.AuthUser;
import com.harry.uac.persistence.AuthUserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

@MyBatisRepository
public interface AuthUserMapper {
    int countByExample(AuthUserExample example);

    int deleteByExample(AuthUserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(AuthUser record);

    int insertSelective(AuthUser record);

    List<AuthUser> selectByExampleWithBLOBs(AuthUserExample example);

    List<AuthUser> selectByExample(AuthUserExample example);

    AuthUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") AuthUser record, @Param("example") AuthUserExample example);

    int updateByExampleWithBLOBs(@Param("record") AuthUser record, @Param("example") AuthUserExample example);

    int updateByExample(@Param("record") AuthUser record, @Param("example") AuthUserExample example);

    int updateByPrimaryKeySelective(AuthUser record);

    int updateByPrimaryKeyWithBLOBs(AuthUser record);

    int updateByPrimaryKey(AuthUser record);

    int updateOrgUser(@Param("userId") Long userId, @Param("userEndtime") String userEndtime);

    // int syncInsertToUser(@Param("userList") List<String> userList);
    //
    // int syncUpdateToUser(@Param("userList") List<String> userList);
    //
    // int syncDeleteToUser(@Param("userList") List<String> userList);
    //
    // List<Map<String, String>> selectSyncAllData(@Param("appFields") List<String> appFields);

}