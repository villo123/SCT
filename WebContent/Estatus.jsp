<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Catalogo Estatus</title>
	<link rel="stylesheet" type="text/css" href="css/Estatus.css" />
	<script type="text/javascript" src="js/master.js"></script>
</head>
<body onload="deshabilitarstatus();">
		<div class="panel">
			<div class="title">
				<img src="ima/logo.png" width="260" height="84" />
			</div>
			<h1><center>Catalogo Estatus</center></h1>
			<div class="container">
				<button id="btn" onclick="habilitarstatus();">Nuevo</button>
				<button id="btn" onclick="habilitarstatus();">Editar</button>
				<button id="btn" onclick="();">Guardar</button>
				<button id="btn" onclick="seacker();">Buscar</button>
				<button id="btn" onclick="cancelar();">Cancelar</button><br />  <br />
		 <table border="2px" style="border-collapse: collapse;"> 
             <tr>
                 <td class="t" style="color:#FFFFFF;">Id</td>
                 <td class="t" style="color:#FFFFFF;">Estatus</td>
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
					<label id="idatendiolabel">Id:</label>
					<input type="text" value="" id="idatendiotxt" name="idatendio" value="" size="30" /><br /><br />
					<label id="nameatendiolabel">Estatus:</label>
					<input type="text" value="" id="nameatendiotxt" name="nameatendio" value="" size="30" /><br /><br />
        
        	</div>
      	</div>
	</body>
</html>