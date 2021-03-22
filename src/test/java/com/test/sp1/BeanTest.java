package com.test.sp1;

import javax.sql.DataSource;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class BeanTest {
	private static final Logger log = LoggerFactory.getLogger(BeanTest.class);
	
	@Autowired
	private ObjectMapper om;
	
	@Autowired
	private XMLBeanTest xmlBeanTest;
	
	@Autowired
	private DataSource ds;
	
	@Autowired
	private Father father;
	
	@Autowired 
	private Son son;
	
	@Test
	public void test() {
		log.debug("om=>{}",om);
		log.debug("xmlBeanTest.om=>{}",xmlBeanTest.getOm());
		log.debug("ds=>{}",ds);
		log.debug("father=>{}",father);
		log.debug("son=>{}",son);
	}

}
