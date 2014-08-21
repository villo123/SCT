package com.sct.incidencias.catalogos;

import java.io.Serializable;

public class CATUsuarioUTIC implements Serializable{

	private static final long serialVersionUID = 7812871434641926227L;
	
	private int idUsuarioUtic;
	private String NomusuarioUtic;
	private String APaterno;
	private String AMaterno;
	private String EmailUtic;
	private int ClaveEmpleado;
	private String CuentaUsuario;
	private String Contrasena;
	
	public int getidUsuarioUtic(){
		return idUsuarioUtic;
	}
	
	public void setidUsuarioUtic(int idUsuarioUtic){
		this.idUsuarioUtic = idUsuarioUtic;
	}
	
	public String getNomusuarioUtic(){
		return NomusuarioUtic;
	}
	
	public void setNomusuarioUtic(String NomusuarioUtic){
		this.NomusuarioUtic = NomusuarioUtic;
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
	
	public String getEmailUtic(){
		return EmailUtic;
	}
	
	public void setEmailUtic(String EmailUtic){
		this.EmailUtic = EmailUtic;
	}
	
	public int getClaveEmpleado(){
		return ClaveEmpleado;
	}
	
	public void setClaveEmpleado(int ClaveEmpleado){
		this.ClaveEmpleado = ClaveEmpleado;
	}
	
	public String getCuentaUsuario(){
		return CuentaUsuario;
	}
	
	public void setCuentaUsuario(String CuentaUsuario){
		this.CuentaUsuario = CuentaUsuario;
	}
	
	public String getContrasena(){
		return Contrasena;
	}
	
	public void setContrasena(String Contrasena){
		this.Contrasena = Contrasena;
	}
}
