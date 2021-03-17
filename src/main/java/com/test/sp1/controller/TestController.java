package com.test.sp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String test(Model m) {
		m.addAttribute("result","1");
		m.addAttribute("msg","가온씨가 원하는게 이거일듯");
		return "result";
	}
}
