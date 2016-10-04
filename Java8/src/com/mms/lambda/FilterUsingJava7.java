package com.mms.lambda;

import java.util.ArrayList;
import java.util.List;

public class FilterUsingJava7 {
	
	public static List<Apple> filterGreenApples(List<Apple> applesList)
	{
		List<Apple> grennApplesList = new ArrayList<Apple>();
		
		for(Apple apple: applesList)
		{
			if(apple.getColor().equalsIgnoreCase("green"))
			{
				grennApplesList.add(apple);
			}
		}
		
		return grennApplesList;
		
	}
	
	public static List<Apple> filterHeavyApples(List<Apple> applesList)
	{
		List<Apple> heavyApplesList = new ArrayList<Apple>();
		
		for(Apple apple: applesList)
		{
			if(apple.getWeight() > 150)
			{
				heavyApplesList.add(apple);
			}
		}
		
		return heavyApplesList;
		
	}

}
