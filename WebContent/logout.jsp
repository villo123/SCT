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
		//HttpSession s = request.getSession(false);
		String usuarioad = "";
		 HttpSession sessionad = request.getSession();
		 usuarioad = (String)sessionad.getAttribute("usuarioad");
	if (sessionad != null) {
		sessionad.invalidate();
		response.sendRedirect("login.jsp");
	}

	Cookie[] cookies = request.getCookies();
	if (cookies != null && cookies.length > 0) {
		for (Cookie cookie : cookies) {
			cookie.setValue("-");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			response.sendRedirect("login.jsp");
		}
	}
	%>

</body>
</html>