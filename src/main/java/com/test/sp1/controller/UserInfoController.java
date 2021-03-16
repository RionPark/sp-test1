package com.test.sp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp1.entity.UserInfo;
import com.test.sp1.service.UserInfoService;

@Controller
public class UserInfoController {
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
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public @ResponseBody UserInfo getUserInfo(@RequestParam int uiNum) {
		System.out.println("uiNum=" + uiNum);
		return null;
	}
}
