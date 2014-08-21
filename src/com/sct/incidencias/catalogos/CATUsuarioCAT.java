package com.sct.incidencias.catalogos;

import java.io.Serializable;

public class CATUsuarioCAT implements Serializable{

	private static final long serialVersionUID = 1906788523030102236L;
	
	private int ildUsuarioCat;
	private String NombreUsuario;
	private String APaterno;
	private String AMaterno;
	private int CiscoCat;
	private String EmailCat;
	
	public int getildUsuarioCat(){
		return ildUsuarioCat;
	}
	
	public void setildUsuarioCat(int ildUsuarioCat){
		this.ildUsuarioCat = ildUsuarioCat;
	}
	
	public String getNombreUsuario(){
		return NombreUsuario;
	}
	
	public void setNombreUsuario(String NombreUsuario){
		this.NombreUsuario = NombreUsuario;
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
	
	public int getCiscoCat(){
		return CiscoCat;
	}
	
	public void setCiscoCat(int CiscoCat){
		this.CiscoCat = CiscoCat;
	}
	
	public String getEmailCat(){
		return EmailCat;
	}
	
	public void setEmailCat(String EmailCat){
		this.EmailCat = EmailCat;
	}
}
