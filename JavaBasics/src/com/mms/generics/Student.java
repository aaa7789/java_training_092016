package com.mms.generics;

public class Student<T> implements Comparable<Student<T>> {
	
	private T studentID;
	private String name;
	
	public Student(T studentId, String name)
	{
		this.studentID = studentId;
		this.name = name;
	}
	
	public T getStudentID() {
		return studentID;
	}
	public void setStudentID(T studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentID == null) ? 0 : studentID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentID == null) {
			if (other.studentID != null)
				return false;
		} else if (!studentID.equals(other.studentID))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student<T> o) {
		
		return 0;
	}
	
	
	

}
