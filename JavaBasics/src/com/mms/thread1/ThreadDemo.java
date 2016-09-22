package com.mms.thread1;

public class ThreadDemo extends Thread {
	
	private Thread t1;
	private String threadName;
	
	 public ThreadDemo(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		
		System.out.println("Starting thread " + threadName);
		
		for(int i = 0; i <4; i++)
		{
			System.out.println("Running thread " + threadName + " version " + i);
		}
		
		System.out.println("Exiting thread " + threadName);
	}

	
	public void execute()
	{
		System.out.println("starting from execute method " + threadName);
		if(t1 == null)
		{
			t1 = new Thread(this, threadName);
			t1.start();
			try {
				t1.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
