package com.harry.uac.dao;

import com.harry.uac.persistence.AuthPrivilege;
import com.harry.uac.persistence.AuthPrivilegeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
@MyBatisRepository
public interface AuthPrivilegeMapper {
    int countByExample(AuthPrivilegeExample example);

    int deleteByExample(AuthPrivilegeExample example);

    int deleteByPrimaryKey(Long privilegeId);

    int insert(AuthPrivilege record);

    int insertSelective(AuthPrivilege record);

    List<AuthPrivilege> selectByExample(AuthPrivilegeExample example);

	List<AuthPrivilege> selectPaginationByExample(AuthPrivilegeExample example);

	AuthPrivilege selectByPrimaryKey(Long privilegeId);

    int updateByExampleSelective(@Param("record") AuthPrivilege record, 
			@Param("example") AuthPrivilegeExample example);

    int updateByExample(@Param("record") AuthPrivilege record, 
			@Param("example") AuthPrivilegeExample example);

    int updateByPrimaryKeySelective(AuthPrivilege record);

    int updateByPrimaryKey(AuthPrivilege record);
}