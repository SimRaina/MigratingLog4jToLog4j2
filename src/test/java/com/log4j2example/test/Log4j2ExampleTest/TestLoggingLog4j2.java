package com.log4j2example.test.Log4j2ExampleTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLoggingLog4j2 extends Log4j2Example{
	public static final Logger log = LogManager.getLogger(TestLoggingLog4j2.class.getName());
	
	@BeforeTest
	public void testinit()
	{
		init();
	}
        
	@Test
	public void testmain() {
		log.info("Test");
	}
}
