package com.mms.oops.classwork;

public class AutomobileTest {

	public static void main(String[] args) {
		
		Audi samathaAudi = new Audi(4, "silver", 4, 12345, 5);
		
		Audi sridharAudi = new Audi(4, "red", 6, 4567, 3);
		
		Audi vindya = sridharAudi;
		//samathaAudi.setColor("Silver");
		//samathaAudi.setNumSeats(4);
		System.out.println(samathaAudi.toString());
		System.out.println(samathaAudi.getColor());
		
		Vehicle  vehicle1 = new Audi(4, "silver", 4, 12345, 5);
		
		vehicle1.accelerate();
		
		Vehicle  vehicle2 = new Hundai(4, "silver", 4, 100000);
		vehicle2.accelerate();
		
		
		

	}

}
