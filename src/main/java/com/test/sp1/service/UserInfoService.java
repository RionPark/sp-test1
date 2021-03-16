package com.test.sp1.service;

import java.util.List;

import com.test.sp1.entity.UserInfo;

public interface UserInfoService {

	List<UserInfo> getUserInfoList();	
	int saveUserInfo(UserInfo userInfo);
	int updateUserInfo(UserInfo userInfo);
	int deleteUserInfo(int uiId);
}
