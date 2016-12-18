<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="com.mms.dto.StudentInfo" %>  
  <%@ taglib uri="WEB-INF/SampleCustomTag.tld"  prefix="sq"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome to Rutgers</h1>

<% 
StudentInfo studentInfo1 = (StudentInfo) session.getAttribute("studentInfo");
StudentInfo studentInfoFromReq = (StudentInfo) request.getAttribute("studentInfo");
%>
<h3> your login is success</h3>
<h2> thanks for vising Rutgers site </h2>
  <h2> <%=studentInfo1.getStudentName() %></h2>
  
   <h2>student Name from request <%=studentInfoFromReq.getStudentName() %></h2>
   
   <jsp:useBean id="studentInfo"  class="com.mms.dto.StudentInfo" scope="request"></jsp:useBean>   
   <jsp:getProperty property="studentName" name="studentInfo"/>
   
   <h1>printing square of a number</h1>
   <sq:square number="4"/>
   
  

</body>
</html>