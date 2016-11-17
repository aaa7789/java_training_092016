package com.mms.hibernate.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CriteriaClassworkTest {
	private static EntityManagerFactory entityManagerFactory;

	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		
		String input = "Phone";
	
		
		if("Person".equalsIgnoreCase(input))
		{
			CriteriaQuery<Person> criteria = builder.createQuery(Person.class);
			Root<Person> root = criteria.from( Person.class );
			criteria.select( root );			
			
	 List<Person> persons = entityManager.createQuery( criteria ).getResultList();
	 for(Person currPerson : persons)
	 {
		 System.out.println("name of person " + currPerson.getName());
	 }
			
		}
		else if("Phone".equalsIgnoreCase(input))
		{
			CriteriaQuery<Phone> query = builder.createQuery(Phone.class);
			Root<Phone> root = query.from( Phone.class );
			 query.select( root );
			 List<Phone> phones = entityManager.createQuery( query ).getResultList();
			 
			 for(Phone currPhone : phones)
			 {
				 System.out.println("name of person " + currPhone.getType());
			 }
		}
			
		
	/*List<Person> persons = 	entityManager.createQuery("select p from Person p" , Person.class).getResultList();
	
	for(Person currPerson : persons)
	{
		System.out.println("name of person" + currPerson.getName());
		
	}*/
	
	entityManager.getTransaction().commit();
	entityManager.close();
		
		
		

	}

}
