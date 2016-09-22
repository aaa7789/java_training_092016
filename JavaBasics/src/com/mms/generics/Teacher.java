package com.mms.generics;

public class Teacher<T> {
	private T teacherID;
	private String teacherName;
	
	public Teacher(T teacherId, String teacherName)
	{
		this.teacherID = teacherId;
		this.teacherName = teacherName;
	}
	
	
	public T getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(T teacherID) {
		this.teacherID = teacherID;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	

}
