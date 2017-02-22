package com.mms.revision.day1;

public class TestCar {
	static int num = 5;
	private int count;

	public static void main(String[] args) {
		
		Toyota carolla = new Toyota("Corolla", 16000);
		Toyota camary = new Toyota("camary", 2100);
		Toyota priyus = carolla;
		TestCar testCar = new TestCar();
		carolla.drive();
		System.out.println(carolla.getName());
		System.out.println(carolla.getPrice());
		num = 20;
		System.out.println("num value is " + num);
		System.out.println("num value is " + testCar.count);
		
		String name = "Hari";
		
	}

}
