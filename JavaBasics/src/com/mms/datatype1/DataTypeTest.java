package com.mms.datatype1;

public class DataTypeTest {

	public static void main(String[] args) {
	
		
		// -127 to 128
		byte currByte = 51;
		System.out.println(currByte);
		
		//primitive datatype
		int currInt = 5000;
		
		Integer intObj = currInt;  //autoboxing
		
		int otherInt = intObj; //auto unboxing
		
		double currDouble = 5.5;
		float currFloat = 6.4f;
		
		// primitive datatype
		
		//autoboxing   -- convertrng from primitive
		//autounboxing
		String userIn = "123";
		
		int userInt = Integer.parseInt(userIn);
		
		System.out.println(userInt);
		
		
		
		

	}

}
