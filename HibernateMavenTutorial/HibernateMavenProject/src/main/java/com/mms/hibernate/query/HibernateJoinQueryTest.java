package com.mms.hibernate.query;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateJoinQueryTest {
	private static EntityManagerFactory entityManagerFactory;

	public static void main(String[] args) {

		
		try
		{
			entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
			EntityManager entityManager  = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			//save data into Db
			
			Person person1 = new Person();
			person1.setName("john");
			person1.setNickName("john");
			person1.setVersion(1);
			person1.getAddresses().put(AddressType.OFFICE, "Office1234");
			
			
			Phone phone = new Phone();
			Call call1 = new Call();
			call1.setDuration(10);
			call1.setTimestamp(new Date());
			
			phone.addCall(call1);
			phone.addCallHistory(call1);
			
			phone.setType(PhoneType.MOBILE);
			
			Phone landPhone = new Phone();
			Call landCall = new Call();
			landCall.setDuration(10);
			landCall.setTimestamp(new Date());
			
			landPhone.addCall(landCall);
			landPhone.addCallHistory(landCall);			
			landPhone.setType(PhoneType.LAND_LINE);
			
			person1.addPhone(phone);
			person1.addPhone(landPhone);
			entityManager.persist(person1);
			
			List<Person> personList = entityManager.createQuery("select p from Person p " +
			  " where p.name like :name ").setParameter("name", "h%").getResultList();
			
			for(Person curPerson : personList)
			{
				System.out.println("retrieving data from DB for person:  " + curPerson.getName());
			}
			
			
			List<Person> persons = entityManager.createQuery(
				    "select distinct pr " +
				    "from Person pr " +
				    "inner join pr.phones ph " +
				    "where ph.type = :phoneType", Person.class )
				.setParameter( "phoneType", PhoneType.LAND_LINE )
				.getResultList();
			
			for(Person currPerson : persons)
			{
				System.out.println("name of person with landphone " + currPerson.getName());
			}
			
			// inserting into only person table
			Person chris = new Person();
			chris.setName("chris");
			chris.setNickName("chris");
			chris.setVersion(1);
			chris.getAddresses().put(AddressType.OFFICE, "Office1234");
			entityManager.persist(chris);
			
			//left join
			List<Person> allPersons = entityManager.createQuery(
				    "select distinct pr " +
				    "from Person pr " +
				    "left  outer join pr.phones ph " +
				    "where ph is null " +
				    "   or ph.type = :phoneType", Person.class )
				.setParameter( "phoneType", PhoneType.LAND_LINE )
				.getResultList();
			for(Person currPerson : allPersons)
			{
				System.out.println("All persons with or without phone " + currPerson.getName());
			}
			
			//using "ON" join clause
			List<Object[]> personsAndPhones = entityManager.createQuery(
				    "select pr.name, ph.number " +
				    "from Person pr " +
				    "left join pr.phones ph on ph.type = :phoneType " )
				.setParameter( "phoneType", PhoneType.LAND_LINE )
				.getResultList();
			
			/*//implicit join
			List<Phone> phones = entityManager.createQuery(
				    "select ph " +
				    "from Phone ph " +
				    "where ph.person.address = :address ", Phone.class )
				.setParameter( "address", address )
				.getResultList();

				// same as implicit joins always treated as 
				List<Phone> phones2 = entityManager.createQuery(
				    "select ph " +
				    "from Phone ph " +
				    "join ph.person pr " +
				    "where pr.address = :address ", Phone.class )
				.setParameter( "address", address)
				.getResultList();
				
				
				
			//collection reference example
			List<Phone> phones = entityManager.createQuery(
				    "select ph " +
				    "from Person pr " +
				    "join pr.phones ph " +
				    "join ph.calls c " +
				    "where pr.address = :address " +
				    "  and c.duration > :duration", Phone.class )
				.setParameter( "address", address )
				.setParameter( "duration", duration )
				.getResultList();

			*/
			entityManager.getTransaction().commit();
			entityManager.close();
			
			System.out.println("after saving in data base");
			
		}
		catch(Exception ex)
		{
			System.out.println("exception occurred " + ex.getMessage());
		}
		

	
	}

}
