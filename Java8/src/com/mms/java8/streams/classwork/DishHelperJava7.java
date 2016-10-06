package com.mms.java8.streams.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DishHelperJava7 {
	
	public static List<Dish> filter(List<Dish> dishList)
	{
		List<Dish> moreColoriesList = new ArrayList<>();
		for(Dish dish : dishList)
		{
			if(dish.getColories() > 300)
			{
				moreColoriesList.add(dish);
			}
				
		}
		
		
		return moreColoriesList;
		
	}
	
	public static  <Dish> List<Dish> filterByJava8(List<Dish> dishList,  Predicate<Dish> predicate)
	{
		List<Dish> moreColoriesList = new ArrayList<>();
		
		for(Dish dish : dishList)
		{
			 if(predicate.test(dish))
			 {
				 moreColoriesList.add(dish);
			 }
			
		}
		return moreColoriesList;
	}

}
