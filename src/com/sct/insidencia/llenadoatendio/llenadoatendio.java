package com.sct.insidencia.llenadoatendio;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sct.incidencias.catalogos.CATAtendio;

/**
 * Servlet implementation class llenadoatendio
 */
@WebServlet("/llenadoatendio")
public class llenadoatendio extends HttpServlet {
	private static final long serialVersionUID = 1L;
	boolean status = false;
	private static Connection ct;
	private static Statement st;
	static PreparedStatement pst = null;
	static ResultSet rs = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public llenadoatendio() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(response, request);
		
	}
	 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try{
			String databaseURL = "jdbc:datadirect:openedge://localhost:30060;"
									+ "schemaDefault=PUB;"
										+ "databaseName=incidencias.db;=sysprogress;password=sysprogress";
			Class.forName("com.ddtek.jdbc.openedge.OpenEdgeDriver");
			System.out.println("Controlador cargado");
			ct = DriverManager.getConnection(databaseURL);
			st = ct.createStatement();
            PreparedStatement ps = ct.prepareStatement("SELECT CATAtendio.idAtendio, CATAtendio.NombreAtendio, CATAtendio.APaterno, CATAtendio.AMaterno FROM PUB.CATAtendio");
            ps.getString(1,idAtendio);
            ps.getString(2,NombreAtendio);
            ps.getString(3,APaterno);
            ps.getString(4,AMaterno);
            rs = ps.executeQuery();
            status = rs.next();
            ct.close();
		}catch(Exception e){
			System.out.println("No se pudo conectar a la base de datos");
		}return status;		
	}
}
