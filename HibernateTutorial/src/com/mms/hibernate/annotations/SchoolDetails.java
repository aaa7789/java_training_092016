package com.mms.hibernate.annotations;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="school_details")
public class SchoolDetails {
	
	@Id
	@GeneratedValue(generator="newGenerator")
	@GenericGenerator(name = "newGenerator", strategy="foreign" , parameters={ @Parameter(name="property", value="school")} )
	@Column(name="school_id")
	private Long schoolId;
	
	private String city;
	private int numOfTeachers;
	private int numOfStudents;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="school_id")
	private School school;
	
	public SchoolDetails()
	{
		
	}
	
	public SchoolDetails(School school, String city, int teachers, int studetns)
	{
		this.school = school;
		this.city = city;
		this.numOfStudents = teachers;
		this.numOfStudents = studetns;
		
	}
	
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getNumOfTeachers() {
		return numOfTeachers;
	}
	public void setNumOfTeachers(int numOfTeachers) {
		this.numOfTeachers = numOfTeachers;
	}
	public int getNumOfStudents() {
		return numOfStudents;
	}
	public void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}

}
