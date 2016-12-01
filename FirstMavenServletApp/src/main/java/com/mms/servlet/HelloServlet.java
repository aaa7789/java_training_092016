package com.mms.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	public HelloServlet(){
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		String userName = request.getParameter("userName");
		
		PrintWriter writer = response.getWriter();
		   writer.println("<h1> Hi There from get method " + userName + " ! from HelloServlet  </h1> ");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath()); 
		response.setContentType("text/html");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String prof = request.getParameter("prof");
		String [] location = request.getParameterValues("location");
		
		PrintWriter writer = response.getWriter();
		   writer.println("<h1> Hi There from post method:  first Name" + firstName +
				  " last  name:  " +lastName  + "! from HelloServlet "
				  		+ "profession  " +  prof 
				  		+ "location " + location[0] + "</h1> ");
	}

}
