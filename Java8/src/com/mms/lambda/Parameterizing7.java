package com.mms.lambda;

import java.util.ArrayList;
import java.util.List;

public class Parameterizing7 {
	
	public static List<Apple> filterApplesByColor(List<Apple> applesList, String color)
	{
		List<Apple> filteredApplesList = new ArrayList<Apple>();
		
		for(Apple apple: applesList)
		{
			if(apple.getColor().equalsIgnoreCase(color))
			{
				filteredApplesList.add(apple);
			}
		}
		
		return filteredApplesList;
		
	}
	
	

}
