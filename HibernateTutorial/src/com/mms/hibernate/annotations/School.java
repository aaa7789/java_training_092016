package com.mms.hibernate.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="school")
public class School {
	@Id
	@GeneratedValue
	@Column(name="school_id")
	private Long schoolId;
	private String name;
	
	public School()
	{
		
	}
	
	public School(Long id, String name)
	{
		this.schoolId = id;
		this.name = name;
	}
	
	public Long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
