package com.mms.hibernate.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateClassWork {
	private static EntityManagerFactory entityManagerFactory;

	public static void main(String[] args) {
		
		try
		{
			entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
			
			EntityManager entityManager  = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			
		  List<Person>	personList = 
				  entityManager.createQuery("select  pr from Person pr , Phone ph"
				  		+ " where  ph.person = pr and "
				  		+ " ph.type = :phoneType").
				  setParameter("phoneType", PhoneType.MOBILE).
				  getResultList();
		  
		  
		/*  List<Person> personList = entityManager.createQuery("select p from Person p " +
				  " where p.name like :name ").setParameter("name", "h%").getResultList();*/
		  
		  for(Person currPerson : personList)
		  {
			  System.out.println("person name " + currPerson.getName());
		  }
		  
		  entityManager.getTransaction().commit();
			entityManager.close();
			
			System.out.println("after retrieving from data base");
		  
		  
		}
		catch(Exception ex)
		{
			System.out.println("exception occurred " + ex.getMessage());
		}
		
		

	}

}
