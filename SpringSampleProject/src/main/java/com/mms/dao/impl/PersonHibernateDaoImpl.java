package com.mms.dao.impl;

import java.util.List;

import javax.persistence.AttributeOverride;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import com.mms.dao.PersonDao;
import com.mms.dto.Person;

@Repository
public class PersonHibernateDaoImpl implements PersonDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	private String numPeopleSql = "SELECT count(*) FROM Person";

	public int getCountOfPersons() {
	  Query	 query = sessionFactory.openSession().createQuery(numPeopleSql);
		return ((Long) query.uniqueResult()).intValue();
	}

	public String getNickName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getMatchingPersons(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Person getPersonDtls(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insertPersons(List<Person> personList) {
		// TODO Auto-generated method stub
		return 0;
	}

}
