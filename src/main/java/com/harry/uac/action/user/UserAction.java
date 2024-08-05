package com.harry.uac.action.user;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.harry.uac.action.ActionBase;
import com.harry.uac.common.Consts;
import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.util.CommonUtil;
import com.harry.uac.common.util.DictUtil;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.common.util.Page;
import com.harry.uac.dao.ViewAuthOrgUserMapper;
import com.harry.uac.service.IOrgService;
import com.harry.uac.service.IOrgUserService;
import com.harry.uac.service.IUserService;
import com.harry.uac.vo.AjaxDone;
import net.sf.json.JSONObject;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.harry.uac.persistence.AuditLog;
import com.harry.uac.persistence.AuthOrg;
import com.harry.uac.persistence.AuthOrgUser;
import com.harry.uac.persistence.AuthOrgUserKey;
import com.harry.uac.persistence.AuthUser;
import com.harry.uac.persistence.Dict;
import com.harry.uac.persistence.ViewAuthOrgUser;
import com.harry.uac.persistence.ViewAuthOrgUserExample;

public class UserAction extends ActionBase {

    @Autowired
    private IOrgUserService orgUserService;
    @Autowired
    private IOrgService orgService;
    @Autowired
    private ViewAuthOrgUserMapper OrgUserDAO;
    private AuthOrg org;
    private AuthUser user;
    private String jsonResult;
    private OnePage<ViewAuthOrgUser> pageData;

    @Autowired
    private IUserService userService;
    private String actionName;
    private String rel;
    private List<Dict> nationDictList;
    private List<Dict> religionDictList;
    private List<Dict> levelDictList;
    private List<Dict> positionLevelDictList;
    private List<Dict> employeetypeDictList;
    private int val = 0;
    
    private File fileUpload;
    private String fileUploadFileName;
    private String fileUploadContentType;

    private String errorMsg;

    public String getErrorMsg() {
        return errorMsg;
    }

    public File getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(File fileUpload) {
        this.fileUpload = fileUpload;
    }

    public String getFileUploadFileName() {
        return fileUploadFileName;
    }

    public void setFileUploadFileName(String fileUploadFileName) {
        this.fileUploadFileName = fileUploadFileName;
    }
    
    public String getFileUploadContentType() {
        return fileUploadContentType;
    }

    public void setFileUploadContentType(String fileUploadContentType) {
        this.fileUploadContentType = fileUploadContentType;
    }


    private AuthOrgUser orgUser;

    @Action(value = "initUserPageInfo", results = { @Result(name = "initUserPageInfo", location = "user_list.jsp") })
    public String initUserListPage() {
	return "initUserPageInfo";
    }

    @Action(value = "queryUserInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String queryUserInfo() {

	return SUCCESS;
    }

    /**
     * display add/update jsp
     * 
     * @return
     */
    @Action(value = "displayUser", results = { @Result(name = "displayUser", location = "user_add.jsp") })
    public String displayUser() {
	String userId = (String) getParameterValue("userId");
	String orgId = (String) getParameterValue("orgId");
	if (userId != null) {
	    user = userService.findSingleUser(Long.valueOf(userId));
	    AuthOrgUserKey orgUserKey = new AuthOrgUserKey();
	    orgUserKey.setUserId(Long.valueOf(userId));
	    orgUserKey.setOrgId(Long.valueOf(orgId));

	    if(null != user.getUserPhoto()) {
		String savePath = ServletActionContext.getServletContext().getRealPath("");// 获取项目根路径
		String newFileFullPath = savePath + Consts.DEFAULT_UPLOADPHOTO_PATH + user.getUserId() + "_photo.jpg";
		byte2image(user.getUserPhoto(), newFileFullPath);
	    }
	    getHttpServletRequest().setAttribute("photoPath", Consts.DEFAULT_UPLOADPHOTO_PATH + user.getUserId() + "_photo.jpg");
	    orgUser = orgUserService.findSingleOrgUser(orgUserKey);
	    orgUser.setOrgInfo(orgService.findSingleOrg(orgUser.getOrgId()));
	    this.rel = "user_list";
	    this.actionName = "updateUser";
	} else {
	    orgUser = new AuthOrgUser();
	    orgUser.setOrgId(Long.valueOf(orgId));
	    this.rel = "user_list";
	    this.actionName = "saveUser";
	}
	return "displayUser";
    }
    
    @Action(value = "uploadPhoto", interceptorRefs = { @InterceptorRef(value = "defaultStack") }, results = { @Result(name = "success", location = "user_add.jsp") })
    public String uploadPhoto() throws IOException {
	String extName = "";// 文件扩展名
	
	String savePath = ServletActionContext.getServletContext().getRealPath("");// 获取项目根路径
	savePath = savePath + Consts.DEFAULT_UPLOADPHOTO_PATH;
	File savePathFile = new File(savePath);
	if (!savePathFile.isDirectory()) {
	    savePathFile.mkdir();
	}

	HttpServletResponse response = super.getHttpServletResponse();
	response.setCharacterEncoding("utf-8");// 防止乱码

	// 生成5位随机数，以防文件重名
//	int randomNum = (int) (r.nextDouble() * (99999 - 10000 + 1)) + 10000;
//	simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
//	nowTimeStr = simpleDateFormat.format(new Date());

	if (this.fileUploadFileName.lastIndexOf(".") >= 0) {
	    extName = this.fileUploadFileName.substring(fileUploadFileName.lastIndexOf("."));
	}
//	String newFileFullPath = savePath + nowTimeStr + randomNum + extName;
	String newFileFullPath = savePath + user.getUserId() + "_photo" + extName;
	File newFile = new File(newFileFullPath);
	if (newFile.exists()) {
	    newFile.delete();
	}
//	if (!newFile.exists()) {
//	    fileUpload.renameTo(newFile);
//	}
	
	try {
//	    List<TempUserInfo> tempUserInfos = userService.readAuthUsersFromExcel(newFileFullPath,
//		            Consts.EXCEL_IMPORT_USER_DEFAULT_SHEET, this.fileUploadFileName);
//	    userService.checkAndSaveExcelImportUser(tempUserInfos);
//
	    FileUtils.copyFile(fileUpload, newFile);
	} catch (Exception e) {
	    errorMsg = e.getMessage();
	}
	PrintWriter w = super.getHttpServletResponse().getWriter();
	w.print(user.getUserId() + "_photo" + extName);
	return null;
    }
    

    @Action(value = "saveUser")
    public String saveUser() {
	// System.out.println(user.getUserId());
	user.setUserName(user.getUserLastname() + " " + user.getUserFirstname());
	user.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
	user.setCreateTime(new Date());
	userService.insertUser(user);
	orgUser.setUserId(user.getUserId());
	orgUserService.insertOrgUser(orgUser);
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_INSERT, Consts.AUDIT_OBJECT_USER,
	                Consts.AUDIT_LEVEL_NORMAL, "新增用户[" + user.getUserName() + "]成功！", AppContextHolder.getContext()
	                                .getUser().getUserId(), user.getCreateTime(), new Date(), new Date());
	CommonUtil.authLog(auditInfo);
	String navTab = (String) getParameterValue("navTabId");
	// AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK,
	// "save ok")
	// .navTabId(navTab)
	// .forwardUrl(
	// "../user/queryUserInfo?application.applicationId="
	// + user.getApplicationId()).build();
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, getText("global.save.success")).navTabId(navTab)
	                .build();

	return ajaxForward(parameAjaxDone);
    }

    /**
     * update user action
     * 
     * @return
     */
    @Action(value = "updateUser")
    public String updateUser() {
	String savePath = ServletActionContext.getServletContext().getRealPath("");// 获取项目根路径
	String photoPath = savePath + (String)getParameterValue("photoPath");
	user.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	user.setUpdateTime(new Date());
	try {
	    user.setUserPhoto(getPhoto(photoPath));
        } catch (IOException e) {
	    e.printStackTrace();
        }
	user.setUserName(user.getUserLastname() + " " + user.getUserFirstname());
	userService.updateUser(user);
	// 没改过组织节点
	if (orgUser.getOrgId() == orgUser.getOrgInfo().getOrgId()){
	    orgUserService.updateOrgUser(orgUser);
	} else {
	    AuthOrgUserKey aukey = new AuthOrgUserKey();
	    aukey.setOrgId(orgUser.getOrgId());
	    aukey.setUserId(user.getUserId());
	    orgUserService.deleteOrgUser(aukey);
	    
	    orgUser.setOrgId(orgUser.getOrgInfo().getOrgId());
	    orgUserService.insertOrgUser(orgUser);
	    
	}
	
	
	
	AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_UPDATE, Consts.AUDIT_OBJECT_USER,
	                Consts.AUDIT_LEVEL_NORMAL, "修改用户[" + user.getUserName() + "]成功！", AppContextHolder.getContext()
	                                .getUser().getUserId(), new Date(), new Date(), new Date());
	CommonUtil.authLog(auditInfo);
	String navTab = (String) getParameterValue("navTabId");
	// AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK,
	// "update ok")
	// .navTabId(navTab)
	// .forwardUrl(
	// "../user/queryUserInfo?application.applicationId="
	// + user.getApplicationId()).build();
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, getText("global.update.success")).navTabId(
	                navTab).build();

	return ajaxForward(parameAjaxDone);
    }
    
    private byte[] getPhoto(String path) throws IOException {        
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(path));        
        ByteArrayOutputStream out = new ByteArrayOutputStream();        
        byte[] temp = new byte[1024];        
        int size = 0;        
        while ((size = in.read(temp)) != -1) {        
            out.write(temp, 0, size);        
        }        
        in.close();        
        byte[] content = out.toByteArray();        
        return content;
    }
    
    private void byte2image(byte[] data, String path) {
	if (data.length < 3 || path.equals(""))
	    return;
	try {
	    FileImageOutputStream imageOutput = new FileImageOutputStream(new File(path));
	    imageOutput.write(data, 0, data.length);
	    imageOutput.close();
	    System.out.println("Make Picture success,Please find image in " + path);
	} catch (Exception ex) {
	    System.out.println("Exception: " + ex);
	    ex.printStackTrace();
	}
    }

    /**
     * delete action
     * 
     * @return
     */
    @Action(value = "deleteUser", results = { @Result(name = "success", type = "json", params = { "includeProperties",
	    "jsonResult" }) })
    public String deleteUser() {
	String userId = (String) getParameterValue("userId");
	user = userService.findSingleUser(Long.valueOf(userId));
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	Date orgUserEndtime = new Date();
	String userEndtime = sdf.format(orgUserEndtime);
	// Date userEndtime = new Date();
	if (userId == null) {
	    AjaxDone errorAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "delete error").build();
	    return ajaxForward(errorAjaxDone);
	}
	if (!user.getUserStatus().equals("1") && !user.getUserStatus().equals("2")) {
	    val = userService.updateOrgUser(Long.valueOf(userId), userEndtime);
//	    userService.deleteUser(Long.valueOf(userId));
//	    AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_DELETE, Consts.AUDIT_OBJECT_USER,
//		            Consts.AUDIT_LEVEL_WARN, "删除用户[" + user.getUserName() + "]成功！", AppContextHolder
//		                            .getContext().getUser().getUserId(), new Date(), new Date(), new Date());
//	    CommonUtil.authLog(auditInfo);
	    this.jsonResult = "{delCount:" + 1 + "}";
	    if (val == 0) {
		AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_LOCK, Consts.AUDIT_OBJECT_USER,
		                Consts.AUDIT_LEVEL_NORMAL, "锁定用户[" + user.getUserName() + "]失败，失败原因：存在与用户相关联的数据，无法删除！",
		                AppContextHolder.getContext().getUser().getUserId(), new Date(), new Date(), new Date());
		CommonUtil.authLog(auditInfo);
	    } else {
		AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_LOCK, Consts.AUDIT_OBJECT_USER,
		                Consts.AUDIT_LEVEL_NORMAL, "锁定用户[" + user.getUserName() + "]成功！", AppContextHolder
		                                .getContext().getUser().getUserId(), new Date(), new Date(), new Date());
		CommonUtil.authLog(auditInfo);
	    }
	}
	return SUCCESS;
    }
    
    /**
     * delete action
     * 
     * @return
     */
    @Action(value = "deleteUserPhysically", results = { @Result(name = "success", type = "json", params = { "includeProperties",
	    "jsonResult" }) })
    public String deleteUserPhysically() {
	String userId = (String) getParameterValue("userId");
	user = userService.findSingleUser(Long.valueOf(userId));
	// Date userEndtime = new Date();
	if (userId == null) {
	    AjaxDone errorAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, "delete error").build();
	    return ajaxForward(errorAjaxDone);
	}
	if (!user.getUserStatus().equals("1") && !user.getUserStatus().equals("2")) {
	    //val = userService.updateOrgUser(Long.valueOf(userId), userEndtime);
	    userService.deleteUser(Long.valueOf(userId));
	    AuditLog auditInfo = new AuditLog(Consts.AUDIT_TYPE_DELETE, Consts.AUDIT_OBJECT_USER,
		            Consts.AUDIT_LEVEL_WARN, "删除用户[" + user.getUserName() + "]成功！", AppContextHolder
		                            .getContext().getUser().getUserId(), new Date(), new Date(), new Date());
	    CommonUtil.authLog(auditInfo);
	    this.jsonResult = "{delCount:" + 1 + "}";
	}
	return SUCCESS;
    }

    @Action(value = "queryUserOrgInfo", results = { @Result(name = "success", type = "json", params = {
	    "includeProperties", "jsonResult" }) })
    public String queryUserOrgInfo() {
	loadPerPage();
	ViewAuthOrgUserExample criteria = searchCondition();
	pageData = orgUserService.onePageOrgUser(criteria);

	Map<String, OnePage<ViewAuthOrgUser>> map = new HashMap<String, OnePage<ViewAuthOrgUser>>();
	map.put("pageData", pageData);
	this.jsonResult = JSONObject.fromObject(map).toString();
	return SUCCESS;
    }

    private ViewAuthOrgUserExample searchCondition() {
	ViewAuthOrgUserExample criteria = new ViewAuthOrgUserExample();
	// initialize search condition
	ViewAuthOrgUserExample.Criteria c = criteria.createCriteria();
	// if (getParameterValue("criteria_orgName") != null) {
	// c.andOrgNameLike(("%" + (String) getParameterValue("criteria_orgName")).trim());
	// }
	if (!getParameterValue("org.orgLayerCode").equals("") && getParameterValue("org.orgLayerCode") != null) {
	    c.andOrgLayerCodeLike(((String) getParameterValue("org.orgLayerCode")).trim() + "%");
	}
	if (getParameterValue("user.uesrName") != null) {
	    c.andUserNameLike("%" + ((String) getParameterValue("user.uesrName")).trim() + "%");
	}
	if (getParameterValue("user.userUid") != null) {
	    c.andUserUidLike("%" + ((String) getParameterValue("user.userUid")).trim() + "%");

	}
	if (getParameterValue("user.userStatus") != null) {
	    if (Integer.parseInt((String) getParameterValue("user.userStatus")) != 2)
		c.andUserStatusEqualTo(Integer.parseInt((String) getParameterValue("user.userStatus")));
	}
	if (getParameterValue("user.userUsertype") != null && !getParameterValue("user.userUsertype").equals("")) {
	    c.andUserUsertypeEqualTo(((String) getParameterValue("user.userUsertype")));
	}
	if (getParameterValue("user.userGender") != null) {
	    if (Integer.parseInt((String) getParameterValue("user.userGender")) != 4)
		c.andUserGenderEqualTo(Integer.parseInt((String) getParameterValue("user.userGender")));
	}
	// initialize pagination parameter
	int pageNum = 1, numPerPage = 20;
	if (getParameterValue("pageNum") != null) {
	    pageNum = Integer.valueOf((String) getParameterValue("pageNum"));
	    numPerPage = Integer.valueOf((String) getParameterValue("numPerPage"));
	}
	Page page = new Page((pageNum - 1) * numPerPage + 1, numPerPage);
	criteria.setPage(page);
	return criteria;
    }

    public AuthOrg getOrg() {
	return org;
    }

    public void setOrg(AuthOrg org) {
	this.org = org;
    }

    public AuthUser getUser() {
	return user;
    }

    public void setUser(AuthUser user) {
	this.user = user;
    }

    public String getJsonResult() {
	return jsonResult;
    }

    public void setJsonResult(String jsonResult) {
	this.jsonResult = jsonResult;
    }

    public OnePage<ViewAuthOrgUser> getPageData() {
	return pageData;
    }

    public void setPageData(OnePage<ViewAuthOrgUser> pageData) {
	this.pageData = pageData;
    }

    public String getActionName() {
	return actionName;
    }

    public void setActionName(String actionName) {
	this.actionName = actionName;
    }

    public String getRel() {
	return rel;
    }

    public void setRel(String rel) {
	this.rel = rel;
    }

    public List<Dict> getNationDictList() {
	List<Dict> nationList = DictUtil.getDictListByDictTableName("DICT_NATION");
	setNationDictList(nationList);
	return nationDictList;
    }

    public void setNationDictList(List<Dict> nationDictList) {
	this.nationDictList = nationDictList;
    }

    public List<Dict> getReligionDictList() {
	setReligionDictList(DictUtil.getDictListByDictTableName("DICT_POLITY"));
	return religionDictList;
    }

    public void setReligionDictList(List<Dict> religionDictList) {
	this.religionDictList = religionDictList;
    }

    public List<Dict> getLevelDictList() {
	setLevelDictList(DictUtil.getDictListByDictTableName("DICT_USER_LEVEL"));
	return levelDictList;
    }

    public void setLevelDictList(List<Dict> levelDictList) {
	this.levelDictList = levelDictList;
    }

    public List<Dict> getPositionLevelDictList() {
	setPositionLevelDictList(DictUtil.getDictListByDictTableName("DICT_POSITON_TITLE"));
	return positionLevelDictList;
    }

    public void setPositionLevelDictList(List<Dict> positionLevelDictList) {
	this.positionLevelDictList = positionLevelDictList;
    }

    public List<Dict> getEmployeetypeDictList() {
	setEmployeetypeDictList(DictUtil.getDictListByDictTableName("DICT_USER_TYPE"));
	return employeetypeDictList;
    }

    public void setEmployeetypeDictList(List<Dict> employeeTypeDictList) {
	this.employeetypeDictList = employeeTypeDictList;
    }

    public AuthOrgUser getOrgUser() {
	return orgUser;
    }

    public void setOrgUser(AuthOrgUser orgUser) {
	this.orgUser = orgUser;
    }

    public int getVal() {
	return val;
    }

    public void setVal(int val) {
	this.val = val;
    }

    private static final long serialVersionUID = 908405643678412792L;
}
