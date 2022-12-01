<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="java.sql.*;" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String emailid,password; %>
<%
emailid = request.getParameter("emailid");
password = request.getParameter("password");
if(emailid.equals("raj@gmail.com") && password.equals("123")){
	out.println("Successfully login");
	%>
	<jsp:forward page="Home.jsp"></jsp:forward>
	<%
}else {
	out.println("Failure try once again");
	%>
	<jsp:include page="index.jsp"></jsp:include>
	<%		
}
%>
</body>
</html>