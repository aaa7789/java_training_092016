package com.mms.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mms.dao.PersonDao;
import com.mms.dto.Person;

public class TestRestaurant {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\practice\\java_training\\201609_batch\\workspace\\SpringSampleProject\\applicationContext.xml");
		
		
		Restaurant restaurant = (Restaurant) context.getBean("indianRestaurant");
		restaurant.foodItems();
		
		PersonDao dao = (PersonDao) context.getBean("PersonDao");
		int cntPersons = dao.getCountOfPersons();
		System.out.println("number of persons in person table are " + cntPersons);
		
		String personName = dao.getNickName("chris");
		System.out.println("person nick name from test class is " + personName);
		
		List<String> personNickNames = dao.getMatchingPersons("hari");
		for(String currName :personNickNames)
		{
			System.out.println("person nick name:  " + currName);
		}
		
		Person person = dao.getPersonDtls("chris");
		System.out.println("person details " + person.toString());
		
		
		System.out.println("finished processing");

	}

}
