package com.harry.uac.dao;

import com.harry.uac.persistence.AuthRolePrivilege;
import com.harry.uac.persistence.AuthRolePrivilegeExample;
import com.harry.uac.persistence.AuthRolePrivilegeKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;
@MyBatisRepository
public interface AuthRolePrivilegeMapper {
    int countByExample(AuthRolePrivilegeExample example);

    int deleteByExample(AuthRolePrivilegeExample example);

    int deleteByPrimaryKey(AuthRolePrivilegeKey key);

    int insert(AuthRolePrivilege record);

    int insertSelective(AuthRolePrivilege record);

    List<AuthRolePrivilege> selectByExample(AuthRolePrivilegeExample example);

    AuthRolePrivilege selectByPrimaryKey(AuthRolePrivilegeKey key);

    int updateByExampleSelective(@Param("record") AuthRolePrivilege record, @Param("example") AuthRolePrivilegeExample example);

    int updateByExample(@Param("record") AuthRolePrivilege record, @Param("example") AuthRolePrivilegeExample example);

    int updateByPrimaryKeySelective(AuthRolePrivilege record);

    int updateByPrimaryKey(AuthRolePrivilege record);
}