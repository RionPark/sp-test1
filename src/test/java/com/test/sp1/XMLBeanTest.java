package com.test.sp1;

import org.codehaus.jackson.map.ObjectMapper;

import lombok.Data;

@Data
public class XMLBeanTest {

	private ObjectMapper om;
	
	public void setOm(ObjectMapper om) {
		this.om = om;
	}
	
}
