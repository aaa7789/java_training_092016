package com.mms.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.mms.dao.PersonDao;
import com.mms.dto.Person;

@Repository
public class PersonHibernateSpringDaoImpl extends HibernateDaoSupport implements PersonDao {

/*	@Autowired
	private SessionFactory sessionFactory;*/
	
	private String personNameSql = "SELECT  p.nickName FROM Person p "
			   + " where p.name=?";
	
	 @Autowired
	    public void init(SessionFactory sessionFactory)
	    {
	        setSessionFactory(sessionFactory);
	    }
	public int getCountOfPersons() {
		
		 return DataAccessUtils.intResult(getHibernateTemplate().find("SELECT count(*) FROM Person"));
	   }
		

	public String getNickName(String inName) {
		
		List<String> names = (List<String>) getHibernateTemplate().find(personNameSql, inName);
		// TODO Auto-generated method stub
		return names.get(0);
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
