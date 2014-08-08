package com.sct.incidencias.InsertarFor;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sct.incidencias.Conexion.DBConexion;
import com.sct.incidencias.catalogos.*;

import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;


@WebServlet("/InsertarFormulario")
public class InsertarFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection ct;
	private static Statement st;
	static PreparedStatement pst = null;
	static ResultSet rs = null;

    public InsertarFormulario() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		INCIDENCIA inc = new INCIDENCIA();
		String folio = request.getParameter("folio");
		inc.setFolio(folio);

	
		CATUsuarioUnidadResponsable catusunr = new CATUsuarioUnidadResponsable();
		
		String nombreresponsable = request.getParameter("nombreur");
		catusunr.setNombreResponsable(nombreresponsable);
		
		String responsableAPaterno= request.getParameter("APur");
		catusunr.setAPaterno(responsableAPaterno);
		
		String responsableAMaterno = request.getParameter("AMur");
		catusunr.setAMaterno(responsableAMaterno);
		
		String responsableCisco = request.getParameter("ciscour");
		catusunr.setCiscoUr(Integer.parseInt(responsableCisco));
		
		String responsableEmail = request.getParameter("emailur");
		catusunr.setEmailUr(responsableEmail);
		
		CATUnidadResponsable catur = new CATUnidadResponsable();
		String unidadrespoildUnidadAdm = request.getParameter("unidadresponsable");
		catur.setildUnidadAdm(Integer.parseInt(unidadrespoildUnidadAdm));
		catusunr.setildUnidadAdm(Integer.parseInt(unidadrespoildUnidadAdm));
		
		CATDepartamento catdep = new CATDepartamento();
		String ildDepartamento = request.getParameter("departamento");
		catdep.setildDepartamento(Integer.parseInt(ildDepartamento));
		

		CATModulo catmod = new CATModulo();
		String ildModulo = request.getParameter("modulo");
		catmod.setildModulo(Integer.parseInt(ildModulo));
		
		CATProceso catpro = new CATProceso();
		String ildProceso = request.getParameter("proceso");
		catpro.setildProceso(Integer.parseInt(ildProceso));

		CATTipoDeIncidente cattipin = new CATTipoDeIncidente();
		String ildIncidente = request.getParameter("tipodeincidencias");
		cattipin.setildIncidente(Integer.parseInt(ildIncidente));
		
		CATTipoDeSolucion cattipsol = new CATTipoDeSolucion();
		String ildTipoDeSolucion = request.getParameter("tipodesolucion");
		cattipsol.setildTipoDeSolucion(Integer.parseInt(ildTipoDeSolucion));
		
		
		String Aprobado = request.getParameter("aprobacion");
		inc.setAprobado(Aprobado);
		

		String FechaAprobacion = request.getParameter("fechaaprobacion");//PENDIENTE
		//SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		java.sql.Date fechaaprobacion=java.sql.Date.valueOf(FechaAprobacion);
		inc.setFechaAprobacion(fechaaprobacion);
	
		String DescripcionIncidencia = request.getParameter("descripcionincidencia");
		inc.setDescripcionIncidencia(DescripcionIncidencia);
		
		CATEstatus cates = new CATEstatus();
		String ildEstatus = request.getParameter("estatus");
		cates.setildEstatus(Integer.parseInt(ildEstatus));
		
		String Prioridad = request.getParameter("prioridad");
		inc.setPrioridad(Prioridad);
		
		
		String FELab = request.getParameter("fechamesa");//Pendiente
		java.sql.Date fechamesa =java.sql.Date.valueOf(FELab);
		inc.setFELab(fechamesa);
		
		
		String HELab = request.getParameter("timepickermesa");//pendiente
		java.sql.Time horamesa = java.sql.Time.valueOf(HELab+":00");
		inc.setHELab(horamesa);

		CATUsuarioCAT caturcat = new CATUsuarioCAT();
		String UsuarioCAT = request.getParameter("usuariocat");//separar strings
		caturcat.setildUsuarioCat(Integer.parseInt(UsuarioCAT));
		
		/*if(NombreUsuarioCAT.equals("Michel Báez Aguirre")){
			NombreUsuarioCAT = "Michel Báez Aguirre";
			String nombre = "";
			String ap = "";
			String am = "";
			StringTokenizer tokens = new StringTokenizer(NombreUsuarioCAT);

			while(tokens.hasMoreTokens()){
			nombre = tokens.nextToken();
			ap = tokens.nextToken();
			am = tokens.nextToken();	
			}
			caturcat.setNombreUsuario(nombre);
			caturcat.setAPaterno(ap);
			caturcat.setAMaterno(am);
		}else if(NombreUsuarioCAT.equals("Daniel Cortes Cortes")){
			NombreUsuarioCAT = "Daniel Cortes Cortes";
			String nombre = "";
			String ap = "";
			String am = "";

			StringTokenizer tokens = new StringTokenizer(NombreUsuarioCAT);

			while(tokens.hasMoreTokens()){
			nombre = tokens.nextToken();
			ap = tokens.nextToken();
			am= tokens.nextToken();	
			}
			caturcat.setNombreUsuario(nombre);
			caturcat.setAPaterno(ap);
			caturcat.setAMaterno(am);
		}else if(NombreUsuarioCAT.equals("Pedro Sánchez García")){
			NombreUsuarioCAT = "Pedro Sánchez García";
			String nombre = "";
			String ap = "";
			String am = "";
			
			StringTokenizer tokens = new StringTokenizer(NombreUsuarioCAT);
			
			while(tokens.hasMoreTokens()){
				nombre = tokens.nextToken();
				ap = tokens.nextToken();
				am= tokens.nextToken();	
				}
				caturcat.setNombreUsuario(nombre);
				caturcat.setAPaterno(ap);
				caturcat.setAMaterno(am);
		}else if(NombreUsuarioCAT.equals("Ricardo Hernández Tovar")){
			NombreUsuarioCAT = "Ricardo Hernández Tovar";
			String nombre = "";
			String ap = "";
			String am = "";
			
			StringTokenizer tokens = new StringTokenizer(NombreUsuarioCAT);
			
			while(tokens.hasMoreTokens()){
				nombre = tokens.nextToken();
				ap = tokens.nextToken();
				am= tokens.nextToken();	
				}
				caturcat.setNombreUsuario(nombre);
				caturcat.setAPaterno(ap);
				caturcat.setAMaterno(am);
		}else if(NombreUsuarioCAT.equals("Yosimar Nolasco Garduño")){
			NombreUsuarioCAT = "Yosimar Nolasco Garduño";
			String nombre = "";
			String ap = "";
			String am = "";
			
			StringTokenizer tokens = new StringTokenizer(NombreUsuarioCAT);
			
			while(tokens.hasMoreTokens()){
				nombre = tokens.nextToken();
				ap = tokens.nextToken();
				am= tokens.nextToken();	
				}
				caturcat.setNombreUsuario(nombre);
				caturcat.setAPaterno(ap);
				caturcat.setAMaterno(am);
		}else if(NombreUsuarioCAT.equals("Alberto Angel Muñiz Colin")){
			NombreUsuarioCAT = "Alberto Angel Muñiz Colin";
			String nombre1 = "";
			String nombre2 = "";
			String ap = "";
			String am = "";
			String nombre = "";
			
			StringTokenizer tokens = new StringTokenizer(NombreUsuarioCAT);
			
			while(tokens.hasMoreTokens()){
				nombre1 = tokens.nextToken();
				nombre2 = tokens.nextToken();
				ap = tokens.nextToken();
				am= tokens.nextToken();	
				}
			
			nombre = nombre1 + " " + nombre2;
		
			caturcat.setNombreUsuario(nombre);
			caturcat.setAPaterno(ap);
			caturcat.setAMaterno(am);
		}else if(NombreUsuarioCAT.equals("Iván Roberto Apolinar González")){
			NombreUsuarioCAT = "Iván Roberto Apolinar González";
			String nombre1 = "";
			String nombre2 = "";
			String ap = "";
			String am = "";
			String nombre = "";
			
			StringTokenizer tokens = new StringTokenizer(NombreUsuarioCAT);
			
			while(tokens.hasMoreTokens()){
				nombre1 = tokens.nextToken();
				nombre2 = tokens.nextToken();
				ap = tokens.nextToken();
				am= tokens.nextToken();	
				}
			
			nombre = nombre1 + " " + nombre2;
		
			caturcat.setNombreUsuario(nombre);
			caturcat.setAPaterno(ap);
			caturcat.setAMaterno(am);
		}else if(NombreUsuarioCAT.equals("Perla Sarai López Varona")){
			NombreUsuarioCAT = "Perla Sarai López Varona";
			String nombre1 = "";
			String nombre2 = "";
			String ap = "";
			String am = "";
			String nombre = "";
			
			StringTokenizer tokens = new StringTokenizer(NombreUsuarioCAT);
			
			while(tokens.hasMoreTokens()){
				nombre1 = tokens.nextToken();
				nombre2 = tokens.nextToken();
				ap = tokens.nextToken();
				am= tokens.nextToken();	
				}
			
			nombre = nombre1 + " " + nombre2;
		
			caturcat.setNombreUsuario(nombre);
			caturcat.setAPaterno(ap);
			caturcat.setAMaterno(am);
		}*/
			/*System.out.println(caturcat.getNombreUsuario());
			System.out.println(caturcat.getAPaterno());
			System.out.println(caturcat.getAMaterno());*/

		/*String EmailCAT = request.getParameter("emailcat");
		caturcat.setEmailCat(EmailCAT);
		
		String CiscoCAT = request.getParameter("ciscocat");
		caturcat.setCiscoCat(Integer.parseInt(CiscoCAT));*/

		
		CATAtendio catate = new CATAtendio();
		String atendio = request.getParameter("atendio");
		catate.setildAtendio(Integer.parseInt(atendio));
		/*String NombreAtendio = request.getParameter("atendio");//separar strings
		if(NombreAtendio.equals("Abraham Martinez Alejo")){
			NombreAtendio = "Abraham Martinez Alejo";
			String nombre = "";
			String ap = "";
			String am = "";

			StringTokenizer tokens = new StringTokenizer(NombreAtendio);

			while(tokens.hasMoreTokens()){
				nombre = tokens.nextToken();
				ap = tokens.nextToken();
				am = tokens.nextToken();	
			}
			catate.setNombreAtendio(nombre);
			catate.setAPaterno(ap);
			catate.setAMaterno(am);
		}else if(NombreAtendio.equals("Adrian Ramiro Bonilla")){
			NombreAtendio = "Adrian Ramiro Bonilla";
			String nombre = "";
			String ap = "";
			String am = "";

			StringTokenizer tokens = new StringTokenizer(NombreAtendio);

			while(tokens.hasMoreTokens()){
				nombre = tokens.nextToken();
				ap = tokens.nextToken();
				am = tokens.nextToken();	
			}
			catate.setNombreAtendio(nombre);
			catate.setAPaterno(ap);
			catate.setAMaterno(am);
		}else if(NombreAtendio.equals("David de Léon Muñoz")){
			NombreAtendio = "David de Léon Muñoz";
			String nombre = "";
			String ap1 = "";
			String ap2 = "";
			String am = "";
			String ap = "";
			
			StringTokenizer tokens = new StringTokenizer(NombreAtendio);
			
			while(tokens.hasMoreTokens()){
				nombre = tokens.nextToken();
				ap1 = tokens.nextToken();
				ap2= tokens.nextToken();
				am = tokens.nextToken();
			}
			ap = ap1 + " " + ap2;
			
			catate.setNombreAtendio(nombre);
			catate.setAPaterno(ap);
			catate.setAMaterno(am);
		}else if(NombreAtendio.equals("Diego Alberto Mejia Rodriguez")){
			NombreAtendio = "Diego Alberto Mejia Rodriguez";
			String nombre1 = "";
			String nombre2 = "";
			String ap = "";
			String am = "";
			String nombre = "";
			
			StringTokenizer tokens = new StringTokenizer(NombreAtendio);
			
			while(tokens.hasMoreTokens()){
				nombre1 = tokens.nextToken();
				nombre2 = tokens.nextToken();
				ap = tokens.nextToken();
				am= tokens.nextToken();	
				}
			
			nombre = nombre1 + " " + nombre2;
		
			catate.setNombreAtendio(nombre);
			catate.setAPaterno(ap);
			catate.setAMaterno(am);
		}else if(NombreAtendio.equals("Edgar de Jesus Ramirez Cano")){
			NombreAtendio = "Edgar de Jesus Ramirez Cano";
			String nombre1 = "";
			String nombre2 = "";
			String nombre3 = "";
			String ap = "";
			String am = "";
			
			String nombre = "";
			
			StringTokenizer tokens = new StringTokenizer(NombreAtendio);
			
			while(tokens.hasMoreTokens()){
				nombre1 = tokens.nextToken();
				nombre2 = tokens.nextToken();
				nombre3 = tokens.nextToken();
				ap = tokens.nextToken();
				am= tokens.nextToken();	
				}
			
			nombre = nombre1 + " " + nombre2 + " " + nombre3;
		
			catate.setNombreAtendio(nombre);
			catate.setAPaterno(ap);
			catate.setAMaterno(am);
		}else if(NombreAtendio.equals("Ernesto Gonzalez Hernandez")){
			NombreAtendio = "Ernesto Gonzalez Hernandez";
			String nombre = "";
			String ap = "";
			String am = "";

			StringTokenizer tokens = new StringTokenizer(NombreAtendio);

			while(tokens.hasMoreTokens()){
				nombre = tokens.nextToken();
				ap = tokens.nextToken();
				am= tokens.nextToken();	
			}
			catate.setNombreAtendio(nombre);
			catate.setAPaterno(ap);
			catate.setAMaterno(am);
		}else if(NombreAtendio.equals("Gabriel Rioja Argumedo")){
			NombreAtendio = "Gabriel Rioja Argumedo";
			String nombre = "";
			String ap = "";
			String am = "";

			StringTokenizer tokens = new StringTokenizer(NombreAtendio);

			while(tokens.hasMoreTokens()){
				nombre = tokens.nextToken();
				ap = tokens.nextToken();
				am= tokens.nextToken();	
			}
			catate.setNombreAtendio(nombre);
			catate.setAPaterno(ap);
			catate.setAMaterno(am);
		}else if(NombreAtendio.equals("Miguel Vega Vivas")){
			NombreAtendio = "Miguel Vega Vivas";
			String nombre = "";
			String ap = "";
			String am = "";

			StringTokenizer tokens = new StringTokenizer(NombreAtendio);

			while(tokens.hasMoreTokens()){
				nombre = tokens.nextToken();
				ap = tokens.nextToken();
				am= tokens.nextToken();	
			}
			catate.setNombreAtendio(nombre);
			catate.setAPaterno(ap);
			catate.setAMaterno(am);
		}*/
		String FAtencion = request.getParameter("fechaatencion");
		java.sql.Date fechaatencion =java.sql.Date.valueOf(FAtencion);
		inc.setFAtencion(fechaatencion);
		
		//SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		//java.sql.Date fecha=java.sql.Date.valueOf(FAtencion);
		//inc.setFAtencion(fecha);

		/*DBConexion db = new DBConexion();
		try {
			PreparedStatement ps = db.getCt().prepareStatement("INSERT INTO PUB.INCIDENCIA (FAtencion) VALUES (?)");
			ps.setDate(1,(java.sql.Date) inc.getFAtencion());
			ps.executeUpdate();
			System.out.println("Se efectuo correctamente el Insert");
			db.getCt().close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("No se hizo insert");
		}*/
		
		String HAtencion = request.getParameter("timepickeratencion");//Pendiente
		java.sql.Time horatencion = java.sql.Time.valueOf(HAtencion+":00");
		inc.setHAtencion(horatencion);

		//Archivo
		
		String RespuestaUtic = request.getParameter("respuesta");
		inc.setRespuestaUtic(RespuestaUtic);
		
		/*System.out.println("Folio: " + inc.getFolio());
		System.out.println("Nombre Usuario Responsable: " + catunr.getNombreResponsable());
		System.out.println("Apellido Paterno Usuario Responsable: " + catunr.getAPaterno());
		System.out.println("Apellido Materno Usuario Responsable: " + catunr.getAMaterno());
		System.out.println("Cisco de Usuario Responsable: " + catunr.getCisco());
		System.out.println("Email Usuario Responsable: " + catunr.getEmail());
		System.out.println("Unidad Responsable (ID): " + catunr.getildUnidadAdm());
		System.out.println("Departamento (ID): " + catdep.getildDepartamento());
		System.out.println("Modulo (ID): " + catmod.getildModulo());
		System.out.println("Proceso (ID): " + catpro.getildProceso());
		System.out.println("Tipo de Incidente (ID): " + cattipin.getildIncidente());
		System.out.println("Tipo de Solucion (ID): " + cattipsol.getildTipoDeSolucion());
		System.out.println("Aprobado: " + inc.getAprobado());
		System.out.println("Fecha de Aprobacion: "  + inc.getFechaAprobacion());
		System.out.println("Descripcion Incidencia: " + inc.getDescripcionIncidencia());
		System.out.println("Estatus: " + cates.getildEstatus());
		System.out.println("Prioridad " + inc.getPrioridad());
		System.out.println("Fecha enviada por la mesa: " + inc.getFELab());
		System.out.println("Hora enviada por la mesa: " + inc.getHELab());
		System.out.println("Nombre usuario Cat (ID): " + caturcat.getildUsuarioCat());
		System.out.println("Email Cat: " + caturcat.getEmail());
		System.out.println("Cisco Cat: " +  caturcat.getCisco());
		System.out.println("Nombre Atendio (ID): " +  catate.getildAtendio());
		System.out.println("Fecha Atencion: " + inc.getFAtencion());
		System.out.println("Hora de Atencion: " + inc.getHAtencion());
		System.out.println("Respuesta Utic: " + inc.getRespuestaUtic());*/
		
		
		//inc.setFolio(Integer.parseInt(folio));
		//System.out.println(inc.getFolio() + 5);
		
		try{
			String databaseURL = "jdbc:datadirect:openedge://localhost:30060;schemaDefault=PUB;databaseName=incidencias.db;user=sysprogress;password=sysprogress";
			Class.forName("com.ddtek.jdbc.openedge.OpenEdgeDriver");
			System.out.println("Controlador cargado");
			ct = DriverManager.getConnection(databaseURL);
			st = ct.createStatement();
			System.out.println("Conexion exitosa");
            PreparedStatement ps = ct.prepareStatement("INSERT INTO PUB.Incidencia (ildIncidencia,"
            		+ "ildSistema,"
            		+ "ildAtendio,"
            		+ "ildDepartamento,"
            		+ "ildEstatus,"
            		+ "ildTipoDeSolucion,"
            		+ "ildUnidadAdmin,"
            		+ "ildUsuarioCat,"
            		+ "ildIncidente,"
            		+ "idUsuarioResponsable,"
            		+ "Folio, "
            		+ "Aprobado,"
            		+ "FechaAprobacion,"
            		+ "DescripcionIncidencia,"
            		+ "Prioridad,"
            		+ "FELab,"
            		+ "HELab,"
            		+ "FAtencion,"
            		+ "HAtencion,"
            		+ "RespuestaUtic) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");//WHERE ildUnidadAdmin = (?) AND ildDepartamento = (?) AND ildModulo = (?) AND ildProceso = (?) AND ildIncidente = (?) AND ildTipoDeSolucion = (?) AND ildEstatus = (?) AND ildUsuarioCat = (?) AND ildAtendio = (?)");
            
            ps.setString(1, "2");
            ps.setString(2, "1"); 
            ps.setString(3, Integer.toString(catate.getildAtendio()));
            ps.setString(4, Integer.toString(catdep.getildDepartamento()));
            ps.setString(5, Integer.toString(cates.getildEstatus()));
            ps.setString(6, Integer.toString(cattipsol.getildTipoDeSolucion()));
            ps.setString(7, Integer.toString(catur.getildUnidadAdm()));
            ps.setString(8, Integer.toString(caturcat.getildUsuarioCat()));
            ps.setString(9,	Integer.toString(cattipin.getildIncidente()));
            ps.setString(10, "2");
            ps.setString(11, inc.getFolio());
            ps.setString(12, inc.getAprobado());
            ps.setDate(13, (java.sql.Date)inc.getFechaAprobacion());
            ps.setString(14, inc.getDescripcionIncidencia());
            ps.setString(15 ,inc.getPrioridad());
            ps.setDate(16, (java.sql.Date)inc.getFELab());
            ps.setTime(17, (java.sql.Time)inc.getHELab());            
            ps.setDate(18, (java.sql.Date)inc.getFAtencion());
            ps.setTime(19,(java.sql.Time) inc.getHAtencion());
            ps.setString(20, inc.getRespuestaUtic());
            
           /* ps.setString(12, Integer.toString(catunr.getildUnidadAdm()));
            ps.setString(13, Integer.toString(catdep.getildDepartamento()));
            ps.setString(14, Integer.toString(catmod.getildModulo()));
            ps.setString(15, Integer.toString(catpro.getildModulo()));
            ps.setString(16, Integer.toString(cattipin.getildIncidente()));
            ps.setString(17, Integer.toString(cattipsol.getildTipoDeSolucion()));
            ps.setString(18, Integer.toString(cates.getildEstatus()));
            ps.setString(19, Integer.toString(caturcat.getildUsuarioCat()));
            ps.setString(20, Integer.toString(catate.getildAtendio()));*/
            
            
            
            PreparedStatement ps2 = ct.prepareStatement("INSERT INTO PUB.CATUsuarioUnidadResponsable (idUsuarioResponsable,"
            													+"ildUnidadAdm,"
            													+"NombreResponsable,"
            													+"APaterno,"
													            +"AMaterno,"
													            +"CiscoUr,"
													            +"EmailUr) VALUES (?,?,?,?,?,?,?)");// WHERE ildUnidadAdmin = (?)");
            ps2.setString(1, "2");
            ps2.setString(2, Integer.toString(catusunr.getildUnidadAdm()));
            ps2.setString(3, catusunr.getNombreResponsable());
            ps2.setString(4, catusunr.getAPaterno());
            ps2.setString(5, catusunr.getAMaterno());
            ps2.setString(6, Integer.toString(catusunr.getCiscoUr()));
            ps2.setString(7, catusunr.getEmailUr());
           // ps2.setString(5, Integer.toString(catunr.getildUnidadAdm()));
            
            //PreparedStatement ps3 = ct.prepareStatement("INSERT INTO PUB.CATEstatus (NombreEstatus)"
            				//								+ " VALUES (?)");//WHERE ildEstatus = (?)");
            
           // ps3.setString(1, cates.getNombreEstatus());
           // ps3.setString(2, Integer.toString(cates.getildEstatus()));
            
          /* PreparedStatement ps4 = ct.prepareStatement("INSERT INTO PUB.CATUsuarioCAT (CiscoCat,"
            												+ "EmailCat) VALUES (?,?)");// WHERE ildUsuarioCat = (?)");
            ps4.setString(1, Integer.toString(caturcat.getCiscoCat()));
            ps4.setString(2, caturcat.getEmailCat());*/
           // ps4.setString(3, Integer.toString(caturcat.getildUsuarioCat()));
            
           /* PreparedStatement ps5 = ct.prepareStatement("SELECT ildUsuarioUtic FROM PUB.Incidencia "
            											+ "WHERE"
            											+ "ildUnidadAdmin = (?) "
            											+ "AND ildDepartamento = (?) "
            											+ "AND ildModulo = (?) "
            											+ "AND ildProceso = (?) "
            											+ "AND ildIncidente = (?) "
            											+ "AND ildTipoDeSolucion = (?) "
            											+ "AND ildEstatus = (?) "
            											+ "AND ildUsuarioCat = (?) "
            											+ "AND ildAtendio = (?)");
			
            ps5.setInt(1, catunr.getildUnidadAdm());
            ps5.setInt(2, catdep.getildDepartamento());
            ps5.setInt(3, catmod.getildModulo());
            ps5.setInt(4, catpro.getildProceso());
            ps5.setInt(5, cattipin.getildIncidente());
            ps5.setInt(6, cattipsol.getildTipoDeSolucion());
            ps5.setInt(7, cates.getildEstatus());
            ps5.setInt(8, caturcat.getildUsuarioCat());
            ps5.setInt(9, catate.getildAtendio());*/
            
            ps.executeUpdate();
            ps2.executeUpdate();
          //ct.close();
			System.out.println("Insercion correcta");
			//ct.close();
		}catch(SQLException e){
			//System.out.println("No se pudo insertar");
			e.printStackTrace();
			System.out.println();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassnotFoundException");
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("formulario.jsp");
		rd.forward(request, response);
	}

}
