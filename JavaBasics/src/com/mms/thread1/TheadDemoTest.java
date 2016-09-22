package com.mms.thread1;

public class TheadDemoTest {

	public static void main(String[] args) {
		
		ThreadDemo t1 = new ThreadDemo("thread1");
		t1.execute();
		
		ThreadDemo t2 = new ThreadDemo("thread2");
		t2.execute();

	}

}
