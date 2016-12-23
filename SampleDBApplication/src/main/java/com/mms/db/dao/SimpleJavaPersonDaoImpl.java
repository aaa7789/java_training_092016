package com.mms.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mms.db.dto.Person;

public class SimpleJavaPersonDaoImpl implements PersonDao {
	
	private String sql = "SELECT * FROM jpa_db.person p where p.name = 'chris'";

	public Person getPersonDtls(String name) {
		System.out.println("inside SimpleJavaPersonDaoImpl");
		Person currPerson = new Person();
		
		
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jpa_db", "root", "bittu1");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				currPerson.setId(rs.getLong("id"));
				currPerson.setAddress(rs.getString("address"));
				currPerson.setName(rs.getString("name"));
				currPerson.setVersion(rs.getInt("version"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
				
		
		
		

		return currPerson;
	}

}
