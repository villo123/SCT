<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Catálogo Operador</title>
		<link rel="stylesheet" type="text/css" href="css/OperadorUTIC.css" />
	<script type="text/javqqascript" src="js/master.js"></script>
</head>
<body onclick="deshabilitaroperutic();">
		<div class="panel">
			<div class="title">
				<img src="ima/logo.png" width="260" height="84" />
			</div>
			<div class="container">
				<h1><center>Catálogo Operador</center></h1>
				<button id="btn" onclick="abrirformulario();">Nuevo</button>
				<button id="btn" onclick="habilitaroperutic();">Editar</button>
				<button id="btn" onclick="();">Guardar</button>
				<button id="btn" onclick="seacker();">Buscar</button>
				<button id="btn" onclick="cancelar();">Cancelar</button>
				<br /> <br /> 
		 <table border="2px" style="border-collapse: collapse;"> 
             <tr>
                 <td class="t" style="color:#FFFFFF;">Usuario</td>
                 <td class="t" style="color:#FFFFFF;">Número de Empleado</td>
                 <td class="t" style="color:#FFFFFF;">Nombre</td>
                 <td class="t" style="color:#FFFFFF;">Apellido Materno</td>
                 <td class="t" style="color:#FFFFFF;">Apellido Paterno</td>
                 <td class="t" style="color:#FFFFFF;">Departamento</td>
                 <td class="t" style="color:#FFFFFF;">E-mail</td>
                 <td class="t" style="color:#FFFFFF;">Unidad</td>
                                
              	 </tr>
             <tr>
             	 <td></td>
                 <td></td>
                 <td></td>
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
                 <td></td>
                 <td></td>
                 <td></td>
                               
             </tr>
        </table>
        	<br />
			<label>Usuarios:</label>
			<input type="text" value="" id="UsuarioOpt" name="timepicker" size="30" /><br /><br />
			<label>Numero de Empleado:</label>
			<input type="text" value="" id="NumeroOpt" name="timepicker" size="30" /><br /><br />
			<label>Nombre:</label>
			<input type="text" value="" id="NombreOpt" name="timepicker" size="30" /><br /><br />
			<label>Apellido Paterno:</label>
			<input type="text" value="" id="ApellidoPatOpt" name="timepicker" size="30" /><br /><br />
			<label>Apellido Materno:</label>
			<input type="text" value="" id="ApellidoMatOpt" name="timepicker" size="30" /><br /><br />
			<label>Departamento:</label>
			<input type="text" value="" id="DeptoOpt" name="timepicker" size="30" /><br /><br />
			<label>E-mail:</label>
			<input type="text" value="" id="EmailOpt" name="timepicker" size="30" /><br /><br />
			<label>Unidad:</label>
			<input type="text" value="" id="UnidadOpt" name="timepicker" size="30" /><br /><br />

			</div>
  		</div>
	</body>
</html>