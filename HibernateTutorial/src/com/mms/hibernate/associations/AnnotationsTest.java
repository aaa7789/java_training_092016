package com.mms.hibernate.associations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AnnotationsTest {
	private static SessionFactory sessionFactory;

	public static void main(String[] args) {

		

		// A SessionFactory is set up once for an application!
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
		}
		catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
			// so destroy it manually.
			
			System.out.println("exception occurred while creating sessionfactory " + e.getMessage());
			StandardServiceRegistryBuilder.destroy( registry );
		}
		System.out.println("before creating session");
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Person person = new Person();
		/* session.save(person);
		
		Phone phone = new Phone();
		phone.setPerson(person);
		phone.setNumber("a1234");*/
		
		Phone mobile = new Phone ("m123");
		Phone office = new Phone("o123");
		person.addPhone(mobile);
		person.addPhone(office);
		
		session.save(person);
		
		
		
		
		session.getTransaction().commit();
		session.close();
	
		System.out.println("saved the entity to database");
		
		
		

		

	
	}

}
