package com.mms.thread1.classwork;

public class TestSampleThread {

	public static void main(String[] args) {
		SampleThread t1 = new SampleThread("Thread 1");
				t1.start();
				
				SampleThread t2 = new SampleThread("Thread 2");
				t2.start();
	}
 
}
