package com.mms.revision.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		List<String> s1 = new ArrayList<>();
		s1.add( "raju");
		s1.add( "rani");
		s1.add( "sonu");
		s1.add( "ravi");
		s1.add("ra");
		//s1.add(10);
		System.out.println(s1.toString());
		
		List s2= new LinkedList<>();
		
		s2.add("raju");
		s2.add("rani");
		s2.add( "sonu");
		s2.add("ravi");
		s2.add("ra");
		
		System.out.println(s2.toString());
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(5);
		
		

	}

}
