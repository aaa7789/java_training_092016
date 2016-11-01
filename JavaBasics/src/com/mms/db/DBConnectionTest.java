package com.mms.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnectionTest {

	public static void main(String[] args) {
		
		String sql = "SELECT * FROM world.city  LIMIT 10";

		try {

			// Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "bittu1");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println("  Name " + rs.getString("Name"));
				System.out.print("  CountryCode " + rs.getString("CountryCode"));
				System.out.print("   District " + rs.getString("District"));
				System.out.print("  Population " + rs.getString("Population"));
			}
			conn.close();

			//System.out.println("successfully connected to db");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}

}
