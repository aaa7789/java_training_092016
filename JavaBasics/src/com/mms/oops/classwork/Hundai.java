package com.mms.oops.classwork;

public class Hundai extends Vehicle implements Automobile {

	int warranty ;
	public Hundai( int wheels, String color, int seats, int warranty)
	{
		super(wheels, color, seats);
	  this.warranty = 	warranty;
	 
	
	}
	
	@Override
	public void accelerate() {
		System.out.println("This is from accelerate of Hundai");
	}

}
