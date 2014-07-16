package com.sct.incidencias.catalogos;

import java.io.Serializable;

public class CATDepartamento implements Serializable{

	private static final long serialVersionUID = -4815781473360399941L;
	
	private int ildDepartamento;
	private String NombreDepartamento;
	
	public int getildDepartamento(){
		return ildDepartamento;
	}
	
	public void setildDepartamento(int ildDepartamento){
		this.ildDepartamento = ildDepartamento;
	}
	
	public String getNombreDepartamento(){
		return  NombreDepartamento;
	}
	
	public void setNombreDepartamento(String NombreDepartamento){
		this.NombreDepartamento = NombreDepartamento;
	}


}
