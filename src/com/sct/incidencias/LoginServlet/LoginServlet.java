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


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//CATUsuarioUTIC usuariou = new CATUsuarioUTIC();
		
		String usuario = request.getParameter("usuarioutic");
		String pass = request.getParameter("passwordutic");
		
		HttpSession session = request.getSession(false);
		if(session != null){
			session.setAttribute("login",usuario);
		}
		if(DBConexion.validar(usuario, pass)){
			if(usuario.equals("gvega")){
				RequestDispatcher rd = request.getRequestDispatcher("vista.jsp");
				rd.forward(request, response);
			}
			else if(usuario.equals("rbernabe")){
				RequestDispatcher rd = request.getRequestDispatcher("vista.jsp");
				rd.forward(request, response);
			}
			else if(usuario.equals("ext.71301")){
				RequestDispatcher rd = request.getRequestDispatcher("vistas.jsp");
				rd.forward(request, response);
			}

			else if(usuario.equals("ddt.utic.09")){
				RequestDispatcher rd = request.getRequestDispatcher("vistas.jsp");
				rd.forward(request, response);
			}
			else if(usuario.equals("andresv")){
				RequestDispatcher rd = request.getRequestDispatcher("vistasusuario.jsp");
				rd.forward(request, response);	
			}
		}
		else{
			out.print("<center><p style=\"color:red\">Usuario o Contraseña incorrecto</p></center>");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
		out.close();
	}

}
