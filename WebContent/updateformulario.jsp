<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
   <%@ page import="com.sct.incidencias.catalogos.CATUsuarioUTIC"%>
   <%@ page import="com.sct.incidencias.Conexion.DBConexion" %>
   <%DBConexion dba = new DBConexion();%>
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
		<title>ACTUALIZAR FORMULARIO</title>
	</head>
	<body>
		<div class="panel">
			<div class="title">
				<img src="ima/logo.png" width="260" height="84">
			</div>
			<center><h1>Nueva Incidencia</h1></center>
			<div class="container">
            <center><form method="POST" action="InsertarFormulario">
                <div id="loginForm">
                    <label id="foliolabel">Folio:</label>
                    <%String valor = request.getParameter("foliolabel"); 
                    String nombre ="";
                    String ap ="";
                    String am ="";
                    String cisco ="";
                    String email ="";
                    String ildUnidadAdmin ="";
                    String ildDepartamento ="";
                    
						ResultSet rset = dba.getSt().executeQuery("SELECT Incidencia.Folio"
								+ ", CATEstatus.NombreEstatus"
								+ ", Incidencia.Prioridad "
								+ ", Incidencia.FELab "
								+ ", Incidencia.HELab"
								+ ", CATUsuarioCAT.NombreUsuario,CATUsuarioCAT.APaterno,CATUsuarioCAt.AMaterno "
								+ ", CATUsuarioCAT.CiscoCat"
								+ ", Incidencia.FAtencion"
								+ ", Incidencia.HAtencion"
								+ ", CATAtendio.NombreAtendio,CATAtendio.APaterno,CATAtendio.AMaterno "
								+ ", CATUnidadResponsable.ildUnidadAdmin"
								+ ", CATUsuarioUnidadResponsable.EmailUr"
								+ ", Incidencia.DescripcionIncidencia"
							    + ", CATUsuarioUnidadResponsable.NombreResponsable,CATUsuarioUnidadResponsable.APaterno as AP,CATUsuarioUnidadResponsable.AMaterno as AM"
							    + ", CATUsuarioUnidadResponsable.CiscoUr"
							    + ", CATDepartamento.NombreDepartamento"
							    + ", CATModulo.NombreModulo "
							    + ", CATProceso.Proceso"
							    + ", CATTipoDeIncidente.NombreIncidente"
							    + ", CATTipoDeSolucion.NombreSolucion"
							    + ", CATSistema.NombreSistema"
							   // + ", DocumentosIncidencia.Documento"
							    + ", Incidencia.FLlamada"
							    + ", Incidencia.HLlamada"
							    + ", Incidencia.ComLlamada"
							    + ", CATDepartamento.ildDepartamento"
							    
																					
								+ " FROM PUB.Incidencia "
								
	                                    + "LEFT JOIN PUB.CATSistema ON Incidencia.ildSistema = CATSistema.ildSistema "
	                                    //+ "LEFT JOIN PUB.Incidencia ON Incidencia.ildIncidencia = Incidencia.ildIncidencia "
	                                    + "LEFT JOIN PUB.CATTipoDeSolucion ON Incidencia.ildTipoDeSolucion = CATTipoDeSolucion.ildTipoDeSolucion "
	                                    + "LEFT JOIN PUB.CATTipoDeIncidente ON Incidencia.ildIncidente = CATTipoDeIncidente.ildIncidente "  
	                                    + "LEFT JOIN PUB.CATUsuarioCAT ON Incidencia.ildUsuarioCat = CATUsuarioCAT.ildUsuarioCat " 
	                                    + "LEFT JOIN PUB.CATAtendio ON Incidencia.ildAtendio = CATAtendio.ildAtendio "
										+ "LEFT JOIN PUB.CATUnidadResponsable ON Incidencia.ildUnidadAdmin = CATUnidadResponsable.ildUnidadAdmin "
										+ "LEFT JOIN PUB.CATDepartamento ON Incidencia.ildDepartamento = CATDepartamento.ildDepartamento "
										+ "LEFT JOIN PUB.CATModulo ON Incidencia.ildModulo = CATModulo.ildModulo "
										+ "LEFT JOIN PUB.CATProceso ON Incidencia.ildProceso = CATProceso.ildProceso "
										+ "LEFT JOIN PUB.CATEstatus ON Incidencia.ildEstatus = CATEstatus.ildEstatus "
										+ "LEFT JOIN PUB.CATUsuarioUnidadResponsable ON Incidencia.idUsuarioResponsable = CATUsuarioUnidadResponsable.idUsuarioResponsable"  
										+ " WHERE Incidencia.Folio = '"+valor+"'");
							while(rset.next()){
								 nombre = rset.getString("NombreResponsable");
			                     ap = rset.getString("AP");
			                     am = rset.getString("AM");
			                     cisco = rset.getString("CiscoUr");
			                     email = rset.getString("EmailUr");
			                     ildUnidadAdmin = rset.getString("ildUnidadAdmin");
			                     ildDepartamento= rset.getString("ildDepartamento");
							}%>
                    <input disabled="true" id="foliotxt" type="text" name="folio" size="30" value="<%=valor%>"/><br/>
                    
                    <label id="nombrelabel">Nombre:</label>                     
                    <input disabled="true" id="nombretxt" type="text" name="nombreur" value="<%=nombre%>" size="30"/><br/>
                    
                    <label id="passwdconflabel">Apellido Paterno:</label>
                    <input disabled="true"id="passwdconftxt" type="text" name="APur" value="<%=ap%>" size="30"/><br/>
                    
                    <label id="pnomlabel">Apellido Materno:</label>
                    <input disabled="true" id="pnomtxt" type="text" name="AMur" value=" <%=am%>" size="30"/><br/>
                    
                     <label id="snomlabel">CISCO:</label>
                     <input disabled="true" id="snomtxt" type=text name="ciscour" value=" <%=cisco%>" size="30"/><br/>
                     
                                                                                                                     
                    <label id="paplabel">E-mail:</label>
                    <input disabled="true" id="paptxt" type=text name="emailur" value="<%=email%> " size="30"/><br/>
                    
                    
                    <label id="maplabel">Unidad Responsable:</label>
                    <select id="maptxt" name="unidadresponsable">
                    	<% 
                    	String SQL = "SELECT CATUnidadResponsable.ildUnidadAdmin,CATUnidadResponsable.DescUR FROM PUB.CATUnidadResponsable where CATUnidadResponsable.ildUnidadAdmin = "+ildUnidadAdmin;
                    	ResultSet rsu = dba.getSt().executeQuery(SQL);
							while(rsu.next()){ 
						%>
								<option value="<%=rsu.getString(1)%>"><%=rsu.getString(2)%></option>
							<%}%>
					</select><br />

                    <label id="esplabel">Departamento:</label>
                    <select name="departamento" id="esptxt">
						<%
						String SQL1 = "SELECT CATDepartamento.ildDepartamento,CATDepartamento.NombreDepartamento FROM PUB.CATDepartamento where  CATDepartamento.ildDepartamento = "+ildDepartamento; 
						ResultSet rsd = dba.getSt().executeQuery(SQL1);
							while(rsd.next()){%>
								<option value="<%=rsd.getString(1)%>"><%=rsd.getString(2)%></option>
							<%}%>
					</select><br/>
					
                       <label id="naclabel">Modulo:</label>
					<select id="dateString" class="nactxt" name="modulo">
						<% ResultSet rsm = dba.getSt().executeQuery("SELECT CATModulo.ildModulo,CATModulo.NombreModulo FROM PUB.CATModulo");
							while(rsm.next()){%>
								<option value="<%=rsm.getString(1)%>"><%=rsm.getString(2)%></option>
							<%}%> 
					</select><br /> 
                   
                    
					<label id="processlabel">Proceso:</label>
					<select name="proceso" id="processtxt">
						<% ResultSet rsp = dba.getSt().executeQuery("SELECT CATProceso.ildProceso,CATProceso.Proceso FROM PUB.CATProceso");
							while(rsp.next()){%>
								<option value="<%=rsp.getString(1)%>"><%=rsp.getString(2)%></option>
								<%}%>
					</select><br />
					
					<label id="tipoinlabel">Tipo de incidencia:</label>
					<select name="tipodeincidencias" id="tipointxt">
						<% ResultSet rsi = dba.getSt().executeQuery("SELECT CATTipoDeIncidente.ildIncidente,CATTipoDeIncidente.NombreIncidente FROM PUB.CATTipoDeIncidente");
							while(rsi.next()){%>
								<option value="<%=rsi.getString(1)%>">
									<%=rsi.getString(2)%>
								</option><%}%>
					</select><br />
					
					<label id="tiposollabel">Tipo de solucion:</label>
					<select name="tipodesolucion" id="tiposoltxt">
						<% ResultSet rss = dba.getSt().executeQuery("SELECT CATTipoDeSolucion.ildTipoDeSolucion,CATTipoDeSolucion.NombreSolucion FROM PUB.CATTipoDeSolucion");
							while(rss.next()){%>
								<option value="<%=rss.getString(1)%>">
									<%=rss.getString(2)%>
								</option><%}
								%>
					</select><br />
					
					<label id="aprovylabel">Aprobacion:</label>
					<select name="aprobacion" id="aprovytxt">
						<option value="SI">SI</option>
						<option value="NO">NO</option>
					</select><br/>
					
				<label id="fechanlabel">Fecha de aprobacion:</label>
				<input id="aprobacion" type="text" name="fechaaprobacion" value="yyyy-mm-dd" >
					<img src="ima/calendario.png" width="16" height="16" border="0" title="Fecha Aprobacion" id="lanzadoraprobacion">
                    <script type="text/javascript"> 
						Calendar.setup({ 
						inputField     :    "aprobacion",     // id del campo de texto 
						ifFormat     :     "%Y-%m-%d",     // formato de la fecha que se escriba en el campo de texto 
						button     :    "lanzadoraprobacion"     // el id del botón que lanzará el calendario 
					}); 
					</script><br />
					
				<label id="insidentlabel">Descripcion</label>
				<label id="insidentilabel">de</label>	
				<label id="insidentialabel">insidencia:</label>
				<textarea id="insidenttxt" rows="6" cols="45" name="descripcionincidencia"></textarea><br/>
				
				<label id="estatuslabel">Estatus:</label>
				<select id="estatustxt" name="estatus1">
					<% ResultSet rse = dba.getSt().executeQuery("SELECT CATEstatus.ildEstatus,CATEstatus.NombreEstatus FROM PUB.CATEstatus");
							while(rse.next()){%>
								<option value="<%=rse.getString(1)%>"><%=rse.getString(2)%></option>
								<%}
									%>
				</select><br />
				
				<label id="prioridadlabel">Prioridad:</label>	
				<select id="prioridadtxt" name="prioridad">
					<option value="Alta">Alta</option>
					<option value="Media">Media</option>
					<option value="Baja">Baja</option>
				</select><br />
				
				<label id="fechamlabel">Fecha enviada </label>   
				<label id="fechamilabel">por el CAT:</label>  		
					<input type="text" id="mesa"  name="fechamesa"  value="yyyy-mm-dd" />
					<img src="ima/calendario.png" width="16" height="16" border="0" title="Fecha Mesa" id="lanzadormesa"/>
                    <script type="text/javascript"> 
						Calendar.setup({ 
						inputField     :    "mesa",     // id del campo de texto 
						ifFormat     :     "%Y-%m-%d",     // formato de la fecha que se escriba en el campo de texto 
						button     :    "lanzadormesa"     // el id del botón que lanzará el calendario 
					}); 
					</script><br />
					
					<label id="tplabel">Hora enviada </label>   
					<label id="tpilabel">por el CAT:</label>  	
					<input type="text" value="00:00" id="tptxt" name="timepickermesa" /><br />
					
					<label id="catlabel">Usuario CAT:</label>  	
					<select id="catxt" name="usuariocat">
						<% ResultSet rsuc = dba.getSt().executeQuery("SELECT CATUsuarioCAT.ildUsuarioCat,CATUsuarioCAT.NombreUsuario,CATUsuarioCAT.APaterno,CATUsuarioCAT.AMaterno FROM PUB.CATUsuarioCAT");
							while(rsuc.next()){%>
								<option value="<%=rsuc.getString(1)%>"><%=rsuc.getString(2)+ " " + rsuc.getString(3) + " " + rsuc.getString(4)%>
								</option><%}%>
					</select><br />
					<label id="atenlabel">Atendido:</label>
                		<select name="atendio" id="atentxt">
						<% ResultSet rsa = dba.getSt().executeQuery("SELECT CATAtendio.ildAtendio,CATAtendio.NombreAtendio,CATAtendio.APaterno,CATAtendio.AMaterno FROM PUB.CATAtendio");
							while(rsa.next()){%>
								<option value="<%=rsa.getString(1)%>">
									<%=rsa.getString(2)+ " " + rsa.getString(3) + " " + rsa.getString(4)%>
								</option><%}%>
						</select>
						<label id="fechantlabel">Fecha de atencion:</label>
						<input type="text" name="fechaatencion" id="atencion" value="yyyy-mm-dd"/>
							<img src="ima/calendario.png" width="16" height="16" border="0" title="Fecha Atencion" id="lanzadoratencion2"/>
                   				 <script type="text/javascript"> 
										Calendar.setup({ 
										inputField     :    "atencion2",     // id del campo de texto 
										ifFormat     :     "%Y-%m-%d",     // formato de la fecha que se escriba en el campo de texto 
										button     :    "lanzadoratencion2"     // el id del botón que lanzará el calendario 
									}); 
								</script><br>
						<label id="atenalabel">Hora de atencion:</label>  	
						<input type="text" value="00:00" id="atenatxt" name="horaatencion" /><br>
                		<label id="atachylabel">Respuesta:</label>
                		<textarea rows="6" cols="50" name="respuesta" id="atachytxt"></textarea>
                		<label id="fechallamada">Fecha de la llamada:</label>
                		
                		<input type="text" name="fechadellamada" id="fellamada" value="yyyy-mm-dd"/>
							<img src="ima/calendario.png" width="16" height="16" border="0" title="Fecha de llamada" id="lanzadorfllamada"/>
                   				 <script type="text/javascript"> 
										Calendar.setup({ 
										inputField     :    "fellamada",     // id del campo de texto 
										ifFormat     :     "%Y-%m-%d",     // formato de la fecha que se escriba en el campo de texto 
										button     :    "lanzadorfllamada"     // el id del botón que lanzará el calendario 
									}); 
								</script><br>
								
						<label id="horallamada">Hora de la llamadas:</label> 
						<input type="text" value="00:00" id="hllamada" name="horallamda"/><br>
																		
						<label id="estatuslabel2">Estatus:</label>
							<select id="estatustxt2" name="estatus">
								<% ResultSet rse2 = dba.getSt().executeQuery("SELECT CATEstatus.ildEstatus,CATEstatus.NombreEstatus FROM PUB.CATEstatus");
									while(rse2.next()){%>
								<option value="<%=rse2.getString(1)%>"><%=rse2.getString(2)%></option>
									<%}
										%>
							</select><br>
							
							<label id="atachylabel2">Comentario Llamadas:</label>
                		<textarea rows="6" cols="50" name="comentariollamada" id="atachytxt3" ></textarea>
					<%dba.liberarConexion(dba.getCt());%>
				
                    <input type="submit" value="Guardar" id="submit"/>
					<input type="submit" value="Cancelar" id="cancel"/> 
                </div>
            </form></center>
			</div>
		</div>	
	</body>    
</html>