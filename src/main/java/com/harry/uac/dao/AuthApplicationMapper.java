package com.harry.uac.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.harry.uac.persistence.AuthApplication;
import com.harry.uac.persistence.AuthApplicationExample;
@MyBatisRepository
public interface AuthApplicationMapper {
	int countByExample(AuthApplicationExample example);

	int deleteByExample(AuthApplicationExample example);

	int deleteByPrimaryKey(Long applicationId);

	int insert(AuthApplication record);

	int insertSelective(AuthApplication record);

	List<AuthApplication> selectByExample(AuthApplicationExample example);

	List<AuthApplication> selectPaginationByExample(
			AuthApplicationExample example);

	AuthApplication selectByPrimaryKey(Long applicationId);

	int updateByExampleSelective(@Param("record") AuthApplication record,
			@Param("example") AuthApplicationExample example);

	int updateByExample(@Param("record") AuthApplication record,
			@Param("example") AuthApplicationExample example);

	int updateByPrimaryKeySelective(AuthApplication record);

	int updateByPrimaryKey(AuthApplication record);

	int deleteByPrimaryKeyWithValidator(Long applicationId);
}