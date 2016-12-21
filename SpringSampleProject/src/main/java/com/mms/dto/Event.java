package com.mms.dto;

import java.sql.Date;

public class Event {
	
	private int id;
	private Date eventDate;
	private String title;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", eventDate=" + eventDate + ", title=" + title + "]";
	}
	
	

}
