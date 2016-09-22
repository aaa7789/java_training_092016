package com.mms.generics.classwork;

public class Student<S, T> {
	private S studentID;
	private String name;
	private T city;
	
	public T getCity() {
		return city;
	}


	public void setCity(T city) {
		this.city = city;
	}


	public Student(S id, String name, T city)
	{
		this.studentID = id;
		this.name = name;
		this.city = city;
	}
	
	
	public S getStudentID() {
		return studentID;
	}
	public void setStudentID(S studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
