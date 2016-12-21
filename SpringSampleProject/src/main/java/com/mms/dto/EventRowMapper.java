package com.mms.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EventRowMapper implements RowMapper<Event> {

	public Event mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Event currEvent = new Event();
		currEvent.setId(rs.getInt("id"));
		currEvent.setEventDate(rs.getDate("EVENT_DATE"));
		currEvent.setTitle(rs.getString("title"));
		
		
		return currEvent;
	}

}
