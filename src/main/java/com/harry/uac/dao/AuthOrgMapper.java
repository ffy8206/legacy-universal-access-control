package com.harry.uac.dao;

import java.util.List;

import com.harry.uac.persistence.AuthOrg;
import com.harry.uac.persistence.AuthOrgExample;
@MyBatisRepository
public interface AuthOrgMapper {
    int countByExample(AuthOrgExample example);

    int deleteByExample(AuthOrgExample example);

    int deleteByPrimaryKey(Long orgId);

    int insert(AuthOrg record);

    List<AuthOrg> selectByExample(AuthOrgExample example);
    
    List<AuthOrg> selectPaginationByExample(AuthOrgExample example);

    AuthOrg selectByPrimaryKey(Long orgId);

    int updateByPrimaryKeySelective(AuthOrg record);

    int updateByPrimaryKey(AuthOrg record);
    
    List<AuthOrg> selectChildOrgs(String orgCode);
    
    String maxLayerCode(String parent);
}