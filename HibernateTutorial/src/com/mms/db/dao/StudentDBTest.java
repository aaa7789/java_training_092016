package com.mms.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDBTest {

	public static void main(String[] args) {
		String sql = "SELECT * FROM training.student";
		
		Connection conn = null;
		Statement	stmt = null;
		ResultSet rs = null;
		try
		{ 
			conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "bittu1");
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			System.out.println("got the results from student table");
			
			while(rs.next())
			{
				System.out.println("name of student " + rs.getString("name"));
				System.out.println("id of student " + rs.getString("student_id"));
			}
			
			
		}
		catch(Exception ex)
		{
			System.out.println("exception occurred " + ex.getMessage());
		}
		
		
	}

}
