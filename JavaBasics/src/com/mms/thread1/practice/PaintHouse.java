package com.mms.thread1.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PaintHouse {

	public static void main(String[] args) {
		Area living = new Area("living", "person1");
		Area kitchen = new Area("kitchen", "person1");
		Area beddroom = new Area("beddroom", "person1");
		Area dinning = new Area("dinning", "person1");
		Area dinning1= new Area("dinning", "person1");
		Area dinning2 = new Area("dinning", "person1");
		Area dinning3 = new Area("dinning", "person1");
		
		
		List<Area> house = new ArrayList<>();
		house.add(living);
		house.add(kitchen);
		house.add(beddroom);
		house.add(dinning);
		house.add(dinning1);
		house.add(dinning2);
		house.add(dinning3);
		
		
		
	/*	for(Area area : house)
		{
			PaintProcessor processor = new PaintProcessor(area);
			Thread t1 = new Thread(processor);
			t1.start();
			System.out.println("finished processing");
			
		}
		
		for(Area area : house)
		{
			PaintProcessor processor = new PaintProcessor(area);
			processor.run();
			System.out.println("finished processing");
			
		}*/
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		/*for(Area area : house)
		{
			PaintProcessor processor = new PaintProcessor(area);
			service.execute(processor);
			System.out.println("finished processing");
			
		}
		service.shutdown();*/
		
		
		/*for(Area area : house)
		{
			ResponsiblePainter painter = new ResponsiblePainter(area);
		    Future<Area> res = 	service.submit(painter);
		  
		     Area resultArea;
			try {
				resultArea = res.get();
				System.out.println("finished processing " + resultArea.getStatus());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		service.shutdown();*/
		
		//anonymous way of implementing the runnalbe
		Runnable r1 =  new Runnable() {
			public void run() {
				System.out.println("this is from anonymous class  " + Thread.currentThread().getName());
			}
		};
		
		Thread t1 = new Thread(r1);
		 t1.start();
		
	//java 8
		
		 Runnable r2 =  ( () -> System.out.println("this is from lambda expression  " +
		                 Thread.currentThread().getName()));
		 
		 Thread t2 = new Thread(r2);
		 t2.start();

	
		
		
		
	}

}
