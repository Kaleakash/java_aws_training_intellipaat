<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Account create</h2>
	<form action="signUp" method="post">
	<label>EmailId</label>
	<input type="email" name="emailid"><br/>
	<label>Password</label>
	<input type="password" name="password"><br/>
	<input type="submit" value="signIn"/>
	<input type="reset" value="reset"/>
	</form>
	<br/>
	<a href="index.jsp">Login Page</a>
</body>
</html>