package com.mms.thread1.classwork;

public class SampleThread extends Thread {
	
	private String threadName;
	
	public SampleThread(String threadName) {
		this.threadName = threadName;
	}
	
	public void run()
	{
		for(int i = 0; i <10; i++)
		{
			System.out.println("This is from run method implemented by"
					+ " Thread class iteration : " +  i + "Thread name "
							+ threadName);
			
		}
		
	}
	

}
