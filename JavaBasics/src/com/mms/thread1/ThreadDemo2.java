package com.mms.thread1;

public class ThreadDemo2 extends Thread {
	private Thread t1;
	private String threadName;
	
	
	public ThreadDemo2(String threadName)
	{
		this.threadName = threadName;
	}
	
	
	public void start()
	{
		if(null == t1)
		{
			System.out.println("started thread " + threadName);
			t1 = new Thread( new Runnable() {
				
				@Override
				public void run() {
					for(int i = 0; i <4; i++)
					{
						System.out.println("running thread " + threadName + "version " + i);
					}
					
				}
			}, threadName);
			t1.start();
			
			System.out.println("started thread " + threadName);
		}
	}

}
