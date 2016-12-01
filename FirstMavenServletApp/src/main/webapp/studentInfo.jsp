<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! 
  public int sum(int a , int b) 
  {
	return a +b;
  }

%>

<form action="" >
Name : <input type="text"> <br>
Location : <input type="text"> <br>
Gender  : <input type="radio" name="gender" value="F">Female
          <input type="radio" name="gender" value="M">Male
            <br>

  <input type="submit" value="submit">
</form>
  <%@ include file="myFirstJspFile.jsp" %> 
  <br>
  <h1>sum of the number is</h1>
  
  <%= sum( 7, 9) %>
  
  <%
  for(int m =0; m<5; m++)
  {
  %>
  
   <h3> value of m is</h3>	
   <%  
	  out.println( m);
  }
  %>
  


</body>
</html>