package com.mms.thread1;

public class TheadDemo2Test {

	public static void main(String[] args) {
	ThreadDemo2 t1 = new ThreadDemo2("thread1");
	t1.start();
	
	ThreadDemo2 t2 = new ThreadDemo2("thread2");
	t2.start();

	}

}
