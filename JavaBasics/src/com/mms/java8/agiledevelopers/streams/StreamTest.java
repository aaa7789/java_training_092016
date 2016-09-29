package com.mms.java8.agiledevelopers.streams;

import  java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {

	
	public static List<Person> createPersons()
	{
		return Arrays.asList(
				new Person("Sara", "F", 20),
				new Person("Sara", "F", 22),
				new Person("Bob", "M", 20),
				new Person("Paula", "F", 32),
				new Person("Paul", "M", 32),
				new Person("Jack", "M", 2),
				new Person("Jack", "M", 72),
				new Person("Jil", "F", 12));
		
	}
	
	
	public static void main(String[] args) {
		
		List<Person> people = createPersons();
		
		//java 7 of getting all persons older than 18 years of age
		
		List<String> teenageList = new ArrayList<String>();
		
		for(Person person : people)
		{
			if(person.getAge() > 18)
			{
				teenageList.add(person.getName().toUpperCase());
				
			}			
			
		}
		System.out.println(teenageList);
		
		//java8 way
		
		List<String> teenageList2	=	people.stream().filter(person -> person.getAge() > 18 )
		              .map(person -> person.getName())
		              .map(person -> person.toUpperCase())
		              .collect(Collectors.toList());
		
		System.out.println(teenageList2);
		
		List<String> teenageList3	=	people.stream().filter(person -> person.getAge() > 18 )
	              .map(Person:: getName)
	              .map(String::toUpperCase)
	              .collect(Collectors.toList());
	
	System.out.println(teenageList3);
	
	//get all males
	           people.stream()
			                 .filter(person -> person.getGender().equals("M"))
			                 .forEach(System.out::println);
	
			
	}

}
