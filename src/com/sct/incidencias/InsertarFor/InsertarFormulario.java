package com.sct.incidencias.InsertarFor;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	INCIDENCIA inc = new INCIDENCIA();
	DBConexion d = new DBConexion();
	CATUsuarioUnidadResponsable catusunr = new CATUsuarioUnidadResponsable();
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
		catur.setildUnidadAdmin(Integer.parseInt(unidadrespoildUnidadAdm));
		catusunr.setildUnidadAdmin(Integer.parseInt(unidadrespoildUnidadAdm));
		
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
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		PreparedStatement psi = null;
		PreparedStatement psu = null;
		ResultSet rs = null;
		ResultSet rs2 = null;
		try{
			/*String databaseURL = "jdbc:datadirect:openedge://localhost:30060;schemaDefault=PUB;databaseName=incidencias.db;user=sysprogress;password=sysprogress";
			Class.forName("com.ddtek.jdbc.openedge.OpenEdgeDriver");
			System.out.println("Controlador cargado dentro de Insertar Formulario");
			ct = DriverManager.getConnection(databaseURL);
			//st = ct.createStatement();
			System.out.println("Conexion exitosa dentro de Insertar Formulario");*/
			/*ps = d.getCt().prepareStatement("SELECT MAX(ildIncidencia),MAX(idUsuarioResponsable) FROM PUB.Incidencia");
			rs = ps.executeQuery();
			while(rs.next()){
				inc.setildIncidencia(Integer.parseInt(rs.getString(1)) + 1);
				inc.setidUsuarioResponsable(Integer.parseInt(rs.getString(2)) + 1);
			}
			
			ps2 = d.getCt().prepareStatement("SELECT MAX(idUsuarioResponsable) FROM PUB.CATUsuarioUnidadResponsable");
			rs2 = ps2.executeQuery();
			while(rs2.next()){
						catusunr.setidUsuarioResponsable(Integer.parseInt(rs2.getString(1)) + 1);
			}*/
			
			
			
	        psi = d.getCt().prepareStatement("INSERT INTO PUB.Incidencia (ildIncidencia,ildSistema,"
	        		+ "ildAtendio,"
	        		+ "ildDepartamento,"
	        		+ "ildEstatus,"
	        		+ "ildTipoDeSolucion,"
	        		+ "ildUnidadAdmin,"
	        		+ "ildUsuarioCat,"
	        		+ "ildIncidente,"
	        		+ "ildModulo,"
	        		+ "ildProceso,"
	        		+ "idUsuarioResponsable,"
	        		+ "Folio, "
	        		+ "Aprobado,"
	        		+ "FechaAprobacion,"
	        		+ "DescripcionIncidencia,"
	        		+ "Prioridad,"
	        		+ "FELab,"
	        		+ "HELab,"
	        		+ "FAtencion,"
	        		+ "HAtencion,"
	        		+ "RespuestaUtic) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
	        
	        psi.setString(1, Integer.toString(inc.getildIncidencia()));
	        psi.setString(2, "1"); 
	        psi.setString(3, Integer.toString(catate.getildAtendio()));
	        psi.setString(4, Integer.toString(catdep.getildDepartamento()));
	        psi.setString(5, Integer.toString(cates.getildEstatus()));
	        psi.setString(6, Integer.toString(cattipsol.getildTipoDeSolucion()));
	        psi.setString(7, Integer.toString(catur.getildUnidadAdmin()));
	        psi.setString(8, Integer.toString(caturcat.getildUsuarioCat()));
	        psi.setString(9, Integer.toString(cattipin.getildIncidente()));
	        psi.setString(10, Integer.toString(catmod.getildModulo()));
	        psi.setString(11,Integer.toString(catpro.getildProceso()));
	        psi.setString(12, Integer.toString(catusunr.getidUsuarioResponsable()));
	        psi.setString(13, inc.getFolio());
	        psi.setString(14, inc.getAprobado());
	        psi.setDate(15, (java.sql.Date)inc.getFechaAprobacion());
	        psi.setString(16, inc.getDescripcionIncidencia());
	        psi.setString(17 ,inc.getPrioridad());
	        psi.setDate(18, (java.sql.Date)inc.getFELab());
	        psi.setTime(19, (java.sql.Time)inc.getHELab());            
	        psi.setDate(20, (java.sql.Date)inc.getFAtencion());
	        psi.setTime(21,(java.sql.Time) inc.getHAtencion());
	        psi.setString(22, inc.getRespuestaUtic());
	        
	        
	        psu = d.getCt().prepareStatement("INSERT INTO PUB.CATUsuarioUnidadResponsable (idUsuarioResponsable,ildUnidadAdmin,"
	        													+"NombreResponsable,"
	        													+"APaterno,"
													            +"AMaterno,"
													            +"CiscoUr,"
													            +"EmailUr) VALUES (?,?,?,?,?,?,?)");
	        psu.setString(1, Integer.toString(catusunr.getidUsuarioResponsable()));
	        psu.setString(2, Integer.toString(catusunr.getildUnidadAdmin()));
	        psu.setString(3, catusunr.getNombreResponsable());
	        psu.setString(4, catusunr.getAPaterno());
	        psu.setString(5, catusunr.getAMaterno());
	        psu.setString(6, Integer.toString(catusunr.getCiscoUr()));
	        psu.setString(7, catusunr.getEmailUr());      
	        psi.executeUpdate();
	        psu.executeUpdate();
			System.out.println("Insercion correcta");
			
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println();
		}finally{
			try{
				if(d.getCt() != null){
					DBConexion.liberarConexion(d.getCt());
				}else if(ps != null){
					ps.close();
				}else if(ps2 != null){
					ps2.close();
				}else if(psi != null){
					psi.close();
				}else if(psu != null){
					psu.close();
				}else if(rs != null){
					rs.close();
				}else if(rs2 != null){
					rs2.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("formulario.jsp");
		rd.forward(request, response);
	}

}