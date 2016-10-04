package com.mms.java8.ch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.mms.lambda.Apple;

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
		
		List<Apple> greenApplesList = FilterByAbstraction.filterByAbstraction(appleList, new AppleGreenColorPredicate());
		System.out.println("apples filtered by abstraction " +greenApplesList );
		
		//using anonymous class
		
		List<Apple> filteredApplesList = FilterByAbstraction.filterByAbstraction(appleList,  new ApplePredicate() {
			
			@Override
			public boolean test(Apple apple) {
				
				return "yellow".equals(apple.getColor());
			}
		});
		
		System.out.println("filter by anonymous class " + filteredApplesList);
		
		//using lambda
		
	 List<Apple> filterdUsingLambdaList = FilterByAbstraction.filterByAbstraction(appleList, (Apple apple) -> "yellow".equals(apple.getColor()));
	 System.out.println("filterd using lamda " + filterdUsingLambdaList);
	 
	 //using generic filter
	 List<Apple> genericFilterList = GenericFilter.filter(appleList, (Apple a) ->"orange".equals(a.getColor()));
	 System.out.println("using generic filter" + genericFilterList);
	 
	 List<Integer> numList = Arrays.asList(1,2,3,6,8,10,11,12,13,14);
	 
	 List<Integer> filterNumList = GenericFilter.filter(numList, ( num)-> num%2==0);
	 System.out.println("using same generic filter to filter even numbers from number list" + filterNumList);
	 
	 //sorting using java7
	  appleList.sort(new Comparator<Apple>()
	 {

		@Override
		public int compare(Apple apple1, Apple apple2) {
			return apple1.getWeight().compareTo(apple2.getWeight());
		
		}
		 
	 });
	  
	  System.out.println("apples sorted by weight using inline implementation  " +appleList);
	  
	  // sorting apples using color using java8
	  
	  appleList.sort((Apple apple1, Apple apple2) ->  apple1.getColor().compareTo(apple2.getColor()) );
	  
	  System.out.println(" sorting apples by color using java8 " +appleList);

	}

}
