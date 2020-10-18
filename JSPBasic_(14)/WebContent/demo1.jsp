<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
	h1
	{
		background-color: teal;
		color:white;
		padding:10px;
		margin:10px;
		border:5px solid black;
		text-align:center;
	}
</style>
</head>
<body>
  		<%--FETCH THE VALUE FROM HTML PAGE --%>
  		
  		<h1><%
  			String username=request.getParameter("name");
  			out.print("Welcome "+username);
  		%></h1>
</body>
</html>