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
			<button id="btn" onclick="abrirformulario();">Nuevo</button>
			<button id="btn">Actualizar</button>
			<button id="btn">Buscar</button>
			<button id="btn">Cancelar</button>
			
			<select id="btn">
				<option>Catálogos</option>
				<option>Atendio Utic</option>
				<option>Tipo de Incidencia</option>
				<option>Tipo de Solución</option>
				<option>Estatus</option>
				<option>Modulo</option>
				<option>Operador Utic</option>
				<option>Proceso</option>
				<option>Sistema</option>
				<option>Tipo de Prioridad</option>
				<option>Usuario Cat</option>
			</select>
			

			
		<div id="close"></div> 
		 <table border="2px" style="border-collapse: collapse;"> 
             	
	
             <tr>
                 <td class="t">Folio</td>
                 <td class="t">Estatus de la Incidencia</td>
                 <td class="t">Prioridad</td>
                 <td class="t">Fecha envida por el CAT</td>
                 <td class="t">Hora envida por el CAT</td>
                 <td class="t">Usuario CAT</td>
                 <td class="t">CISCO</td>
                 <td class="t">Fecha de atención</td>
                 <td class="t">Hora de atención</td>
                 <td class="t">Atendido</td>
                 <td class="t">Centro SCT</td>
                 <td class="t">E-mail</td>
                 <td class="t">Observaciones</td>
                 <td class="t">Usuario UR</td>
                 <td class="t">Cisco</td>
                 <td class="t">Centro SCT</td>
                 <td class="t">Departamento</td>
                 <td class="t">Modulo</td>
                 <td class="t">Proceso</td>
                 <td class="t">Tipo de Incidente</td>
                 <td class="t">Tipo de Solución</td>
                 <td class="t">Sistema</td>
                 <td class="t">Formato</td>
             </tr>
             
             <% 
             html utils = new html();
             ArrayList registros = utils.getIncidencias();
             Iterator it = registros.iterator();

             while(it.hasNext()){
            	 String[] columnas = (String[])it.next();
            	 out.println("<tr>");
            	 for (int x=0;x<columnas.length;x++ ){
            		 if(x>=7){
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