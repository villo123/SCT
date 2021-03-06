package com.sct.incidencias.UpdateForm;

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
import com.sct.incidencias.catalogos.CATAtendio;
import com.sct.incidencias.catalogos.CATDepartamento;
import com.sct.incidencias.catalogos.CATEstatus;
import com.sct.incidencias.catalogos.CATModulo;
import com.sct.incidencias.catalogos.CATProceso;
import com.sct.incidencias.catalogos.CATTipoDeIncidente;
import com.sct.incidencias.catalogos.CATTipoDeSolucion;
import com.sct.incidencias.catalogos.CATUnidadResponsable;
import com.sct.incidencias.catalogos.CATUsuarioCAT;
import com.sct.incidencias.catalogos.CATUsuarioUnidadResponsable;
import com.sct.incidencias.catalogos.INCIDENCIA;


@WebServlet("/UpdateFormulario")
public class UpdateForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UpdateForm() {
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
		
		String DescripcionIncidencia = request.getParameter("descripcionincidencia");
		inc.setDescripcionIncidencia(DescripcionIncidencia);

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
		
		//Apartir de aqui update
		CATEstatus cates = new CATEstatus();
		String ildEstatus = request.getParameter("estatus2");
		cates.setildEstatus(Integer.parseInt(ildEstatus));
		
		CATAtendio catate = new CATAtendio();
		String atendio = request.getParameter("atendio");
		catate.setildAtendio(Integer.parseInt(atendio));
		
		String FAtencion = request.getParameter("fechaatencion");
		java.sql.Date fechaatencion =java.sql.Date.valueOf(FAtencion);
		inc.setFAtencion(fechaatencion);
		
		String HAtencion = request.getParameter("horaatencion");
		java.sql.Time horatencion = java.sql.Time.valueOf(HAtencion+":00");
		inc.setHAtencion(horatencion);
		
		CATTipoDeIncidente cattipin = new CATTipoDeIncidente();
		String ildIncidente = request.getParameter("tipodeincidencias");
		cattipin.setildIncidente(Integer.parseInt(ildIncidente));
		
		CATTipoDeSolucion cattipsol = new CATTipoDeSolucion();
		String ildTipoDeSolucion = request.getParameter("tipodesolucion");
		cattipsol.setildTipoDeSolucion(Integer.parseInt(ildTipoDeSolucion));
		
		String RespuestaUtic = request.getParameter("respuesta");
		inc.setRespuestaUtic(RespuestaUtic);
		
		String Aprobado = request.getParameter("aprobacion");
		inc.setAprobado(Aprobado);
		
		String FechaAprobacion = request.getParameter("fechaaprobacion");
		java.sql.Date fechaaprobacion = java.sql.Date.valueOf(FechaAprobacion);
		inc.setFechaAprobacion(fechaaprobacion);
		
		String FLlamada = request.getParameter("fechadellamada");
		java.sql.Date fechallamada = java.sql.Date.valueOf(FLlamada);
		inc.setFLlamada(fechallamada);
		
		String HLlamada = request.getParameter("hrllamada");
		java.sql.Time horallamada = java.sql.Time.valueOf(HLlamada+":00");
		inc.setHLlamada(horallamada);
		
		String ComLlamada = request.getParameter("comentariollamada");
		inc.setComLlamada(ComLlamada);
		
		String idusuarioresp = request.getParameter("iduseresp");
		catusunr.setidUsuarioResponsable(Integer.parseInt(idusuarioresp));
		
		
		
		PreparedStatement pu = null;
		PreparedStatement pu2 = null;
		
		try{
			/*pu = d.getCt().prepareStatement("UPDATE PUB.Incidencia,"
					+ "PUB.CATUsuarioUnidadResponsable SET PUB.Incidencia.Folio = ?,"
					+ "PUB.CATUsuarioUnidadResponsable.NombreResponsable = ?,PUB.CATUsuarioUnidadResponsable.APaterno = ?,"
					+ "PUB.CATUsuarioUnidadResponsable.AMaterno = ?,PUB.CATUsuarioUnidadResponsable.CiscoUr = ?,"
					+ "PUB.CATUsuarioUnidadResponsable.EmailUr = ?,PUB.Incidencia.ildUnidadAdmin = ?,"
					+ "PUB.Incidencia.ildDepartamento = ?,PUB.Incidencia.ildModulo = ?,PUB.Incidencia.ildProceso = ?,"
					+ "PUB.Incidencia.DescripcionIncidencia = ?,PUB.Incidencia.Prioridad = ?,PUB.Incidencia.FELab = ?,"
					+ "PUB.Incidencia.HELab = ?,PUB.Incidencia.ildUsuarioCat = ?,PUB.Incidencia.ildEstatus = ?,"
					+ "PUB.Incidencia.ildAtendio = ?,PUB.Incidencia.FAtencion = ?,PUB.Incidencia.HAtencion = ?,"
					+ "PUB.Incidencia.ildIncidente = ?,PUB.Incidencia.ildTipoDeSolucion = ?,PUB.Incidencia.RespuestaUtic = ?,"
					+ "PUB.Incidencia.Aprobado = ?,PUB.Incidencia.FechaAprobacion = ?,PUB.Incidencia.FLlamada = ?,PUB.Incidencia.HLlamada=?,"
					+ "PUB.Incidencia.ComLlamada = ?,PUB.Incidencia.ildSistema = ? FROM PUB.Incidencia "
					+ "LEFT JOIN PUB.CATSistema ON Incidencia.ildSistema = CATSistema.ildSistema "
					+ "LEFT JOIN PUB.CATTipoDeSolucion ON Incidencia.ildTipoDeSolucion = CATTipoDeSolucion.ildTipoDeSolucion "
					+ "LEFT JOIN PUB.CATTipoDeIncidente ON Incidencia.ildIncidente = CATTipoDeIncidente.ildIncidente "
					+ "LEFT JOIN PUB.CATUsuarioCAT ON Incidencia.ildUsuarioCat = CATUsuarioCAT.ildUsuarioCat "
					+ "LEFT JOIN PUB.CATAtendio ON Incidencia.ildAtendio = CATAtendio.ildAtendio "
					+ "LEFT JOIN PUB.CATUnidadResponsable ON Incidencia.ildUnidadAdmin = CATUnidadResponsable.ildUnidadAdmin "
					+ "LEFT JOIN PUB.CATDepartamento ON Incidencia.ildDepartamento = CATDepartamento.ildDepartamento "
					+ "LEFT JOIN PUB.CATModulo ON Incidencia.ildModulo = CATModulo.ildModulo "
					+ "LEFT JOIN PUB.CATProceso ON Incidencia.ildProceso = CATProceso.ildProceso "
					+ "LEFT JOIN PUB.CATEstatus ON Incidencia.ildEstatus = CATEstatus.ildEstatus "
					+ "LEFT JOIN PUB.CATUsuarioUnidadResponsable ON Incidencia.idUsuarioResponsable = CATUsuarioUnidadResponsable.idUsuarioResponsable "
					+ "WHERE Folio = "+folio);*/
			System.out.println(inc.getFolio());
			pu = d.getCt().prepareStatement("UPDATE PUB.Incidencia "
					+ "SET Folio = ?,ildUnidadAdmin = ?,"
					+ "ildDepartamento = ?,ildModulo = ?,ildProceso = ?,"
					+ "DescripcionIncidencia = ?,Prioridad = ?,FELab = ?,"
					+ "HELab = ?,ildUsuarioCat = ?,ildEstatus = ?,"
					+ "ildAtendio = ?,FAtencion = ?,HAtencion = ?,"
					+ "ildIncidente = ?,ildTipoDeSolucion = ?,RespuestaUtic = ?,"
					+ "Aprobado = ?,FechaAprobacion = ?,FLlamada = ?,HLlamada=?,"
					+ "ComLlamada = ?,ildSistema = ? "
					+ "WHERE Folio = ?");
			
	        pu.setString(1, inc.getFolio());
	        pu.setString(2, Integer.toString(catur.getildUnidadAdmin()));
	        pu.setString(3, Integer.toString(catdep.getildDepartamento()));
	        pu.setString(4, Integer.toString(catmod.getildModulo()));
	        pu.setString(5,Integer.toString(catpro.getildProceso()));
	        pu.setString(6, inc.getDescripcionIncidencia());
	        pu.setString(7 ,inc.getPrioridad());
	        pu.setDate(8, (java.sql.Date)inc.getFELab());
	        pu.setTime(9, (java.sql.Time)inc.getHELab());  
	        pu.setString(10, Integer.toString(caturcat.getildUsuarioCat()));
	        pu.setString(11, Integer.toString(cates.getildEstatus()));
	        pu.setString(12, Integer.toString(catate.getildAtendio()));
	        pu.setDate(13, (java.sql.Date)inc.getFAtencion());
	        pu.setTime(14,(java.sql.Time) inc.getHAtencion());
	        pu.setString(15, Integer.toString(cattipin.getildIncidente()));
	        pu.setString(16, Integer.toString(cattipsol.getildTipoDeSolucion()));
	        pu.setString(17, inc.getRespuestaUtic());
	        pu.setString(18, inc.getAprobado());
	        pu.setDate(19, (java.sql.Date)inc.getFechaAprobacion());
		    pu.setDate(20, (java.sql.Date)inc.getFLlamada());
		    pu.setTime(21, (java.sql.Time)inc.getHLlamada());
		    pu.setString(22, inc.getComLlamada());
	        pu.setString(23, "1"); //ildSistema
	        pu.setString(24, inc.getFolio());
	        
			pu2 = d.getCt().prepareStatement("UPDATE PUB.CATUsuarioUnidadResponsable "
					+ "SET NombreResponsable = ?,APaterno = ?,"
					+ "AMaterno = ?,CiscoUr = ?,"
					+ "EmailUr = ? "
					+ "WHERE idUsuarioResponsable = ?");
			
			//idUsuarioResponsable
			

	        
	        
	        pu2.setString(1, catusunr.getNombreResponsable());
	        pu2.setString(2, catusunr.getAPaterno());
	        pu2.setString(3, catusunr.getAMaterno());
	        pu2.setString(4, responsableCisco);
	        pu2.setString(5, catusunr.getEmailUr());   
	        pu2.setString(6, Integer.toString(catusunr.getidUsuarioResponsable()));
	        
	        pu.executeUpdate();
	        pu2.executeUpdate();
	        System.out.println("Update correcto");
			}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(d.getCt() != null){
					DBConexion.liberarConexion(d.getCt());
				}else if(pu != null){
					pu.close();
				}
				else if(pu2 !=null){
					pu2.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher("vista.jsp");
		rd.forward(request, response);
	}
}
