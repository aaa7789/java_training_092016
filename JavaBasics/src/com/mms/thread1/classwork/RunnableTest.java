package com.mms.thread1.classwork;

public class RunnableTest {

	public static void main(String[] args) {
		SampleRunnable runnable = new SampleRunnable("Thread1");
		
		Thread t1 = new Thread(runnable);
		t1.start();
		
		SampleRunnable runnable2 = new SampleRunnable("Thread2");
		Thread t2 = new Thread(runnable2);
		t2.start();

	}

}
