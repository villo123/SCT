package com.sct.incidencias.catalogos;

import java.io.Serializable;

public class CATUnidadResponsable implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int ildUnidadAdm;
	private String DescUR;

	
	public int getildUnidadAdm(){
		return ildUnidadAdm;
	}
	
	public void setildUnidadAdm(int ildUnidadAdm){
		this.ildUnidadAdm = ildUnidadAdm;
	}
	
	public String getDescUR(){
		return DescUR;
	}
	
	public void setDescUR(String DescUR){
		this.DescUR = DescUR;
	}
	
	
}
