package com.mms.oops.anonymous;

public class AnonymousInnerClassTest {
	
	//method which accepts the object of interface Message
	   public void displayMessage(Message m){
	      System.out.println(m.greet() +", This is an example of anonymous inner class as an argument");	   
	   }

	public static void main(String[] args) {
		AnonymousInnerClassTest obj = new AnonymousInnerClassTest();
		
		obj.displayMessage(new Message() {
			
			@Override
			public String greet() {
				// TODO Auto-generated method stub
				return "Hello";
			}
		});
	}

}
