package com.test.sp1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.sp1.dao.UserInfoDAO;
import com.test.sp1.entity.UserInfo;
import com.test.sp1.service.UserInfoService;

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDAO userInfoDAO;
	@Override
	public List<UserInfo> getUserInfoList() {
		return userInfoDAO.findUserInfos();
	}
	@Override
	public int saveUserInfo(UserInfo userInfo) {
		userInfoDAO.saveUserInfo(userInfo);
		return userInfo.getUiNum();
	}
	@Override
	public int updateUserInfo(UserInfo userInfo) {
		userInfoDAO.updateUserInfo(userInfo);
		return userInfo.getUiNum();
	}
	@Override
	public int deleteUserInfo(int uiId) {
		userInfoDAO.deleteUserInfo(uiId);
		if(userInfoDAO.findUserInfoByUiId(uiId)==null) {
			return 1;
		}
		return 0;
	} 

}
