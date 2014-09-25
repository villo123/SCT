package com.sct.incidencias.upload;

public class uploadfile extends HttpServlet {
	public void init(ServletConfig config) throws ServletException{
	}		
	super.init(config);
}
protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws    
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
	               
	               
	            } catch(Exception e){
	                lSuccess = false;
	            }  finally{           
	                response.getWriter().println("Subió documento: " + lSuccess);
	            }           
	       }
	      
	       protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	           processRequest(request,response);
	       }
}
