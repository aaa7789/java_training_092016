package com.mms.hibernate.associations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	//biderctional  -- we will have reference of each class in other class
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany(mappedBy = "person", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<Phone> phones = new ArrayList<Phone>();
	
	public Person()
	{
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Phone> getPhones() {
		return phones;
	}
	
	
	public void addPhone(Phone phone)
	{
		phones.add(phone);
		phone.setPerson(this);
	}
	
	
	public void removePhone(Phone phone)
	{
		phones.remove(phone);
		phone.setPerson(null);
	}
	
	

}
