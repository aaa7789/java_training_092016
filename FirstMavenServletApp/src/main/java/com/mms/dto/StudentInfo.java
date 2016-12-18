package com.mms.dto;

public class StudentInfo {
	private String studentName;
	private String password;
	
	public StudentInfo()
	{
		
	}
		
	public StudentInfo(String name, String password)
	{
		studentName = name;
		this.password = password;
		
		
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
