<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WELCOME</title>
</head>
<body>
<%
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
	}



%>
WELCOME....${username}

<form action="Logout">
<input type = "submit" value="Logout">



</form>


</body>
</html>