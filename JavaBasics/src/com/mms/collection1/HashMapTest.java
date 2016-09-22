package com.mms.collection1;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		
		Map map = new HashMap<>();
		
		Student s1 = new Student("Vindya", 1);
		Student s2 = new Student("hari", 2);
		Student s3 = new Student("Samatha", 3);
		Student s4 = new Student("Vindya", 4);
		
		map.put(s1, "medak");
		map.put(s2, "medak");
		map.put(s3, "hyd");
		map.put(s4, "hyd");
		
		System.out.println(map);
		
	}

}
