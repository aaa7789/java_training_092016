package com.mms.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mms.dto.Person;

@Repository
public class PersonSpringHibenrateSessionDaoImpl {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public int getCountOfPersons() {
		
	Query query=  	sessionFactory.getCurrentSession().createQuery("SELECT count(*) FROM Person");
	      return query.executeUpdate();
	   }
	
	
	
	public List<Person> getPersonDtls() {
		
	Query<Person> query=  	sessionFactory.openSession().createQuery("SELECT p FROM Person p");
	       List<Person> personList = query.getResultList();
	      return personList;
	   }
	
	

}
