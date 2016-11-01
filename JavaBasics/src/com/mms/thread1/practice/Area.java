package com.mms.thread1.practice;

public class Area {
	private String name;
	private String person;
	private String status;
	
	public Area(String name, String person)
	{
		this.name = name;
		this.person = person;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	
	
	@Override
	public String toString() {
		return "Area [name=" + name + ", person=" + person + "]";
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
