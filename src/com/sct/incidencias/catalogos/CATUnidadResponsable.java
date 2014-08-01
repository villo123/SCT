package com.sct.incidencias.catalogos;

import java.io.Serializable;

public class CATUnidadResponsable implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int ildUnidadAdm;
	private String DescUR;
	private String NombreResponsable;
	private String APaterno;
	private String AMaterno;
	private int CiscoUr;
	private String EmailUr;
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
	
	public int getCiscoUr(){
		return CiscoUr;
	}
	
	public void setCiscoUr(int CiscoUr){
		this.CiscoUr = CiscoUr;
	}
	
	public String getEmailUr(){
		return EmailUr;
	}
	
	public void setEmailUr(String EmailUr){
		this.EmailUr = EmailUr;
	}
	
	public String getPuestoUr(){
		return Puesto;
	}
	
	public void setPuesto(String Puesto){
		this.Puesto = Puesto;
	}
}
