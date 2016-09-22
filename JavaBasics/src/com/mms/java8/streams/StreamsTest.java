package com.mms.java8.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsTest {

	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("John", "","Ram", "" , "sam", "", "Hari", "") ; 
		
		int countEmptyStrings =  (int) stringList.stream().filter(string -> string.isEmpty()).count() ;
		System.out.println("number of empty strings " + countEmptyStrings);
		
		int count3Length = (int) stringList.stream().filter(string -> string.length() == 3).count();
		
		System.out.println("number strings having lenght 3: " + count3Length);
		
		List<String> nonEmptyList = stringList.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		
		System.out.println("non empty list " + nonEmptyList);
		
		String joinedString = stringList.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
		
		
		System.out.println("string of non empty List " + joinedString);

		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 7, 9,12, 14,16);
		List<Integer> numSquare = numbers.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println("square list " + numSquare);
		
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) ->x).summaryStatistics();
		System.out.println("max number from list : " + stats.getMax());
		System.out.println("min number from list : " + stats.getMin());
		System.out.println("sum of numbers from list : " + stats.getSum());
		
	}

}
