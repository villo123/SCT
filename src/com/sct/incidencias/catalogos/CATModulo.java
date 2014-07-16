package com.sct.incidencias.catalogos;

import java.io.Serializable;

public class CATModulo implements Serializable{

	private static final long serialVersionUID = 435293972976848165L;
	
	private int ildModulo;
	private int ildSistema;
	private String NombreModulo;
	
	public int getildModulo(){
		return ildModulo;
	}
	
	public void setildModulo(int ildModulo){
		this.ildModulo = ildModulo;
	}
	
	public int getildSistema(){
		return ildSistema;
	}
	
	public void setildSistema(int ildSistema){
		this.ildSistema = ildSistema;
	}
	
	public String getNombreModulo(){
		return NombreModulo;
	}
	
	public void setNombreModulo(String NombreModulo){
		this.NombreModulo = NombreModulo;
	}

}
