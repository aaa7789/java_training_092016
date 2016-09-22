package com.mms.thread1;

public class RunnableDemo implements Runnable {
	
	private Thread t;
	private String threadName;
	
	public RunnableDemo(String threadName) {
		this.threadName = threadName;		

	}

	@Override
	public void run() {
		System.out.println("Running thread " + threadName);
		for(int i = 0; i <4; i++)
		{
			System.out.println("Running thread " + threadName +"  :" + i);
			
			try {
				t.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("Exiting thread " + threadName);

	}
	
	public void execute()
	{
	     System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	

}
