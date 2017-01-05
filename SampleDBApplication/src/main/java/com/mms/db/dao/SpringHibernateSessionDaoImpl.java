package com.mms.db.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mms.db.dto.Person;

@Repository
public class SpringHibernateSessionDaoImpl implements PersonDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public Person getPersonDtls(String name) {
	  Query query = 	sessionFactory.openSession().createQuery("select p from Person p");
		
			  List<Person> personList = query.getResultList();
		return personList.get(0);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
