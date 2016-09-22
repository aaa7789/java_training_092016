package com.mms.variables;
/**
 * 
 * @author RKomatreddy
 * 
 * stack memory used by method variables and references to actual objects
 * heap memory used to store Objects and class level variables, which have global access
 * http://www.journaldev.com/4098/java-heap-space-vs-stack-memory
 * 
 *
 */

public class Memory {

	public static void main(String[] args) {
		int i=1; // Line 2
		Object obj = new Object(); // Line 3
		Memory mem = new Memory(); // Line 4
		mem.foo(obj); // Line 5
	} // Line 9

	  private void foo(Object param) { // Line 6
		String str = param.toString(); //// Line 7
		System.out.println(str);

	}

}
