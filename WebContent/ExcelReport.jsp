<%@page import="com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Woodstox"%>
<%@page import="jxl.format.CellFormat"%>

<%@page import="jxl.write.Number"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*" %>
<%@ page import="jxl.Workbook" %>
<%@ page import="jxl.WorkbookSettings" %>
<%@ page import="jxl.write.*" %>

<%@ page import="mx.gob.sct.utic.utils.html" %> 
<%@ page import="java.util.ArrayList" %> 
<%@ page import="java.util.Iterator" %> 
<%@ page import="com.sct.incidencias.Conexion.DBConexion" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<%	
      
	try{
        WritableFont wf = new WritableFont( WritableFont.ARIAL, 13, WritableFont.NO_BOLD);
        WritableCellFormat cf = new WritableCellFormat(wf);  
        WritableCellFormat fc = new WritableCellFormat(wf);
        
        try{
        fc.setBackground(Colour.GREEN);
        }catch(WriteException e1){
        	e1.printStackTrace();
        }
        //Interfaz para una hoja de cálculo
        WritableSheet excelSheet = null;
        WritableWorkbook workbook = null;
        
        
		DBConexion dba = new DBConexion();
			

            
            try {
            	ServletOutputStream outputStream = response.getOutputStream();
                workbook = Workbook.createWorkbook(outputStream);
                //hoja con nombre de la tabla
                workbook.createSheet( "persona", 0 );
                excelSheet = workbook.getSheet(0);               
                System.out.println(  "creando hoja excel.....Listo"  );            
            } catch (IOException ex) {
                System.err.println( ex.getMessage() );
            }

            Label fo  = new Label(0,0, "Folio",fc);
            Label  usr = new Label(1,0, "Usuario UR",fc);
	        Label ciscour = new Label(2,0,"Cisco",fc);
	        Label emailur = new Label(3,0,"E-mail",fc);
	        Label ur = new Label(4,0,"Unidad Respondable",fc);
	        Label dept = new Label(5,0,"Departamento",fc);
	        Label est = new Label(6,0,"Estatus",fc);
	        Label mod = new Label(7,0,"Modulo",fc);
	        Label pro = new Label(8,0,"Proceso",fc);
	        Label desin = new Label(9,0,"Descripción de la Incidencia",fc);
	    	Label prio = new Label(10,0,"Prioridad",fc);
	    	Label feen = new Label(11,0,"Fech enviada por el CAT",fc);
	    	Label hoen = new Label(12,0,"Hora enviada por el CAT",fc);
	    	Label usrcat = new Label(13,0,"Usuario CAT",fc);
	    	Label aten = new Label(14,0,"Atendio",fc);
	    	Label featen = new Label(15,0,"Fecha de atención",fc);
	    	Label hoaten = new Label(16,0,"Hora de atencion",fc);
	    	Label tinc = new Label(17,0,"Tipo de Incidencia",fc);
	    	Label tisol = new Label(18,0,"Tipo de Solucion",fc);
	    	Label resp = new Label(19,0,"Respuesta",fc);
	    	Label apro = new Label(20,0,"Aprobación",fc);
	    	Label feapro = new Label(21,0,"Fecha de Aprobación",fc);
	    	Label fella = new Label(22,0,"Fecha de Llamada",fc);
	    	Label holla = new Label(23,0,"Hora de Llamada",fc);
	    	Label comlla = new Label(24,0,"Comentario Llamada",fc);
	    	Label sist = new Label(25,0,"Sistema",fc);
	    	
	    	int widthInChars = 20;
            excelSheet.setColumnView(0,widthInChars);
	    	excelSheet.addCell( fo );
	    	
	    	widthInChars = 48;
            excelSheet.setColumnView(1,widthInChars);
	    	excelSheet.addCell(usr );
	    	
	    	widthInChars = 11;
            excelSheet.setColumnView(2,widthInChars);
	    	excelSheet.addCell( ciscour );
	    	
	    	widthInChars = 35;
            excelSheet.setColumnView(3,widthInChars);
	    	excelSheet.addCell(emailur );
	    	
	    	widthInChars = 60;
            excelSheet.setColumnView(4,widthInChars);
			excelSheet.addCell( ur );
			
			widthInChars = 45;
            excelSheet.setColumnView(5,widthInChars);
			excelSheet.addCell(dept);
			
			widthInChars = 14;
            excelSheet.setColumnView(6,widthInChars);
			excelSheet.addCell(est);
			
			widthInChars = 32;
            excelSheet.setColumnView(7,widthInChars);
			excelSheet.addCell(mod );
			widthInChars = 35;
            excelSheet.setColumnView(8,widthInChars);
			excelSheet.addCell(pro );
			widthInChars = 55;
            excelSheet.setColumnView(9,widthInChars);
			excelSheet.addCell(desin);
			widthInChars = 13;
            excelSheet.setColumnView(10,widthInChars);
			excelSheet.addCell( prio);
			widthInChars = 28;
            excelSheet.setColumnView(11,widthInChars);
			excelSheet.addCell(feen );
			widthInChars = 35;
            excelSheet.setColumnView(12,widthInChars);
			excelSheet.addCell(hoen );
			widthInChars = 35;
            excelSheet.setColumnView(13,widthInChars);
			excelSheet.addCell( usrcat);
			widthInChars = 40;
            excelSheet.setColumnView(14,widthInChars);
			excelSheet.addCell(aten );
			widthInChars = 25;
            excelSheet.setColumnView(15,widthInChars);
			excelSheet.addCell( featen);
			widthInChars = 35;
            excelSheet.setColumnView(16,widthInChars);
			excelSheet.addCell( hoaten);
			widthInChars = 25;
            excelSheet.setColumnView(17,widthInChars);
			excelSheet.addCell( tinc );
			widthInChars = 25;
            excelSheet.setColumnView(18,widthInChars);
			excelSheet.addCell( tisol );
			widthInChars = 55;
            excelSheet.setColumnView(19,widthInChars);
			excelSheet.addCell( resp );
			widthInChars = 13;
            excelSheet.setColumnView(20,widthInChars);
			excelSheet.addCell( apro );
			widthInChars = 45;
            excelSheet.setColumnView(21,widthInChars);
			excelSheet.addCell(feapro );
			widthInChars = 25;
            excelSheet.setColumnView(22,widthInChars);
			excelSheet.addCell(fella );
			widthInChars = 35;
            excelSheet.setColumnView(23,widthInChars);
			excelSheet.addCell(holla );
			widthInChars = 55;
            excelSheet.setColumnView(24,widthInChars);
			excelSheet.addCell(comlla);
			widthInChars = 12;
            excelSheet.setColumnView(25,widthInChars);
			excelSheet.addCell(sist);

	        int row=1;
	        ResultSet rset = null;
	        try{
	        	rset = dba.getSt().executeQuery(
						"SELECT Incidencia.Folio"
						+ ", CATUsuarioUnidadResponsable.NombreResponsable,CATUsuarioUnidadResponsable.APaterno AS AP,CATUsuarioUnidadResponsable.AMaterno AS AM "
						+ ", CATUsuarioUnidadResponsable.CiscoUr"	
						+ ", CATUsuarioUnidadResponsable.EmailUr"
						+ ", CATUnidadResponsable.DescUR"
						+ ", CATDepartamento.NombreDepartamento"
						+ ", CATEstatus.NombreEstatus"
						+ ", CATModulo.NombreModulo "
						+ ", CATProceso.Proceso"
						+ ", Incidencia.DescripcionIncidencia"	
						+ ", Incidencia.Prioridad "
						+ ", Incidencia.FELab "
						+ ", Incidencia.HELab"
						+ ", CATUsuarioCAT.NombreUsuario,CATUsuarioCAT.APaterno,CATUsuarioCAt.AMaterno "
						+ ", CATAtendio.NombreAtendio,CATAtendio.APaterno AS APA,CATAtendio.AMaterno AS AMA"
						+ ", Incidencia.FAtencion"
						+ ", Incidencia.HAtencion"
						+ ", CATTipoDeIncidente.NombreIncidente"
						+ ", CATTipoDeSolucion.NombreSolucion"
						+ ", Incidencia.RespuestaUtic"
						+ ", Incidencia.Aprobado"
						+ ", Incidencia.FechaAprobacion"
					    + ", Incidencia.FLlamada"
					    + ", Incidencia.HLlamada"
					    + ", Incidencia.ComLlamada"
					    + ", CATSistema.NombreSistema"
					    //+ ", CATUsuarioUnidadResponsable.idUsuarioResponsable"
					    + " FROM PUB.Incidencia "							
                                + "LEFT JOIN PUB.CATSistema ON Incidencia.ildSistema = CATSistema.ildSistema "
                                //+ "LEFT JOIN PUB.Incidencia ON Incidencia.ildIncidencia = Incidencia.ildIncidencia "
                                + "LEFT JOIN PUB.CATTipoDeSolucion ON Incidencia.ildTipoDeSolucion = CATTipoDeSolucion.ildTipoDeSolucion "
                                + "LEFT JOIN PUB.CATTipoDeIncidente ON Incidencia.ildIncidente = CATTipoDeIncidente.ildIncidente "  
                                + "LEFT JOIN PUB.CATUsuarioCAT ON Incidencia.ildUsuarioCat = CATUsuarioCAT.ildUsuarioCat " 
                                + "LEFT JOIN PUB.CATAtendio ON Incidencia.ildAtendio = CATAtendio.ildAtendio "
								+ "LEFT JOIN PUB.CATUnidadResponsable ON Incidencia.ildUnidadAdmin = CATUnidadResponsable.ildUnidadAdmin "
								+ "LEFT JOIN PUB.CATDepartamento ON Incidencia.ildDepartamento = CATDepartamento.ildDepartamento "
								+ "LEFT JOIN PUB.CATModulo ON Incidencia.ildModulo = CATModulo.ildModulo "
								+ "LEFT JOIN PUB.CATProceso ON Incidencia.ildProceso = CATProceso.ildProceso "
								+ "LEFT JOIN PUB.CATEstatus ON Incidencia.ildEstatus = CATEstatus.ildEstatus "
								+ "LEFT JOIN PUB.CATUsuarioUnidadResponsable ON Incidencia.idUsuarioResponsable = CATUsuarioUnidadResponsable.idUsuarioResponsable " 
								+ "ORDER BY CATEstatus.NombreEstatus DESC");
				while(rset.next()){

					Label folio  = new Label( 0 , row, rset.getString( "Folio" ) , cf ); 
		            String nombre = rset.getString("NombreResponsable");
		            String ap = rset.getString("AP");
		            String am = rset.getString("AM");
		            String nombreusr = nombre + " " + ap + " " + am;
		            Label usresp = new Label(1,row,nombreusr,cf);
		            Number cisco = new Number(2,row,rset.getInt("CiscoUr"),cf);
		            Label email = new Label(3,row,rset.getString("EmailUr"),cf);
		            Label DescUR = new Label(4,row,rset.getString("DescUR"),cf);
		            Label Departamento= new Label(5,row,rset.getString("NombreDepartamento"),cf);
		            Label Estatus = new Label(6,row,rset.getString("NombreEstatus"),cf);
		            Label Modulo = new Label(7,row,rset.getString("NombreModulo"),cf);
		            Label Proceso = new Label(8,row,rset.getString("Proceso"),cf);
		            Label DescripcionIncidencia = new Label(9,row,rset.getString("DescripcionIncidencia"),cf);
		            Label Prioridad = new Label(10,row,rset.getString("Prioridad"),cf);
		            Label FELab = new Label(11,row,rset.getString("FELab"),cf);
		            Label HELab = new Label(12,row,rset.getString("HELab"),cf);
		           
		            String nomcat = rset.getString("NombreUsuario");
		            String apcat = rset.getString("APaterno");
		            String amcat = rset.getString("AMaterno");
		            String nombrecat = nomcat + " " + apcat + " " + amcat;
		            Label nombcat = new Label(13,row,nombrecat,cf);
		            
		            String nomaten = rset.getString("NombreAtendio");
					String apaten = rset.getString("APA");
					String amaten = rset.getString("AMA");
					String nombaten = nomaten + " " + apaten + " " + amaten;
					Label nombreatendio = new Label(14,row,nombaten,cf);
					Label FAtencion = new Label(15,row,rset.getString("FAtencion"),cf);
					Label HAtencion = new Label(16,row,rset.getString("HAtencion"),cf);
					Label NombreIncidente = new Label(17,row,rset.getString("NombreIncidente"),cf);
					Label NombreSolucion = new Label(18,row,rset.getString("NombreSolucion"),cf);
					Label RespuestaUtic = new Label(19,row,rset.getString("RespuestaUtic"),cf);
					Label Aprobado = new Label(20,row,rset.getString("Aprobado"),cf);
					Label FechaAprobacion = new Label(21,row,rset.getString("FechaAprobacion"),cf);
					Label FLlamada = new Label(22,row,rset.getString("FLlamada"),cf);
					Label HLlamada = new Label(23,row,rset.getString("HLlamada"),cf);
					Label ComLlamada = new Label(24,row,rset.getString("ComLlamada"),cf);
					Label NombreSistema = new Label(25,row,rset.getString("NombreSistema"),cf);

                     row++;
                    
                     excelSheet.addCell(folio);
                     excelSheet.addCell(usresp);
                     excelSheet.addCell(cisco);
                     excelSheet.addCell(email);
                     excelSheet.addCell(DescUR);
                     excelSheet.addCell(Departamento);
                     excelSheet.addCell(Estatus);
                     excelSheet.addCell(Modulo);
                     excelSheet.addCell(Proceso);
                     
                     excelSheet.addCell(DescripcionIncidencia);
                     excelSheet.addCell(Prioridad);
                     excelSheet.addCell(FELab);
                     excelSheet.addCell(HELab);
                               
                     excelSheet.addCell(nombcat);
                     excelSheet.addCell(nombreatendio);
                     excelSheet.addCell(FAtencion);
                     excelSheet.addCell(HAtencion);
                     excelSheet.addCell(NombreIncidente);
                     excelSheet.addCell(NombreSolucion);
                     excelSheet.addCell(RespuestaUtic);
                     excelSheet.addCell(Aprobado);
                     excelSheet.addCell(FechaAprobacion);
                     excelSheet.addCell(FLlamada);
                     excelSheet.addCell(HLlamada);
                     excelSheet.addCell(ComLlamada);
                     excelSheet.addCell(NombreSistema);
				}	
	        }catch(SQLException e){
	        	e.printStackTrace();
	        }finally{
	        	try{
	        		if(dba != null){
	        			DBConexion.liberarConexion(dba.getCt());
	        		}else if(rset != null){
	        			rset.close();
	        		}
	        	}catch(SQLException e){
	        		e.printStackTrace();
	        	}
	        }
	        
	        try {
	        	response.setContentType("application/vnd.ms-excel");
	        	response.setHeader("Content-Disposition","attachment;filename=\"ReporteIncidencia.xls\"");
	        	workbook.write();	            
	            workbook.close();
	            out.clear();
	            out = pageContext.pushBody();
	            System.out.println(  "Escribiendo en disco....Listo"  );         
	        } catch (IOException ex) {
	            System.err.println(  ex.getMessage() );
	        }
	        catch (WriteException ex) {
	           System.err.println(  ex.getMessage() );
	        }

	        System.out.println(  "Proceso completado...."  );
			RequestDispatcher rd = request.getRequestDispatcher("vista.jsp");
			rd.forward(request, response);
				
	}catch ( Exception ex ){
	}%>
</body>
</html>