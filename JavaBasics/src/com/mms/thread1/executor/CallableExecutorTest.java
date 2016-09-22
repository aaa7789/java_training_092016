package com.mms.thread1.executor;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class CallableExecutorTest {
	
	static AtomicInteger count = new AtomicInteger(0);

	public static void main(String[] args) {
		ExecutorService exService = Executors.newFixedThreadPool(10);
		
		List<String> inputList = new ArrayList<>();
		
		for(int i = 0; i < 100; i++)
		{
			inputList.add("file number " + i);
		}
		
		for(String inFile: inputList)
		{
			Status input = new Status();
			input.setFileName(inFile);
			Future<Status> res = exService.submit(new CallableTask(input));
			
			Status response;
			try {
				response = res.get();
				if(response.isRes())
					 count.incrementAndGet();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			if(count.get() == 10)
			{
				System.out.println("processed first 10 files");
				count.set(0);
			}
			
		}
		
		
		exService.shutdown();
		

	}

}

final class CallableTask implements Callable<Status>
{
	private Status input;	 
	
	
	public CallableTask(Status input)
	{
		this.input = input;
	}

	@Override
	public Status call() throws Exception {
		input.setRes(true);
		System.out.println("Processed the file by thread id: " + Thread.currentThread().getName());
		return input;
	}
	
}

class Status
{
	private boolean res;
	private int count;
	private File file;
	private String fileName;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public boolean isRes() {
		return res;
	}
	public void setRes(boolean res) {
		this.res = res;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
