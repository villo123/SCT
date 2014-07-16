package com.sct.incidencias.catalogos;

import java.io.Serializable;

public class CATAtendio implements Serializable{
	private static final long serialVersionUID = -5945219478080674192L;
	
	private int ildAtendio;
	private String NombreAtendio;
	private String APaterno;
	private String AMaterno;
	
	public int getildAtendio(){
		return ildAtendio;
	}
	
	public void setildAtendio(int ildAtendio){
		this.ildAtendio = ildAtendio;
	}
	
	public String getNombreAtendio(){
		return NombreAtendio;
	}
	
	public void setNombreAtendio(String NombreAtendio){
		this.NombreAtendio = NombreAtendio;
	}
	
	public String getAPaterno(){
		return APaterno;
	}
	
	public void setAPaterno(String APaterno){
		this.AMaterno = APaterno;
	}
	
	public String getAMaterno(){
		return AMaterno;
	}
	
	public void setAMaterno(String AMaterno){
		this.AMaterno = AMaterno;
	}
}
