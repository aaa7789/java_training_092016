package com.mms.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mms.dao.PersonDao;
import com.mms.dto.Person;
import com.mms.dto.PersonRowMapper;

public class PersonDaoImpl implements PersonDao {
	private JdbcTemplate jdbcTemplate;
	
	private String numPeopleSql = "SELECT count(*) FROM jpa_db.person";
	private String personNameSql = "SELECT  p.nickName FROM jpa_db.person p "
			   + " where p.name=?";
	
	private String personDtlSql = "select * from jpa_db.person p where p.name= ? ";

	public int getCountOfPersons() {
		
		int cnt = jdbcTemplate.queryForObject(numPeopleSql, Integer.class);
		System.out.println("number of records in a table " + cnt);
		return cnt;
	}
	
	public String getNickName(String name)
	{
		String nickName = jdbcTemplate.queryForObject(personNameSql, new Object[] {name}, String.class);
		System.out.println("nick name of person ins ");
		
		return nickName;
	}
	
	public List<String> getMatchingPersons(String name)
	{
		List<String> personList = jdbcTemplate.queryForList(personNameSql, new Object[] {name}, String.class);
		
		return personList;
	}
	
	public Person getPersonDtls(String name)
	{
		Person person = jdbcTemplate.queryForObject(personDtlSql, new Object[] {name}, new PersonRowMapper());
		
		return person;
		
	}
	
	public void setDataSource(DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	

}
