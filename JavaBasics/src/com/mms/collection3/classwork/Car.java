package com.mms.collection3.classwork;

public class Car  implements Comparable<Car>{
	private int numSeats;
	private String model;
	private int year;
	
	public Car(int seats, String model, int year)
	{
		this.numSeats = seats;
		this.model = model;
		this.year = year;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [numSeats=");
		builder.append(numSeats);
		builder.append(", model=");
		builder.append(model);
		builder.append(", year=");
		builder.append(year);
		builder.append("]");
		return builder.toString();
	}


	public int getNumSeats() {
		return numSeats;
	}
	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public int compareTo(Car otherCarYear) {
		
		int res;
		if(otherCarYear.getYear() > year)
			res = 1;
		else if(otherCarYear.getYear() < year)
			res = -1;
		else
			res = 0;
		
		return res;
	}

}
