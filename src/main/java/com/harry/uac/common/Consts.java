/**
 * 
 */
package com.harry.uac.common;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangsg
 * 
 */
public final class Consts {

    private Consts() {
    }

    public static final String USER_SESSION_KEY = "wallet.session.user";

    public static final String USER_SESSION_ROLE_KEY = "wallet.session.user.role";

    public static final String USER_SESSION_FORCE_CHANGEPWD_KEY = "ifForceChangePassword";

    public static final String TO_NORIGHTS_PAGE = "norights";

    public static final String GOING_TO_URL = "goto.url";

    public static final String LOGIN = "login";

    public static final String LOGIN_INDEX = "login_index";

    public static final String DEFAULT_LOGIN_DISPLAY_PAGE = "main/main-page";

    public static final String LDAP_CONFIG = "SpringConf/ldapconfig.properties";

    public static final String SSO_PROPERTIES_PATH = "ssoConfig.properties";

    public static final short AUDIT_LEVEL_NORMAL = 0;
    public static final short AUDIT_LEVEL_ERROR = 1;
    public static final short AUDIT_LEVEL_WARN = 2;

    public static final short AUDIT_TYPE_INSERT = 0;
    public static final short AUDIT_TYPE_UPDATE = 1;
    public static final short AUDIT_TYPE_DELETE = 2;
    public static final short AUDIT_TYPE_LOCK = 3;
    // public static final short AUDIT_TYPE_AUTHORIZATION = 3;

    public static final short AUDIT_OBJECT_USER = 0;
    public static final short AUDIT_OBJECT_ORG = 1;
    public static final short AUDIT_OBJECT_GROUP = 2;
    public static final short AUDIT_OBJECT_APPLICATION = 3;
    public static final short AUDIT_OBJECT_ROLE = 4;
    public static final short AUDIT_OBJECT_PRIVILEGE = 5;
    public static final short AUDIT_OBJECT_DATARANGE = 6;

    public static final int ORG_STYLE_COMPANY = 0;
    public static final int ORG_STYLE_DEPARTMENT = 1;
    public static final int ORG_STYLE_OFFICES = 2;

    public static final int ORG_STATUS_NORAML = 0;
    public static final int ORG_STATUS_STOP = 1;

    // identical to dwz.core.js
    public static final int AJAX_OK = 200;
    public static final int AJAX_ERROR = 300;

    public static final String LOGIN_SHOW_DIALOG = "showlogindialog";

    public static final String LOGIN_FROM_DIALOG = "loginfromdialog";

     public static final Short TEMP_USER_SYNCED = 1;
    //
     public static final Short TEMP_USER_UNSYNCED = 0;

    public static final Short TEMP_USER_DATA_SOURCE_XML = 0;

    public static final Short TEMP_USER_DATA_SOURCE_EXCEL = 1;

    public static final Short TEMP_USER_DATA_SYNC_TYPE_ADD = 0;

    public static final Short TEMP_USER_DATA_SYNC_TYPE_UPDATE = 1;

    public static final Short TEMP_USER_DATA_SYNC_TYPE_DELETE = 2;

    public static final Long PREDEFINED_ROOTORG_ID = 0L;

    public static final String[] EXTEND_DATA_TYPE_USER_MSG = { "短信开关 ", "AUTH_USER", "MESSAGE", "0" };
    
    public static final String[] EXTEND_DATA_TYPE_ORG_TAG = { "组织标签 ", "AUTH_ORG", "TAG", "0" };
    
    public static final String[] EXTEND_DATA_TYPE_USER_TAG = { "用户标签", "AUTH_USER", "TAG", "0" };
    
    public static final String[] EXTEND_DATA_TYPE_APPLICATION_TAG = { "应用标签", "AUTH_APPLICATION", "TAG", "0" };

    public static final String EXTEND_DATA_KEY_ID = "ID";
    public static final String EXTEND_DATA_KEY_DATATYPEID = "DATA_DATATYPEID";
    public static final String EXTEND_DATA_KEY_SOURCEID = "DATA_SOURCEID";
    public static final String EXTEND_DATA_KEY_VALUE = "VALUE";
    public static final String EXTEND_DATA_KEY_ORDER = "DISPLAY_ORDER";
    public static final String EXTEND_DATA_KEY_REMARK = "DATA_REMARK";

    public static final String USER_MESSAGE_ON = "1";
    public static final String USER_MESSAGE_OFF = "0";

    public static final int STATISTICS_REPORT_FLAG_IMPORT_EXPORT = 0;
    public static final int STATISTICS_REPORT_FLAG_APP_SYNC = 1;
    public static final int STATISTICS_REPORT_FLAG_BASEDATA_UPDATE = 2;

    public static final String DEFAULT_UPLOADFILE_PATH = "\\uploadFiles\\";
    public static final String DEFAULT_UPLOADPHOTO_PATH = "\\uploadPhotos\\";
    public static final String DEFAULT_EXCEL_EXPORT_TEMPLATE_PATH = "template\\export_user_list_template.xls";
    public static final String DEFAULT_EXCEL_IMPORT_TEMPLATE_PATH = "template\\batch_user_import_template.xls";

    // Excel relatives
    public static final int EXCEL_ROW_START_INDEX = 2;
    public static final String EXCEL_IMPORT_USER_DEFAULT_SHEET = "user";
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_NAME = 1;
    // public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_UID = 2;
    // public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_PASSWORD = 3;
    // public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_SURNAME = 4;
    // public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_DESCRIPTION = 5;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_EMPLOYEE_NUMBER = 2;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_EMAIL = 3;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_NATION_DICT = 4;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_GENDER = 5;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_BIRTHDAY = 6;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_NATIONALITY = 7;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_RELIGION_DICT = 8;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_TELEPHONE_NUMBER = 9;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_PREFFERED_MOBILE = 10;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_POSTAL_ADDRESS = 11;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_POSTAL_CODE = 12;
    // public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_FAX_NUMBER = 16;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_STARTTIME = 13;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_ENDTIME = 14;
    // public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_STATUS = 19;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_ID_CARD_NUMBER = 15;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_EMPLOYEE_TYPE = 16;
    // public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_USERTYPE = 21;

    // public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_LEVEL_DICT = 23;
    // public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_CATEGORY = 24;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_ENTRYTIME = 17;
    // public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_POSITION_LEVEL_DICT = 26;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_LOCATION = 18;
    // public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_REMARK = 28;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_JOB_CODE = 19;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_JOB_NAME = 20;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_POSITION_CODE = 21;
    public static final int EXCEL_IMPORT_COLUMN_INDEX_USER_POSITION_NAME = 22;

    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_NAME = 1;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_FIRST_NAME = 2;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_LAST_NAME = 3;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_EMPLOYEE_NUMBER = 4;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_UID = 5;
    /*public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_SURNAME = 6;*/
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_DESCRIPTION = 6;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_EMAIL = 7;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_NATION_DICT = 8;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_GENDER = 9;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_BIRTHDAY = 10;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_NATIONALITY = 11;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_RELIGION_DICT = 12;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_TELEPHONE_NUMBER = 13;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_PREFERRED_MOBILE = 14;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_POSTAL_ADDRESS = 15;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_POSTAL_CODE = 16;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_FAX_NUMBER = 17;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_START_TIME = 18;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_END_TIME = 19;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_STATUS = 20;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_ID_CARD_NUMBER = 21;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_TYPE = 22;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_EMPLOYEE_TYPE = 23;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_LEVEL_DICT = 24;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_CATEGORY = 25;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_ENTRYTIME = 26;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_POSITION_LEVEL_DICT = 27;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_LOCATION = 28;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_REMARK = 29;
    public static final int EXCEL_EXPORT_COLUMN_INDEX_USER_LAST_LOGIN_TIME = 30;

    public static final Short EXPORT_USER_SUCCESS = 1;
    public static final Short EXPORT_USER_FAIL = 0;

    public static final String SYNC_CONSTS_YES = "是";
    public static final String SYNC_CONSTS_NO = "否";

    public static final String SYNC_CONSTS_ADD = "0";
    public static final String SYNC_CONSTS_UPDATE = "1";
    public static final String SYNC_CONSTS_DELETE = "2";

    public static Map<String, String> SYNC_CONSTS_TYPE_MAP = null;
    static {
	SYNC_CONSTS_TYPE_MAP = new HashMap<String, String>();
	SYNC_CONSTS_TYPE_MAP.put(Consts.SYNC_CONSTS_ADD, "新增");
	SYNC_CONSTS_TYPE_MAP.put(Consts.SYNC_CONSTS_UPDATE, "更新");
	SYNC_CONSTS_TYPE_MAP.put(Consts.SYNC_CONSTS_DELETE, "删除");
    }

    public static Map<String, String> orgColumnBeanMap = new HashMap<String, String>();
    static {
	orgColumnBeanMap.put("orgId", "ORG_ID");
	orgColumnBeanMap.put("orgName", "ORG_NAME");
	orgColumnBeanMap.put("orgCode", "ORG_CODE");
	orgColumnBeanMap.put("orgInitials", "ORG_INITIALS");
	orgColumnBeanMap.put("orgDescription", "ORG_DESCRIPTION");
	orgColumnBeanMap.put("orgStyle", "ORG_STYLE");
	orgColumnBeanMap.put("orgStatus", "ORG_STATUS");
	orgColumnBeanMap.put("orgParentId", "ORG_PARENT_ID");
	orgColumnBeanMap.put("orgLayerCode", "ORG_LAYER_CODE");
	orgColumnBeanMap.put("orgLevelDict", "ORG_LEVEL_DICT");
	orgColumnBeanMap.put("orgDisplayOrder", "ORG_DISPLAY_ORDER");
	orgColumnBeanMap.put("orgSupervisorUid", "ORG_SUPERVISOR_UID");
	orgColumnBeanMap.put("orgManagerUid", "ORG_MANAGER_UID");
	orgColumnBeanMap.put("orgViceManagerUid", "ORG_VICE_MANAGER_UID");
	orgColumnBeanMap.put("orgAdminUid", "ORG_ADMIN_UID");
	orgColumnBeanMap.put("orgManageOrgId", "ORG_MANAGE_ORG_ID");
	orgColumnBeanMap.put("orgPostalAddress", "ORG_POSTAL_ADDRESS");
	orgColumnBeanMap.put("orgPostalCode", "ORG_POSTAL_CODE");
	orgColumnBeanMap.put("orgTelephoneNumber", "ORG_TELEPHONE_NUMBER");
	orgColumnBeanMap.put("orgFaxNumber", "ORG_FAX_NUMBER");
	orgColumnBeanMap.put("orgStarttime", "ORG_STARTTIME");
	orgColumnBeanMap.put("orgEndtime", "ORG_ENDTIME");
	orgColumnBeanMap.put("orgErpId", "ORG_ERP_ID");
	orgColumnBeanMap.put("orgLocation", "ORG_LOCATION");
	orgColumnBeanMap.put("orgRemark", "ORG_REMARK");
	orgColumnBeanMap.put("createUserId", "CREATE_USER_ID");
	orgColumnBeanMap.put("createTime", "CREATE_TIME");
	orgColumnBeanMap.put("updateUserId", "UPDATE_USER_ID");
	orgColumnBeanMap.put("updateTime", "UPDATE_TIME");

    }

    public static Map<String, String> userColumnBeanMap = new HashMap<String, String>();
    static {
	userColumnBeanMap.put("userId", "USER_ID");
	userColumnBeanMap.put("userName", "USER_NAME");
	userColumnBeanMap.put("userUid", "USER_UID");
	userColumnBeanMap.put("userPassword", "USER_PASSWORD");
	userColumnBeanMap.put("userSurname", "USER_SURNAME");
	userColumnBeanMap.put("userDescription", "USER_DESCRIPTION");
	userColumnBeanMap.put("userEmail", "USER_EMAIL");
	userColumnBeanMap.put("userNationDict", "USER_NATION_DICT");
	userColumnBeanMap.put("userGender", "USER_GENDER");
	userColumnBeanMap.put("userBirthday", "USER_BIRTHDAY");
	userColumnBeanMap.put("userNationality", "USER_NATIONALITY");
	userColumnBeanMap.put("userReligionDict", "USER_RELIGION_DICT");
	userColumnBeanMap.put("userTelephoneNumber", "USER_TELEPHONE_NUMBER");
	userColumnBeanMap.put("userPreferredMobile", "USER_PREFERRED_MOBILE");
	userColumnBeanMap.put("userPostalAddress", "USER_POSTAL_ADDRESS");
	userColumnBeanMap.put("userPostalCode", "USER_POSTAL_CODE");
	userColumnBeanMap.put("userFaxNumber", "USER_FAX_NUMBER");
	userColumnBeanMap.put("userStarttime", "USER_STARTTIME");
	userColumnBeanMap.put("userEndtime", "USER_ENDTIME");
	userColumnBeanMap.put("userStatus", "USER_STATUS");
	userColumnBeanMap.put("userPwdModifiedDate", "USER_PWD_MODIFIED_DATE");
	userColumnBeanMap.put("userIdCardNumber", "USER_ID_CARD_NUMBER");
	userColumnBeanMap.put("userUsertype", "USER_USERTYPE");
	userColumnBeanMap.put("userEmployeeNumber", "USER_EMPLOYEE_NUMBER");
	userColumnBeanMap.put("userLevelDict", "USER_LEVEL_DICT");
	userColumnBeanMap.put("userCategory", "USER_CATEGORY");
	userColumnBeanMap.put("userEntrytime", "USER_ENTRYTIME");
	userColumnBeanMap.put("userPositionLevelDict", "USER_POSITION_LEVEL_DICT");
	userColumnBeanMap.put("userLocation", "USER_LOCATION");
	userColumnBeanMap.put("userRemark", "USER_REMARK");
	userColumnBeanMap.put("createUserId", "CREATE_USER_ID");
	userColumnBeanMap.put("createTime", "CREATE_TIME");
	userColumnBeanMap.put("updateUserId", "UPDATE_USER_ID");
	userColumnBeanMap.put("updateTime", "UPDATE_TIME");
	userColumnBeanMap.put("userEmployeetype", "USER_EMPLOYEETYPE");
	userColumnBeanMap.put("lastLoginTime", "LAST_LOGIN_TIME");
	userColumnBeanMap.put("passwordMofidyFlag", "PASSWORD_MODIFY_FLAG");

    }
    public final static SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");

}
