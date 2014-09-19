<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="mx.gob.sct.utic.utils.html" %> 
<%@ page import="java.util.ArrayList" %> 
<%@ page import="java.util.Iterator" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Registro de Insidencia</title>
		<link rel="stylesheet" type="text/css" href="css/vista.css"/>
		<script type="text/javascript" src="js/master.js"></script>
	</head>
<body>
		<div id="contentvista"></div>
		<div id="middlevista">
			<img src="ima/logo.png" alt="SCT" width="260" height="84">
			<h1 align="center">Registro de Incidencia</h1>
		<div id="close"></div> 
		 <table border="2px" style="border-collapse: collapse;"> 
             	
	
             <tr>
                 <td class="t">Folio</td>
                 <td class="t">Usuario UR</td>
                 <td class="t">Cisco</td>
                 <td class="t">E-mail</td>
                 <td class="t">Unidad Respondable</td>
                 <td class="t">Departamento</td>
                 <td class="t">Estatus</td>
                 <td class="t">Modulo</td>
                 <td class="t">Proceso</td>
                 <td class="t">Descripci�n de la Incidencia </td>
                 <td class="t">Prioridad</td>
                 <td class="t">Fech enviada por el CAT</td>
                 <td class="t">Hora enviada por el CAT</td>
                 <td class="t">Usuario CAT</td>
                 <td class="t">Atendio</td>
                 <td class="t">Fecha de atenci�n</td>
                 <td class="t">Hora de atencion</td>
                 <td class="t">Tipo de Incidencia</td>
                 <td class="t">Tipo de Solucion</td>
                 <td class="t">Respuesta</td>
                 <td class="t">Aprobaci�n</td>
                 <td class="t">Fecha de Aprobaci�n</td>
                 <td class="t">Fecha de Llamada</td>
                 <td class="t">Hora de Llamada </td>
                 <td class="t">Comentario Llamada</td>
                 <td class="t">Sistema</td>
             </tr>
             
             <% 
             html utils = new html();
             ArrayList registros = utils.getIncidencias();
             Iterator it = registros.iterator();
			/*            			 if(x==0){
            				 out.println("<td><a href=\"./updateformulario.jsp?foliolabel="+columnas[x]+"\">"+columnas[x]+"</a></td>");
            			 }else{*/
             while(it.hasNext()){
            	 String[] columnas = (String[])it.next();
            	 out.println("<tr>");
            	 for (int x=0;x<columnas.length;x++ ){
            		 if(x>=0){
            				 out.println("<td>"+columnas[x]+"</td>");
            			 } 
            		 }
            		
            	 out.println("</tr>");
             }
             
             %>
  </table>
    HOLA, <%=session.getAttribute("login") %>  
    </div>
		<div id="downvista"></div>   
</body>
</html>