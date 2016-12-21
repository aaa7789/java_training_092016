package com.mms.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
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
	
	private String insertPersonsSql = "INSERT INTO `jpa_db`.`person`"
			+ " (`id`,`address`,`name`,`nickName`,`version`)"
			+ "VALUES(?, ?, ?, ?, ?)";

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

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertPersons(final List<Person> personList) {
		
		jdbcTemplate.batchUpdate(insertPersonsSql, new  BatchPreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setInt(1, personList.get(i).getId());
				ps.setString(2, personList.get(i).getAddress());
				ps.setString(3, personList.get(i).getName());
				ps.setString(4, personList.get(i).getNickName());
				ps.setInt(5, personList.get(i).getVersion());
				
			}
			
			public int getBatchSize() {
				// TODO Auto-generated method stub
				return personList.size();
			}
		});
		return personList.size();
	}
	

}
