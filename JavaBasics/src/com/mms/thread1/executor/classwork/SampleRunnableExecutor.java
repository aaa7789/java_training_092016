package com.mms.thread1.executor.classwork;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SampleRunnableExecutor {

	public static void main(String[] args) {
		// process 100 files

		FileProcessor inFile;
		
		long stattime = System.currentTimeMillis();

		for (int i = 0; i < 100; i++) {
			String fileName = "file" + i;
			String threaName = "thread" + i;
			inFile = new FileProcessor(fileName, 10, false, threaName);
			MyRunnable helper1 = new MyRunnable(inFile);
			Thread t1 = new Thread(helper1);
			t1.start();

		}
		long endtime = System.currentTimeMillis();
		
		System.out.println("*************************");
		System.out.println("*************************");
		System.out.println("Time taken by old process " + (endtime - stattime));
		
		long stattime2 = System.currentTimeMillis();
		
		ExecutorService  service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 100; i++) {
			String fileName = "file" + i;
			String threaName = "thread" + i;
			inFile = new FileProcessor(fileName, 10, false, threaName);
			MyRunnable helper1 = new MyRunnable(inFile);
			service.execute(helper1);
			

		}
		
		
		service.shutdown();
		
		
		ExecutorService  service2 = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 100; i++) {
			String fileName = "file" + i;
			String threaName = "thread" + i;
			inFile = new FileProcessor(fileName, 10, false, threaName);
			Mycallable helper2 = new Mycallable(inFile);
			
		  Future<FileProcessor> result = 	service2.submit(helper2);
		  
		  try {
			FileProcessor resFile = result.get();
			System.out.println("**********&&&&&&&&&&&&&&&&&&&**********");
			 System.out.println("after processing the file " + resFile.getFileName() +
					 "status of the file is " + resFile.isStatus());
			 System.out.println("**********&&&&&&&&&&&&&&&&&&&**********");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
			

		}
		
		
		service2.shutdown();
		long endTime2 = System.currentTimeMillis();
		System.out.println("time taken by Executor framework " + ( endTime2- stattime2));

	}

}

class FileProcessor {
	private String fileName;
	private int size;
	private boolean status;
	private String threadName;

	public FileProcessor(String fileName, int size, boolean status, String threadName) {
		this.fileName = fileName;
		this.size = size;
		this.status = status;
		this.threadName = threadName;

	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}

class MyRunnable implements Runnable {
	private FileProcessor file;

	public MyRunnable(FileProcessor inFile) {
		this.file = inFile;

	}

	@Override
	public void run() {

		System.out.println(" processing file  " + file.getFileName() + " processed by Thread   " +
		      Thread.currentThread().getName());

	}

}

class Mycallable implements Callable<FileProcessor>
{
	FileProcessor inFile;
	
	public Mycallable(FileProcessor inFile) {
		this.inFile = inFile;
		
	}
	 
	@Override
	public FileProcessor call() throws Exception {
		
		System.out.println("succefully process the file " + inFile.getFileName() 
		+  Thread.currentThread().getName());
		inFile.setStatus(true);
		return inFile;
	}
	
}
