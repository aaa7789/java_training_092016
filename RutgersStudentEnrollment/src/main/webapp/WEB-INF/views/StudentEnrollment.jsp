<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enrollment success </h1>
  ${msg}
  
 <h2> Hi: ${student1.studentName}  </h2> 
 <h2>  you are from:  ${student1.city}  </h2> 
 <h2>  street:  ${student1.street}  </h2> 
 <h2>  city:   ${student1.city}  </h2>
 <h2>  state:   ${student1.state}  </h2> 


</body>
</html>