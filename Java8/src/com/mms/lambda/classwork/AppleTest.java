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
				
				if("red".equals(apple.getColor()) && "peach".equals(apple.getType()))
						{
					      return true;
						}
				else
					return false;
				
			}
		});
		
		System.out.println("red gala apples using interface java7" + redGalaApplesList);
		
		
		
		//java8 lambda expressions
		
		List<Apple> redGalaApplesUsingJava8 = AppleHelperUsingJava7.filter(appleList,
				(Apple apple) ->  {
					
					if("red".equals(apple.getColor()) && "peach".equals(apple.getType()))
							{
						      return true;
							}
					else
						return false;
					
				}  );
		
		System.out.println(" filter using java8" +redGalaApplesUsingJava8 );
		


	}

}
