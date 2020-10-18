<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%--DECLARATION TAG --%>
	<%!
		double radius=5.25;
		double circleArea()
		{
			return 3.14*radius*radius;
		}
	%>
	<%-- SCRIPLET TAG --%>
	<h1><%
		out.print("SCRIPTLET TAG");
	%></h1>
	<h1>Area of Circle <%=circleArea() %></h1>
</body>
</html>