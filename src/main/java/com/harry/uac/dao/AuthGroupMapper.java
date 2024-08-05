package com.harry.uac.dao;

import com.harry.uac.persistence.AuthGroup;
import com.harry.uac.persistence.AuthGroupExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
@MyBatisRepository
public interface AuthGroupMapper {
	int countByExample(AuthGroupExample example);

	int deleteByExample(AuthGroupExample example);

	int deleteByPrimaryKey(Long groupId);

	int insert(AuthGroup record);

	int insertSelective(AuthGroup record);

	List<AuthGroup> selectByExample(AuthGroupExample example);

	List<AuthGroup> selectPaginationByExample(AuthGroupExample example);

	AuthGroup selectByPrimaryKey(Long groupId);

	int updateByExampleSelective(@Param("record") AuthGroup record,
			@Param("example") AuthGroupExample example);

	int updateByExample(@Param("record") AuthGroup record,
			@Param("example") AuthGroupExample example);

	int updateByPrimaryKeySelective(AuthGroup record);

	int updateByPrimaryKey(AuthGroup record);

	int deleteByPrimaryKeyWithValidator(Long groupId);
}