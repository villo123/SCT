package com.sct.incidencias.catalogos;

import java.io.Serializable;
import java.util.Date;

public class INCIDENCIA implements Serializable{

	private static final long serialVersionUID = 6022324092708159996L;
	
	private int ildIncidencia;
	private int Folio;
	private Date FELab; //ver con tipo de  dato fecha
	private Date HELab; //ver tipo de dato hora
	private Date FAtencion;//ver con tipo de  dato fecha
	private Date HAtencion;//ver tipo de dato hora
	private String Observaciones;
	private String Aprobado;
	private Date FechaAprobacion;//ver con tipo de  dato fecha
	private String DescripcionIncidencia;
	private String RespuestaUtic;
	private String Prioridad;
	
	public int getildIncidencia(){
		return ildIncidencia;
	}
	
	public void setildIncidencia(int ildIncidencia){
		this.ildIncidencia = ildIncidencia;
	}
	
	public int getFolio(){
		return Folio;
	}
	
	public void setFolio(int Folio){
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
