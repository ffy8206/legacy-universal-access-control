package com.harry.uac.action.batchusermgt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletResponse;

import com.harry.uac.action.ActionBase;
import com.harry.uac.common.Consts;
import com.harry.uac.common.exception.AppException;
import com.harry.uac.persistence.AuthUser;
import com.harry.uac.persistence.AuthUserExample;
import com.harry.uac.persistence.TempUserInfo;
import com.harry.uac.service.IUserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author xm
 * 
 */
public class BatchUserImportAction extends ActionBase {
    /**
     * 属性名：fileUpload 对应于页面input控件的name属性值
     */
    private File fileUpload;
    /**
     * 属性名：fileUploadFileName 需满足规则：File的名字 + FileName Struts2拦截器按此规则拦截文件名
     */
    private String fileUploadFileName;
    
    @Autowired
    private IUserService userService;

    /**
     * 文件下载参数
     */
    private String inputPath;
    private String contentType;
    private String inputName;
    private InputStream inputStream;
    private String contentDisposition;
    private int bufferSize;

    private Log log = LogFactory.getLog(getClass());
    private String errorMsg;
    private String successMsg;

    @Action(value = "userBatchImport", results = { @Result(name = "success", location = "batchUserImport.jsp") })
    public String userBatchImport() {
	return SUCCESS;
    }

    @Action(value = "uploadFile", results = { @Result(name = "success", location = "batchUserImport.jsp") })
    public String uploadFile() {
	log.debug("entering uploadFile method: uploaded original file name is" + this.fileUploadFileName);
	String extName = "";// 文件扩展名
	String nowTimeStr = "";

	SimpleDateFormat simpleDateFormat;
	Random r = new Random();

	String savePath = ServletActionContext.getServletContext().getRealPath("");// 获取项目根路径
	savePath = savePath + Consts.DEFAULT_UPLOADFILE_PATH;
	File savePathFile = new File(savePath);
	if (!savePathFile.isDirectory()) {
	    savePathFile.mkdir();
	}

	HttpServletResponse response = super.getHttpServletResponse();
	response.setCharacterEncoding("utf-8");// 防止乱码

	// 生成5位随机数，以防文件重名
	int randomNum = (int) (r.nextDouble() * (99999 - 10000 + 1)) + 10000;
	simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	nowTimeStr = simpleDateFormat.format(new Date());

	if (this.fileUploadFileName.lastIndexOf(".") >= 0) {
	    extName = this.fileUploadFileName.substring(fileUploadFileName.lastIndexOf("."));
	}
	String newFileFullPath = savePath + nowTimeStr + randomNum + extName;
	File newFile = new File(newFileFullPath);

	if (!newFile.exists()) {
	    fileUpload.renameTo(newFile);
	}
	log.debug("finished uploading file: new file name:" + newFileFullPath);
	// AjaxDone ajaxDone = new AjaxDone.Builder(Consts.AJAX_ERROR,
	// labels.getString("error.userhelp.password.wrong")).build();

	log.debug("begin to read user list from excel:");
	try {
	    List<TempUserInfo> tempUserInfos = userService.readAuthUsersFromExcel(newFileFullPath,
		            Consts.EXCEL_IMPORT_USER_DEFAULT_SHEET, this.fileUploadFileName);
	    userService.checkAndSaveExcelImportUser(tempUserInfos);

	} catch (AppException e) {
	    // TODO: handle exception
	    errorMsg = e.getMessage();
	}
	this.setSuccessMsg("用户导入成功");
	return SUCCESS;
    }

    @Action(value = "downloadFile", results = { @Result(name = "success", type = "stream", params = {
	    "includeProperties", "inputPath", "inputStream", "contentType", "contentDisposition", "bufferSize" }) })
    public String downloadFile() {
	log.debug("starting download file: " + inputPath);
	String rootPath = ServletActionContext.getServletContext().getRealPath("");
	String fullPath = "";
	if (inputPath != null && !inputPath.equals("")) {
	    fullPath = rootPath + "\\" + inputPath;
	}
	if (inputPath.contains("export_user_list.xls")) {
	    exportUserToExcel(fullPath);
	}
	try {
	    this.setInputStream(new FileInputStream(fullPath));
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	    log.debug("File not found: " + fullPath);
	    // AjaxDone error = new AjaxDone.Builder(Consts.AJAX_ERROR, getText("downfile.file.not.found")).build();
	    // return ajaxForward(error);
	    return ERROR;
	}
	// finally {
	// if(inputStream != null)
	// try {
	// inputStream.close();
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	// AjaxDone success = new AjaxDone.Builder(Consts.AJAX_OK, "").build();
	return SUCCESS;
    }

    @Action(value = "userBatchExport", results = { @Result(name = "success", location = "batchUserExport.jsp") })
    public String userBatchExport() {
	return SUCCESS;
    }

    /**
     * @return excel文件路径
     */
    private void exportUserToExcel(String exportExcelPath) {
	String rootPath = ServletActionContext.getServletContext().getRealPath("");
	String templatePath = rootPath + "\\" + Consts.DEFAULT_EXCEL_EXPORT_TEMPLATE_PATH;
	File templateFile = new File(templatePath);
	File exportExcelFile = new File(exportExcelPath);
	if (templateFile.exists()) {
	    if (exportExcelFile.exists())
		exportExcelFile.delete();
	    templateFile.renameTo(new File(exportExcelPath));
	}
	List<AuthUser> users = userService.selectAuthUserByExample(new AuthUserExample());
	try {
	    userService.exportUsersToExcel(users, exportExcelPath);
	} catch (AppException e) {
	    errorMsg = e.getMessage();
	}
    }

    public void setFileUpload(File fileUpload) {
	this.fileUpload = fileUpload;
    }

    public File getFileUpload() {
	return fileUpload;
    }

    public void setFileUploadFileName(String fileUploadFileName) {
	this.fileUploadFileName = fileUploadFileName;
    }

    public String getFileUploadFileName() {
	return fileUploadFileName;
    }

    public void setInputPath(String inputPath) {
	this.inputPath = inputPath;
    }

    public String getInputPath() {
	return inputPath;
    }

    public void setContentType(String contentType) {
	this.contentType = contentType;
    }

    public String getContentType() {
	return contentType;
    }

    public void setContentDisposition(String contentDisposition) {
	this.contentDisposition = contentDisposition;
    }

    public String getContentDisposition() {
	return contentDisposition;
    }

    public void setBufferSize(int bufferSize) {
	this.bufferSize = bufferSize;
    }

    public int getBufferSize() {
	return bufferSize;
    }

    public void setInputStream(InputStream inputStream) {
	this.inputStream = inputStream;
    }

    public InputStream getInputStream() {
	return inputStream;
    }

    public void setInputName(String inputName) {
	this.inputName = inputName;
    }

    public String getInputName() {
	return inputName;
    }

    public void setErrorMsg(String errorMsg) {
	this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
	return errorMsg;
    }

    public void setSuccessMsg(String successMsg) {
	this.successMsg = successMsg;
    }

    public String getSuccessMsg() {
	return successMsg;
    }

    /**
	 * 
	 */
    private static final long serialVersionUID = -2558583595039979541L;
}
