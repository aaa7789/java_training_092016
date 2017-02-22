package com.mms.revision.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashCodeEqualsTest {

	public static void main(String[] args) {
		Student s1 = new Student("john", 15, 4);
		Student s2 = new Student("Chris", 18 , 3);
		Student s3 = new Student("Sandy", 16, 1);
		Student s4 = new Student("Joe", 17, 2);
		
		/*System.out.println("s1 hashcode: "  + s1.hashCode());
		System.out.println("s2 hashcode: "  + s2.hashCode());
		System.out.println("s3 hashcode: "  + s3.hashCode());
		System.out.println("s4 hashcode: "  + s4.hashCode());
		
		
		System.out.println("s1 equals s2: "  + s1.equals(s2));
		System.out.println("s1 equals s3: "  + s1.equals(s3));
		System.out.println("s2 equals s3:: "  + s2.equals(s3));
		System.out.println("modulus:  " +  2%16);
		System.out.println("modulus:  " +  16%16);
		System.out.println("modulus:  " +  18%16);*/
		
		/*Map map  = new HashMap();
		map.put(800, "eight hundred");
		map.put(800, "eight twenty");
		System.out.println("hashmap value is:  "  + map.get(800));*/
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
		List<Integer> idList = Arrays.asList(4, 5,10,  8, 2, 1);
		System.out.println("before sorting: " + idList.toString());
		
		Collections.sort(idList);
		System.out.println("after sorting: " + idList.toString());
		
		System.out.println("students before sorting:  " + studentList.toString());
		
		/*Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				
			 return	(s1.getAge() > s2.getAge())? 1:(s1.getAge() < s2.getAge())?-1:0;
				
				if(s1.getAge() > s2.getAge())
					return 1;
				else if(s1.getAge() < s2.getAge())
					return -1;
				else return 0;				
				
			}
		});*/
		
		Collections.sort(studentList);
		
		
		
		
		System.out.println("students after sorting:  " + studentList.toString());
		
		
		
	//  List<Student> sortedStudentList =  	Collections.sor
		
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		studentMap.put(1, s1);
		studentMap.put(2, s2);
		studentMap.put(3, s3);
		studentMap.put(4, s4);
		
		System.out.println( "map data : " +  studentMap.toString());
		
		
		
		

	}

}

/*class StudentComparator implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.getAge() > s2.getAge())
			return -1;
		else if(s1.getAge() < s2.getAge())
			return 1;
		else return 0;				
		
	}
	
}*/
