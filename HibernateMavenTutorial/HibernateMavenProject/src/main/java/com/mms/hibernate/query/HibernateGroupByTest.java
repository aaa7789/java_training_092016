package com.mms.hibernate.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateGroupByTest {
	private static EntityManagerFactory entityManagerFactory;

	public static void main(String[] args) {
		
		entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
		
		EntityManager entityManager  = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		//select sum(duration) from jpa_db.phone_call
		Long totalDuration = entityManager.createQuery(
			    "select sum( c.duration ) " +
			    "from Call c ", Long.class )
			.getSingleResult();
		
		
/**
			  SELECT pr.name, sum(pc.duration) FROM jpa_db.phone_call pc,  jpa_db.phone ph, jpa_db.person pr
			    where pc.phone_id = ph.id and
			      ph.person_id = pr.id
			    group by pr.name 
 */
		
			List<Object[]> personTotalCallDurations = entityManager.createQuery(
			    "select p.name, sum( c.duration ) " +
			    "from Call c " +
			    "join c.phone ph " +
			    "join ph.person p " +
			    "group by p.name", Object[].class )
			.getResultList();
			
			for(Object[] currObj : personTotalCallDurations)
			{
				System.out.println("name of the person " + currObj[0] + " and duration of phone used " + currObj[1]);
			}	

			//It's even possible to group by entities!
		/*List<Object[]> personTotalCallDurations2 = entityManager.createQuery(
			    "select p, sum( c.duration ) " +
			    "from Call c " +
			    "join c.phone ph " +
			    "join ph.person p " +
			    "group by p", Object[].class )
			.getResultList();
		
		for(Object[] currObj : personTotalCallDurations2)
		{
			System.out.println("name of the person " + currObj[0] + " and duration of phone used " + currObj[1]);
		}	*/
		
	List<Person> persons = entityManager.createQuery(
			    "select p " +
			    "from Person p " +
			    "order by p.name", Person.class )
			.getResultList();
	
	for(Person person : persons)
	{
		System.out.println("name of person " + person.getName());
	}

			List<Object[]> personTotalCallDurations2 = entityManager.createQuery(
			    "select p.name, sum( c.duration ) as total " +
			    "from Call c " +
			    "join c.phone ph " +
			    "join ph.person p " +
			    "group by p.name " +
			    "order by total", Object[].class )
			.getResultList();
			
			for(Object[] currObject : personTotalCallDurations2)
			{
				System.out.println("name of the person " + currObject[0] + "  duration " + currObject[1]);
			}
			
			  entityManager.getTransaction().commit();
				entityManager.close();
				
				System.out.println("after retrieving from data base");
			  
	}

}
