package com.sct.incidencias.catalogos;

import java.io.Serializable;
import java.util.Date;

public class INCIDENCIA implements Serializable{

	private static final long serialVersionUID = 6022324092708159996L;
	
	private int ildIncidencia;
	private String Folio;
	private Date FELab;
	private Date HELab; 
	private Date FAtencion;
	private Date HAtencion;
	private String Observaciones;
	private String Aprobado;
	private Date FechaAprobacion;
	private String DescripcionIncidencia;
	private String RespuestaUtic;
	private String Prioridad;
	private int idUsuarioResponsable;
	private int ildModulo;
	private int ildProceso;
	private int ildUnidadAdmin;
	private int ildSistema;
	private int ildUsuarioCat;
	private int ildTipoDeSolucion;
	private int ildEstatus;
	private int ildDepartamento;
	private int ildAtendio;
	
	public int getildAtendio(){
		return ildAtendio;
	}
	
	public void setildAtendio(int ildAtendio){
	 this.ildAtendio = ildAtendio;
	}
	
	public int getildDepartamento(){
		return ildDepartamento;
	}
	
	public void setildDepartamento(int ildDepartamento){
		this.ildDepartamento = ildDepartamento;
	}
	
	public int getildEstatus(){
		return ildEstatus;
	}
	
	public void setildEstatus(int ildEstatus){
		this.ildEstatus = ildEstatus;
	}
	
	public int getildTipoDeSolucion(){
		return ildTipoDeSolucion;
	}
	
	public void setildTipoDeSolucion(int ildTipoDeSolucion){
		this.ildTipoDeSolucion = ildTipoDeSolucion;
	}
	
	public int getildUsuarioCat(){
		return ildUsuarioCat;
	}
	
	public void setildUsuarioCat(int ildUsuarioCat){
		this.ildUsuarioCat = ildUsuarioCat;
	}
	
	public int getildSistema(){
		return ildSistema;
	}
	
	public void setildSistema(int ildSistema){
		this.ildSistema = ildSistema;
	}
	
	public int getildUnidadAdmin(){
		return ildUnidadAdmin;
	}
	
	public void setildUnidadAdmin(int ildUnidadAdmin){
		this.ildUnidadAdmin = ildUnidadAdmin;
	}
	
	public int getildProceso(){
		return ildProceso;
	}
	
	public void setildProceso(int ildProceso){
		this.ildProceso = ildProceso;
	}
	
	public int getildModulo(){
		return ildModulo;
	}
	
	public void setildModulo(int ildModulo){
		this.ildModulo = ildModulo;
	}
	
	public int getidUsuarioResponsable(){
		return idUsuarioResponsable;
	}
	
	public void setidUsuarioResponsable(int idUsuarioResponsable){
		this.idUsuarioResponsable = idUsuarioResponsable;
	}
	
	public int getildIncidencia(){
		return ildIncidencia;
	}
	
	public void setildIncidencia(int ildIncidencia){
		this.ildIncidencia = ildIncidencia;
	}
	
	public String getFolio(){
		return Folio;
	}
	
	public void setFolio(String Folio){
		this.Folio = Folio;
	}
	
	public Date getFELab(){
		return FELab;
	}
	public void setFELab(Date FELab){
		this.FELab = FELab;
	}
	
	public Date getHELab(){
		return HELab;
	}
	
	public void setHELab(Date HELab){
		this.HELab = HELab;
	}
	
	public Date getFAtencion(){
		return FAtencion;
	}
	
	public void setFAtencion(Date FAtencion){
		this.FAtencion = FAtencion;
	}
	
	public Date getHAtencion(){
		return HAtencion;
	}
	
	public void setHAtencion(Date HAtencion){
		this.HAtencion = HAtencion;
	}
	
	public String getObservaciones(){
		return Observaciones;
	}
	
	public void setObservaciones(String Observaciones){
		this.Observaciones = Observaciones;
	}
	
	public String getAprobado(){
		return Aprobado;
	}
	
	public void setAprobado(String Aprobado){
		this.Aprobado = Aprobado;
	}
	
	public Date getFechaAprobacion(){
		return FechaAprobacion;
	}
	
	public void setFechaAprobacion(Date FechaAprobacion){
		this.FechaAprobacion = FechaAprobacion;
	}
	
	public String getDescripcionIncidencia(){
		return DescripcionIncidencia;
	}
	
	public void setDescripcionIncidencia(String DescripcionIncidencia){
		this.DescripcionIncidencia = DescripcionIncidencia;
	}
	
	public String getRespuestaUtic(){
		return RespuestaUtic;
	}
	
	public void setRespuestaUtic(String RespuestaUtic){
		this.RespuestaUtic = RespuestaUtic;
	}
	
	public String getPrioridad(){
		return Prioridad;
	}
	
	public void setPrioridad(String Prioridad){
		this.Prioridad = Prioridad;
	}
}
