package com.harry.uac.dao;

import com.harry.uac.persistence.AuthDatarange;
import com.harry.uac.persistence.AuthDatarangeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
@MyBatisRepository
public interface AuthDatarangeMapper {
    int countByExample(AuthDatarangeExample example);

    int deleteByExample(AuthDatarangeExample example);

    int deleteByPrimaryKey(Long datarangeId);

    int insert(AuthDatarange record);

    int insertSelective(AuthDatarange record);

    List<AuthDatarange> selectByExample(AuthDatarangeExample example);
	
	List<AuthDatarange> selectPaginationByExample(AuthDatarangeExample example);

    AuthDatarange selectByPrimaryKey(Long datarangeId);

    int updateByExampleSelective(@Param("record") AuthDatarange record, 
			@Param("example") AuthDatarangeExample example);

    int updateByExample(@Param("record") AuthDatarange record,
			 @Param("example") AuthDatarangeExample example);

    int updateByPrimaryKeySelective(AuthDatarange record);

    int updateByPrimaryKey(AuthDatarange record);
}