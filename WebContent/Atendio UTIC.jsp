<!DOCTYPE html>
<html>
	<head>	
		<title>Atendió UTIC</title>
		<!--Meta content-->
		<meta charset="ISO-8859-1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<!--Style content-->
		<link rel="stylesheet" type="text/css" href="css/AtendioUTIC.css" />
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
				<h1><center>Catalogo Atendio</center></h1>
				<button id="btn" onclick="abrirformulario();">Nuevo</button>
				<button id="btn" onclick="();">Editar</button>
				<button id="btn" onclick="();">Guardar</button>
				<button id="btn" onclick="seacker();">Buscar</button>
				<button id="btn" onclick="cancelar();">Cancelar</button>
				<br /> <br />
            <form action="FillTable" name="Fill" method="post"/>
				<table border="2px" style="border-collapse: collapse;"> 
					<tbody>
					
					
						<tr>
							<td class="t" style="color:#FFFFFF;">ID</td>
							<td class="t" style="color:#FFFFFF;">Nombre</td>
							<td class="t" style="color:#FFFFFF;">Apellido Paterno</td>
							<td class="t" style="color:#FFFFFF;">Apellido Materno</td>
							<td class="t" style="color:#FFFFFF;">Departamento</td>            
						</tr>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
                                                
						</tr>
					</tbody>
				</table>
				<br /><br />
					<label id="idatendiolabel">ID:</label>
					<input type="text" value="" id="idatendiotxt" name="idatendio" value="" size="30" /><br /><br />
					<label id="nameatendiolabel">Nombre:</label>
					<input type="text" value="" id="nameatendiotxt" name="nameatendio" value="" size="30" /><br /><br />
					<label id="apellidopatatendiolabel">Apellido Paterno:</label>
					<input type="text" value="" id="apellidopatatendiotxt" name="apellidopatatendio" value="" size="30" /><br /><br />
					<label id="apellidomatatendiolabel">Apellido Materno:</label>
					<input type="text" value="" id="apellidomatatendiotxt" name="apellidomatatendio" value="" size="30" /><br /><br />
					<label id="deptoatendiolabel">Departamento:</label>
					<input type="text" value="" id="deptoatendiotxt" name="deptoatendio" value="" size="30" /><br /><br />
			</div>
		</div>	
	</body>    
</html>