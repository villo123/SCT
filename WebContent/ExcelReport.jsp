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
		Excel Report
	
	<%	
      
	try{
		//html utils = new html();
    	//ArrayList registros = utils.getIncidencias();
    	//Iterator it = registros.iterator();
			
        //formato fuente para el contenido contenido
         File file = new File("C:\\Users\\Brayan\\output.xls");
        WritableFont wf = new WritableFont( WritableFont.ARIAL, 12, WritableFont.NO_BOLD );
        WritableCellFormat cf = new WritableCellFormat(wf);  
        
       

        //Interfaz para una hoja de cálculo
        WritableSheet excelSheet = null;
        WritableWorkbook workbook = null;
        
        
			DBConexion dba = new DBConexion();
			

            
            try {
                workbook = Workbook.createWorkbook(file);
                //hoja con nombre de la tabla
                workbook.createSheet( "persona", 0 );
                excelSheet = workbook.getSheet(0);               
                System.out.println(  "creando hoja excel.....Listo"  );            
            } catch (IOException ex) {
                System.err.println( ex.getMessage() );
            }

            Label fo  = new Label(0,0, "Folio",cf);
            Label  usr = new Label(1,0, "Usuario UR",cf);
	        Label ciscour = new Label(2,0,"Cisco",cf);
	        Label emailur = new Label(3,0,"E-mai",cf);
	        Label ur = new Label(4,0,"Unidad Respondable",cf);
	        Label dept = new Label(5,0,"Departamento",cf);
	        Label est = new Label(6,0,"Estatus",cf);
	        Label mod = new Label(7,0,"Modulo",cf);
	        Label pro = new Label(8,0,"Proceso",cf);
	        Label desin = new Label(9,0,"Descripción de la Incidencia",cf);
	    	Label prio = new Label(10,0,"Prioridad",cf);
	    	Label feen = new Label(11,0,"Fech enviada por el CAT",cf);
	    	Label hoen = new Label(12,0,"Hora enviada por el CAT",cf);
	    	Label usrcat = new Label(13,0,"Usuario CAT",cf);
	    	Label aten = new Label(14,0,"Atendio",cf);
	    	Label featen = new Label(15,0,"Fecha de atención",cf);
	    	Label hoaten = new Label(16,0,"Hora de atencion",cf);
	    	Label tinc = new Label(17,0,"Tipo de Incidencia",cf);
	    	Label tisol = new Label(18,0,"Tipo de Solucion",cf);
	    	Label resp = new Label(19,0,"Respuesta",cf);
	    	Label apro = new Label(20,0,"Aprobación",cf);
	    	Label feapro = new Label(21,0,"Fecha de Aprobación",cf);
	    	Label fella = new Label(22,0,"Fecha de Llamada",cf);
	    	Label holla = new Label(23,0,"Hora de Llamada",cf);
	    	Label comlla = new Label(24,0,"Comentario Llamada",cf);
	    	Label sist = new Label(25,0,"Sistema",cf);
	    	excelSheet.addCell( fo );

	    	excelSheet.addCell(usr );
	    	excelSheet.addCell( ciscour );
	    	excelSheet.addCell(emailur );
			excelSheet.addCell( ur );
			excelSheet.addCell(dept);
			excelSheet.addCell(est);
			excelSheet.addCell(mod );
			excelSheet.addCell(pro );
			excelSheet.addCell(desin);
			excelSheet.addCell( prio);
			excelSheet.addCell(feen );
			excelSheet.addCell(hoen );
			excelSheet.addCell( usrcat);
			excelSheet.addCell(aten );
			excelSheet.addCell( featen);
			excelSheet.addCell( hoaten);
			excelSheet.addCell( tinc );
			excelSheet.addCell( tisol );
			excelSheet.addCell( resp );
			excelSheet.addCell( apro );
			excelSheet.addCell(feapro );
			excelSheet.addCell(fella );
			excelSheet.addCell(holla );
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
								+ "LEFT JOIN PUB.CATUsuarioUnidadResponsable ON Incidencia.idUsuarioResponsable = CATUsuarioUnidadResponsable.idUsuarioResponsable");
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
	            workbook.write();
	            workbook.close();
	            System.out.println(  "Escribiendo en disco....Listo"  );         
	        } catch (IOException ex) {
	            System.err.println(  ex.getMessage() );
	        }
	        catch (WriteException ex) {
	           System.err.println(  ex.getMessage() );
	        }

	        System.out.println(  "Proceso completado...."  );
				

			/* ;*/
			
				
			
			/**/

			/*int c = 0;
			while(it.hasNext()){
           	 c++;
           	 String[] columnas = (String[])it.next();
           	 	for(int x = 0; x <= columnas.length;x++){
           	 	}
			}	*/	
			/*row.createCell((short)0).setCellValue(value1);
			row.createCell((short)1).setCellValue(value2);
			row.createCell((short)2).setCellValue(value3);
			row.createCell((short)3).setCellValue(value4);
			row.createCell((short)4).setCellValue(value5);
			row.createCell((short)5).setCellValue(value6);*/

			out.println("Data is saved in excel file.");
	}catch ( Exception ex ){
	}%>
</body>
</html>