package com.mms.thread1.practice;

import java.util.concurrent.Callable;

public class ResponsiblePainter implements Callable<Area> {
 private Area area;
 
  public ResponsiblePainter(Area area) {
	this.area = area;
}
	
	@Override
	public Area call() throws Exception {
		System.out.println("finished painting of " + area.getName());
		area.setStatus("Success");
		return area;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

}
