package com.mms.db.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mms.db.dto.Person;
import com.mms.db.dto.PersonRowmapper;

@Repository
public class SpringJdbcTemplatePersonDaoImpl implements PersonDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	String getPersons = "select * from jpa_db.person";

	public Person getPersonDtls(String name) {
		List<Person> personList =  jdbcTemplate.query(getPersons, new PersonRowmapper());
		
		
		return personList.get(0);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

}
