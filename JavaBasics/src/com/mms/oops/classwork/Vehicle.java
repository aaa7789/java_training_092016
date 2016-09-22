package com.mms.oops.classwork;

import java.io.Serializable;

public class Vehicle implements Serializable {

	//access modifiers - public, protected, private
	
	//encapusulation 
	private int wheels;
	private String color;
	private int numSeats;
	
	//default constructor -- 
	//no return type
	public Vehicle()
	{
		System.out.println("from vehicle default constructor");
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicle [wheels=");
		builder.append(wheels);
		builder.append(", color=");
		builder.append(color);
		builder.append(", numSeats=");
		builder.append(numSeats);
		builder.append("]");
		return builder.toString();
	}
	public Vehicle(int argwheels, String argColor, int argNumSeats)	
	{
		wheels = argwheels;
		color = argColor;
		numSeats = argNumSeats;
		System.out.println("from vehicle arg constructor");
		
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	public void move() {
		System.out.print("this is from Vehicle class");
	}
	
	public void accelerate() {

		   System.out.println("this is from Vehicle car method");

			}

}
