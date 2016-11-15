package com.mms.hibernate.associations;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "laptop_details")
public class LaptopDetails {
	@Id
	@GeneratedValue
	private Long id;
	
	private String memory;
	private String processor;
	private String harddisk;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="laptop_id" )
	private Laptop laptop;
	
	public LaptopDetails()
	{
		
	}
	
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(String harddisk) {
		this.harddisk = harddisk;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

}
