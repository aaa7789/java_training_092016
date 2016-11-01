package com.mms.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CoreJavaDBTest {

	public static void main(String[] args) {
		
	 String sql = 	"select * from sample.sa_employee";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet  rs  = null;
		try
		{
			conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "bittu1");
			System.out.println("successfully created db connection");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println( "employee name " + rs.getString("emp_name"));
			}
			
			conn.close();
		}
		catch(Exception ex)
		{
			System.out.println("exception occurred " + ex.getLocalizedMessage());
		}

	}

}
