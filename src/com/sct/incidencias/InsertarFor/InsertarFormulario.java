package com.sct.incidencias.InsertarFor;

import java.io.IOException;

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
		
		d.insetarFormulario();
		
		RequestDispatcher rd = request.getRequestDispatcher("formulario.jsp");
		rd.forward(request, response);
	}

}