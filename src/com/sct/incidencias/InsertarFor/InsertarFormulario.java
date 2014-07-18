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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;


@WebServlet("/InsertarFormulario")
public class InsertarFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public InsertarFormulario() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		INCIDENCIA inc = new INCIDENCIA();
		String folio = request.getParameter("folio");
		inc.setFolio(Integer.parseInt(folio));

	
		CATUnidadResponsable catunr = new CATUnidadResponsable();
		String nombreresponsable = request.getParameter("nombreur");
		catunr.setNombreResponsable(nombreresponsable);
		String responsableAPaterno= request.getParameter("APur");
		catunr.setAPaterno(responsableAPaterno);
		String responsableAMaterno = request.getParameter("AMur");
		catunr.setAMaterno(responsableAMaterno);
		String responsableCisco = request.getParameter("ciscour");
		catunr.setCisco(Integer.parseInt(responsableCisco));
		String responsableEmail = request.getParameter("emailur");
		catunr.setEmail(responsableEmail);
		String unidadrespoDescUR = request.getParameter("unidadresponsable");
		catunr.setDescUR(unidadrespoDescUR);

		CATDepartamento catdep = new CATDepartamento();
		String NombreDepartamento = request.getParameter("departamento");
		catdep.setNombreDepartamento(NombreDepartamento);

		CATModulo catmod = new CATModulo();
		String NombreModulo = request.getParameter("modulo");
		catmod.setNombreModulo(NombreModulo);
		
		CATProceso catpro = new CATProceso();
		String Proceso = request.getParameter("proceso");
		catpro.setProceso(Proceso);

		CATTipoDeIncidente cattipin = new CATTipoDeIncidente();
		String NombreIncidente = request.getParameter("tipodeincidencias");
		cattipin.setNombreIncidente(NombreIncidente);
		
		CATTipoDeSolucion cattipsol = new CATTipoDeSolucion();
		String NombreSolucion = request.getParameter("tipodesolucion");
		cattipsol.setNombreSolucion(NombreSolucion);
		
		
		String Aprobado = request.getParameter("aprobacion");
		inc.setAprobado(Aprobado);
		

		String FechaAprobacion = request.getParameter("fechaaprobacion");//PENDIENTE
		/*SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try{
			String date = formatter.format(FechaAprobacion);
			Date date2 = formatter.parse(date);
			inc.setFechaAprobacion(date2);
		}catch(ParseException e){
			e.printStackTrace();
		}
		System.out.println(inc.getFechaAprobacion());*/
	
		String DescripcionIncidencia = request.getParameter("descripcionincidencia");
		inc.setDescripcionIncidencia(DescripcionIncidencia);
		
		CATEstatus cates = new CATEstatus();
		String NombreEstatus = request.getParameter("estatus");
		cates.setNombreEstatus(NombreEstatus);
		
		String Prioridad = request.getParameter("prioridad");
		inc.setPrioridad(Prioridad);
		String FELab = request.getParameter("fechamesa");//Pendiente
		String HELab = request.getParameter("timepickermesa");//pendiente

		CATUsuarioCAT caturcat = new CATUsuarioCAT();
		String NombreUsuarioCAT = request.getParameter("usuariocat");//separar strings
		
		if(NombreUsuarioCAT.equals("Michel Báez Aguirre")){
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
		}
			/*System.out.println(caturcat.getNombreUsuario());
			System.out.println(caturcat.getAPaterno());
			System.out.println(caturcat.getAMaterno());*/

		String EmailCAT = request.getParameter("emailcat");
		caturcat.setEmail(EmailCAT);
		String CiscoCAT = request.getParameter("Ciscocat");
		caturcat.setCisco(Integer.parseInt(CiscoCAT));

		CATAtendio catate = new CATAtendio();
		String NombreAtendio = request.getParameter("atendio");//separar strings
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
		}
		String FAtencion = request.getParameter("fechaatencion");
		
		/*SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		java.sql.Date fecha=java.sql.Date.valueOf(FAtencion);
		inc.setFAtencion(fecha);
		System.out.println(formater.format(inc.getFAtencion()));

		DBConexion db = new DBConexion();
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

		//Archivo
		
		String RespuestaUtic = request.getParameter("respuesta");
		inc.setRespuestaUtic(RespuestaUtic);
		
		/*System.out.println(folio);
		System.out.println(nombreresponsable);
		System.out.println(responsableAPaterno);
		System.out.println(responsableAMaterno);
		System.out.println(responsableCisco);
		System.out.println(responsableEmail);
		System.out.println(unidadrespoDescUR);
		System.out.println(NombreDepartamento);
		System.out.println(NombreModulo);
		System.out.println(Proceso);
		System.out.println(NombreIncidente);
		System.out.println(NombreSolucion);
		System.out.println(Aprobado);
		System.out.println(FechaAprobacion);
		System.out.println(DescripcionIncidencia);
		System.out.println(NombreEstatus);
		System.out.println(Prioridad);
		System.out.println(FELab);
		System.out.println(HELab);
		System.out.println(NombreUsuarioCAT);
		System.out.println(EmailCAT);
		System.out.println(CiscoCAT);
		System.out.println(NombreAtendio);
		System.out.println(FAtencion);
		System.out.println(HAtencion);
		System.out.println(RespuestaUtic);*/
		
		
		//inc.setFolio(Integer.parseInt(folio));
		//System.out.println(inc.getFolio() + 5);
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("formulario.jsp");
		rd.forward(request, response);



	}

}
