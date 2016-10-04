package com.mms.lambda.classwork;

import java.util.ArrayList;
import java.util.List;

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

}
