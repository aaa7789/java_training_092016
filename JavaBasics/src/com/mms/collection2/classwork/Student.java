package com.mms.collection2.classwork;

public class Student {
	
	private int id;
	private String name;
	private String collegeName;
	
	
	public Student(int id, String name, String collegeName)
	{
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
				
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	//id = 12   31*1 + 10 = 43
	//100  31*1 + 100  = 131
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if(name != other.getName())
			return false;
		
		return true;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", collegeName=");
		builder.append(collegeName);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
