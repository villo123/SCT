<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*" %>
<%@ page import="org.apache.poi.hssf.usermodel.HSSFSheet" %>
<%@ page import="org.apache.poi.hssf.usermodel.HSSFWorkbook" %>
<%@ page import="org.apache.poi.ss.usermodel.*" %>
<%@ page import="org.apache.poi.hssf.usermodel.*" %>
<%@ page import="mx.gob.sct.utic.utils.html" %> 
<%@ page import="java.util.ArrayList" %> 
<%@ page import="java.util.Iterator" %> 


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		Excel Report
	
	<%	
      
	try{
		html utils = new html();
    	ArrayList registros = utils.getIncidencias();
    	Iterator it = registros.iterator();
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet("Excel Sheet");
			 String [] titulos = {"Folio",
				        "Usuario UR",
				        "Cisco",
				        "E-mai",
				        "Unidad Respondable",
				        "Departamento",
				        "Estatus",
				        "Modulo",
				        "Proceso",
				        "Descripción de la Incidencia",
				        "Prioridad",
				        "Fech enviada por el CAT",
				        "Hora enviada por el CAT",
				        "Usuario CAT",
				        "Atendio",
				        "Fecha de atención",
				        "Hora de atencion",
				        "Tipo de Incidencia",
				        "Tipo de Solucion",
				        "Respuesta",
				        "Aprobación",
				        "Fecha de Aprobación",
				        "Fecha de Llamada",
				        "Hora de Llamada",
				        "Comentario Llamada",
				        "Sistema"};
			
			HSSFRow rowhead = sheet.createRow((short)0);	
			
			for(int i = 0; i < titulos.length; i++){
				rowhead.createCell((short)i).setCellValue(titulos[i]);
			}
			HSSFRow row = sheet.createRow((short)1);
			HSSFRow row2 = sheet.createRow((short)2);
			int c = 0;
			while(it.hasNext()){
           	 c++;
           	 String[] columnas = (String[])it.next();
           	 	for(int j = 0; j < columnas.length;j++){
           	 		//
           	 		if(j >= 0){
           	 			//row.createCell((short)j).setCellValue(columnas[j]);
           	 			out.println(columnas[j]);		
           	 		}else{
           	 			//row2.createCell((short)j).setCellValue(columnas[j]);
           	 		}
           	 	}
			}		
			/*row.createCell((short)0).setCellValue(value1);
			row.createCell((short)1).setCellValue(value2);
			row.createCell((short)2).setCellValue(value3);
			row.createCell((short)3).setCellValue(value4);
			row.createCell((short)4).setCellValue(value5);
			row.createCell((short)5).setCellValue(value6);*/
			
			FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Brayan\\File.xls");
			wb.write(fileOut);
			fileOut.close();
			out.println("Data is saved in excel file.");
	}catch ( Exception ex ){
	}%>
</body>
</html>