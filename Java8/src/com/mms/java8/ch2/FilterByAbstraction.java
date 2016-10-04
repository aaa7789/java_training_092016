package com.mms.java8.ch2;

import java.util.ArrayList;
import java.util.List;

import com.mms.lambda.Apple;

public class FilterByAbstraction {
	
	public static List<Apple> filterByAbstraction(List<Apple> applesList,  ApplePredicate p)
	{
		List<Apple> filteredApplesList = new ArrayList<>();
		
		for(Apple apple: applesList)
		{
			if(p.test(apple))
			{
				filteredApplesList.add(apple);
			}
			
		}
		
		return filteredApplesList;
		
	}

}
