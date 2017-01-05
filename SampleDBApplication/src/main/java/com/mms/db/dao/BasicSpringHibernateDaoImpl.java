package com.mms.db.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.mms.db.dto.Person;

public class BasicSpringHibernateDaoImpl extends HibernateDaoSupport implements PersonDao {
	
	/*private SessionFactory sessionFactory;
*/
	public Person getPersonDtls(String name) {
		
		
		List<Person> person = (List<Person>) getHibernateTemplate().find("select p from Person p");
		return person.get(0);
	}

}
