package com.harry.uac.service;

import java.util.List;

import javax.annotation.PostConstruct;

import com.harry.uac.dao.AuthOrgMapper;
import com.harry.uac.persistence.AuthOrg;
import com.harry.uac.persistence.AuthOrgExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

/**
 * 
 * @author xm
 * 
 */
@Service("commonService")
public class CommonService {
    
    @Autowired
    private AuthOrgMapper authOrgMapper;
    
    @PostConstruct
    public void init() {
	orgDAO = authOrgMapper;
    }

    private static AuthOrgMapper orgDAO;
    private static String treeData;
    private final static String jsonTemplate = "{'orgID' : '{0}', 'orgCodeNo' : '{1}', 'orgName' : '{2}', 'pid' : '{3}', 'children' : [{4}]}";
    private final static String jsonZTreeTemplate = "{'id' : '{0}', 'pId' : '{1}', 'name' : '{2}', 'open' : '{3}', 'click' : \"orgTreeNodeSel({4})\", 'isParent' : '{5}'}";

    public static String getOrgTreeJsonData(Long rootOrgId) {
	// TODO Auto-generated method stub
	List<AuthOrg> rootOrgs = Lists.newArrayList();
	//AuthOrg rootOrg = null;
	if (rootOrgId == null) {
	    // get default root Org
	    AuthOrgExample example = new AuthOrgExample();
	    AuthOrgExample.Criteria criteria = example.createCriteria();
	    criteria.andOrgParentIdEqualTo("");
	    //rootOrg = orgDAO.selectByExample(example).get(0);
	    // adds mulit-root support
	    rootOrgs = orgDAO.selectByExample(example);
	    
	} else
	    rootOrgs.add(orgDAO.selectByPrimaryKey(rootOrgId));
	
	String json = "";
	for (AuthOrg rootOrg : rootOrgs) {
	    String temp = strFormatter4Json(jsonTemplate, rootOrg.getOrgId(), rootOrg.getOrgCode(), rootOrg.getOrgName(), rootOrg.getOrgParentId() == null ? "" : rootOrg.getOrgParentId());
	    temp = temp.replace("{4}", getJsonStr4Children(rootOrg.getOrgCode()));
	    json = json + temp + ",";
	}
	json = "[" + StringUtils.removeEnd(json, ",") + "]";
	return json;
    }

    private static String getJsonStr4Children(String orgCode) {
	// AuthOrg org = this.orgDAO.selectByPrimaryKey(2L);
	List<AuthOrg> orgs = orgDAO.selectChildOrgs(orgCode);
	StringBuilder strB = new StringBuilder();
	if (orgs != null && orgs.size() > 0) {
	    for (AuthOrg org: orgs) {
		String tmp = strFormatter4Json(jsonTemplate, org.getOrgId(), org.getOrgCode(), org.getOrgName(), org.getOrgParentId() == null ? "" : org.getOrgParentId());
		tmp = tmp.replace("{4}", getJsonStr4Children(org.getOrgCode()));
		strB.append(tmp + ",");
	    }
	    strB.deleteCharAt(strB.length() - 1);// remove last comma
	}
	return strB.toString();
    }

    /**
     * MessageFormat.format处理带有{符号的字符串有问题，故用此方法代替
     * 
     * @param str
     * @param object
     * @return
     */
    public static String strFormatter4Json(String str, Object... object) {
	for (int i = 0; i < object.length; i++) {
	    str = str.replace("{" + i + "}", object[i].toString());
	}
	return str;
    }

    public static String getOrgZTreeJsonData(Long rootOrgId) {
	// TODO Auto-generated method stub
	List<AuthOrg> rootOrgs = Lists.newArrayList();
	//AuthOrg rootOrg = null;
	if (rootOrgId == null) {
	    // get default root Org
	    AuthOrgExample example = new AuthOrgExample();
	    AuthOrgExample.Criteria criteria = example.createCriteria();
	    criteria.andOrgParentIdEqualTo("");
	    // rootOrg = orgDAO.selectByExample(example).get(0);
	    // adds mulit-root support
	    rootOrgs = orgDAO.selectByExample(example);
	} else
	    rootOrgs.add(orgDAO.selectByPrimaryKey(rootOrgId));
	
	String json = "";
	for (AuthOrg rootOrg : rootOrgs) {
	    String temp = strFormatter4Json(jsonZTreeTemplate, rootOrg.getOrgCode(), "0", rootOrg.getOrgName(), "true", "'"
		                + rootOrg.getOrgId() + "','" + rootOrg.getOrgName() + "','" + rootOrg.getOrgLayerCode() + "'",
		                "true");
	    String children = getJsonStr4ZTree(rootOrg.getOrgCode());
	    if (StringUtils.isNotEmpty(children)) {
		temp = temp + "," + children.substring(0, children.length() - 1);
	    }
	    json = json + temp + ",";
	}
	json = StringUtils.removeEnd(json, ",");
	return json;
    }

    private static String getJsonStr4ZTree(String orgCode) {
	List<AuthOrg> orgs = orgDAO.selectChildOrgs(orgCode);
	StringBuilder strB = new StringBuilder("");
	if (orgs != null && orgs.size() > 0) {
	    for (AuthOrg org: orgs) {
		String pNode = strFormatter4Json(jsonZTreeTemplate, org.getOrgCode(), org.getOrgParentId(),
		                org.getOrgName(), "false", "'" + org.getOrgId() + "','" + org.getOrgName() + "','"
		                                + org.getOrgLayerCode() + "'");
		String cNode = getJsonStr4ZTree(org.getOrgCode());
		if (StringUtils.isNotEmpty(cNode)) {
		    // parent node
		    pNode = pNode.replace("{5}", "true");
		} else {
		    // leaf node
		    pNode = pNode.replace("{5}", "false");
		}
		strB.append(pNode + "," + cNode);
	    }
	}
	return strB.toString();
    }

    public void setTreeData(String treeData) {
	CommonService.treeData = treeData;
    }

    public String getTreeData() {
	return treeData;
    }

}
