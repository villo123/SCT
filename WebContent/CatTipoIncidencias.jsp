<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Catalogo Tipo de Inicidencia</title>
	<link rel="stylesheet" type="text/css" href="css/CatTipoIncidencias.css" />
	<script type="text/javqqascript" src="js/master.js"></script>
</head>
	<body>
		<div class="panel">
			<div class="title">
				<img src="ima/logo.png" width="260" height="84" />
			</div>
			<center><h1>Cat�logo tipo de incidencia</h1></center>
			<div class="container">
				<button id="btn" onclick="abrirformulario();">Nuevo</button>
				<button id="btn" onclick="();">Editar</button>
				<button id="btn" onclick="();">Guardar</button>
				<button id="btn" onclick="seacker();">Buscar</button>
				<button id="btn" onclick="cancelar();">Cancelar</button><br />
<br>    
		 <table border="2px" style="border-collapse: collapse;"> 
             	
	
             <tr>
                 <td class="t" style="color:#FFFFFF;">Folio</td>
                 <td class="t" style="color:#FFFFFF;">Tipo de La Incidencia</td>
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
        </table><br /><br />
			<label>Folio:</label> 
			<input type="text" value="" id="FolioInc" name="timepicker" size="30"/><br /><br />
			<label>Tipo de la Incidencia:</label>
			<input type="text" value="" id="TipoInc" name="timepicker" size="30"/>
			</div>
		</div>
	</body>
</html>