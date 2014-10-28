<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cerrar sesión</title>
</head>
<body>
	<%
		response.setContentType("text/html");
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Cache-Control", "no-store");
		response.setDateHeader("Expires", 0);
		response.setHeader("Pragma","no-cache");
	
		 //HttpSession susuarioad = request.getSession(false);
		 //susuarioad.removeAttribute("usuarioad");
		 //susuarioad.invalidate();
		 
		 request.getSession().removeAttribute("usuarioad");
		 session.invalidate();
		 response.sendRedirect("login.jsp");
	
	%>

</body>
</html>