package com.sct.incidencias.catalogos;

import java.io.Serializable;

public class CATUnidadResponsable implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int ildUnidadAdmin;
	private String DescUR;

	
	public int getildUnidadAdmin(){
		return ildUnidadAdmin;
	}
	
	public void setildUnidadAdmin(int ildUnidadAdmin){
		this.ildUnidadAdmin = ildUnidadAdmin;
	}
	
	public String getDescUR(){
		return DescUR;
	}
	
	public void setDescUR(String DescUR){
		this.DescUR = DescUR;
	}
	
	
}
