<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="shortcut icon" type="image/x-icon" href="ima/favicon.ico">
<link rel="icon" type="image/x-icon" href="ima/favicon.ico">


<script type="text/javascript">
		function carga(){
			document.getElementById("usuario").focus();
		}
		function valideDatos(){
			var usuario = document.getElementById("usuario");
			var password = document.getElementById("password");
			
			if((usuario.value == "" || usuario.value == '' || usuario.value == null) && (password.value == "" || password.value == '' || password.value == null)){
						alert("Ingresa tu usuario y tu password");
						usuario.focus();
						return false;
				}else if(usuario.value == "" || usuario.value == '' || usuario.value == null){
						alert("Ingresa tu usuario");
						usuario.focus();
						return false;
				}else if(password.value == "" || password.value == '' || password.value == null){
						alert("Ingresa tu contraseña");
						password.focus();
						return false;
			    }else{
			    	return true;
			    }
		}
	</script>	
  <!--<style type="text/css">

  	/*.myButton {
		background-color:#44c767;
		display:inline-block;
		cursor:pointer;
		color:#ffffff;
		font-family:Arial;
		font-size:19px;
		font-weight:bold;
		padding:17px 15px;
		text-decoration:none;
	}
	.myButton:hover {
		background-color:#5cbf2a;
	}
	.myButton:active {
		position:relative;
		top:1px;
	}*/
  </style>-->
</head>
	<body onload="carga();" id="backfoto">
	<div id="imagen"><img src="ima/logo.png" width="260" height="84"></div>
	<div id="sistema"><h1>Sistema de Incidencia</h1></div>
		<form action="Login" method="POST" onsubmit="return valideDatos();">
			<table align="center" id="tablalogin">
				<tr>
					<td colspan="2">
						<span>Usuario:</span> 
					</td>
					<td>
						<input type ="text" name="usuarioutic" id="usuario">
					</td>	
				</tr>
				<tr>
					<td colspan="2">
						<span>Password:</span> 
					</td>
					<td>
						<input type ="password" name="passwordutic" id="password">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" name="aceptar" value="Aceptar" id="botone">
						<!--<a href="#" class="myButton" onsubmit="">Enviar</a>-->
					</td>
					<td>
						<input type="button" name="cancelar" value="Cancelar" id="botonc">
					</td>
				</tr>
			</table>	
		</form>
	</body>
</html>