package com.mms.hibernate.associations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class LaptopTest {
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
		
		Laptop dell = new Laptop();
				dell.setName("Dell");
		
		LaptopDetails dellDetails = new LaptopDetails();
		dellDetails.setHarddisk("300GB");
		dellDetails.setMemory("16GB");
		dellDetails.setProcessor("Intel 5 core");
		
		dell.addLapDetails(dellDetails);		
		
		session.save(dell);	
		
			session.getTransaction().commit();
		session.close();
	
		System.out.println("saved the entity to database");
		
		
		

		

	
	}

}
