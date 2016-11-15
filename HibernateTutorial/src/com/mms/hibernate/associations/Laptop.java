package com.mms.hibernate.associations;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "laptop")
public class Laptop {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	 public Laptop() {
		// TODO Auto-generated constructor stub
	}
	
	@OneToOne(mappedBy="laptop", cascade= CascadeType.ALL)	
	private LaptopDetails laptopDetails;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void addLapDetails(LaptopDetails details)
	{
		details.setLaptop(this);
		this.laptopDetails = details;
	}
	
	public void removeDetails(LaptopDetails details)
	{
		if(details != null)
		{
			details.setLaptop(null);
            this.laptopDetails = null;

		}
	}
	

}
