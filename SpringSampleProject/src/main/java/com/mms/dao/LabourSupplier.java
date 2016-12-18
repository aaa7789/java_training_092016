package com.mms.dao;

public class LabourSupplier implements RestaurantHelper {
	
	private int hourlyRate;
	private int numberOfLabour;
	public void performTask()
	{
		System.out.println("this is from LabourSupplier");
		System.out.println("number of labour " + numberOfLabour);
		System.out.println("hourly rate of labour " + hourlyRate);
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public int getNumberOfLabour() {
		return numberOfLabour;
	}
	public void setNumberOfLabour(int numberOfLabour) {
		this.numberOfLabour = numberOfLabour;
	}

}
