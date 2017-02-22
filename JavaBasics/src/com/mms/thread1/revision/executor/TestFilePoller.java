package com.mms.thread1.revision.executor;

import java.io.IOException;

public class TestFilePoller {
	
	 private static String outFileFolder="/practice/java_training/file/out" + "/";
		private static String inFileFolder="/practice/java_training/file/in";;
		private static String searchStr="car";

	public static void main(String[] args) {
		
		FilePoller poller = new FilePoller();
		try {
			poller.processFiles();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		
		
		
		
	}

}
