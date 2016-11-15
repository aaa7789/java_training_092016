package com.mms.hibernate;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateJpaTest {
	private static EntityManagerFactory entityManagerFactory;

	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
		
		System.out.println("before creating entity manager");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist( new Event( "event from entity manager", new Date() ) );
		entityManager.persist( new Event( "one more entity manager", new Date() ) );
		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("after saving in data base");

	}

}
