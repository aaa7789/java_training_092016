package com.mms.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterUsingJava8 {
	
	public static List<Apple> filterApples(List<Apple> applesList, Predicate<Apple> p)
	{
		List<Apple> greenApplesList = new ArrayList<Apple>();
		for(Apple apple: applesList)
		{
			if(p.test(apple))
			{
				greenApplesList.add(apple);
			}
		}
		return greenApplesList;
	}
	
	
}
