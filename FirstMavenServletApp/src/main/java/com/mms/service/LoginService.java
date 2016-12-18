package com.mms.service;

import java.util.HashMap;
import java.util.Map;

import com.mms.dto.StudentInfo;

public class LoginService {

	private Map<String, StudentInfo> studentMap = new HashMap<String, StudentInfo>();

	public LoginService() {
		StudentInfo john = new StudentInfo("john", "password1");
		StudentInfo hari = new StudentInfo("hari", "password1");
		studentMap.put("hari", hari);
		studentMap.put("john", john);
	}

	public boolean validateUser(String name, String password) {
		/*
		 * if(null != password && !password.isEmpty()) { return true; } return
		 * false;
		 */
		StudentInfo studentInfo = studentMap.get(name);
		String currPassword = studentInfo.getPassword();

		if (null != currPassword && currPassword.equalsIgnoreCase(password)) {
			return true;
		} else {
			return false;
		}

	}

	public StudentInfo getStudentInfo(String user) {
		StudentInfo student = studentMap.get(user);

		return student;

	}

}
