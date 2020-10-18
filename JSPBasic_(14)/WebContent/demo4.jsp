<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%-- FETCH THE VALUE FROM HTML PAGE --%>
  		  <%--JSP SCRIPTLET --%>
  		  <%
  		  		String name=request.getParameter("user");
  		  		String n1=request.getParameter("num1");
  		  		String n2=request.getParameter("num2");
  		  		
  		  		//parsing
  		  		double no1=Double.parseDouble(n1);
  		  		double no2=Double.parseDouble(n2);
  		  %>
  		  
  		  <%--JSP EXPRESSION --%>
  		  <h1>HELLO <%=name%><h1>
  		  <h1> ADDITION IS <%=no1+no2%><h1>
  		  <h1>SUBSTRACTION IS <%=no1-no2%></h1>
  		  <h1>MULTIPLICATION IS <%=no1*no2%><h1>
  		  <h1> DIVISION IS <%=no1/no2%><h1>
  		  
  		  
  		  
  
</body>
</html>