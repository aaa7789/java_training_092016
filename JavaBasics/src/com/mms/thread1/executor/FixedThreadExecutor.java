package com.mms.thread1.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FixedThreadExecutor {
	
	
	public static void main(String [] args)
	{
		ExecutorService exService = Executors.newFixedThreadPool(10);
		for(int i= 0; i<25; i++)
		{
			Future res =   exService.submit(new Task(i));
			System.out.println("result of execution " + res.toString());
		}
		exService.shutdown();
		
		
	}

}

final class Task implements Runnable
{
	private int num;
	
	public Task(int num)
	{
		this.num = num;
	}

	@Override
	public void run() {
		System.out.println("executing iteration : " + num +   "  executing thread : " + Thread.currentThread().getName());
		
	}
	
}
