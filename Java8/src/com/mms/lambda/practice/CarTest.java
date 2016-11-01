package com.mms.lambda.practice;

import java.lang.reflect.GenericArrayType;
import java.util.Arrays;
import java.util.List;

public class CarTest {

	public static void main(String[] args) {
		
		List<Car> carList = Arrays.asList(
				new Car("Honda", "Civic", 2012, "silver", 12000),
				new Car("Honda", "Accord", 2014, "red", 12000),
				new Car("Toyota", "camry", 2010, "silver", 16000),
				new Car("Toyota", "Corola", 2012, "silver", 10000),
				new Car("Honda", "Civic", 2010, "red", 10000),
				new Car("Audi",  "audi", 2012, "silver", 18000),
				new Car("BMW",   "bmw",   2014, "silver", 12000),
				new Car("Honda", "Civic", 2016, "silver", 12000),
				new Car("Honda", "Civic", 2014, "black", 12000),
				new Car("Honda", "Civic", 2016, "red", 17000)			
				
				);
		
		//find honda 
		
	List<Car> hondaCars=	CarProcessor.getCars(carList, (car) ->
		                            { return  ("Honda".equals(car.getMake()) 
		                            		   &&  car.getYear() > 2014
		                            		   &&  car.getPrice() < 13000); } );
	
	System.out.println("honda make cars are " + hondaCars);

	}

}
