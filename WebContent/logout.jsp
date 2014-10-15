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
	      /*HttpSession sessionad = request.getSession(true);
	      sessionad.getAttribute("usuarioad");
		  sessionad.removeAttribute("usuarioad");
		  sessionad.invalidate();	
		  response.sendRedirect("login.jsp");*/
		  
		 /* HttpSession sessionop = request.getSession(true);
		  sessionop.getAttribute("usuarioop");
		  sessionop.removeAttribute("usuarioop");
		  sessionop.invalidate();
		  response.sendRedirect("login.jsp");
		  
		  HttpSession sessionusr = request.getSession(true);
		  sessionusr.getAttribute("usuario");
		  sessionusr.removeAttribute("usuario");
		  sessionusr.invalidate();
		  response.sendRedirect("login.jsp");*/
		  
		      HttpSession s = request.getSession(false);
		      s.invalidate();
		     %>
		     <h1>Logout

		     <p>You are now logged out.
		   
		     <a href="login.jsp"/>Login
</body>
</html>