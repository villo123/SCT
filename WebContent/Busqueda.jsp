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
			<center><h1>Filtrar Incidencia</h1></center>
			<div class="container">
				<label id="Foliolabel">Folio:</label>
				<input type="Text" name="camposelector" id="Foliotxt" size="30" />
				
				<label id="Unitlabel">Unidad Administrativa:</label>
                    <select id="Unittxt" name="unidadresponsable">
                    	<% ResultSet rsu = dba.getSt().executeQuery("SELECT CATUnidadResponsable.ildUnidadAdmin,CATUnidadResponsable.DescUR FROM PUB.CATUnidadResponsable");
							while(rsu.next()){%>
								<option value="<%=rsu.getString(1)%>"><%=rsu.getString(2)%></option>
							<%}%>
					</select><br />
				
				
				<label id="Estatuslabel">Estatus:</label>
				<select id="Estatustxt" name="estatus">
					<% ResultSet rse = dba.getSt().executeQuery("SELECT CATEstatus.ildEstatus,CATEstatus.NombreEstatus FROM PUB.CATEstatus");
							while(rse.next()){%>
								<option value="<%=rse.getString(1)%>"><%=rse.getString(2)%></option>
								<%}
									%>
				</select><br />
				
				<label id="Tipolabel">Tipo de solucion:</label>
					<select name="camposelector" id="Tipotxt">
						<% ResultSet rss = dba.getSt().executeQuery("SELECT CATTipoDeSolucion.ildTipoDeSolucion,CATTipoDeSolucion.NombreSolucion FROM PUB.CATTipoDeSolucion");
							while(rss.next()){%>
								<option value="<%=rss.getString(1)%>">
									<%=rss.getString(2)%>
								</option><%}
								%>
					</select><br />
				
				
				<label id="Modulolabel">Modulo:</label>
					<select id="Modulotxt" class="nactxt" name="camposelector">
						<% ResultSet rsm = dba.getSt().executeQuery("SELECT CATModulo.ildModulo,CATModulo.NombreModulo FROM PUB.CATModulo");
							while(rsm.next()){%>
								<option value="<%=rsm.getString(1)%>"><%=rsm.getString(2)%></option>
							<%}%>
					</select><br />
				
				
				<label id="Sublabel">Proceso:</label>
					<select name="camposelector" id="Subtxt">
						<% ResultSet rsp = dba.getSt().executeQuery("SELECT CATProceso.ildProceso,CATProceso.Proceso FROM PUB.CATProceso");
							while(rsp.next()){%>
								<option value="<%=rsp.getString(1)%>"><%=rsp.getString(2)%></option>
								<%}%>
					</select><br />
					
					<label id="Sistlabel">Sistema:</label>
					<select name="camposelector" id="Sisttxt">
						<% ResultSet rsx = dba.getSt().executeQuery("SELECT CATSistema.ildSistema,CATSistema.NombreSistema FROM PUB.CATSistema");
							while(rsx.next()){%>
								<option value="<%=rsx.getString(1)%>"><%=rsx.getString(2)%></option>
								<%}%>
					</select><br />
					
				
				
				<input type="button" name="enviar" value="Filtrar" id="btnSubmit" />
				
			</div>
		</div>
	</body>
</html>