package com.sct.incidencias.catalogos;

import java.io.Serializable;

public class CATUnidadResponsable implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int ildUnidadAdm;
	private String DescUR;
	private String NombreResponsable;
	private String APaterno;
	private String AMaterno;
	private int Cisco;
	private String Email;
	private String Puesto;
	
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
	
	public String getNombreResponsable(){
		return NombreResponsable;
	}
	
	public void setNombreResponsable(String NombreResponsable){
		this.NombreResponsable = NombreResponsable;
	}
	
	public String getAPaterno(){
		return APaterno;
	}
	
	public void setAPaterno(String APaterno){
		this.APaterno = APaterno;
	}
	
	public String getAMaterno(){
		return AMaterno;
	}
	
	public void setAMaterno(String AMaterno){
		this.AMaterno = AMaterno;
	}
	
	public int setCisco(){
		return Cisco;
	}
	
	public void setCisco(int Cisco){
		this.Cisco = Cisco;
	}
	
	public String getEmail(){
		return Email;
	}
	
	public void setEmail(String Email){
		this.Email = Email;
	}
	
	public String getPuesto(){
		return Puesto;
	}
	
	public void setPuesto(String Puesto){
		this.Puesto = Puesto;
	}
}
