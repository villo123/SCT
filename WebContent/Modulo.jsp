<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Cat�logo Modulo</title>
		<link rel="stylesheet" type="text/css" href="css/Modulo.css" />
	<script type="text/javqqascript" src="js/master.js"></script>
</head>
<body onclick="deshabilitarmodulo();">
		<div class="panel">
			<div class="title">
				<img src="ima/logo.png" width="260" height="84" />
			</div>
			<h1><center>Cat�logo Modulo</center></h1>
			<div class="container">
				<button id="btn" onclick="abrirformulario();">Nuevo</button>
				<button id="btn" onclick="habiliarmodulo();">Editar</button>
				<button id="btn" onclick="();">Guardar</button>
				<button id="btn" onclick="seacker();">Buscar</button>
				<button id="btn" onclick="cancelar();">Cancelar</button><br />  <br />   
		 <table border="2px" style="border-collapse: collapse;"> 
             <tr>
                 <td class="t" style="color:#FFFFFF;">Id</td>
                 <td class="t" style="color:#FFFFFF;">Modulos</td>
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
        </table>
        <br /><br />
					<label id="idmodulolabel">Id:</label>
					<input type="text" value="" id="idmodulotxt" name="idmodulo" value="" size="30" /><br /><br />
					<label id="modulolabel">Modulo:</label>
					<input type="text" value="" id="modulotxt" name="modulo" value="" size="30" /><br /><br />
        	</div>
		</div>
	</body>
</html>