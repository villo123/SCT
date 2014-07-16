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
<div id="imagen"><img src="ima/logo.png" width="260" height="84"></div>
	
<center><form method="POST" action="InsertarFormulario">
<table>
	<caption style="caption-side: top;font-size: xx-large; padding: 16px;">NUEVA INCIDENCIA</caption>
	<tr>
		<th colspan="2" style="padding: 15px;">
			Usuario unidad responsable
		</th>
	</tr>
	<tr>
		<td>
			Folio:
		</td>
		<td>
			<input type="text" name="folio">
		</td>
	</tr>
	<tr>
		<td>
			Nombre:
		</td>
		<td>
			<input type="text" name="nombreur">
		</td>
	</tr>
	<tr>
		<td>
			Apellido Paterno:
		</td>
		<td>
			<input type="text" name="APur">
		</td>
	</tr>
	<tr>
		<td>
			Apellido Materno:
		</td>
		<td>
			<input type="text" name="AMur">
		</td>
	</tr>	
	<tr>
		<td>
			CISCO:
		</td>
		<td>
			<input type=text name="ciscour">
		</td>
	</tr>
	<tr>
		<td>
			E-mail:
		</td>
		<td>
			<input type=text name="emailur">
		</td>
	</tr>
	<tr>
		<td>
			Unidad Responsable:
		</td>
		<td>
			<select name="unidadresponsable">
				<% ResultSet rsu = dba.getSt().executeQuery("SELECT CATUnidadResponsable.DescUR,CATUnidadResponsable.DescUR FROM PUB.CATUnidadResponsable");
						while(rsu.next())
						{
					%>
						<option value="<%=rsu.getString(1)%>"><%=rsu.getString(2)%></option>
					<%}
						%>
			</select>
		</td>
	</tr>
	<tr>
		<td>
			Departamento:
		</td>
		<td>
			<select name="departamento">
				<% ResultSet rsd = dba.getSt().executeQuery("SELECT CATDepartamento.NombreDepartamento,CATDepartamento.NombreDepartamento FROM PUB.CATDepartamento");
						while(rsd.next())
						{
					%>
						<option value="<%=rsd.getString(1)%>"><%=rsd.getString(2)%></option>
					<%}
						%>
			</select>
		</td>
	</tr>
	<tr>
		<td>
			Modulo:
		</td>
		<td>
			<select name="modulo">
				<% ResultSet rsm = dba.getSt().executeQuery("SELECT CATModulo.NombreModulo,CATModulo.NombreModulo FROM PUB.CATModulo");
						while(rsm.next())
						{
					%>
						<option value="<%=rsm.getString(1)%>"><%=rsm.getString(2)%></option>
					<%}
						%>
			</select>
		</td>
	</tr>
	<tr>
		<td>
			Proceso:
		</td>
		<td>
			<select name="proceso">
				<% ResultSet rsp = dba.getSt().executeQuery("SELECT CATProceso.Proceso,CATProceso.Proceso FROM PUB.CATProceso");
						while(rsp.next())
						{
					%>
						<option value="<%=rsp.getString(1)%>"><%=rsp.getString(2)%></option>
					<%}
						%>
			</select>
		</td>
	</tr>
	<TR>
		<td>
			Tipo de Incidencias:
		</td>
		<td>
			<select name="tipodeincidencias">
				<% ResultSet rsi = dba.getSt().executeQuery("SELECT CATTipoDeIncidente.NombreIncidente,CATTipoDeIncidente.NombreIncidente FROM PUB.CATTipoDeIncidente");
						while(rsi.next())
						{
					%>
						<option value="<%=rsi.getString(1)%>"><%=rsi.getString(2)%></option>
					<%}
						%>
			</select>
		</td>
	</tr>
	<tr>
		<td>
			Tipo de Solución:
		</td>
		<td>
			<select name="tipodesolucion">
				<% ResultSet rss = dba.getSt().executeQuery("SELECT CATTipoDeSolucion.NombreSolucion,CATTipoDeSolucion.NombreSolucion FROM PUB.CATTipoDeSolucion");
						while(rss.next())
						{
					%>
						<option value="<%=rss.getString(1)%>"><%=rss.getString(2)%></option>
					<%}
						%>
			</select>
		</td>
	</tr>
	<tr>
		<td>
			Aprobación:
		</td>
		<td>
			<input type="text" name="aprobacion"></input>
		</td>
	</tr>
	<tr>
		<td>
			Fecha de aprobación:
		</td>
		<td>
			<input type="text" name="fechaaprobacion" id="aprobacion" value="dd/mm/yyyy" /> 
			<img src="ima/calendario.png" width="16" height="16" border="0" title="Fecha Inicial" id="lanzadoraprobacion">
			<script type="text/javascript"> 
   					Calendar.setup({ 
    				inputField     :    "aprobacion",     // id del campo de texto 
     				ifFormat     :     "%d/%m/%Y",     // formato de la fecha que se escriba en el campo de texto 
     				button     :    "lanzadoraprobacion"     // el id del botón que lanzará el calendario 
				}); 
 			</script>
		</td>
	</tr>
	<tr>
		<td>
			Descripción de la Incidencia:
		</td>
		<td>
			<textarea rows="6" cols="45" name="descripcionincidencia" ></textarea>
		</td>
	</tr>	
	<tr>
		<td colspan="2">
			<hr style="border-color: #63666a"></hr>
		</td>
	</tr>
	<tr>
		<td>
			Estatus:
		</td>
		<td>
			<select name="estatus">
				<option VALUE="Pendiente">Pendiente</option>
				<option VALUE="Resuelto">Resuelto</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>
			Prioridad:
		</td>
		<td>
			<select name="prioridad">
				<option VALUE="Alta">Alta</option>
				<option VALUE="Media">Media</option>
				<option VALUE="Baja">Baja</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>
			Fecha enviada por la mesa:
		</td>
		<td>
			<input type="text" name="fechamesa" id="mesa" value="dd/mm/yyyy" /> 
			<img src="ima/calendario.png" width="16" height="16" border="0" title="Fecha Inicial" id="lanzadormesa">
			<script type="text/javascript"> 
   					Calendar.setup({ 
    				inputField     :    "mesa",     // id del campo de texto 
     				ifFormat     :     "%d/%m/%Y",     // formato de la fecha que se escriba en el campo de texto 
     				button     :    "lanzadormesa"     // el id del botón que lanzará el calendario 
				}); 
 			</script>
		</td>
	</tr>
	<tr>
		<td colspan="1">
			Hora envida por la mesa: 
		</td>
		<td>
			<input type="text" value="00:00" id="tp1" name="timepickermesa"/>    HH:MM
		</td>
	</tr>
	<tr>
		<td>
			Usuario CAT:
		</td>
		<td>
			<select name="usuariocat">
				<% ResultSet rsuc = dba.getSt().executeQuery("SELECT CATUsuarioCAT.NombreUsuario,CATUsuarioCAT.APaterno,CATUsuarioCAT.AMaterno,CATUsuarioCAT.NombreUsuario,CATUsuarioCAT.APaterno,CATUsuarioCAT.AMaterno FROM PUB.CATUsuarioCAT");
						while(rsuc.next())
						{
					%>
						<option value="<%=rsuc.getString(1) + " " + rsuc.getString(2)+ " " + rsuc.getString(3)%>"><%=rsuc.getString(4)+ " " + rsuc.getString(5) + " " + rsuc.getString(6)%></option>
					<%}
						%>
			</select>
		</td>
	</tr>
	<tr>
		<td>
			E-mail:
		</td>
		<td>
			<input type=text name="emailcat">
		</td>
	</tr>
	<tr>
		<td>
			CISCO:
		</td>
		<td>
			<input type=text name="Ciscocat">
		</td>
	</tr>
	<tr>
		<td>
			Atendio:
		</td>
		<td>
			<select name="atendio">
				<% ResultSet rsa = dba.getSt().executeQuery("SELECT CATAtendio.NombreAtendio,CATAtendio.APaterno,CATAtendio.AMaterno,CATAtendio.NombreAtendio,CATAtendio.APaterno,CATAtendio.AMaterno FROM PUB.CATAtendio");
						while(rsa.next())
						{
					%>
						<option value="<%=rsa.getString(1) + " " + rsa.getString(2)+ " " + rsa.getString(3)%>"><%=rsa.getString(4)+ " " + rsa.getString(5) + " " + rsa.getString(6)%></option>
					<%}
						%>
			</select>
		</td>
	</tr>
	<tr>
		<td>
			Fecha de atención:
		</td>
		<td>
			<input type="text" name="fechaatencion" id="atencion" value="mm-dd-yyyy" /> 
			<img src="ima/calendario.png" width="16" height="16" border="0" title="Fecha Inicial" id="lanzadoratencion">
			<script type="text/javascript"> 
   					Calendar.setup({ 
    				inputField     :    "atencion",     // id del campo de texto 
     				ifFormat     :     "%m-%d-%Y",     // formato de la fecha que se escriba en el campo de texto 
     				button     :    "lanzadoratencion"     // el id del botón que lanzará el calendario 
				}); 
 			</script>
		</td>
	</tr>
	<tr>
		<td>
			Hora de atencion:
		</td>
		<td>
			<input type="text" value="00:00" id="tp2" name="timepickeratencion" />    HH:MM
		</td>
	</tr>
	<tr>
		<td>
			Archivo:
		</td>
		<td>
			<input type="file" name="archivo" size="45">
		</td>
	</tr>
	<tr>
		<td>
			Respuesta:
		</td>
		<td>
			<textarea rows="6" cols="45" name="respuesta" ></textarea>
		</td>
	</tr>	
	
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="Guardar">
		</td>
	</tr>
</table>
</form>
</center>
</body>
</html>