package com.mms.java8.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortTest {

	public static void main(String[] args) {
		
		
		List<String> nameList =  Arrays.asList("Hari", "Sam", "Anish", "John", "Zeeb");
		System.out.println("list before sorting " + nameList);
		SortTest sortTest = new SortTest();
		sortTest.sortUsingJava7(nameList);
		System.out.println( "list after sorting " +nameList);
		
		List<String> nameList2 =  Arrays.asList("Promod", "Hari", "Anish", "Neelima", "Nawaz");
		System.out.println("before sort using java7"+ nameList2) ;
		sortTest.sortUsingJava8(nameList2);
		System.out.println("after sort using java8 "+ nameList2) ;
		

	}
	
	private void sortUsingJava7(List<String> nameList)	
	{
		 Collections.sort(nameList, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				
				return s1.compareTo(s2);
			}
		});
	
	}
	
	private void sortUsingJava8(List<String> nameList)
	{
		Collections.sort(nameList, (s1, s2)->  s1.compareTo(s2));
	}

}
