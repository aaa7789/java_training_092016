package com.mms.db.dto;

public class Student {
	private int studentId;
	private String name;
	private String branch;
	private String location;
	private int address;
	public Student()
	{
		
	}
	
	public Student(int studentId, String name, String branch, String location, int address)
	{
		this.studentId = studentId;
		this.name = name;
		this.branch = branch;
		this.location = location;
		this.address = address;
		
				
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	

}
