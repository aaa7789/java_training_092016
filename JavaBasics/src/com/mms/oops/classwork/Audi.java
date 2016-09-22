package com.mms.oops.classwork;

public class Audi extends Vehicle  implements Automobile{
  //inheritance 
	
	// while serialzing this field will be ignored
	private  transient  int ssn;
	
	//thread safety, 
	private volatile int count;
	
	public Audi(int wheels, String color, int seats,   int ssn, int count)
	{
		super(wheels, color, seats);
		this.ssn = ssn;
		this.count = count;
		System.out.println("from Audi arg constructor");
	}
	
	@Override
	public void accelerate() {

   System.out.println("this is from Audi car method");

	}
	
	public void backCamera()
	{
		System.out.println("this is from Audi car backCamera method");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Audi [count=");
		builder.append(count);
		builder.append("]");
		return builder.toString();
	}


}
