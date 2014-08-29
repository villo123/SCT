<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
   <%@ page import="com.sct.incidencias.catalogos.CATUsuarioUTIC"%>
   <%@ page import="com.sct.incidencias.Conexion.DBConexion" %>
   <%DBConexion dba = new DBConexion();%>
   <%@ page import="java.sql.*;" %>
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
			<center><h1>Buscar Incidencia</h1></center>
			<div class="container">
				<label id="Foliolabel">Folio:</label>
				<input type="Text" name="camposelector" id="Foliotxt" size="30" />
				
				
				<label id="Unitlabel">Por Unidad Administrativa:</label>
				<select name="camposelector" id="Unittxt" size="30" >
                    	<% ResultSet rsu = dba.getSt().executeQuery("SELECT CATUnidadResponsable.ildUnidadAdmin,CATUnidadResponsable.DescUR FROM PUB.CATUnidadResponsable");
							while(rsu.next()){%>
								<option value="<%=rsu.getString(1)%>"><%=rsu.getString(2)%></option>
							<%}%>
					</select>
				
				
				<label id="Estatuslabel">Estatus Incidencia:</label>
				<select name="camposelector" id="Estatustxt" size="30">
					<% ResultSet rse = dba.getSt().executeQuery("SELECT CATEstatus.ildEstatus,CATEstatus.NombreEstatus FROM PUB.CATEstatus");
							while(rse.next()){%>
								<option value="<%=rse.getString(1)%>"><%=rse.getString(2)%></option>
								<%}
									%>
				</select>
				
				<label id="Tipolabel">Tipo de Solución:</label>
		 		<select name="camposelector" id="Tipotxt" size="30">
						<% ResultSet rss = dba.getSt().executeQuery("SELECT CATTipoDeSolucion.ildTipoDeSolucion,CATTipoDeSolucion.NombreSolucion FROM PUB.CATTipoDeSolucion");
							while(rss.next()){%>
								<option value="<%=rss.getString(1)%>">
									<%=rss.getString(2)%>
								</option><%}
								%>
					</select>
				
				
				<label id="Modulolabel">Modulo:</label>
				<select name="camposelector" id="Modulotxt" size="30" >
						<% ResultSet rsm = dba.getSt().executeQuery("SELECT CATModulo.ildModulo,CATModulo.NombreModulo FROM PUB.CATModulo");
							while(rsm.next()){%>
								<option value="<%=rsm.getString(1)%>"><%=rsm.getString(2)%></option>
							<%}%>
					</select>
				
				
				<label id="Sublabel">Submodulo:</label>
				<input type="Text" name="camposelector" id="Subtxt" size="30" />
				
				
				<label id="Sistlabel">Sistema:</label>
		 		<input type="Text" name="camposelector" id="Sisttxt" size="30" />
				
				
				<input type="button" name="enviar" value="Filtrar" id="btnSubmit" />
				
			</div>
		</div>
	</body>
</html>