package com.api.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{
	
	private static final Logger logger =LogManager.getLogger(TestListener.class);
	public void onStart(ITestContext context) {
	    logger.info("Test Suite started! ");
	  }
	
	public void onTestSuccess(ITestResult result) {
		logger.info("Test Suite completed! ");
		  }
	
	 public void onTestFailure(ITestResult result) {
		 logger.error("Test Failed: {}", result.getName());
	        logger.error("Exception: ", result.getThrowable());
		  }


}
