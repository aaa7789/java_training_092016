package com.mms.hibernate.annotations;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SchoolTest {
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
		
		School rutgers = new School();
		 rutgers.setName("rutgers");
		 
		 SchoolDetails pisctawayRutgers = new SchoolDetails();
		 pisctawayRutgers.setCity("Piscataway");
		 pisctawayRutgers.setNumOfStudents(10000);
		 pisctawayRutgers.setNumOfTeachers(100);
		 pisctawayRutgers.setSchool(rutgers);
		 
		 
		 session.save(pisctawayRutgers);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("saved the entity to database");

	
	}

}
