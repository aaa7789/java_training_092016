package com.mms.variables;

/**
 * 
 * @author RKomatreddy
 *  method variables are stored in stack memory 
 *  Objects and class level variables are stored in Heap (metaspace from java1.8) memory
 */
public class FooTest {
	   public static void main(String[] args){
	          Foo f = new Foo("f");
	          
	          
	          System.out.println(f.toString());
	          changeReference(f); // It won't change the reference!
	          
	          System.out.println(f.toString());
	          modifyReference(f); // It will modify the object that the reference variable "f" refers to!
	          
	          System.out.println(f.toString());
	     }
	     public static void changeReference(Foo a){
	          Foo b = new Foo("b");
	          a = b;
	     }
	     public static void modifyReference(Foo c){
	          c.setAttribute("c");
	     }

}
