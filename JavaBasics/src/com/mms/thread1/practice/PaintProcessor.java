package com.mms.thread1.practice;

public class PaintProcessor implements Runnable {
	Area area;
	
	 public PaintProcessor(Area area) 
	{
		this.area = area;
		
	}

	@Override
	public void run() {
		
		System.out.println("painting area " + area.getName() + "painted by thread"  + Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}



}
