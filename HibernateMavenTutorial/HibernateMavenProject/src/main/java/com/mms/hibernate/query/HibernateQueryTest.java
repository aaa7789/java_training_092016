package com.mms.hibernate.query;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateQueryTest {
	private static EntityManagerFactory entityManagerFactory;

	public static void main(String[] args) {
		
		try
		{
			entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
			EntityManager entityManager  = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			//save data into Db
			
			Person person1 = new Person();
			person1.setName("hari");
			person1.setNickName("Hari");
			person1.setVersion(1);
			person1.getAddresses().put(AddressType.HOME, "a1234");
			
			
			Phone phone = new Phone();
			Call call1 = new Call();
			call1.setDuration(15);
			call1.setTimestamp(new Date());
			
			phone.addCall(call1);
			phone.addCallHistory(call1);
			
			phone.setType(PhoneType.LAND_LINE);
			person1.addPhone(phone);
			entityManager.persist(person1);
			
			List<Person> personList = entityManager.createQuery("select p from Person p " +
			  " where p.name like :name ").setParameter("name", "h%").getResultList();
			
			for(Person curPerson : personList)
			{
				System.out.println("retrieving data from DB for person:  " + curPerson.getName());
			}
			
			
			List<Object[]> persons = entityManager.createQuery(
				    "select distinct pr, ph " +
				    "from Person pr, Phone ph " +
				    "where ph.person = pr and ph is not null", Object[].class)
				.getResultList();
			
			for(Object currobj : persons)
			{
				System.out.println( "value of current object " +currobj);
			}
			
			List<Person> personsSelf = entityManager.createQuery(
				    "select distinct pr1 " +
				    "from Person pr1, Person pr2 " +
				    "where pr1.id <> pr2.id " +
				    "  and pr1.address = pr2.address " +
				    "  and pr1.createdOn < pr2.createdOn", Person.class )
				.getResultList();
			
			
			
			
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
