<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cerrar sesi�n</title>
</head>
<body>
	<%
	  HttpSession sessionad = request.getSession(true);
	  sessionad.getAttribute("usuarioad");
	  sessionad.invalidate();
	  sessionad.removeAttribute("usuarioad");	
	  response.sendRedirect("login.jsp");
	%>
</body>
</html>