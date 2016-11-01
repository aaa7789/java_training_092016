package com.mms.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericsTest2 {

	public static void main(String[] args) {
		
		
		List<String> studentList = new ArrayList<String>();
		studentList.add("hari");
		studentList.add("neelima");
		
		
		Student< Integer> student1 = new Student<Integer>(2, "hari");
		System.out.println("student's name " + student1.getName() );
		System.out.println("student's ID " + student1.getStudentID());
		System.out.println("hash code of student1  " + student1.hashCode());
		
		Student< Integer> student2 = new Student<Integer>(3, "neelima");
		System.out.println("student's name " + student2.getName() );
		System.out.println("student's ID " + student2.getStudentID());
		System.out.println("hash code of student2  " + student2.hashCode());
		
		Student< Integer> student11 = new Student<Integer>(2, "neelima");
		System.out.println("student's name " + student11.getName() );
		System.out.println("student's ID " + student11.getStudentID());
		System.out.println("hash code of student11  " + student11.hashCode());
		
		Map<Student, String> studentMap = new HashMap<Student, String>();
		studentMap.put(student1, "hari");
		studentMap.put(student2, "neelima");
		studentMap.put(student11, "raju");
		
		student11 = student1;
		
	}

}
