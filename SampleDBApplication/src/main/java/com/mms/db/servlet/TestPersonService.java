package com.mms.db.servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mms.db.dto.Person;
import com.mms.db.service.PersonService;

public class TestPersonService {
	
	
	public static void main(String args[])
	{
		ApplicationContext context = new 
				FileSystemXmlApplicationContext("C:\\practice\\java_training\\201609_batch\\workspace\\SampleDBApplication\\applicationContext.xml");
		PersonService service =  context.getBean("personService", PersonService.class);
		
		  Person person = service.getPersonDetails("chris");
		  System.out.println("person details from db  " + person.toString());
		
	}
	
	  
	   
	  

}
