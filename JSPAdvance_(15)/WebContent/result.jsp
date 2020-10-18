<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="test.Calculator" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--FETCH THE VALUE FROM HTML PAGE --%>
	<%
		double no1=Double.parseDouble(request.getParameter("num1"));
	    double no2=Double.parseDouble(request.getParameter("num2"));
 		
	    Calculator c1=new Calculator();
	%>
	<h1>Addition is <%=Calculator.addition(no1,no2) %></h1>
	<h1> Multiplication is <%= c1.multiplication(no1, no2)%></h1>
	
</body>
</html>