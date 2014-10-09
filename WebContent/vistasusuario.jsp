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
		<style type="text/css" title="currentStyle">
			@import "./css/demo_page.css";
			@import "./css/demo_table.css";
		</style>
		<script type="text/javascript" language="javascript" src="js/jquery.js"></script>
		<script type="text/javascript" language="javascript" src="js/jquery.dataTables.js"></script>
		<script type="text/javascript" charset="utf-8">
			$(document).ready(function() {
				$('#tabla').dataTable();
			} );
		</script>
	</head>
<body>
		<div id="contentvista"></div>
		<div id="middlevista">
			<img src="ima/logo.png" alt="SCT" width="260" height="84">
			<h1 align="center">Registro de Incidencia</h1>
			<%
   				 String usuario = "";
   				 HttpSession sessionusr = request.getSession();
  				 usuario = (String)sessionusr.getAttribute("usuario");
    %>  
     Bienvenido <%=usuario%>
     <a href="logout.jsp">Cerrar Sesión</a>
			<button id="btn" onclick="window.open('ExcelReport.jsp')">Exportar a Excel</button>
		<div id="close"></div> 
		 <table border="2px" style="border-collapse: collapse;"> 
             	
	
            </select>		
			<!--  -->
		<div id="close"></div> 
		 <table border="2px" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" border="0" class="display" id="tabla"> 
             	<thead>
		<tr>
                 <th>Folio</th>
                 <th>Usuario UR</th>
                 <th>Cisco</th>
                 <th>E-mail</th>
                 <th>Unidad Respondable</th>
                 <th>Departamento</th>
                 <th>Estatus</th>
                 <th>Modulo</th>
                 <th>Proceso</th>
                 <th>Descripción de la Incidencia </th>
                 <th>Prioridad</th>
                 <th>Fech enviada por el CAT</th>
                 <th>Hora enviada por el CAT</th>
                 <th>Usuario CAT</th>
                 <th>Atendio</th>
                 <th>Fecha de atención</th>
                 <th>Hora de atencion</th>
                 <th>Tipo de Incidencia</th>
                 <th>Tipo de Solucion</th>
                 <th>Respuesta</th>
                 <th>Aprobación</th>
                 <th>Fecha de Aprobación</th>
                 <th>Fecha de Llamada</th>
                 <th>Hora de Llamada </th>
                 <th>Comentario Llamada</th>
                 <th>Sistema</th>
		</tr>
	</thead>
		
	<!--
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
                 <td class="t">Descripción de la Incidencia </td>
                 <td class="t">Prioridad</td>
                 <td class="t">Fech enviada por el CAT</td>
                 <td class="t">Hora enviada por el CAT</td>
                 <td class="t">Usuario CAT</td>
                 <td class="t">Atendio</td>
                 <td class="t">Fecha de atención</td>
                 <td class="t">Hora de atencion</td>
                 <td class="t">Tipo de Incidencia</td>
                 <td class="t">Tipo de Solucion</td>
                 <td class="t">Respuesta</td>
                 <td class="t">Aprobación</td>
                 <td class="t">Fecha de Aprobación</td>
                 <td class="t">Fecha de Llamada</td>
                 <td class="t">Hora de Llamada </td>
                 <td class="t">Comentario Llamada</td>
                 <td class="t">Sistema</td>
             </tr>
               -->
               <tbody>
             <% 
             html utils = new html();
             ArrayList registros = utils.getIncidencias();
             Iterator it = registros.iterator();
				int c = 0;
             while(it.hasNext()){
            	 c++;
            	 String[] columnas = (String[])it.next();
            	 out.println("<tr>");
            	
            	 for (int x=0;x<columnas.length;x++ ){
            		 
            		 if(x>=0){
            			 if(x==0){
            				 out.println("<td><a href=\"./updateformulario.jsp?foliolabel="+columnas[x]+"\">"+columnas[x]+"</a></td>");
            			 }
            			 else{
            				 out.println("<td>"+columnas[x]+"</td>");
            			 } 
            		 }
            		 /*else if(x == 26){
    				 out.println("<td style=\"visibility:hidden;\">"+columnas[x]+"</td>");
    			 }*/
            	 }
            	 out.println("</tr>");
             }
             
             %>
             </tbody>

	  </table>
	  </div>

            </div>
    </div>
		<div id="downvista"></div>   
</body>
</html>
