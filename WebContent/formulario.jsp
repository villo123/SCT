<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="com.sct.incidencias.catalogos.CATUsuarioUTIC"%>
   <%@ page import="com.sct.incidencias.Conexion.DBConexion" %>
   <%DBConexion dba = new DBConexion();
   	 DBConexion dbd = new DBConexion();%>
   <%@ page import="java.sql.*;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/master-style.css"/> 
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" media="screen" href="css/timepicker.css" type="text/css" />
		<link href="css/calendario.css" type="text/css" rel="stylesheet">
		<script src="js/calendar.js" type="text/javascript"></script>
		<script src="js/calendar-es.js" type="text/javascript"></script>
		<script src="js/calendar-setup.js" type="text/javascript"></script>
		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript" src="js/jquery.mousewheel.js"></script>
		<script type="text/javascript" src="js/jquery.timepicker.js"></script>
		<script type="text/javascript">
			$(document).ready(function() {
				//$("#tp").timepicker({divId: "mytimepicker"});
				//$("#tp2").timepicker({divId: "mytimepicker"});
				//$("#tp1").timepicker({divId: "mytimepicker"});
			//	$("#tp2").timepicker({divId: "mytimepicker"});
				//$("#tp1").timepickera();
			});
		</script>
		<title>FORMULARIO</title>
	</head>
	<body>
		<div class="panel">
			<div class="title">
				<img src="ima/logo.png" width="260" height="84">
			</div>
			<div class="container">
            <center><form method="POST" action="InsertarFormulario">
                <div id="loginForm">
                    <label id="foliolabel">Folio:</label>
                    <input id="foliotxt" type="text" name="folio" value="" size="30"/><br/>
                    
                    <label id="nombrelabel">Nombre:</label>
                    <input id="nombretxt" type="text" name="nombreur" value="" size="30"/><br/>
                    
                    <label id="passwdconflabel">Apellido Paterno:</label>
                    <input id="passwdconftxt" type="text" name="APur" value="" size="30"/><br/>
                    
                    <label id="pnomlabel">Apellido Materno:</label>
                    <input id="pnomtxt" type="text" name="AMur" value="" size="30"/><br/>
                    
                    <label id="snomlabel">CISCO:</label>
                    <input id="snomtxt" type=text name="ciscour" value="" size="30"/><br/>
                    
                    <label id="paplabel">E-mail:</label>
                    <input id="paptxt" type=text name="emailur" value="" size="30"/><br/>
                    
                    <label id="maplabel">Unidad Responsable:</label>
                    <select id="maptxt" name="unidadresponsable">
                    	<% ResultSet rsu = dba.getSt().executeQuery("SELECT CATUnidadResponsable.ildUnidadAdm,CATUnidadResponsable.DescUR FROM PUB.CATUnidadResponsable");
							while(rsu.next()){%>
								<option value="<%=rsu.getString(1)%>">
									<%=rsu.getString(2)%>
								</option>
							<%}%>
					</select><br />

                    <label id="esplabel">Departamento:</label>
                    <select name="departamento" id="esptxt">
						<% ResultSet rsd = dba.getSt().executeQuery("SELECT CATDepartamento.ildDepartamento,CATDepartamento.NombreDepartamento FROM PUB.CATDepartamento");
							while(rsd.next()){%>
								<option value="<%=rsd.getString(1)%>">
									<%=rsd.getString(2)%>
								</option>
							<%}%>
					</select><br/>
                    
                    <label id="naclabel">Modulo:</label>
					<select id="dateString" class="nactxt" name="modulo">
						<% ResultSet rsm = dba.getSt().executeQuery("SELECT CATModulo.ildModulo,CATModulo.NombreModulo FROM PUB.CATModulo");
							while(rsm.next()){%>
								<option value="<%=rsm.getString(1)%>">
									<%=rsm.getString(2)%>
								</option>
							<%}%>
					</select><br />
                    
					<label id="processlabel">Proceso:</label>
					<select name="proceso" id="processtxt">
						<% ResultSet rsp = dba.getSt().executeQuery("SELECT CATProceso.ildProceso,CATProceso.Proceso FROM PUB.CATProceso");
							while(rsp.next()){%>
								<option value="<%=rsp.getString(1)%>">	
									<%=rsp.getString(2)%>
								</option><%}%>
					</select><br />
					
					<label id="tipoinlabel">Tipo de insidencias:</label>
					<select name="tipodeincidencias" id="tipointxt">
						<% ResultSet rsi = dba.getSt().executeQuery("SELECT CATTipoDeIncidente.ildIncidente,CATTipoDeIncidente.NombreIncidente FROM PUB.CATTipoDeIncidente");
							while(rsi.next()){%>
								<option value="<%=rsi.getString(1)%>">
									<%=rsi.getString(2)%>
								</option><%}%>
					</select><br />
					
					<label id="tiposollabel">Tipo de solución:</label>
					<select name="tipodesolucion" id="tiposoltxt">
						<% ResultSet rss = dba.getSt().executeQuery("SELECT CATTipoDeSolucion.ildTipoDeSolucion,CATTipoDeSolucion.NombreSolucion FROM PUB.CATTipoDeSolucion");
							while(rss.next()){%>
								<option value="<%=rss.getString(1)%>">
									<%=rss.getString(2)%>
								</option><%}%>
					</select><br />
					
					<label id="aprovylabel">Aprobación:</label>
					<select  type="text" name="aprobacion" id="aprovytxt">
						<option value="si">SI</option>
						<option value="no">NO</option>
					</select><br />
					
				<label id="fechanlabel">Fecha de aprobación:</label>
				<input id="fechantxt" type="text" name="fechaaprobacion" value="dd/mm/yyyy" >
					<img src="ima/calendario.png" width="16" height="16" border="0" title="Fecha Inicial" id="fechanim" id="lanzadoraprobacion">
                    <script type="text/javascript"> 
						Calendar.setup({ 
						inputField     :    "aprobacion",     // id del campo de texto 
						ifFormat     :     "%d/%m/%Y",     // formato de la fecha que se escriba en el campo de texto 
						button     :    "lanzadoraprobacion"     // el id del botón que lanzará el calendario 
					}); 
					</script><br />
					
				<label id="insidentlabel">Descripción</label>
				<label id="insidentilabel">de</label>	
				<label id="insidentialabel">insidencia:</label>
				<textarea id="insidenttxt" rows="6" cols="45" name="descripcionincidencia"></textarea><br/>
				
				<label id="estatuslabel">Estatus:</label>
				<select id="estatustxt" name="estatus">
					<option value="Pendiente">Pendiente</option>
					<option value="Resuelto">Resuelto</option>
				</select><br />
				
				<label id="prioridadlabel">Prioridad:</label>	
				<select id="prioridadtxt" name="prioridad">
					<option value="Alta">Alta</option>
					<option value="Media">Media</option>
					<option value="Baja">Baja</option>
				</select><br />
				
				<label id="fechamlabel">Fecha enviada </label>   
				<label id="fechamilabel">por la mesa:</label>  		
					<input type="text" id="fechamtxt"  name="fechamesa"  value="dd/mm/yyyy" />
					<img src="ima/calendario.png" width="16" height="16" border="0" title="Fecha Inicial" id="fechamim"/>
                    <script type="text/javascript"> 
						Calendar.setup({ 
						inputField     :    "aprobacion",     // id del campo de texto 
						ifFormat     :     "%d/%m/%Y",     // formato de la fecha que se escriba en el campo de texto 
						button     :    "lanzadoraprobacion"     // el id del botón que lanzará el calendario 
					}); 
					</script><br />
					
					<label id="tplabel">Hora enviada </label>   
					<label id="tpilabel">por la mesa:</label>  	
					<input type="text" value="00:00" id="tptxt" name="timepickermesa" /><br />
					
					<label id="catlabel">Usuario CAT:</label>  	
					<select id="catxt" name="usuariocat">
						<% ResultSet rsuc = dba.getSt().executeQuery("SELECT CATUsuarioCAT.ildUsuarioCat,CATUsuarioCAT.NombreUsuario,CATUsuarioCAT.APaterno,CATUsuarioCAT.AMaterno FROM PUB.CATUsuarioCAT");
							while(rsuc.next()){%>
								<option value="<%=rsuc.getString(1)%>">
									<%=rsuc.getString(2)+ " " + rsuc.getString(3) + " " + rsuc.getString(4)%>
								</option><%}%>
					</select><br />
					
					<label id="lialabel">E-mail:</label>
                    <input id="liatxt" type="text" value="" size="30" name="emailcat"/><br/>
                    
					<label id="ocsilabel">CISCO:</label>
                    <input id="ocsitxt" type="text"value="" size="30" name="Ciscocat"/><br/>
                    
					<label id="atenlabel">Atendido:</label>
					<select name="atendio" id="atentxt">
						<% ResultSet rsa = dba.getSt().executeQuery("SELECT CATAtendio.ildAtendio,CATAtendio.NombreAtendio,CATAtendio.APaterno,CATAtendio.AMaterno FROM PUB.CATAtendio");
							while(rsa.next()){%>
								<option value="<%=rsa.getString(1)%>">
									<%=rsa.getString(2)+ " " + rsa.getString(3) + " " + rsa.getString(4)%>
								</option><%}%>
					</select>
					
					<label id="fechantlabel">Fecha de atención:</label>
					<input type="text" name="fechaatencion" id="fechanttxt" value="dd/mm/yyyy" id="lanzadoratencion"/>
					<img src="ima/calendario.png" width="16" height="16" border="0" title="Fecha Inicial" id="fechatnim"/>
                    <script type="text/javascript"> 
						Calendar.setup({ 
							inputField     :    "aprobacion",     // id del campo de texto 
							ifFormat     :     "%d/%m/%Y",     // formato de la fecha que se escriba en el campo de texto 
							button     :    "lanzadoraprobacion"     // el id del botón que lanzará el calendario 
						}); 
					</script><br />
					
					<label id="atenalabel">Hora de atención:</label>  	
					<input type="text" value="00:00" id="atenatxt" name="timepickeratencion" /><br />
					
					<label id="atachylabel">Respuesta:</label>
					<textarea rows="6" cols="45" name="respuesta" id="atachytxt"></textarea>
                    <input type="submit" value="Guardar" id="submit"/>
					<input type="submit" value="Cancel" id="cancel"/>
                </div>
            </form></center>
			</div>
		</div>	
	</body>    
</html>







