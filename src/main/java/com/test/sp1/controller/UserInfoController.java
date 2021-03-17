package com.test.sp1.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp1.entity.UserInfo;
import com.test.sp1.service.UserInfoService;

@Controller
public class UserInfoController {
	private static final Logger log = LoggerFactory.getLogger(UserInfoController.class);

	@Autowired
	private UserInfoService userService;

	@RequestMapping(value="/users", method=RequestMethod.GET)
	public @ResponseBody List<UserInfo> getUserInfoList(){
		List<UserInfo> uiList = userService.getUserInfoList();
		return uiList;
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public @ResponseBody Integer insertUser(@RequestBody UserInfo userInfo) {
		return userService.saveUserInfo(userInfo);
	}
	
	@RequestMapping(value="/user/delete", method=RequestMethod.POST)
	public @ResponseBody Integer deleteUser(@RequestBody UserInfo userInfo) {
		return userService.deleteUserInfo(userInfo.getUiNum());
	}
	
	@RequestMapping(value="/user/update", method=RequestMethod.POST)
	public @ResponseBody Integer updateUser(@RequestBody UserInfo userInfo) {
		log.debug("유저정보=>{}",userInfo);
		return userService.updateUserInfo(userInfo);
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public @ResponseBody UserInfo getUserInfo(@RequestParam int uiNum) {
		log.debug("uiNum=" + uiNum);
		return userService.getUserInfo(uiNum);
	}
}
