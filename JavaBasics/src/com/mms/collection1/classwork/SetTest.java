package com.mms.collection1.classwork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String args[]) {
		Set<Integer> studentSet = new HashSet<Integer>();

		studentSet.add(3);
		studentSet.add(5);
		studentSet.add(6);
		studentSet.add(5);
		studentSet.add(10);
		studentSet.add(12);
		studentSet.add(15);
		studentSet.add(17);

		System.out.println(studentSet);

		Set studentLinkedHashSet = new LinkedHashSet<>();

		studentLinkedHashSet.add(3);
		studentLinkedHashSet.add(5);
		studentLinkedHashSet.add(6);
		studentLinkedHashSet.add(5);
		studentLinkedHashSet.add(17);
		studentLinkedHashSet.add(12);
		studentLinkedHashSet.add(15);
		studentLinkedHashSet.add(10);

		System.out.println(studentLinkedHashSet);
		

		Set studentTreeSet = new TreeSet<>();

		studentTreeSet.add(3);
		studentTreeSet.add(5);
		studentTreeSet.add(6);
		studentTreeSet.add(5);
		studentTreeSet.add(17);
		studentTreeSet.add(12);
		studentTreeSet.add(15);
		studentTreeSet.add(10);

		System.out.println(studentTreeSet);
	}

}
