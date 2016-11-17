package com.mms.hibernate.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

public class HibernateNativQueryTest {
	private static EntityManagerFactory entityManagerFactory;
	
	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
		
		EntityManager entityManager  = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		List<Person> persons = entityManager.createNativeQuery(
			    "   SELECT * FROM jpa_db.person", Person.class )
			.getResultList();
		
		for(Person currPerson : persons)
		{			
				System.out.println("person name " +((Person) currPerson).getName());			
			
		}
		
		List<Person> persons2 = entityManager.createNativeQuery(
			    "SELECT * " +
			    "FROM person " +
			    "WHERE name like :name", Person.class )
			.setParameter("name", "h%")
			.getResultList();
		
		for(Person currPerson : persons2)
		{			
				System.out.println("person name from filter method " +((Person) currPerson).getName());			
			
		}
		
		StoredProcedureQuery query = entityManager.createStoredProcedureQuery( "sp_count_phones");
		query.registerStoredProcedureParameter( "personId", Long.class, ParameterMode.IN);
		query.registerStoredProcedureParameter( "phoneCount", Long.class, ParameterMode.OUT);

		query.setParameter("personId", 1L);

		query.execute();
		Long phoneCount = (Long) query.getOutputParameterValue("phoneCount");
		
		
		
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		System.out.println("after retrieving from data base");
		
	}


}
