package com.log4j2example.test.Log4j2ExampleTest;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
public class Log4j2Example{
	
	
	public void init() {
		
		File file = new File("log4j2.properties");
		LoggerContext context = (LoggerContext) LogManager.getContext(false);
		context.setConfigLocation(file.toURI());
	}
}