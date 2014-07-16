<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Incidencia</title>

<style type="text/css"> 
	td.t {
			background-color: #007a33;
			padding: 10px; 
	}
	td {
	 	padding: 10px;
	}
	caption{
		font-size: 40px;
	}
	.btnimageningresar{
	border-style: none;
	border-color: inherit;
	border-width: 0;
	background: url('ima/nuevo.gif') no-repeat 0 0;
	cursor: pointer;
    width: 121px;
    height: 33px;
	text-align: left;
}
	 </style>
	 <script language="javascript">
	 	function abrirformulario() {
			abrir = open("formulario.jsp");
		}
	 </script>
</head>
<body>
<img src="ima/logo.png" alt="SCT" width="260" height="84"><p>
<h1 align="center">Registro de Incidencia</h1>
<br>
		<!--<input class="btnimageningresar" type="submit" name="enviar" value="" />-->
        <button class="btnimageningresar" onclick="abrirformulario();"></button>
        <button>Editar</button>
        <button>Guarda</button>
        <button>Buscar</button>
        <button>Cancelar</button>
		   <br>    
		 <table border="2px" style="border-collapse: collapse;"> 
             	
	
             <tr>
                 <td class="t">Folio</td>
                 <td class="t">Estatus de La Incidencia</td>
                 <td class="t">Prioridad</td>
                 <td class="t">Fecha Envida Por La Mesa</td>
                 <td class="t">Hora Enviada Por La Mesa</td>
                 <td class="t">Usuario CAT</td>
                 <td class="t">CISCO</td>
                 <td class="t">Fecha de Atención</td>
                 <td class="t">Hora de Atención</td>
                 <td class="t">Atendido</td>
                 <td class="t">Centro Sct</td>
                 <td class="t">Observaciones</td>
                 <td class="t">Usuario UR</td>
                 <td class="t">Cisco</td>
                 <td class="t">Centro SCT</td>
                 <td class="t">Departamento</td>
                 <td class="t">Modulo</td>
                 <td class="t">Proceso</td>
                 <td class="t">Tipo de Incidente</td>
                 <td class="t">Tipo de Solución</td>
                 <td class="t">Sistema</td>
                 <td class="t">Formato</td>
             </tr>
             <tr>
             	 <td ></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
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
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
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
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
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
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
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
    HOLA, <%=session.getAttribute("login") %>     
</body>
</html>