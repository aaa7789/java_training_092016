package com.mms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mms.dao.EventDao;
import com.mms.dao.PersonDao;
import com.mms.dao.impl.PersonHibernateDaoImpl;
import com.mms.dao.impl.PersonHibernateSpringDaoImpl;
import com.mms.dto.Event;
import com.mms.dto.Person;

public class TestRestaurant {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\practice\\java_training\\201609_batch\\repository\\SpringSampleProject\\applicationContext.xml");
				
		Restaurant restaurant = (Restaurant) context.getBean("indianRestaurant");
		restaurant.foodItems();
		
		PersonDao dao = (PersonDao) context.getBean("personDao");
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
		
		EventDao eventDao = (EventDao) context.getBean("eventDao");
		List<Event> eventList = eventDao.getAllFromEvents();
		
		for(Event currEvent : eventList)
		{
			System.out.println("current Event is " + currEvent.toString());
		}
		
		
		/*Person srujana = new Person(21, "NJ","srujana", "srujana", 3);
		Person neelima = new Person(22, "NJ","neelima", "neelima", 3);
		Person raju = new Person(23, "NJ","raju", "raju", 3);
		Person bittu = new Person(24, "NJ","bittu", "bittu", 3);
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(srujana);
		personList.add(neelima);
		personList.add(raju);
		personList.add(bittu);
		
		int numInserted = dao.insertPersons(personList);
		
		System.out.println("number of persons inserted in DB " + numInserted);*/
		
		PersonHibernateDaoImpl dao3 = context.getBean("personHibernateDaoImpl", PersonHibernateDaoImpl.class);
	int numPersons = 	dao3.getCountOfPersons();
	
	System.out.println("spring hibernate cnt of persons "+ numPersons);
	
	PersonHibernateSpringDaoImpl dao4 = context.getBean("personHibernateSpringDaoImpl", PersonHibernateSpringDaoImpl.class);
	int cntPer = dao4.getCountOfPersons();
	String nickName = dao4.getNickName("hari");
	System.out.println("count of people using hibernateTemplate " + cntPer  + "and nick name is " + nickName);
		
		System.out.println("finished processing");

	}

}
