<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.Date" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is my first JSP page</h1>
<%! 
	public int add(int a , int b)
	{
	  return a+b;
	}
%>

 <% 
   int i =5;
  int j = 6;
   int k = i +j;
   out.println("value of k is " + k);
 %>
 <h2> Current time</h2>  <%= new Date()  %> 
 <br>
 <h3> the sum of I and J is </h3>
 <%= i+j %>
 <h2> sum of 8 and 6 is </h2>
 <%= add(8, 6) %>
 
 <h1>ip address of system is</h1>
 <%= request.getRemoteAddr() %>
 


</body>
</html>