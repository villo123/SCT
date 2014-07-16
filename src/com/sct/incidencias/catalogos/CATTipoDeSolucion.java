package com.sct.incidencias.catalogos;

import java.io.Serializable;

public class CATTipoDeSolucion implements Serializable{

	private static final long serialVersionUID = 5723764663399578186L;
	
	private int ildTipoDeSolucion;
	private String NombreSolucion;
	
	public int getildTipoDeSolucion(){
		return ildTipoDeSolucion;
	}
	
	public void setildTipoDeSolucion(int ildTipoDeSolucion){
		this.ildTipoDeSolucion = ildTipoDeSolucion;
	}
	
	public String getNombreSolucion(){
		return NombreSolucion;
	}
	
	public void setNombreSolucion(String NombreSolucion){
		this.NombreSolucion = NombreSolucion;
	}

}
