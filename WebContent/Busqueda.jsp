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
			<div class="container">
			
				<label id="Foliolabel">Folio:</label>
				<input type="Text" name="camposelector" id="Foliotxt" size="30" />
				<input type="button" id="btnFolio" value="Ver qué elementos seleccionas" />
				
				<label id="Unitlabel">Por Unidad Administrativa:</label>
				<input type="Text" name="camposelector" id="Unittxt" size="30" />
				<input type="button" id="btnUnit" value="Ver qué elementos seleccionas" />
				
				<label id="Estatuslabel">Estatus Incidencia:</label>
				<input type="Text" name="camposelector" id="Estatustxt" size="30" />
				<input type="button" id="btnEstatus" value="Ver qué elementos seleccionas" />
				
				<label id="Tipolabel">Tipo de Solucion:</label>
		 		<input type="Text" name="camposelector" id="Tipotxt" size="30" />
				<input type="button" id="btnTipo" value="Ver qué elementos seleccionas" />
				
				<label id="Modulolabel">Modulo:</label>
				<input type="Text" name="camposelector" id="Modulotxt" size="30" />
				<input type="button" id="btnModulo" value="Ver qué elementos seleccionas" />
				
				<label id="Sublabel">Submodulo:</label>
				<input type="Text" name="camposelector" id="Subtxt" size="30" />
				<input type="button" id="btnSub" value="Ver qué elementos seleccionas" />
				
				<label id="Sistlabel">Sistema:</label>
		 		<input type="Text" name="camposelector" id="Sisttxt" size="30" />
				<input type="button" id="btnSist" value="Ver qué elementos seleccionas" />
				
				<input type="button" name="enviar" value="Filtrar" id="btnSubmit" />
				
			</div>
		</div>
	</body>
</html>