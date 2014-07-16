package com.sct.incidencias.catalogos;

import java.io.Serializable;

public class CATUsuarioCAT implements Serializable{

	private static final long serialVersionUID = 1906788523030102236L;
	
	private int ildUsuarioCat;
	private String NombreUsuario;
	private String APaterno;
	private String AMaterno;
	private int Cisco;
	private String Email;
	
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
	
	public int getCisco(){
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
}
