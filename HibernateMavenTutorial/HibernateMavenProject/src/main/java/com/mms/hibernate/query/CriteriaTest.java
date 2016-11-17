package com.mms.hibernate.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CriteriaTest {
	private static EntityManagerFactory entityManagerFactory;

	public static void main(String[] args) {
entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
		
		EntityManager entityManager  = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();

		CriteriaQuery<Person> criteria = builder.createQuery( Person.class );
		Root<Person> root = criteria.from( Person.class );
		criteria.select( root );
		//criteria.where( builder.equal( root.get( ), "hari" ) );
		List<Person> persons = entityManager.createQuery( criteria ).getResultList();
		
		for(Person currPer : persons)
		{
			System.out.println("name of the person " + currPer.getName()  + "  address of person " + currPer.getAddress());
		}




		  entityManager.getTransaction().commit();
			entityManager.close();
			
			System.out.println("after retrieving from data base");
		
	}

}
