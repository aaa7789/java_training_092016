package com.mms.generics;

public class GenericsTest {
	
	private static void display(String input)
	{
		System.out.println("input from user is " + input);
	}
	
	/*private static <E> void  display(E input)
	{
		System.out.println("input from user is " + input);
		
		}*/

	public static void main(String[] args) {
		
		String userInput = "hi how are you";
		
		int num = 10;
		
	//	GenericsTest.display(num);
		
		Teacher<Integer> teacher = new Teacher("abc123", "Hari");
		System.out.println(teacher.getTeacherID());
		

	}

}
