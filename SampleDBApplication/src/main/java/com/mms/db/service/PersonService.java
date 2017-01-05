package com.mms.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mms.db.dao.PersonDao;
import com.mms.db.dto.Person;

@Component
public class PersonService {
	@Autowired
	@Qualifier("springHibernateSessionDaoImpl")
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
