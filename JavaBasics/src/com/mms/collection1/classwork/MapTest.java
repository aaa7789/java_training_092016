package com.mms.collection1.classwork;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		
		
		Map studentMap = new HashMap<>();
		studentMap.put(1, "");
		studentMap.put(2, "");
		studentMap.put(3, "");
		studentMap.put(4, "");
		studentMap.put(9, "");
		studentMap.put(7, "");
		studentMap.put(6, "");
		studentMap.put(6, "");
		studentMap.put("", "")	;
		
		studentMap.put("", "Sridhar")	;	
		System.out.println(studentMap);
		
		Map studentLinkedhashMap = new LinkedHashMap<>();
		studentLinkedhashMap.put(1, "ANish");
		studentLinkedhashMap.put(2, "Rishi");
		studentLinkedhashMap.put(3, "Vindhya");
		studentLinkedhashMap.put(4, "John");
		studentLinkedhashMap.put(9, "John");
		studentLinkedhashMap.put(7, "John");
		studentLinkedhashMap.put(5, "John");
		studentLinkedhashMap.put(6, "John");
		
		System.out.println(studentLinkedhashMap);
		
		Map studentTreeMap = new TreeMap<>();
				studentTreeMap.put(1, "ANish");
		studentTreeMap.put(2, "Rishi");
		studentTreeMap.put(3, "Vindhya");
		studentTreeMap.put(4, "John");
		studentTreeMap.put(9, "John");
		studentTreeMap.put(7, "John");
		studentTreeMap.put(5, "John");
		studentTreeMap.put(6, "John");
		
		System.out.println(studentTreeMap);
		
		
		
	}

}
