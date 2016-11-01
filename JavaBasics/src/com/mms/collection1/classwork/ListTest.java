package com.mms.collection1.classwork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		int student = 3;
		
		List studentList = new ArrayList();
		
		  studentList.add(2);
		  studentList.add(4);
		  studentList.add(5);
		  studentList.add(2);
		  studentList.add("this");
		  
		  
		  System.out.println(studentList);
		  
		  List studentNamelist = new ArrayList<>();
		  studentNamelist.add("Rishi");
		  studentNamelist.add("Anish");
		  studentNamelist.add("John");
		  
		  studentNamelist.add(1, "Vindha");
		  
		  
		  
		  System.out.println(studentNamelist);
		  System.out.println(studentNamelist.get(1));
		  
		  List employeeList = new LinkedList<>();
		  employeeList.add("citi");
		  employeeList.add("Bank of America");
		  employeeList.add("Chase");
		  System.out.println(employeeList);
		
	
		
		

	}

}
