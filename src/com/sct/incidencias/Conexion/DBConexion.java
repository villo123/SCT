package com.sct.incidencias.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConexion {

	private static Connection ct;
	private static Statement st;
	static PreparedStatement pst = null;
	static ResultSet rs = null;
	
	public DBConexion(){
		try{
			String databaseURL = "jdbc:datadirect:openedge://localhost:30060;schemaDefault=PUB;databaseName=incidencias.db;user=sysprogress;password=sysprogress";
			Class.forName("com.ddtek.jdbc.openedge.OpenEdgeDriver");
			System.out.println("Controlador cargado dentro de DBConexion");
			ct = DriverManager.getConnection(databaseURL);
			st = ct.createStatement();
			System.out.println("Conexion exitosa dentro de DBConexcion");		
		}catch(Exception e){
			System.out.println("No se pudo conectar a la base de datos dentro de DBConexion");
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
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				if(ct != null){
					liberarConexion(ct);
				}else if(rs != null){
					rs.close();
				}
			}catch(SQLException e){
				System.out.println("SQLException dentro de metodo validar");
				e.printStackTrace();
			}
			
		}
		return status;	
	}
	
	public static void liberarConexion(Connection con){
		try{
			if (con != null){
				con.close();
			}
		}catch(SQLException e){
			System.out.println("Dentro de liberarConexcion");
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
