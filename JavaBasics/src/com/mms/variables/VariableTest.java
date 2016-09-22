package com.mms.variables;

public class VariableTest {
	
	//instance variable
	String name = "hari";
	
	//static variable
	static int count = 5;
	int sum = 0;
	

	public static void main(String[] args) {

      //local variable or method variable
		int a =10;// 1
		int b = 20;  //1 
		
		System.out.println(  "local variable " +a);
		
		System.out.println("count " + count);
		VariableTest test = new VariableTest();
		VariableTest test2 = new VariableTest();
		System.out.println("instance variable " + test.name);
		int res = test.display(a, b);
		System.out.println("result " + res);
	}
	
	// pass by variable
	private int display(int a, int b)
	{
	System.out.println(a +b);
	System.out.println(name);
	 sum = a + b;
	 return sum;
	}

}
