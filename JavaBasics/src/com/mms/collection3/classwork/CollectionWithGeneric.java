package com.mms.collection3.classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionWithGeneric {

	public static void main(String[] args) {

		List<String> studentList = Arrays.asList("Rishi", "Anish", "hari");
		
		List<Integer> studentIDList = new ArrayList<>();
		studentIDList.add(10);
		
		studentIDList.add(10);
		
		System.out.println("student list " +studentList);
		System.out.println("teacher list " +studentIDList);

	}

}
