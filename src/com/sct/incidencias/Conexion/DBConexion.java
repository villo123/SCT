package com.sct.incidencias.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sct.incidencias.catalogos.CATAtendio;
import com.sct.incidencias.catalogos.CATDepartamento;
import com.sct.incidencias.catalogos.CATEstatus;
import com.sct.incidencias.catalogos.CATModulo;
import com.sct.incidencias.catalogos.CATProceso;
import com.sct.incidencias.catalogos.CATTipoDeIncidente;
import com.sct.incidencias.catalogos.CATTipoDeSolucion;
import com.sct.incidencias.catalogos.CATUnidadResponsable;
import com.sct.incidencias.catalogos.CATUsuarioCAT;
import com.sct.incidencias.catalogos.CATUsuarioUnidadResponsable;
import com.sct.incidencias.catalogos.INCIDENCIA;

public class DBConexion {

	private static Connection ct,cti,ctu;
	private static Statement st;
	static PreparedStatement pst = null;
	static ResultSet rs = null;
	
	public DBConexion(){
		try{
			String databaseURL = "jdbc:datadirect:openedge://localhost:30060;schemaDefault=PUB;databaseName=incidencias.db;user=sysprogress;password=sysprogress";
			Class.forName("com.ddtek.jdbc.openedge.OpenEdgeDriver");
			System.out.println("Controlador cargado");
			ct = DriverManager.getConnection(databaseURL);
			st = ct.createStatement();
			System.out.println("Conexion exitosa");
		}catch(Exception e){
			System.out.println("No se pudo conectar a la base de datos");
		}
	}
	
	public static boolean validar(String CuentaUsuario,String Contrasena){
		boolean status = false;
		try{
            Class.forName("com.ddtek.jdbc.openedge.OpenEdgeDriver");
            ct = DriverManager.getConnection("jdbc:datadirect:openedge://localhost:30060;schemaDefault=PUB;databaseName=incidencias.db;user=sysprogress;password=sysprogress");
            PreparedStatement ps = ct.prepareStatement("SELECT CATUsuarioUTIC.CuentaUsuario,CATUsuarioUTIC.Contrasena FROM PUB.CATUsuarioUTIC WHERE CuentaUsuario =? AND Contrasena=?");
            ps.setString(1, CuentaUsuario);
            ps.setString(2, Contrasena);
            rs = ps.executeQuery();
            status = rs.next();
            liberarConexion(ct);

		}catch(Exception e){
			System.out.println(e);
		}
		return status;	
	}
	
	public static void liberarConexion(Connection con){
		try{
			if (con != null){
				con.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void insetarFormulario(){
		try{
			String databaseURL = "jdbc:datadirect:openedge://localhost:30060;schemaDefault=PUB;databaseName=incidencias.db;user=sysprogress;password=sysprogress";
			Class.forName("com.ddtek.jdbc.openedge.OpenEdgeDriver");
			System.out.println("Controlador cargado");
			cti = DriverManager.getConnection(databaseURL);
			ctu = DriverManager.getConnection(databaseURL);
			st = ct.createStatement();
			System.out.println("Conexion exitosa");
			INCIDENCIA inc = new INCIDENCIA();
			CATUsuarioUnidadResponsable catusunr = new CATUsuarioUnidadResponsable();
			CATUnidadResponsable catur = new CATUnidadResponsable();
			CATDepartamento catdep = new CATDepartamento();
			CATModulo catmod = new CATModulo();
			CATProceso catpro = new CATProceso();
			CATTipoDeIncidente cattipin = new CATTipoDeIncidente();
			CATTipoDeSolucion cattipsol = new CATTipoDeSolucion();
			CATEstatus cates = new CATEstatus();
			CATUsuarioCAT caturcat = new CATUsuarioCAT();
			CATAtendio catate = new CATAtendio();
	        PreparedStatement psi = cti.prepareStatement("INSERT INTO PUB.Incidencia (ildSistema,"
	        		+ "ildAtendio,"
	        		+ "ildDepartamento,"
	        		+ "ildEstatus,"
	        		+ "ildTipoDeSolucion,"
	        		+ "ildUnidadAdmin,"
	        		+ "ildUsuarioCat,"
	        		+ "ildIncidente,"
	        		+ "ildModulo,"
	        		+ "ildProceso,"
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
	        
	        //ps.setString(1, "2");
	        psi.setString(1, "1"); 
	        psi.setString(2, Integer.toString(catate.getildAtendio()));
	        psi.setString(3, Integer.toString(catdep.getildDepartamento()));
	        psi.setString(4, Integer.toString(cates.getildEstatus()));
	        psi.setString(5, Integer.toString(cattipsol.getildTipoDeSolucion()));
	        psi.setString(6, Integer.toString(catur.getildUnidadAdm()));
	        psi.setString(7, Integer.toString(caturcat.getildUsuarioCat()));
	        psi.setString(8, Integer.toString(cattipin.getildIncidente()));
	        psi.setString(9, Integer.toString(catmod.getildModulo()));
	        psi.setString(10,Integer.toString(catpro.getildProceso()));
	       // ps.setString(10, "2");
	        psi.setString(11, inc.getFolio());
	        psi.setString(12, inc.getAprobado());
	        psi.setDate(13, (java.sql.Date)inc.getFechaAprobacion());
	        psi.setString(14, inc.getDescripcionIncidencia());
	        psi.setString(15 ,inc.getPrioridad());
	        psi.setDate(16, (java.sql.Date)inc.getFELab());
	        psi.setTime(17, (java.sql.Time)inc.getHELab());            
	        psi.setDate(18, (java.sql.Date)inc.getFAtencion());
	        psi.setTime(19,(java.sql.Time) inc.getHAtencion());
	        psi.setString(20, inc.getRespuestaUtic());
	        

	        
	        
	        
	        PreparedStatement psu = ctu.prepareStatement("INSERT INTO PUB.CATUsuarioUnidadResponsable (ildUnidadAdm,"
	        													+"NombreResponsable,"
	        													+"APaterno,"
													            +"AMaterno,"
													            +"CiscoUr,"
													            +"EmailUr) VALUES (?,?,?,?,?,?)");// WHERE ildUnidadAdmin = (?)");
	        psu.setString(1, Integer.toString(catusunr.getildUnidadAdm()));
	        psu.setString(2, catusunr.getNombreResponsable());
	        psu.setString(3, catusunr.getAPaterno());
	        psu.setString(4, catusunr.getAMaterno());
	        psu.setString(5, Integer.toString(catusunr.getCiscoUr()));
	        psu.setString(6, catusunr.getEmailUr());
	        
	        psi.executeUpdate();
	        psu.executeUpdate();
			System.out.println("Insercion correcta");
			liberarConexion(cti);
			liberarConexion(ctu);
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassnotFoundException");
			e.printStackTrace();
		}
	}
	
	public Statement getSt(){
		return st;
	}
	
	public Connection getCt(){
		return ct;
	}
}
