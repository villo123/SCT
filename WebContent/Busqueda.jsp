<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Buscar Incidencia</title>
		<link rel="stylesheet" type="text/css" href="css/Busqueda.css" />
		<script type="text/javqqascript" src="js/master.js"></script>
	</head>
	<body>
		<div class="panel">
			<div class="title">
				<img src="ima/logo.png" width="260" height="84" />
			</div>
			<center><h1>Buscar</h1></center>
			<div class="container">
				<label id="Foliolabel">Folio:</label>
				<input type="Text" name="camposelector" id="Foliotxt" size="30" />
				<input type="button" id="btnUnit" value="Seleccionar" />
				
				<label id="Unitlabel">Por Unidad Administrativa:</label>
				<input type="Text" name="camposelector" id="Unittxt" size="30" />
				<input type="button" id="btnUnit" value="Seleccionar" />
				
				<label id="Estatuslabel">Estatus Incidencia:</label>
				<input type="Text" name="camposelector" id="Estatustxt" size="30" />
				<input type="button" id="btnEstatus" value="Seleccionar" />
				
				<label id="Tipolabel">Tipo de Soluci�n:</label>
		 		<input type="Text" name="camposelector" id="Tipotxt" size="30" />
				<input type="button" id="btnTipo" value="Seleccionar" />
				
				<label id="Modulolabel">Modulo:</label>
				<input type="Text" name="camposelector" id="Modulotxt" size="30" />
				<input type="button" id="btnModulo" value="Seleccionar" />
				
				<label id="Sublabel">Submodulo:</label>
				<input type="Text" name="camposelector" id="Subtxt" size="30" />
				<input type="button" id="btnSub" value="Seleccionar" />
				
				<label id="Sistlabel">Sistema:</label>
		 		<input type="Text" name="camposelector" id="Sisttxt" size="30" />
				<input type="button" id="btnSist" value="Seleccionar" />
				
				<input type="button" name="enviar" value="Filtrar" id="btnSubmit" />
				
			</div>
		</div>
	</body>
</html>