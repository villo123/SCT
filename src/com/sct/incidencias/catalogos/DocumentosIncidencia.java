package com.sct.incidencias.catalogos;

import java.io.File;
import java.io.Serializable;

public class DocumentosIncidencia implements Serializable{

	private static final long serialVersionUID = 3145002947167199725L;
	
	private int ildDocIncidencia;
	private File Documento;
	
	public int getildDocIncidencia(){
		return ildDocIncidencia;
	}
	
	public void setildDocIncidencia(int ildDocIncidencia){
		this.ildDocIncidencia = ildDocIncidencia;
	}
	
	public File getDocumento(){
		return Documento;
	}
	
	public void setDocumento(File Documento){
		this.Documento = Documento;
	}
}
