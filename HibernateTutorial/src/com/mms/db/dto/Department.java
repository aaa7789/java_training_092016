package com.mms.db.dto;

public class Department {
	private int deptId;
	private String deptName;
	private int numEmployees;
	private String location;
	
	
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getNumEmployees() {
		return numEmployees;
	}
	public void setNumEmployees(int numEmployees) {
		this.numEmployees = numEmployees;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
