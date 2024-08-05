package com.harry.uac.service;

import java.util.List;

import com.harry.uac.common.exception.AppException;
import com.harry.uac.persistence.AuthUser;
import com.harry.uac.persistence.AuthUserExample;
import com.harry.uac.persistence.TempUserInfo;

public interface IUserService {
    void insertUser(AuthUser userInfo);
    
    void updateUserWS(AuthUser userInfo);

    void deleteUser(Long userId);

    void updateUser(AuthUser userInfo);

    // OnePage<AuthUser> onePageUser(AuthUserExample criteria);

    AuthUser findSingleUser(Long userId);

    // int deleteUserWithValidator(Long userId);

    public List<AuthUser> selectAuthUserByExample(AuthUserExample example);

    public AuthUser selectAuthUserByUid(String uid);

    public AuthUser selectAuthUserById(Long id);

    public int updateByPrimaryKey(AuthUser user);

    public List<TempUserInfo> readAuthUsersFromExcel(String excelPath, String sheetName, String sourceName)
	            throws AppException;

    public void checkAndSaveExcelImportUser(List<TempUserInfo> tempUserInfos);

    public void exportUsersToExcel(List<AuthUser> users, String excelPath) throws AppException;

    int updateOrgUser(Long userId, String userEndtime);

}
