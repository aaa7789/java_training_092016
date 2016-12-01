<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
int i =4;
 int j = 5;
 int k = i +j;
 out.println("result of addition is " + k);
%>
<br>
The value of k is : <%=k %>

<%for(i=0; i<5; i++) { %>
  Value of i is : <%=i %>
   <br>
  <%} %>
</body>
</html>