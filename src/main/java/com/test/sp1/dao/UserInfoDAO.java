package com.test.sp1.dao;

import java.util.List;

import com.test.sp1.entity.UserInfo;

public interface UserInfoDAO {

	List<UserInfo> findUserInfos();
	UserInfo findUserInfoByUiId(int uiId);
	void saveUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(int uiId);
}
