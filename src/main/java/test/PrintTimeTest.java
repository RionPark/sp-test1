package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.sp1.controller.HomeController;

public class PrintTimeTest {

	private static final Logger log = LoggerFactory.getLogger(PrintTimeTest.class);
	
	public static void main(String[] args) {
		long sTime = System.currentTimeMillis();
		int sum = 0;
		for(int i=1;i<10000;i++) {
			sum+=i;
			log.debug("sum=>{}",sum);
		}
		log.info("sum=>{}",sum);
		long eTime = System.currentTimeMillis();
		log.info("execute time : {}ms",eTime-sTime);
	}
}
