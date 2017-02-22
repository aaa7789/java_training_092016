package com.mms.revision.day1;

public class Toyota extends Car {
	private String name;
	private int price;
	private volatile int count;
	private final int speed = 60;
	
	

	
	public Toyota(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public  synchronized void  drive()
	{
		System.out.println("This is from Toyota class");
		//speed = 70;
		super.drive();
	}
	
	public String drive(String name)
	{
		
		return name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void speed() {
		System.out.println("toyota can go 100 mile for an hour");
		
	}

}
