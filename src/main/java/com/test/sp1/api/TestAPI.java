package com.test.sp1.api;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestAPI {

	@Autowired
	private ObjectMapper om;
	
	public static void main(String[] args) {
		TestAPI tAPI = new TestAPI();
		System.out.println(tAPI.om);
	}
}
