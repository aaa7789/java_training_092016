package com.mms.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper implements RowMapper<Person> {

	public Person mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Person person = new Person();
		
		person.setId(rs.getInt("id"));
		person.setName(rs.getString("name"));
		person.setNickName(rs.getString("nickName"));
		person.setVersion(rs.getInt("version"));
		
		return person;
	}

}
