<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

 #msg1
 {
 	border:5px solid green;
 	color:green;
 	padding:20px;
 }
 
 #msg2
 {
 	border:5px solid red;
 	color:red;
 	padding:20px;
 }

</style>

<body>
		<%--FETCH THE VALUE FROM HTML PAGE --%>
		<%
			String user =request.getParameter("user");
			String password=request.getParameter("password");
		%>
		
		
			<% if(user.equals("Gayas")&& password.equals("123"))
			 {%>
				 <h1 id="msg1" >LOGIN SUCCESSFULL<h1>
			 <%}
			 else
			 {%>
				<h1 id="msg2" >INVALIDE LOGIN DETAILS<h1>
			<%}
		    %>
</body>
</html>