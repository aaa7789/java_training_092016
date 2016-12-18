package com.mms.dto;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TestLog4j {
	
	private static Logger logger = LogManager.getLogger("com.mms.dto.TestLog4j");

	public static void main(String[] args) {
		logger.debug("start of the main method");
		System.out.println("from system log " + 1+2);
		
		logger.debug("end of the main method");


	}

}
