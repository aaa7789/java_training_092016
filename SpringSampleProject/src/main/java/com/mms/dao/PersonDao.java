package com.mms.dao;

import java.util.List;

import com.mms.dto.Person;

public interface PersonDao {
	
	public int getCountOfPersons();
	public String getNickName(String name);
	public List<String> getMatchingPersons(String name);
	public Person getPersonDtls(String name);

}
