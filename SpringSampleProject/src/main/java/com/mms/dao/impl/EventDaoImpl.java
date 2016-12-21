package com.mms.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mms.dao.EventDao;
import com.mms.dto.Event;
import com.mms.dto.EventRowMapper;

public class EventDaoImpl implements EventDao {
   private JdbcTemplate jdbcTemplate;
   
   String getEventsSql = "SELECT * FROM sample.event";

	public List<Event> getAllFromEvents() {
	  List<Event> eventList= 	jdbcTemplate.query(getEventsSql, new EventRowMapper());		
		return eventList;
	}
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
