package com.mms.exceptions.classwork;

import java.io.File;

public class ExceptionsTest {

	public static void main(String[] args) {

		int[] studentArray = { 2, 5, 8, 12, 15 };
		int a = 10;
		int b = 0;
		int res = 0;

		try {

			// checked exceptions
			try {
				for (int i = 0; i < 7; i++) {
					System.out.println("value in the array " + studentArray[i]);
				}

			} catch (ArrayIndexOutOfBoundsException exp) {
				System.out.println("exception occurred " + exp.getMessage());
				// exp.printStackTrace();
			}
			res = a / b;
		} catch (Exception exe) {
			System.out.println("exception occurred inside arthimetic block " + exe.getLocalizedMessage());

		} finally {
			System.out.println("finally block always executes");
		}

		System.out.println("some other logic");

		File file = new File("C://practice//java_training//text.txt");

		System.out.println("logic after opening the file");
		
		try
		{
			divide(10, 0);
		}
		catch(ArithmeticException ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("logic after method throwing exception");
		
		

	}
	
	private static int  divide(int a , int b)	throws ArithmeticException
	{
		int res = 0;
		try
		{
			
			res = a/b;
			
		}
		catch(ArithmeticException exp)
		{
			throw exp;
		}
		
		return res;
		
	}

}
