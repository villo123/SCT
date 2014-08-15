package com.sct.incidencias.InsertarFor;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sct.incidencias.Conexion.DBConexion;
import com.sct.incidencias.catalogos.*;


@WebServlet("/InsertarFormulario")
public class InsertarFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InsertarFormulario() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DBConexion d = new DBConexion();
		INCIDENCIA inc = new INCIDENCIA();
		String folio = request.getParameter("folio");
		inc.setFolio(folio);

	
		CATUsuarioUnidadResponsable catusunr = new CATUsuarioUnidadResponsable();
		
		String nombreresponsable = request.getParameter("nombreur");
		catusunr.setNombreResponsable(nombreresponsable);
		
		String responsableAPaterno= request.getParameter("APur");
		catusunr.setAPaterno(responsableAPaterno);
		
		String responsableAMaterno = request.getParameter("AMur");
		catusunr.setAMaterno(responsableAMaterno);
		
		String responsableCisco = request.getParameter("ciscour");
		catusunr.setCiscoUr(Integer.parseInt(responsableCisco));
		
		String responsableEmail = request.getParameter("emailur");
		catusunr.setEmailUr(responsableEmail);
		
		CATUnidadResponsable catur = new CATUnidadResponsable();
		String unidadrespoildUnidadAdm = request.getParameter("unidadresponsable");
		catur.setildUnidadAdm(Integer.parseInt(unidadrespoildUnidadAdm));
		catusunr.setildUnidadAdm(Integer.parseInt(unidadrespoildUnidadAdm));
		
		CATDepartamento catdep = new CATDepartamento();
		String ildDepartamento = request.getParameter("departamento");
		catdep.setildDepartamento(Integer.parseInt(ildDepartamento));
		

		CATModulo catmod = new CATModulo();
		String ildModulo = request.getParameter("modulo");
		catmod.setildModulo(Integer.parseInt(ildModulo));
		
		CATProceso catpro = new CATProceso();
		String ildProceso = request.getParameter("proceso");
		catpro.setildProceso(Integer.parseInt(ildProceso));

		CATTipoDeIncidente cattipin = new CATTipoDeIncidente();
		String ildIncidente = request.getParameter("tipodeincidencias");
		cattipin.setildIncidente(Integer.parseInt(ildIncidente));
		
		CATTipoDeSolucion cattipsol = new CATTipoDeSolucion();
		String ildTipoDeSolucion = request.getParameter("tipodesolucion");
		cattipsol.setildTipoDeSolucion(Integer.parseInt(ildTipoDeSolucion));
		
		
		String Aprobado = request.getParameter("aprobacion");
		inc.setAprobado(Aprobado);
		

		String FechaAprobacion = request.getParameter("fechaaprobacion");
		java.sql.Date fechaaprobacion = java.sql.Date.valueOf(FechaAprobacion);
		inc.setFechaAprobacion(fechaaprobacion);
	
		String DescripcionIncidencia = request.getParameter("descripcionincidencia");
		inc.setDescripcionIncidencia(DescripcionIncidencia);
		
		CATEstatus cates = new CATEstatus();
		String ildEstatus = request.getParameter("estatus");
		cates.setildEstatus(Integer.parseInt(ildEstatus));
		
		String Prioridad = request.getParameter("prioridad");
		inc.setPrioridad(Prioridad);
		
		
		String FELab = request.getParameter("fechamesa");
		java.sql.Date fechamesa =java.sql.Date.valueOf(FELab);
		inc.setFELab(fechamesa);
		
		
		String HELab = request.getParameter("timepickermesa");
		java.sql.Time horamesa = java.sql.Time.valueOf(HELab+":00");
		inc.setHELab(horamesa);

		CATUsuarioCAT caturcat = new CATUsuarioCAT();
		String UsuarioCAT = request.getParameter("usuariocat");
		caturcat.setildUsuarioCat(Integer.parseInt(UsuarioCAT));

		CATAtendio catate = new CATAtendio();
		String atendio = request.getParameter("atendio");
		catate.setildAtendio(Integer.parseInt(atendio));
		
		String FAtencion = request.getParameter("fechaatencion");
		java.sql.Date fechaatencion =java.sql.Date.valueOf(FAtencion);
		inc.setFAtencion(fechaatencion);
			
		String HAtencion = request.getParameter("timepickeratencion");
		java.sql.Time horatencion = java.sql.Time.valueOf(HAtencion+":00");
		inc.setHAtencion(horatencion);

		//Archivo
	
		String RespuestaUtic = request.getParameter("respuesta");
		inc.setRespuestaUtic(RespuestaUtic);
		
		try{
			/*String databaseURL = "jdbc:datadirect:openedge://localhost:30060;schemaDefault=PUB;databaseName=incidencias.db;user=sysprogress;password=sysprogress";
			Class.forName("com.ddtek.jdbc.openedge.OpenEdgeDriver");
			System.out.println("Controlador cargado dentro de Insertar Formulario");
			ct = DriverManager.getConnection(databaseURL);
			//st = ct.createStatement();
			System.out.println("Conexion exitosa dentro de Insertar Formulario");*/
	        PreparedStatement psi = d.getCt().prepareStatement("INSERT INTO PUB.Incidencia (ildSistema,"
	        		+ "ildAtendio,"
	        		+ "ildDepartamento,"
	        		+ "ildEstatus,"
	        		+ "ildTipoDeSolucion,"
	        		+ "ildUnidadAdmin,"
	        		+ "ildUsuarioCat,"
	        		+ "ildIncidente,"
	        		+ "ildModulo,"
	        		+ "ildProceso,"
	        		+ "Folio, "
	        		+ "Aprobado,"
	        		+ "FechaAprobacion,"
	        		+ "DescripcionIncidencia,"
	        		+ "Prioridad,"
	        		+ "FELab,"
	        		+ "HELab,"
	        		+ "FAtencion,"
	        		+ "HAtencion,"
	        		+ "RespuestaUtic) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
	        
	        //ps.setString(1, "2");
	        psi.setString(1, "1"); 
	        psi.setString(2, Integer.toString(catate.getildAtendio()));
	        psi.setString(3, Integer.toString(catdep.getildDepartamento()));
	        psi.setString(4, Integer.toString(cates.getildEstatus()));
	        psi.setString(5, Integer.toString(cattipsol.getildTipoDeSolucion()));
	        psi.setString(6, Integer.toString(catur.getildUnidadAdm()));
	        psi.setString(7, Integer.toString(caturcat.getildUsuarioCat()));
	        psi.setString(8, Integer.toString(cattipin.getildIncidente()));
	        psi.setString(9, Integer.toString(catmod.getildModulo()));
	        psi.setString(10,Integer.toString(catpro.getildProceso()));
	       // ps.setString(10, "2");
	        psi.setString(11, inc.getFolio());
	        psi.setString(12, inc.getAprobado());
	        psi.setDate(13, (java.sql.Date)inc.getFechaAprobacion());
	        psi.setString(14, inc.getDescripcionIncidencia());
	        psi.setString(15 ,inc.getPrioridad());
	        psi.setDate(16, (java.sql.Date)inc.getFELab());
	        psi.setTime(17, (java.sql.Time)inc.getHELab());            
	        psi.setDate(18, (java.sql.Date)inc.getFAtencion());
	        psi.setTime(19,(java.sql.Time) inc.getHAtencion());
	        psi.setString(20, inc.getRespuestaUtic());
	        
	        
	        PreparedStatement psu = d.getCt().prepareStatement("INSERT INTO PUB.CATUsuarioUnidadResponsable (ildUnidadAdm,"
	        													+"NombreResponsable,"
	        													+"APaterno,"
													            +"AMaterno,"
													            +"CiscoUr,"
													            +"EmailUr) VALUES (?,?,?,?,?,?)");
	        psu.setString(1, Integer.toString(catusunr.getildUnidadAdm()));
	        psu.setString(2, catusunr.getNombreResponsable());
	        psu.setString(3, catusunr.getAPaterno());
	        psu.setString(4, catusunr.getAMaterno());
	        psu.setString(5, Integer.toString(catusunr.getCiscoUr()));
	        psu.setString(6, catusunr.getEmailUr());      
	        psi.executeUpdate();
	        psu.executeUpdate();
			System.out.println("Insercion correcta");
			DBConexion.liberarConexion(d.getCt());
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("formulario.jsp");
		rd.forward(request, response);
	}

}