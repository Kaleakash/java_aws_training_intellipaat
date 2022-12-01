<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to HTML Web Page</h2>
<%!int a,b,sum; %>
<%
	a=10;
	b=20;
	sum = a+b;
	out.println("Welcome to JSP Page");
	out.println("Sum of two number is "+sum);
	out.println("<font color=red>Sum of two number is "+sum+"</font>");
%>
<br/>
<p>Sum of two number is <%=10+20 %> </p>
<font color="blue">Sum of two number is <%=sum%> </font>
</body>
</html>