package com.mms.thread1;

public class RunnableDemoTest {

	public static void main(String[] args) {
		
		RunnableDemo r1 = new RunnableDemo("Thread1");
		r1.execute();
		
		RunnableDemo r2 = new RunnableDemo("Thread2");
		r2.execute();

	}

}
