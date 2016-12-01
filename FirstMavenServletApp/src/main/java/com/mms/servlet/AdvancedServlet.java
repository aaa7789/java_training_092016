package com.mms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdvancedServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public AdvancedServlet()
	{
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath()); 
		response.setContentType("text/html");
		
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		
		String defaultUser = this.getServletContext().getInitParameter("defaultUser");
		if(null != firstName && !firstName.isEmpty())
		{
			session.setAttribute("firstName", firstName);
		}
		/*if(firstName.isEmpty())
		{
			firstName = defaultUser;
		}*/
		
		if(null != lastName  && !lastName.isEmpty())
		{
			context.setAttribute("lastName", lastName);
		}
		
		PrintWriter writer = response.getWriter();
		   writer.println("<h1> Hi There from post method:  first Name" + firstName +
				  " last  name:  " +lastName  + "! from HelloServlet "
				  		+ "  first name from session " + session.getAttribute("firstName")
				  		+  "  lastName from serlvet context " + context.getAttribute("lastName") +
				  		 "  audited :" + request.getAttribute("Audited")  + "</h1> ");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath()); 
		response.setContentType("text/html");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(null != firstName)
		{
			session.setAttribute("firstName", firstName);
		}
		
		if(null != lastName )
		{
			context.setAttribute("lastName", lastName);
		}
		
		PrintWriter writer = response.getWriter();
		   writer.println("<h1> Hi There from post method:  first Name" + firstName +
				  " last  name:  " +lastName  + "! from HelloServlet "
				  		+ "  first name from session " + session.getAttribute("firstName")
				  		+  "  lastName from serlvet context " + context.getAttribute("lastName") + " </h1> ");
	}


}
