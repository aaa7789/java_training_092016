package com.mms.collection3.classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompartorTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(2, "anish", "Uconn");
		Student s2 = new Student(10, "Rishi", "Rutgers");
		Student s3 = new Student(8, "Pramod", "Fair field");
		Student s4 = new Student(1, "neelima", "UCM");
		Student s5 = new Student(6, "Srujana", "UCM");
		
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		System.out.println("before sorting" + studentList);
		
		
		
		Collections.sort(studentList, new StudentComparator());
		
		//anonymous class
		
		Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int res = 0;
				
				if(s1.getId() > s2.getId())			
					res = 1;		
				else if(s1.getId() < s2.getId())
					res = -1;
					else
						res =0;
				return res;
			}
		});
		
		
		
		System.out.println("after sorting" + studentList);

	}

}

class  StudentComparator implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		int res = 0;
		
		if(s1.getId() > s2.getId())			
			res = -1;		
		else if(s1.getId() < s2.getId())
			res = 1;
			else
				res =0;
		return res;
	}
	
}
