package com.mms.lambda;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

	public static void main(String[] args) {
		
		
		List<Apple> appleList = new ArrayList<>();
		Apple appl1 = new Apple(1, "green", 160);
		Apple appl2 = new Apple(2, "orange", 175);
		Apple appl3 = new Apple(3, "green", 40);
		Apple appl4 = new Apple(4, "rose", 180);
		Apple appl5 = new Apple(5, "green", 55);
		Apple appl6 = new Apple(6, "yellow", 40);
		Apple appl7 = new Apple(7, "green", 25);
		Apple appl8 = new Apple(8, "green", 280);
		Apple appl9 = new Apple(9, "green", 35);
		Apple appl10 = new Apple(10, "yellow", 60);
		Apple appl11 = new Apple(11, "orange", 256);
		
		
		appleList.add(appl1);
		appleList.add(appl2);
		appleList.add(appl3);
		appleList.add(appl4);
		appleList.add(appl5);
		appleList.add(appl6);
		appleList.add(appl7);
		appleList.add(appl8);
		appleList.add(appl9);
		appleList.add(appl10);
		appleList.add(appl11);
		
		System.out.println("all apples in list " + appleList);
		
		
	List<Apple> greenApplesList = 	FilterUsingJava7.filterGreenApples(appleList);
	System.out.println("using java7 " + greenApplesList);
	
	List<Apple> heavyApplesList = 	FilterUsingJava7.filterHeavyApples(appleList);
	System.out.println("using java7" + heavyApplesList);
	
	
	//java8 with method passing
	
	List<Apple> greenApplesList2 = 	FilterUsingJava8.filterApples(appleList, Apple::isGreenApple);
	System.out.println("using java8 method passing" + greenApplesList2);
		
	List<Apple> heavyApplesList2 = 	FilterUsingJava8.filterApples(appleList, Apple::isHeavyApple);
	System.out.println("using java8 method passing" + heavyApplesList2);
	
	//java8 with method using lambda
	
	List<Apple> greenApplesList3 = 	FilterUsingJava8.filterApples(appleList, (Apple a) ->"green".equals( a.getColor()));
	System.out.println("using java8 lambda" + greenApplesList3);

	}

}
