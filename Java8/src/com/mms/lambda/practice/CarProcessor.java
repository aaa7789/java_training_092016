package com.mms.lambda.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarProcessor {
	
	public static List<Car> getCars(List<Car> carList, Predicate<Car> car)
	{
		List<Car> resultList = new ArrayList<>();
		for(Car currCar : carList)
		{
			if(car.test(currCar))
			{
				resultList.add(currCar);
			}
		}
		return resultList;
		
	}

}
