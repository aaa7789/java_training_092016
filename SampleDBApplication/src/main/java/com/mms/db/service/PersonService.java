package com.mms.db.service;

import com.mms.db.dao.PersonDao;
import com.mms.db.dto.Person;

public class PersonService {
	private PersonDao personDao;
	
	public Person getPersonDetails(String name)
	{
		System.out.println("inside PersonService");
		Person person = personDao.getPersonDtls(name);
		
		
		return person;
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

}
