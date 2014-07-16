package com.sct.incidencias.catalogos;

import java.io.Serializable;

public class CATEstatus implements Serializable{

	private static final long serialVersionUID = -7602059843594764053L;

	private int ildEstatus;
	private String NombreEstatus;
	
	public int getildEstatus(){
		return ildEstatus;
	}
	
	public void setildEstatus(int ildEstatus){
		this.ildEstatus = ildEstatus;
	}
	
	public String getNombreEstatus(){
		return NombreEstatus;
	}
	
	public void setNombreEstatus(String NombreEstatus){
		this.NombreEstatus = NombreEstatus;
	}
}
