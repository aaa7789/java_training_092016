package com.mms.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	@Id
	private int id;
	
	private String address;
	
	private Date createdOn;
	private String name;
	private String nickName;
	private int version;
	
	public Person(int id, String address, String name, String nickName, int version)
	{
		this.id = id;
		this.address = address;
		this.name = name;
		this.nickName = nickName;
		this.version = version;
	}
	
	public Person()
	{
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", address=" + address + ", createdOn=" + createdOn + ", name=" + name
				+ ", nickName=" + nickName + ", version=" + version + "]";
	}
	
	

}
