package com.sct.incidencias.catalogos;

import java.io.Serializable;

public class CATTipoDeIncidente implements Serializable{

	private static final long serialVersionUID = -4742169774788171586L;
	
	private int ildIncidente;
	private String NombreIncidente;
	
	public int getildIncidente(){
		return ildIncidente;
	}
	
	public void setildIncidente(int ildIncidente){
		this.ildIncidente = ildIncidente;
	}
	
	public String getNombreIncidente(){
		return NombreIncidente;
	}
	
	public void setNombreIncidente(String NombreIncidente){
		this.NombreIncidente = NombreIncidente;
	}

}
