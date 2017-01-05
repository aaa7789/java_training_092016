package com.mms.db.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonRowmapper implements RowMapper<Person> {

	public Person mapRow(ResultSet rs, int arg1) throws SQLException {
		Person person = new Person();
		person.setId(rs.getLong("id"));
		person.setAddress(rs.getString("address"));
		person.setName(rs.getString("name"));
		person.setVersion(rs.getInt("version"));
		
		return person;
	}

}
