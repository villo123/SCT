package com.sct.incidencias.upload;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.jni.File;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


public class uploadfile extends HttpServlet {
	public void init(ServletConfig config) throws ServletException{
	}		
	super.init(config);
}

protected void processRequest (HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{   
	// Validación de documentos menores a 4MB
	DiskFileItemFactory factory = new DiskFileItemFactory();
	factory.setSizeThreshold(4 * 1024 * 1024);
	factory.setRepository(new File("."));
	ServletFileUpload upload = new ServletFileUpload(factory);
	upload.setSizeMax(4 * 1024 * 1024);
	List items = upload.parseRequest(request);
	// Procesamiento de los archivos de carga
	boolean lSuccess = true;
	try{
	   Iterator iter = items.iterator();
	           while(iter.hasNext()){
	             FileItem item = (FileItem) iter.next();
	             if(item.isFormField()){
	               System.out.println("Campo:" + item.getFieldName() + " Valor:" + item.getString());
	             } else{
	              
	               bytes [] bArchivo = item.get();
	              
	               String[] keys = {"userid","password","entity","mimeType","lintiCveDocumen"};
	               String[] values = {"USR","PWD","ITEM-TYPE","application/octet-stream","IDENTIFICADOR UNICO DE DOCUMENTO"};
	    
	               DigitalizarDocumentoServiceLocator wsSerConSL = new DigitalizarDocumentoServiceLocator();
	               DigitalizarDocumento wsSerCon = wsSerConSL.getDigitalizarDocumentoSoapPort(new java.net.URL("URL WS CONTENT MANAGER"));
	       
	               cReturn = wsSerCon.asignar(
	                "USR",
	                "PWD",
	                "ITEM-TYPE",
	                keys, values, bArchivo);
	             }
	               
	            }
		}
	catch(Exception e){
		lSuccess = false;
	}
	finally{           
		response.getWriter().println("Subió documento: " + lSuccess);
	   }           
}  
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		processRequest(request,response);
	}
}
