package com.harry.uac.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.harry.uac.persistence.ViewAuthOrgUser;
import com.harry.uac.persistence.ViewAuthOrgUserExample;

@MyBatisRepository
public interface ViewAuthOrgUserMapper {
    int countByExample(ViewAuthOrgUserExample example);

    int deleteByExample(ViewAuthOrgUserExample example);

    int insert(ViewAuthOrgUser record);

    int insertSelective(ViewAuthOrgUser record);

    List<ViewAuthOrgUser> selectByExample(ViewAuthOrgUserExample example);

    int updateByExampleSelective(@Param("record") ViewAuthOrgUser record,
	            @Param("example") ViewAuthOrgUserExample example);

    int updateByExample(@Param("record") ViewAuthOrgUser record, @Param("example") ViewAuthOrgUserExample example);

    List<ViewAuthOrgUser> selectPaginationByExample(ViewAuthOrgUserExample example);

    // ------------selectUsersForGroup--------------
    int countUsersForGroupByExample(ViewAuthOrgUserExample example);

    List<ViewAuthOrgUser> selectPaginationUsersForGroupByExample(ViewAuthOrgUserExample example);

    // ------------selectRemainingUsersForGroup--------------
    int countRemainingUsersForGroupByExample(ViewAuthOrgUserExample example);

    List<ViewAuthOrgUser> selectPaginationRemainingUsersForGroupByExample(ViewAuthOrgUserExample example);

}