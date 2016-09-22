package com.mms.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceTest {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(2,3,5,6,8,9,10,11,12);
		
		System.out.println("even numbers from list are ");
		eval(numList, n -> n%2 == 0);
		System.out.println("numbers greater than 10 from list are ");
		eval(numList, n -> n > 10);
		

	}
	
	private static void eval(List<Integer> numList, Predicate<Integer> predicate)
	{
		for(Integer n : numList)
		{
			if(predicate.test(n))
			{
				System.out.println(n + " ");
			}
		}
		
	
		
	}

}
