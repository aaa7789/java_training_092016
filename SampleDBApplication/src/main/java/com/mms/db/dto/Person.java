package com.mms.db.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "person")
public class Person {
	@Id
	private Long id;
	
	@Column(name="address")
	private String address;
	
	@Column(name="createdOn")
	private Date created_on;
	
	@Column(name="name")
	private String name;
	
	@Column(name="version")
	private int version;
	
 	public Person()
	{
		
	}
	public Person(int id, String address, String name, int version)
	{
		this.id= (long) id;
		this.address = address;
		this.name = name;
		this.version = version;
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", address=" + address + ", created_on=" + created_on + ", name=" + name
				+ ", version=" + version + "]";
	}

}
