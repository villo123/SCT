package com.sct.incidencias.LoginServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.sct.incidencias.catalogos.CATUsuarioUTIC;


import com.sct.incidencias.Conexion.DBConexion;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}


	@SuppressWarnings("null")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//CATUsuarioUTIC usuariou = new CATUsuarioUTIC();
		
		String usuario = request.getParameter("usuarioutic");
		String pass = request.getParameter("passwordutic");
		
		//HttpSession sessionad = request.getSession(false);
		//HttpSession sessionop = request.getSession(false);
		//HttpSession session = request.getSession(false);
		/*if(sessionad != null){
			sessionad.setAttribute("login",usuario);
		}
		if(session != null){
			session.setAttribute("login",usuario);
		}*/
		if(DBConexion.validar(usuario, pass)){
			if(usuario.equals("gvega1")){
				 usuario = "Gustavo Vega Vivas";
				 HttpSession sessionad = request.getSession(true);
				 //HttpServletRequest ServletRequest = null;
				// ServletRequest.setAttribute("usuarioad",usuario);
				 sessionad.setAttribute("usuarioad",usuario);
				 RequestDispatcher rd = request.getRequestDispatcher("vista.jsp");
				 rd.forward(request, response);
			}
			else if(usuario.equals("rbernabe")){
				usuario = "Ramiro Bernabe Martinez";
				//sessionad.setAttribute("usuarioad",usuario);
				RequestDispatcher rd = request.getRequestDispatcher("vista.jsp");
				rd.forward(request, response);
			}
			else if(usuario.equals("ext.71301")){
				usuario = "Dulce Jaret Vargas Pelaez";
				//sessionop.setAttribute("usuarioop",usuario);
				RequestDispatcher rd = request.getRequestDispatcher("vistas.jsp");
				rd.forward(request, response);
			}

			else if(usuario.equals("ddt.utic.09")){
				usuario = "Jose Angel Maya Quevedo";
				//sessionop.setAttribute("usuarioop",usuario);
				RequestDispatcher rd = request.getRequestDispatcher("vistas.jsp");
				rd.forward(request, response);
			}
			else if(usuario.equals("andres")){
				usuario = "Andres Villagomez";
				//session.setAttribute("usuario",usuario);
				RequestDispatcher rd = request.getRequestDispatcher("vistasusuario.jsp");
				rd.forward(request, response);	
			}
		}
		else{
			out.print("<center><p style=\"color:red\">Usuario o Contraseņa incorrecto</p></center>");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
		out.close();
	}

}
