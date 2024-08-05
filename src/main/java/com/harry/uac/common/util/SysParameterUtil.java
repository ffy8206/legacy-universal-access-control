package com.harry.uac.common.util;

import java.util.ArrayList;
import java.util.List;

import com.harry.uac.dao.SysParameterMapper;
import com.harry.uac.persistence.SysParameter;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * system parameter util(from table:sys_parameter )
 * 
 * @author
 * 
 */
@Component("sysParameterUtil")
public class SysParameterUtil implements ApplicationContextAware {

    private static ApplicationContext context = null;
    private static SysParameterUtil sysParameter = null;
    private static List<SysParameter> sysParameterList = null;

    public synchronized static SysParameterUtil getInstance() {
	if (sysParameter == null) {
	    sysParameter = new SysParameterUtil();
	    SysParameterMapper sysParameterDAO = (SysParameterMapper) context.getBean("sysParameterMapper");
	    sysParameterList = sysParameterDAO.selectAll();
	}
	return sysParameter;
    }

    /**
     * get sys parameter by parameterName from db SysParameterUtil.getInstance().getParameterList("DICT")
     * 
     * @param parameterName
     * @return
     */
    public List<SysParameter> getParameterList(String parameterName) {
	List<SysParameter> list = new ArrayList<SysParameter>();
	for (SysParameter e: sysParameterList) {
	    if (e.getParameterName().equals(parameterName)) {
		list.add(e);
	    }
	}
	return list;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	context = applicationContext;
    }

    public List<SysParameter> getSysParameterList() {
	return sysParameterList;
    }

}
