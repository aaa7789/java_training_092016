package com.mms.thread1.classwork;

public class SampleRunnable implements Runnable {
	private String threaName;
	
	public SampleRunnable(String threaName) {
		this.threaName = threaName;
	}
	

	@Override
	public void run() {
		for(int i =0; i<20; i++)
		{
			System.out.println("This is from Runnable interface : run method  : iteration " + i + 
					"using thread :"  + threaName);
			
		}
		

	}
	
	

}
