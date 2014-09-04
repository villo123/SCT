<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
		<title>FORMULARIO</title>
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
                	<label id="atenlabel2">Atendido:</label>
                		<select name="atendio" id="atentxt2">
						<% ResultSet rsa = dba.getSt().executeQuery("SELECT CATAtendio.ildAtendio,CATAtendio.NombreAtendio,CATAtendio.APaterno,CATAtendio.AMaterno FROM PUB.CATAtendio");
							while(rsa.next()){%>
								<option value="<%=rsa.getString(1)%>">
									<%=rsa.getString(2)+ " " + rsa.getString(3) + " " + rsa.getString(4)%>
								</option><%}%>
						</select>
						<label id="fechantlabel2">Fecha de atencion:</label>
						<input type="text" name="fechaatencion" id="atencion2" value="yyyy-mm-dd"/>
							<img src="ima/calendario.png" width="16" height="16" border="0" title="Fecha Atencion" id="lanzadoratencion2"/>
                   				 <script type="text/javascript"> 
										Calendar.setup({ 
										inputField     :    "atencion2",     // id del campo de texto 
										ifFormat     :     "%Y-%m-%d",     // formato de la fecha que se escriba en el campo de texto 
										button     :    "lanzadoratencion2"     // el id del botón que lanzará el calendario 
									}); 
								</script><br>
						<label id="atenalabel2">Hora de atencion:</label>  	
						<input type="text" value="00:00" id="atenatxt2" name="timepickeratencion" /><br>
                		<label id="atachylabel2">Respuesta:</label>
                		<textarea rows="6" cols="50" name="respuesta" id="atachytxt2"></textarea>
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
								
						<label id="horallamada">Hora de la llamada:</label> 
                
                
                
                
                                                          
					

					
					

					
					

				<%dba.liberarConexion(dba.getCt()); %>
				
					
                    <input type="submit" value="Guardar" id="submit"/>
					<input type="submit" value="Cancelar" id="cancel"/>
                </div>
            </form></center>
			</div>
		</div>	
	</body>    
</html>