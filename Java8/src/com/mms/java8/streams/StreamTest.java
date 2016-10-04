package com.mms.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;
import static java.util.Comparator.comparing;

class StreamTest {

	public static void main(String[] args) {
		
		List<Dish> dishesList = Arrays.asList(new Dish(200, "brinjal"),
				                              new Dish(500, "Sqush"),
				                              new Dish(300, "potato"),
				                              new Dish(600, "chicken"),
				                              new Dish(100, "meat"),
				                              new Dish(200, "tomoto"),
				                              new Dish(800, "beef"));
		//to find low colorie dishes using java7
		List<Dish> lowColorieDishList = new ArrayList<>();
		for(Dish dish:  dishesList)
		{
			if(dish.getColories() < 400)
			{
				lowColorieDishList.add(dish);
			}
		}
		   
		System.out.println(lowColorieDishList);
		//sort the dishes using anonymous class
		
		Collections.sort(lowColorieDishList, new Comparator<Dish>() {

			@Override
			public int compare(Dish dish1, Dish dish2) {
			
				return Integer.compare(dish1.getColories(), dish2.getColories());
			}
		});
		
		System.out.println("sorted LowColories list using java7 " + lowColorieDishList);
		
		List<String> lowColoriesNamesList = new ArrayList<>();
		
		for(Dish dish : lowColorieDishList)
		{
			lowColoriesNamesList.add(dish.getName());
		}
		
		System.out.println("low colorie list names using java7" + lowColoriesNamesList);
		
	
		
		//using java8 and lambda
		List<String> lowColoriesJava8List = 
		dishesList.stream().filter((dish1) -> { System.out.println("name of dish having colories less than 400 " + dish1.getName());
			return dish1.getColories() <400;})
		                  /* .sorted((dish1, dish2) ->
		                    {  System.out.println("sorted dish " + dish1.getName());
		                    	return Integer.compare(dish1.getColories(), dish2.getColories()); })*/
		                   .map( (dish) -> {
		                	     System.out.println("mapped dish " + dish.getName());
		                	   return dish.getName();})
		                   .limit(3)
		                   .collect(toList());
		
		System.out.println("sorted low colorie dishes using java8 lambda" + lowColoriesJava8List);

		////using java8 and method references
		
		List<String> lowColoriesMethodRefList = 
				dishesList.stream().filter((dish1) -> dish1.getColories() <400)
				                   .sorted(comparing(Dish :: getColories))
				                   .map(Dish :: getName)
				                   .collect(toList());
		System.out.println("sorted low colorie dishes using java8 method reference" +lowColoriesMethodRefList);
				
	}

}
