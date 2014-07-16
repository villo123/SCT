package com.sct.incidencias.catalogos;

import java.io.Serializable;

public class CATProceso implements Serializable{

	private static final long serialVersionUID = 3332632034139362565L;
	
	private int ildProceso;
	private int ildModulo;
	private String Proceso;
	
	public int getildProceso(){
		return ildProceso;
	}
	
	public void setildProceso(int ildProceso){
		this.ildProceso = ildProceso;
	}
	
	public int getildModulo(){
		return ildModulo;
	}
	
	public void setildModulo(int ildModulo){
		this.ildModulo = ildModulo;
	}
	
	public String getProceso(){
		return Proceso;
	}
	
	public void setProceso(String Proceso){
		this.Proceso = Proceso;
	}

}
