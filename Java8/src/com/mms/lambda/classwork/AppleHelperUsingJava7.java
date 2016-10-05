package com.mms.lambda.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AppleHelperUsingJava7 {

	public static List<Apple> filterApples(List<Apple> appleList, String color) {
		List<Apple> redAppliesList = new ArrayList<>();

		for (Apple apple : appleList) {
			if (color.equals(apple.getColor())) {
				redAppliesList.add(apple);
			}

		}

		return redAppliesList;
	}

	public static List<Apple> filterApplesByWeight(List<Apple> appleList) {
		List<Apple> heavyAppliesList = new ArrayList<>();

		for (Apple apple : appleList) {
			if (apple.getWeight() > 300) {
				heavyAppliesList.add(apple);
			}

		}

		return heavyAppliesList;
	}

	public static List<Apple> filter(List<Apple> inAppleList, AppleFilter appleFilter) {
		List<Apple> filterAppleList = new ArrayList<>();

		for (Apple apple : inAppleList) {
			if (appleFilter.filter(apple)) {
				filterAppleList.add(apple);

			}
		}

		return filterAppleList;

	}
	
	//generic method to filter anything
	
	public static <T> List<T> filterJava8(List<T>  appleList, Predicate<T> predicate)
	{
		List<T> resultList = new ArrayList<>();
		for(T t : appleList)
		{
			if(predicate.test(t))
			{
				resultList.add(t);
			}
		}
		return resultList;
	}
	
	
	public static <T> void printTypeName(List<T> appleList, Consumer<T> consumer)
	{
		for(T t: appleList)
		{
			consumer.accept(t);
			
		}
	}

}
