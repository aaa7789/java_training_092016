package com.mms.variables;

/**
 * 
 * @author RKomatreddy
 * 
 * Java does manipulate objects by reference, 
 * and all object variables are references. 
 * However, Java doesn't pass method arguments by reference; it passes them by value.
 *
 *http://www.javaworld.com/article/2077424/learn-java/does-java-pass-by-reference-or-pass-by-value.html
 */
public class TestMethodReference {
	
	/**
	 * 
	 * All method variables are local variables, their life ends after completion of method
	 * 
	 * 
	 */
	public static void badSwap(int var1, int var2)
	{
	  int temp = var1;
	  var1 = var2;
	  var2 = temp;
	  
	  System.out.println("value of var1 inside badSwap" + var1);
	  System.out.println("value of var2 inside badSwap" + var2);
	}
	
	public static void tricky(Point arg1, Point arg2)
	{
	  arg1.x = 100;
	  arg1.y = 100;
	  Point temp = arg1;
	  arg1 = arg2;
	  arg2 = temp;
	}

	public static void main(String[] args) {
		 Point pnt1 = new Point(0,0);
		  Point pnt2 = new Point(0,0);
		  System.out.println("X: " + pnt1.x + " Y: " +pnt1.y); 
		  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
		  System.out.println(" ");
		  
		  int var1 = 10;
		  int var2 =20;
		  badSwap(var1, var2);
		  System.out.println("value of var1 inside main" + var1);
		  System.out.println("value of var2 inside main" + var2);
		  
		  
		  tricky(pnt1,pnt2);
		  System.out.println("X: " + pnt1.x + " Y:" + pnt1.y); 
		  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);

	}

}
