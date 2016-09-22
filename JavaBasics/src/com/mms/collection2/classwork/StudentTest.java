package com.mms.collection2.classwork;

import java.util.HashMap;
import java.util.Map;

public class StudentTest {

	public static void main(String[] args) {
		
		Student st1 = new Student(10, "Rishi", "UConn");
		Student st2 = new Student(20, "Anish", "Rutgers");
		Student st3 = new Student(10, "Vindhya", "BU");
		
		if(st1.equals(st2))
		{
			System.out.println("both students are equal");
		}
		else
		{
			System.out.println("both students are  not equal");

			
		}
		
		System.out.println("hashcode of st1 " + st1.hashCode());
		System.out.println("hashcode of st2 " + st2.hashCode());
		System.out.println("hashcode of st3 " + st3.hashCode());
	
		
		st1.equals(st1);
		
		int first = 10;
		int second = 10;
		if(first == second)
		{
			System.out.println("Same number");
		}
		
		String one = "Rishi";
		String two = "Rishi";
		
		if(one.equalsIgnoreCase(two))
		{
			System.out.println("same string");
		}
		
		Map studentMap = new HashMap<>();
		studentMap.put("Rishi", st1);
		studentMap.put("Anish", st2);
		studentMap.put("vindhya", st3);
		
		//first it calculates hashcode for key  --   38
		 // 38 %  16   = 6
		
		//first it calculates hashcode for key  --   36
		 // 38 %  16   = 4
		
		System.out.println(studentMap);
		
		System.out.println(studentMap.get("Rishi"));
		
		Map collegeMap = new HashMap<>();
		collegeMap.put(st1, "Rishi");
		collegeMap.put(st2, "Anish");
		collegeMap.put(st3, "Vindhya");
		
		System.out.println("college map " +collegeMap.toString());
		
		

	}

}
