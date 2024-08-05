package com.harry.uac;

import com.harry.uac.ws.server.AuthorityService;
import com.harry.uac.ws.server.dto.AuthUserDTO;
import com.harry.uac.ws.server.result.AuthUserResult;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Test {
	public static void main(String[] args){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress("http://[address]:[port]/uac/webservice/soap/authorityService");
		factory.setServiceClass(AuthorityService.class);
		AuthorityService service = (AuthorityService)factory.create();
		
		
	    AuthUserDTO authUserDTO = new AuthUserDTO();
	    authUserDTO.setUserEmail("xxx@company.com");
	    
//	    authUserRoleDTO.setDataRange("project.1");
//	    authUserRoleDTO.setRoleName("PM");
//		AuthUserRoleResult result = service.selectUserRole(authUserRoleDTO);
		AuthUserResult result = service.selectAuthUser(authUserDTO);
		System.out.println("------------");
	}
}
