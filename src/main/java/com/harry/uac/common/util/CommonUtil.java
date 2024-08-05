package com.harry.uac.common.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.dao.AuditLogMapper;
import com.harry.uac.persistence.AuditLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * common util for this project
 * 
 * @author wangsg
 * 
 */
@Component("commonUtil")
public class CommonUtil {

    /**
     * get the content from the giving path
     * 
     * @param path
     * @return
     */
    public static List<String> ListFilesInDir(String path) {
	List<String> fileList = new ArrayList<String>();
	// list directory files
	File folder = new File(path);
	File[] listOfFiles = folder.listFiles();
	for (int i = 0; i < listOfFiles.length; i++) {
	    if (listOfFiles[i].isFile()) {
		fileList.add(listOfFiles[i].getName());
	    } else if (listOfFiles[i].isDirectory()) {
	    }
	}
	return fileList;
    }

    /**
     * if equal return true if not equal return false
     * 
     * @param dest
     * @param target
     * @return
     */
    public static boolean compareTwoObject(Object dest, Object target) {
	if (dest == null && target == null) {
	    return true;
	} else if (dest != null) {
	    return dest.equals(target);
	} else {
	    return false;
	}
    }

    /**
     * @param type
     * @param level
     * @param msg
     */
    public static void generateAuditInfo(short type, short level, String msg) {
	Date d = new Date();
	AuditLog retAuditLog = new AuditLog();
	retAuditLog.setOperateType(type);
	// retAuditLog.setOperateObject((short) 0);
	retAuditLog.setOperateLevel(level);
	retAuditLog.setOperateDetail(msg);
	retAuditLog.setOperateOperator(AppContextHolder.getContext().getUser().getUserId());
	retAuditLog.setCreateDate(d);
	retAuditLog.setUpdateDate(d);
	authLog(retAuditLog);
    }

    private static AuditLogMapper auditLogDAO;
    
    @Autowired
    private AuditLogMapper auditLogMapper;
    
    @PostConstruct
    public void init() {
	auditLogDAO = auditLogMapper;
    }

    public static void authLog(AuditLog auditInfo) {
	auditLogDAO.insert(auditInfo);
    }

}
