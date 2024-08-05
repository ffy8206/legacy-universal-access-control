package com.harry.uac.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import com.harry.uac.dao.AuthUserMapper;
import com.harry.uac.dao.SyncIncFieldsInfoMapper;
import com.harry.uac.dao.SyncIncInfoMapper;
import com.harry.uac.dao.TempUserInfoMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.Consts;
import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.exception.AppException;
import com.harry.uac.common.exception.BusinessException;
import com.harry.uac.common.util.CommonUtil;
import com.harry.uac.common.util.ExtendDataUtil;
import com.harry.uac.persistence.AuthUser;
import com.harry.uac.persistence.AuthUserExample;
import com.harry.uac.persistence.SyncIncFieldsInfo;
import com.harry.uac.persistence.SyncIncInfo;
import com.harry.uac.persistence.TempUserAssign;
import com.harry.uac.persistence.TempUserInfo;
import com.harry.uac.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private AuthUserMapper userDAO;
    @Autowired
    private TempUserInfoMapper tempUserDAO;
    @Autowired
    private SyncIncInfoMapper syncInfoDAO;
    @Autowired
    private SyncIncFieldsInfoMapper syncIncFieldsDAO;

    private Log log = LogFactory.getLog(getClass());

    @Override
    public List<AuthUser> selectAuthUserByExample(AuthUserExample example) {
	// TODO Auto-generated method stub
	return userDAO.selectByExample(example);
    }

    @Override
    public AuthUser selectAuthUserById(Long id) {
	// TODO Auto-generated method stub
	return userDAO.selectByPrimaryKey(id);
    }

    @Override
    public AuthUser selectAuthUserByUid(String uid) {
	// TODO Auto-generated method stub
	AuthUserExample example = new AuthUserExample();
	AuthUserExample.Criteria criteria = example.createCriteria();
	if (!uid.equals("")) {
	    criteria.andUserUidEqualTo(uid);
	}
	List<AuthUser> users = this.selectAuthUserByExample(example);
	if (users != null && users.size() > 0)
	    return users.get(0);
	return null;
    }

    @Override
    public void insertUser(AuthUser userInfo) {
	// insertAddSyncInfo(userInfo);

	userInfo.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
	userInfo.setCreateTime(new Date());
	userInfo.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	userInfo.setUpdateTime(new Date());
	userDAO.insert(userInfo);
	deletAndinsertTag(userInfo);

    }
    
	public void updateUserWS(AuthUser userInfo) {
		userInfo.setUpdateTime(new Date());
		userDAO.updateByPrimaryKeySelective(userInfo);
	}
    
    @Override
    public void deleteUser(Long userId) {
	// insertDeleteSyncInfo(userId);

	userDAO.deleteByPrimaryKey(userId);
    }

    @Override
    public void updateUser(AuthUser userInfo) {
	AuthUser userOldInfo = userDAO.selectByPrimaryKey(userInfo.getUserId());
	// insertUpdateSyncInfo(userInfo, userOldInfo);

	userInfo.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	userInfo.setUpdateTime(new Date());
	userDAO.updateByPrimaryKeyWithBLOBs(userInfo);
	deletAndinsertTag(userInfo);
    }

    @Override
    public AuthUser findSingleUser(Long userId) {
	AuthUser user = userDAO.selectByPrimaryKey(userId);
	List<Map<String, Object>> tags = ExtendDataUtil.selectExtendData(Consts.EXTEND_DATA_TYPE_USER_TAG,
	                userId.toString());
	String delim = "";
	StringBuffer sb = new StringBuffer();
	for (Map<String, Object> tagMap: tags) {
	    sb.append(delim).append(tagMap.get(Consts.EXTEND_DATA_KEY_VALUE));
	    delim = ",";
	}
	user.setTag(sb.toString());

	return user;

    }

    // @Override
    // public int deleteUserWithValidator(Long userId) {
    // return userDAO.deleteByPrimaryKeyWithValidator(userId);
    // }

    /**
     * insert tag
     * 
     * @param user
     */
    private void deletAndinsertTag(AuthUser user) {
	StringTokenizer st = new StringTokenizer(user.getTag(), ",");
	Long typeId = ExtendDataUtil.selectOrInsertDataExtendType(Consts.EXTEND_DATA_TYPE_USER_TAG);
	Map<String, Long> delMap = new HashMap<String, Long>();
	delMap.put(Consts.EXTEND_DATA_KEY_SOURCEID, user.getUserId());
	delMap.put(Consts.EXTEND_DATA_KEY_DATATYPEID, typeId);
	ExtendDataUtil.deleteExtendData(delMap);
	while (st.hasMoreElements()) {
	    // delete exists tag
	    // insert
	    Map<String, String> value = new HashMap<String, String>();
	    value.put(Consts.EXTEND_DATA_KEY_DATATYPEID, typeId.toString());
	    value.put(Consts.EXTEND_DATA_KEY_SOURCEID, user.getUserId().toString());// User_ID
	    value.put(Consts.EXTEND_DATA_KEY_VALUE, (String) st.nextElement());
	    ExtendDataUtil.insertExtendData(value);
	}
    }

    @Override
    public int updateByPrimaryKey(AuthUser user) {
	return userDAO.updateByPrimaryKey(user);
    }

    @Override
    public List<TempUserInfo> readAuthUsersFromExcel(String excelPath, String sheetName, String sourceName)
	            throws AppException {
	log.debug("begin reader user list from excel: " + excelPath);
	FileInputStream is = null;
	POIFSFileSystem poiFS;
	HSSFWorkbook workbook = null;
	List<TempUserInfo> tempUserInfos = null;
	try {
	    is = new FileInputStream(excelPath);
	    poiFS = new POIFSFileSystem(is);
	    workbook = new HSSFWorkbook(poiFS);

	    tempUserInfos = new ArrayList<TempUserInfo>();
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	    if (workbook != null) {
		HSSFSheet sheet = workbook.getSheet(sheetName);
		if (sheet != null) {
		    for (int i = Consts.EXCEL_ROW_START_INDEX; i < sheet.getPhysicalNumberOfRows(); i++) {
			HSSFRow row = sheet.getRow(i);
			if (row != null) {
			    TempUserInfo user = new TempUserInfo();
			    HSSFCell cell = null;
			    List<TempUserAssign> tempUserAssigns = new ArrayList<TempUserAssign>();
			    try {
				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_NAME - 1);
				if (cell != null)
				    user.setUserName(cell.getStringCellValue());

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_EMAIL - 1);
				if (cell != null)
				    user.setUserEmail(cell.getStringCellValue());

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_NATION_DICT - 1);
				if (cell != null)
				    user.setUserNationDict(Integer.getInteger(cell.getStringCellValue()));

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_GENDER - 1);
				if (cell != null)
				    // TODO
				    user.setUserGender(Integer.getInteger(cell.getStringCellValue()));

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_BIRTHDAY - 1);
				if (cell != null)
				    user.setUserBirthday(dateFormat.parse(cell.getStringCellValue()));

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_NATIONALITY - 1);
				if (cell != null)
				    user.setUserNationality(cell.getStringCellValue());

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_RELIGION_DICT - 1);
				if (cell != null)
				    // TODO
				    user.setUserReligionDict(Integer.getInteger(cell.getStringCellValue()));

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_TELEPHONE_NUMBER - 1);
				if (cell != null)
				    user.setUserTelephoneNumber(cell.getStringCellValue());

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_PREFFERED_MOBILE - 1);
				if (cell != null)
				    user.setUserPreferredMobile(cell.getStringCellValue());

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_POSTAL_ADDRESS - 1);
				if (cell != null)
				    user.setUserPostalAddress(cell.getStringCellValue());

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_POSTAL_CODE - 1);
				if (cell != null)
				    user.setUserPostalCode(cell.getStringCellValue());

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_STARTTIME - 1);
				if (cell != null)
				    user.setUserStarttime(dateFormat.parse(cell.getStringCellValue()));

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_ENDTIME - 1);
				if (cell != null)
				    user.setUserEndtime(dateFormat.parse(cell.getStringCellValue()));

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_ID_CARD_NUMBER - 1);
				if (cell != null)
				    user.setUserIdCardNumber(cell.getStringCellValue());

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_EMPLOYEE_TYPE - 1);
				if (cell != null)
				    user.setUserEmployeetype(cell.getStringCellValue());

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_EMPLOYEE_NUMBER - 1);
				if (cell != null)
				    user.setUserEmployeeNumber(cell.getStringCellValue());

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_ENTRYTIME - 1);
				if (cell != null)
				    user.setUserEntrytime(dateFormat.parse(cell.getStringCellValue()));

				cell = row.getCell(Consts.EXCEL_IMPORT_COLUMN_INDEX_USER_LOCATION - 1);
				if (cell != null)
				    user.setUserLocation(cell.getStringCellValue());

				// TODO
				// cell =
				// row.getCell(Consts.EXCEL_COLUMN_INDEX_USER_JOB_CODE);
				// if(cell != null){
				// String jobCodeStr =
				// cell.getStringCellValue();
				// String[] jobCodes = jobCodeStr.split(",");
				// }
				// temp user assign info
				user.setTempUserAssigns(tempUserAssigns);
				user.setDataFile(sourceName);
				user.setDataSource(Consts.TEMP_USER_DATA_SOURCE_EXCEL);

				tempUserInfos.add(user);
			    } catch (ParseException e) {
				AppException aException = new AppException("数据不合法，请检查后上传");
				aException.initCause(e);
				throw aException;
			    }
			}
		    }
		}
	    }
	} catch (Exception e) {
	    // TODO: handle exception
	    AppException se = new AppException("打开Excel文件: " + excelPath + "出现异常");
	    se.initCause(e);
	    throw se;
	} finally {
	    if (is != null)
		try {
		    is.close();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		    log.debug("failed to close FileinputStream, detials:" + e.getMessage());
		}
	}
	return tempUserInfos;
    }

    public void exportUsersToExcel(List<AuthUser> users, String excelPath) throws AppException {
	File excel = new File(excelPath);
	if (excel.exists()) {
	    POIFSFileSystem poifsFileSystem = null;
	    HSSFWorkbook wb = null;
	    HSSFSheet sheet = null;
	    FileInputStream fileInputStream = null;
	    FileOutputStream fileOutputStream = null;
	    try {
		fileInputStream = new FileInputStream(excel);
		poifsFileSystem = new POIFSFileSystem(fileInputStream);
		wb = new HSSFWorkbook(poifsFileSystem);
		sheet = wb.getSheet("user");

		// finally {
		// try {
		// if(fileInputStream != null)
		// fileInputStream.close();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		if (sheet != null) {
		    if (users != null && users.size() > 0) {
			for (int i = 0; i < users.size(); i++) {
			    AuthUser user = users.get(i);
			    HSSFRow row = sheet.createRow(i + 1); // index 0 is the
				                                  // headers text
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_NAME - 1).setCellValue(
				            user.getUserName());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_FIRST_NAME - 1).setCellValue(
				            user.getUserFirstname());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_LAST_NAME - 1).setCellValue(
				            user.getUserLastname());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_EMPLOYEE_NUMBER - 1).setCellValue(
				            user.getUserEmployeeNumber());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_UID - 1).setCellValue(
				            user.getUserUid());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_DESCRIPTION - 1).setCellValue(
				            user.getUserDescription());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_EMAIL - 1).setCellValue(
				            user.getUserEmail());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_NATION_DICT - 1).setCellValue(
				            user.getUserNationDict() == null ? "": user.getUserNationDict().toString());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_GENDER - 1).setCellValue(
				            user.getUserGender() == null ? "": user.getUserGender().toString());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_BIRTHDAY - 1).setCellValue(
				            user.getUserBirthday() == null ? "": user.getUserBirthday().toString());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_NATIONALITY - 1).setCellValue(
				            user.getUserNationality());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_RELIGION_DICT - 1).setCellValue(
				            user.getUserReligionDict() == null ? "": user.getUserReligionDict()
				                            .toString());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_TELEPHONE_NUMBER - 1).setCellValue(
				            user.getUserTelephoneNumber());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_PREFERRED_MOBILE - 1).setCellValue(
				            user.getUserPreferredMobile());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_POSTAL_ADDRESS - 1).setCellValue(
				            user.getUserPostalAddress());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_POSTAL_CODE - 1).setCellValue(
				            user.getUserPostalCode());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_FAX_NUMBER - 1).setCellValue(
				            user.getUserFaxNumber());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_START_TIME - 1).setCellValue(
				            user.getUserStarttime() == null ? "": user.getUserStarttime().toString());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_END_TIME - 1).setCellValue(
				            user.getUserEndtime() == null ? "": user.getUserEndtime().toString());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_STATUS - 1).setCellValue(
				            user.getUserStatus() == null ? "": user.getUserStatus().toString());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_ID_CARD_NUMBER - 1).setCellValue(
				            user.getUserIdCardNumber());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_TYPE - 1).setCellValue(
				            user.getUserUsertype());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_EMPLOYEE_TYPE - 1).setCellValue(
				            user.getUserEmployeetype());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_LEVEL_DICT - 1).setCellValue(
				            user.getUserLevelDict() == null ? "": user.getUserLevelDict().toString());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_CATEGORY - 1).setCellValue(
				            user.getUserCategory() == null ? "": user.getUserCategory().toString());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_ENTRYTIME - 1).setCellValue(
				            user.getUserEntrytime() == null ? "": user.getUserEntrytime().toString());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_POSITION_LEVEL_DICT - 1).setCellValue(
				            user.getUserPositionLevelDict() == null ? "": user
				                            .getUserPositionLevelDict().toString());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_LOCATION - 1).setCellValue(
				            user.getUserLocation());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_REMARK - 1).setCellValue(
				            user.getUserRemark());
			    row.createCell(Consts.EXCEL_EXPORT_COLUMN_INDEX_USER_LAST_LOGIN_TIME - 1).setCellValue(
				            user.getLastLoginTime() == null ? "": user.getLastLoginTime().toString());
			}
		    }
		}
		fileOutputStream = new FileOutputStream(excelPath);
		wb.write(fileOutputStream);
	    } catch (Exception e) {
		// TODO Auto-generated catch block
		AppException appException = new AppException("导出用户至Excel时发生异常");
		appException.initCause(e);
		throw appException;
	    } finally {
		try {
		    if (fileInputStream != null)
			fileInputStream.close();
		    if (fileOutputStream != null)
			fileOutputStream.close();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		    log.debug("failed to close fileInputStream. Exception Details:" + e.getMessage());
		}
	    }
	}
    }

    public int updateOrgUser(Long userId, String userEndtime) {
	return userDAO.updateOrgUser(userId, userEndtime);
    }

    @Override
    public void checkAndSaveExcelImportUser(List<TempUserInfo> tempUserInfos) {
        // TODO Auto-generated method stub
        if (tempUserInfos != null && tempUserInfos.size() > 0) {
            for (int i = 0; i < tempUserInfos.size(); i++) {
        	TempUserInfo tempUserInfo = tempUserInfos.get(i);
        	// check if user exists
        	String employeeNo = tempUserInfo.getUserEmployeeNumber();
        	AuthUserExample example = new AuthUserExample();
        	AuthUserExample.Criteria criteria = example.createCriteria();
        	criteria.andUserEmployeeNumberEqualTo(employeeNo);
        	List<AuthUser> users = userDAO.selectByExample(example);
        	if (users != null && users.size() > 0) {// user exists: update
        	    tempUserInfo.setDataSyncType(Consts.TEMP_USER_DATA_SYNC_TYPE_UPDATE);
        	    // TODO
        	    // tempUserInfos.get(i).setUserSyncStatus(null);
        	    // tempUserInfo.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
        	    // tempUserDAO.updateByPrimaryKeySelective(tempUserInfo);
        	} else {// non exist: add
        	    tempUserInfo.setDataSyncType(Consts.TEMP_USER_DATA_SYNC_TYPE_ADD);
        	    // tempUserInfo.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
        	}
        	tempUserInfo.setCreateTime(new Date());
        	tempUserDAO.insertSelective(tempUserInfo);
            }
        }
    }

    private void insertAddSyncInfo(AuthUser userInfo) {
	SyncIncInfo record = new SyncIncInfo();
	record.setOperateObjectId(userInfo.getUserId());
	record.setOperateObject("AUTH_USER");
	record.setOperateType(Short.valueOf(Consts.SYNC_CONSTS_ADD));
	record.setCreateTime(new Date());
	syncInfoDAO.insert(record);
	insertSyncFileds(userInfo, null, record.getSyncId(), Consts.SYNC_CONSTS_ADD);
    }

    private void insertUpdateSyncInfo(AuthUser userInfo, AuthUser userOldInfo) {
	SyncIncInfo record = new SyncIncInfo();
	record.setOperateObjectId(userInfo.getUserId());
	record.setOperateObject("AUTH_USER");
	record.setOperateType(Short.valueOf(Consts.SYNC_CONSTS_ADD));
	record.setCreateTime(new Date());
	syncInfoDAO.insert(record);
	insertSyncFileds(userInfo, userOldInfo, record.getSyncId(), Consts.SYNC_CONSTS_UPDATE);
    }

    private void insertDeleteSyncInfo(Long userId) {
	SyncIncInfo record = new SyncIncInfo();
	record.setOperateObjectId(userId);
	record.setOperateObject("AUTH_USER");
	record.setOperateType(Short.valueOf(Consts.SYNC_CONSTS_DELETE));
	record.setCreateTime(new Date());
	syncInfoDAO.insert(record);
    }

    /**
     * insert into sync_inc_fields_info
     * 
     * @param orgInfo current org
     * @param oldOrgInfo old org
     * @param syncId syncId
     * @param type operateType
     */
    private void insertSyncFileds(AuthUser orgInfo, AuthUser oldOrgInfo, Long syncId, String type) {
	SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date currentDate = new Date();
	Field[] orgfields = orgInfo.getClass().getDeclaredFields();
	try {
	    for (int i = 0; i < orgfields.length; i++) {
		if (orgfields[i].getName().equals("tag") || orgfields[i].getName().equals("createUserId")
		                || orgfields[i].getName().equals("createTime")
		                || orgfields[i].getName().equals("updateUserId")
		                || orgfields[i].getName().equals("updateTime")) {
		    continue;
		}
		orgfields[i].setAccessible(true);
		SyncIncFieldsInfo field1 = new SyncIncFieldsInfo();
		if (Consts.SYNC_CONSTS_ADD.equals(type)) {
		    field1.setSyncFieldsPreValue(null);
		} else if (Consts.SYNC_CONSTS_UPDATE.equals(type)) {
		    if (!CommonUtil.compareTwoObject(orgfields[i].get(orgInfo), orgfields[i].get(oldOrgInfo))) {
			if (orgfields[i].get(oldOrgInfo) != null) {
			    String preVal = "";
			    if (orgfields[i].get(oldOrgInfo) instanceof Date) {
				preVal = sFormat.format((Date) orgfields[i].get(oldOrgInfo));
			    } else {
				preVal = orgfields[i].get(oldOrgInfo).toString();
			    }
			    field1.setSyncFieldsPreValue(preVal);
			} else {
			    field1.setSyncFieldsPreValue(null);
			}
		    } else {
			continue;
		    }
		}
		field1.setSyncId(syncId);
		field1.setSyncFieldsName(Consts.userColumnBeanMap.get(orgfields[i].getName()));
		if (orgfields[i].get(orgInfo) == null) {
		    field1.setSyncFieldsCurValue(null);
		} else {
		    String curVal = "";
		    if (orgfields[i].get(orgInfo) instanceof Date) {
			curVal = sFormat.format((Date) orgfields[i].get(orgInfo));
		    } else {
			curVal = orgfields[i].get(orgInfo).toString();
		    }
		    field1.setSyncFieldsCurValue(curVal);
		}
		field1.setSyncFieldsType(Short.valueOf(Consts.SYNC_CONSTS_ADD));
		field1.setSyncFiledsTable("AUTH_USER");
		field1.setCreateTime(currentDate);
		syncIncFieldsDAO.insert(field1);
	    }
	} catch (NumberFormatException e) {
	    throw new BusinessException(e);
	} catch (IllegalArgumentException e) {
	    throw new BusinessException(e);
	} catch (IllegalAccessException e) {
	    throw new BusinessException(e);
	}
    }

}
