package com.log4j2example.test.Log4jExampleTest;

import org.apache.log4j.PropertyConfigurator;

public class Log4jExample {
	
  public void init() {
	  
	  String log4jConfPath = "log4j.properties";
	  PropertyConfigurator.configure(log4jConfPath);
  }

}
