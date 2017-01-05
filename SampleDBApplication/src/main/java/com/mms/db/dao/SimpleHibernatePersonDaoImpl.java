package com.mms.db.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Repository;

import com.mms.db.dto.Person;

@Repository
public class SimpleHibernatePersonDaoImpl implements PersonDao {	
	private static SessionFactory sessionFactory;

	public Person getPersonDtls(String name) {
		System.out.println("inside SimpleHibernatePersonDaoImpl");

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
		
		
        List result = session.createQuery( "from Person" ).list();
        Person currPerson = (Person) result.get(0);
		
        session.getTransaction().commit();
        session.close();

			return currPerson;
	}

}
