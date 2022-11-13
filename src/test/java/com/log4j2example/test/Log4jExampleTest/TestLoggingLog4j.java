package com.log4j2example.test.Log4jExampleTest;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLoggingLog4j extends Log4jExample{
	public static final Logger log = Logger.getLogger(TestLoggingLog4j.class.getName());
	
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
