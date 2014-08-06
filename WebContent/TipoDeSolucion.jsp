<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Catálogo Tipo de Solución</title>
<!--Meta content-->
		<meta charset="ISO-8859-1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<!--Style content-->
		<link rel="stylesheet" type="text/css" href="css/CatTipoSolucion.css" />
		<link rel="stykesheet" type="text/css" href="css/button.css" />
		<link rel="stylesheet" media="screen" href="css/timepicker.css" type="text/css" />
		<link rel="stylesheet" type="text/css"href="css/calendario.css" />
		<!--Script content-->
		<script type="text/javascript" src="js/master.js"></script>
		<script type="text/javascript" src="js/calendar.js"></script>
		<script type="text/javascript" src="js/calendar-es.js"></script>
		<script type="text/javascript" src="js/calendar-setup.js"></script>
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
	</head>
	<body>
		<div class="panel">
			<div class="title">
				<img src="ima/logo.png" width="260" height="84" />
			</div>
			<div class="container">
				<h1><center>Catálogo Solución</center></h1>
				<button id="btn" onclick="abrirformulario();">Nuevo</button>
				<button id="btn" onclick="();">Editar</button>
				<button id="btn" onclick="();">Guardar</button>
				<button id="btn" onclick="seacker();">Buscar</button>
				<button id="btn" onclick="cancelar();">Cancelar</button>
				<br /> <br />
           
				<table border="2px" style="border-collapse: collapse;"> 
					<tbody>
				<tr>
							<td class="t" style="color:#FFFFFF;">ID</td>
							<td class="t" style="color:#FFFFFF;">Solución</td>
							          
						</tr>
						<tr>
							<td></td>
							<td></td>
							
						</tr>
						<tr>
							<td></td>
							<td></td>
							
						</tr>
						<tr>
							<td></td>
							<td></td>
							
						</tr>
						<tr>
							<td></td>
							<td></td>
						
                                                
						</tr>
					</tbody>
				</table>
				<br /><br />
					<label id="idtipodesolucionlabel">Id:</label>
					<input type="text" value="" id="idtipodesoluciontxt" name="idtipodesolucion" value="" size="30" /><br /><br />
					<label id="tipodesolucionlabel">Solución:</label>
					<input type="text" value="" id="tipodesoluciontxt" name="tipodesolucion" value="" size="30" /><br /><br />
					
			</div>
		</div>	
	</body>    
</html>
	