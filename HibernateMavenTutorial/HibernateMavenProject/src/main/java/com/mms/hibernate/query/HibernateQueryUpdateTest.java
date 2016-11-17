package com.mms.hibernate.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HibernateQueryUpdateTest {
	private static EntityManagerFactory entityManagerFactory;
	public static void main(String[] args) {
		entityManagerFactory= Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
		EntityManager  entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Query query1 = entityManager.createQuery("select p from Person p "
				+ " where p.name like :name  ").
				setParameter("name", "h%");
		
		List<Person> personList = query1.getResultList();
		
		for(Person currPerson : personList)
		{
			System.out.println("retrieved person from DB " + currPerson.getName());
		}
		
		Query query2 = entityManager.createQuery("update Person p "
				+ " set p.name = :newName "
				+ "where p.name = :oldName ").
				setParameter("newName", "Neelima").
				setParameter("oldName", "hari");	
		  
		
		query2.executeUpdate();
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		System.out.println("update person DB ");
				
		
		  
		
	}

}
