package com.mms.generics.classwork;

public class TestGenerics {
	
	/*private   void display(int arg)
	{
		System.out.println("the incoming to method is " + arg);
	}
	
	private   void display(String arg)
	{
		System.out.println("the incoming to method is " + arg);
	}*/
	
	private  <X> void  display(X input)
	{
		System.out.println("the incoming to method is " + input);
	}
	

	public static void main(String[] args) {
		
		TestGenerics test = new TestGenerics();
		
		int input = 10;
		
		String in = "Hi";
		test.display(input);
		double inputDouble = 3.5;
		test.display(inputDouble);
		
		Student<Integer, String> student = new Student<Integer, String>(123, "Hari", "Hartford");
		
		System.out.println(student.getStudentID());
		System.out.println(student.getCity());
		

	}

}
