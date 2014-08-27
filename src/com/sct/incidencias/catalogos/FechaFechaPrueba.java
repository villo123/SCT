package com.sct.incidencias.catalogos;
import com.sct.incidencias.catalogos.CATUsuarioUTIC;
import com.sct.incidencias.Conexion.DBConexion;
import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FechaFechaPrueba {
	private static Connection ct;
	private static Statement st;
	static PreparedStatement pst = null;
	static ResultSet rs = null;

public static void main(String[] args) throws ParseException, SQLException {
		DBConexion dba = new DBConexion();
		INCIDENCIA inc = new INCIDENCIA();
		CATUnidadResponsable catunr = new CATUnidadResponsable();
		/*String FAtencion  = "2010-12-24";
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		java.sql.Date fecha=java.sql.Date.valueOf(FAtencion);
		inc.setFAtencion(fecha);
		System.out.println(inc.getFAtencion());
		//System.out.println(formater.format(inc.getFAtencion()));*/

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
		/*catunr.setildUnidadAdm(1);
		inc.setFolio("345yiyi");
		inc.setAprobado("SI");
		String FechaAprobacion  = "2010-12-24";
		java.sql.Date fecha=java.sql.Date.valueOf(FechaAprobacion);
		inc.setFechaAprobacion(fecha);
		inc.setDescripcionIncidencia("Descripcion Incidencia");
		inc.setPrioridad("Alta");
		String FELab = "2010-12-26";
		java.sql.Date fecha2 = java.sql.Date.valueOf(FELab);
		inc.setFELab(fecha2);
		String horaLab = "13:35";
		java.sql.Time hELab =java.sql.Time.valueOf(horaLab+":00");
		inc.setHELab(hELab);
		String FAtencion = "2010-11-23";
		java.sql.Date FAtencion2 = java.sql.Date.valueOf(FAtencion);
		inc.setFAtencion(FAtencion2);
		String HAtencion = "12:45" ;
		java.sql.Time HAtencion2 =java.sql.Time.valueOf(HAtencion+":00");
		inc.setHAtencion(HAtencion2);
		inc.setRespuestaUtic("Respuesta utic");*/
		DBConexion d = new DBConexion();
		
		try{
			//PreparedStatement ps = d.getCt().prepareStatement("SELECT ildIncidencia FROM PUB.Incidencia");//,MAX(idUsuarioResponsable)
			//PreparedStatement ps = d.getCt().prepareStatement("SELECT MAX(idUsuarioResponsable) FROM PUB.CATUsuarioUnidadResponsable");
			//ResultSet rs = ps.executeQuery();
			//while(rs.next()){
				//System.out.println("ildIncidencia: " + rs.getString(1));
				//inc.setildIncidencia(Integer.parseInt(rs.getString(1))+1);
				//System.out.println("idUsuarioResponsable: " + rs.getString(2));
			//}
			
			/*PreparedStatement ps2 = d.getCt().prepareStatement("INSERT INTO PUB.Incidencia (ildIncidencia) VALUES (?)");
			ps2.setString(1, Integer.toString(inc.getildIncidencia()));
			ps2.executeUpdate();
			System.out.println("insertcion correcta");*/

			/*String databaseURL = "jdbc:datadirect:openedge://localhost:30060;schemaDefault=PUB;databaseName=incidencias.db;user=sysprogress;password=sysprogress";
			Class.forName("com.ddtek.jdbc.openedge.OpenEdgeDriver");
			System.out.println("Controlador cargado");
			ct = DriverManager.getConnection(databaseURL);
			st = ct.createStatement();*/
			//System.out.println("Conexion exitosa");
          /*  PreparedStatement ps = ct.prepareStatement("INSERT INTO PUB.Incidencia (ildIncidencia, "
            		+ "Folio, "
            		+ "Aprobado,"
            		+ "FechaAprobacion,"
            		+ "DescripcionIncidencia,"
            		+ "Prioridad,"
            		+ "FELab,"
            		+ "HELab,"
            		+ "FAtencion,"
            		+ "HAtencion,"
            		+ "RespuestaUtic) VALUES (?,?,?,?,?,?,?,?,?,?,?)");// AND ildDepartamento = (?) AND ildModulo = (?) AND ildProceso = (?) AND ildIncidente = (?) AND ildTipoDeSolucion = (?) AND ildEstatus = (?) AND ildUsuarioCat = (?) AND ildAtendio = (?)");
            
            ps.setString(1, Integer.toString(catunr.getildUnidadAdm()));
            ps.setString(2, inc.getFolio());
            ps.setString(3, inc.getAprobado());
            ps.setDate(4, (java.sql.Date)inc.getFechaAprobacion());
            ps.setString(5, inc.getDescripcionIncidencia());
            ps.setString(6,inc.getPrioridad());
            ps.setDate(7, (java.sql.Date)inc.getFELab());
            ps.setTime(8, (java.sql.Time)inc.getHELab());
            ps.setDate(9, (java.sql.Date)inc.getFAtencion());
            ps.setTime(10,(java.sql.Time) inc.getHAtencion());
            ps.setString(11, inc.getRespuestaUtic());
            
            ps.executeUpdate();*/
			/*PreparedStatement ps2 = d.getCt().prepareStatement("SELECT * FROM PUB.Incidencia ");
			//PreparedStatement ps2 = ct.prepareStatement("SELECT * FROM PUB.CATUsuarioUnidadResponsable INNER JOIN PUB.CATUnidadResponsable ON CATUsuarioUnidadResponsable.ildUnidadAdm = CATUnidadResponsable.ildUnidadAdm ");
			rs = ps2.executeQuery();
			
			while(rs.next()){
				//System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8) + " " + rs.getString(9) + " " + rs.getString(10) + " ");
				System.out.println("ildIncidencia: " +rs.getString(1) + " " );
				//inc.setHELab(rs.getTime(3));
				System.out.println("ildSistema: " + rs.getString(2) + " " );
				System.out.println("ildAtendio: " + rs.getString(3) + " " );
				System.out.println("ildDepartamento:" + rs.getString(4) + " " );
				System.out.println("ildEstatus: " + rs.getString(5) + " " );
				System.out.println("ildTipoDeSolucion: " + rs.getString(6) + " " );
				System.out.println("ildUnidadAdmin: " + rs.getString(7) + " " );
				System.out.println("ildUsuarioCat: " + rs.getString(8) + " " );
				System.out.println("FELab:" + rs.getString(9) + " " );
				System.out.println("HELab: " + rs.getString(10) + " " );
				System.out.println("FAtencion:" + rs.getString(11) + " " );
				System.out.println("HAtencion:" + rs.getString(12) + " " );
				System.out.println("Aprobado:" + rs.getString(13) + " " );
				System.out.println("FechaAprobacion: " + rs.getString(14) + " " );
				System.out.println("DescripcionIncidencia: " + rs.getString(15) + " " );
				System.out.println("RespuestaUtic:" + rs.getString(16) + " " );
				System.out.println("Prioridad:" + rs.getString(17) + " " );
				System.out.println("Folio:" + rs.getString(18) + " " );
				System.out.println("ildIncidente: " + rs.getString(19));
				System.out.println("idUsuarioResponsable:" + rs.getString(20) + " " );
				System.out.println("ildModulo:" + rs.getString(21) + " " );
				System.out.println("ildProceso:" + rs.getString(22) + " " );
				System.out.println();
			}*/
			PreparedStatement ps2 = d.getCt().prepareStatement("SELECT * FROM PUB.Incidencia "
					+ "INNER JOIN PUB.CATUnidadResponsable ON Incidencia.ildUnidadAdmin = CATUnidadResponsable.ildUnidadAdmin "
					+ "INNER JOIN PUB.CATDepartamento ON Incidencia.ildDepartamento = CATDepartamento.ildDepartamento "
					+ "INNER JOIN PUB.CATModulo ON Incidencia.ildModulo = CATModulo.ildModulo "
					+ "INNER JOIN PUB.CATProceso ON Incidencia.ildProceso = CATProceso.ildProceso "
					+ "INNER JOIN PUB.CATEstatus ON Incidencia.ildEstatus = CATEstatus.ildEstatus "
					+ "INNER JOIN PUB.CATUsuarioUnidadResponsable ON Incidencia.idUsuarioResponsable = CATUsuarioUnidadResponsable.idUsuarioResponsable");
			rs = ps2.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) 
						+ " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8) + " " + rs.getString(9)
						+ " " + rs.getString(10) + " " + rs.getString(11) + " " + rs.getString(12) + " " + rs.getString(13)
						+ " " + rs.getString(14) + " " + rs.getString(15) + " " + rs.getString(16) + " " + rs.getString(17)
						+ " " + rs.getString(18) + " " + rs.getString(19) + " " + rs.getString(20) + " " + rs.getString(21)
						+ " " + rs.getString(22) + " " + rs.getString(23) + " " + rs.getString(24) + " " + rs.getString(25)
						+ " " + rs.getString(26) + " " + rs.getString(27) + " " + rs.getString(28) + " " + rs.getString(29)
						+ " " + rs.getString(30) + " " + rs.getString(31) + " " + rs.getString(32) + " " + rs.getString(33)
						+ " " + rs.getString(34) + " " + rs.getString(35) + " " + rs.getString(36) + " " + rs.getString(37)
						+ " " + rs.getString(38) + " " + rs.getString(39) + " " + rs.getString(40) + " " + rs.getString(41)
						+ " " + rs.getString(42));
			}
	}catch(SQLException e){
		//System.out.println("No se pudo insertar");
		e.printStackTrace();
		System.out.println();
	}
		
		//PreparedStatement ps2 = ct.prepareStatement("SELECT RespuestaUtic,FELab,HELab,Aprobado FROM PUB.Incidencia");
		/*PreparedStatement ps2 = ct.prepareStatement("SELECT NombreResponsable,APaterno,"
													            +"AMaterno,"
													            +"CiscoUr,"
													            +"EmailUr FROM PUB.CATUnidadResponsable");*/

			
		
	}
}