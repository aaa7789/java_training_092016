package com.mms.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.dto.StudentInfo;
import com.mms.service.LoginService;

public class LoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String studentName = request.getParameter("studentName");
		String password    = request.getParameter("password");
		
		LoginService loginService = new LoginService();
		boolean validStudent = loginService.validateUser(studentName, password);
		
		HttpSession session = request.getSession();
		
		if(validStudent)
		{
			StudentInfo studentInfo = loginService.getStudentInfo(studentName);
			session.setAttribute("studentInfo", studentInfo);
			request.setAttribute("studentInfo", studentInfo);
			//response.sendRedirect("loginSuccess.jsp");
		  RequestDispatcher dispatcher = 	request.getRequestDispatcher("loginSuccess.jsp");
		  dispatcher.forward(request, response);
			
			return;
		}
		else
		{
			response.sendRedirect("login.jsp");
			return;
			
		}
	}

}
