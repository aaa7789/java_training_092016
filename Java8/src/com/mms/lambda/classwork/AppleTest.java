package com.mms.lambda.classwork;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

	public static void main(String[] args) {
		
		Apple apple1 = new Apple("red", 300, "gala", 200);
		Apple apple2 = new Apple("red" , 400, "peach" , 300);
		Apple apple3 = new Apple("yellow" , 400, "peach" , 300);
		Apple apple4 = new Apple("green" , 200, "gala" , 200);
		Apple apple5 = new Apple("orange" , 800, "peach" , 700);
		Apple apple6 = new Apple("green" , 300, "peach" , 300);
		Apple apple7 = new Apple("yellow" , 500, "gala" , 300);
		Apple apple8 = new Apple("red" , 100, "honeycrest" , 100);
		
		List<Apple> appleList = new ArrayList<>();
		appleList.add(apple1);
		appleList.add(apple2);
		appleList.add(apple3);
		appleList.add(apple4);
		appleList.add(apple5);
		appleList.add(apple6);
		appleList.add(apple7);
		appleList.add(apple8);
		
		System.out.println(" Apples with out filter" + appleList);
		
		List<Apple>		redApplesList = AppleHelperUsingJava7.filterApples(appleList, "yellow");
		System.out.println("Red aples using java7" + redApplesList);
		
		List<Apple> heavyApplesList = AppleHelperUsingJava7.filterApplesByWeight(appleList);
		
		System.out.println("heavy apples using java 7" + heavyApplesList);
		
		//using abstract methods
		
		List<Apple> redGalaApplesList = AppleHelperUsingJava7.filter(appleList, new AppleFilter() {
			
			@Override
			public boolean filter(Apple apple) {
				return "red".equals(apple.getColor()) && "peach".equals(apple.getType());	
							
			}
		});
		
		System.out.println("red gala apples using interface java7" + redGalaApplesList);
		
		
		
		//java8 lambda expressions
		
		List<Apple> redGalaApplesUsingJava8 = AppleHelperUsingJava7.filter(appleList,
				(Apple apple) ->  "red".equals(apple.getColor()) && "peach".equals(apple.getType())  );
		
		System.out.println(" filter using java8" +redGalaApplesUsingJava8 );
		
		
		List<Apple> redGalaApplesUsingJava8_2 = AppleHelperUsingJava7.filter(appleList,
				 apple ->  "red".equals(apple.getColor()) && "peach".equals(apple.getType())  );

		System.out.println(" filter using java8_2" +redGalaApplesUsingJava8_2 );
		
		
		//java 7 using anonymous class
		List<Apple> heavyApples = AppleHelperUsingJava7.filter(appleList, new AppleFilter() {
			
			@Override
			public boolean filter(Apple apple) {
				
				return apple.getWeight() > 400;
			}
		});
		System.out.println("heavy apples " + heavyApples);
		
		//using lamba
		List<Apple> heavyApples8 = AppleHelperUsingJava7.filter(appleList, 
				  (apple) -> apple.getWeight() > 400 &&  "orange".equals(apple.getColor()))  ;
		
		System.out.println("heavy apples using java8" + heavyApples8);
		
		//filter apples which are red gala and more than 100 in number
		
		List<Apple> filterUsingFunctional = AppleHelperUsingJava7.filterJava8(appleList, 
				    (Apple apple ) -> ("red".equals(apple.getColor()) && "gala".equals(apple.getType()) && apple.getNumber() > 100) );
		
		System.out.println("using functional interface " + filterUsingFunctional);
		
		
		AppleHelperUsingJava7.printTypeName(appleList,
				(Apple apple) -> System.out.println("type of apple is " + apple.getType()));
		
		
		AppleHelperUsingJava7.printTypeName(appleList,  Apple:: getType);
				
			
		

	}

}
