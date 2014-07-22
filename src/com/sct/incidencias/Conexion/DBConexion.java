package com.sct.incidencias.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            //PreparedStatement ps = ct.prepareStatement("SELECT CATUsuarioUTIC.CuentaUsuario,CATUsuarioUTIC.Contrasena FROM PUB.CATUsuarioUTIC WHERE CATUsuarioUTIC.CuentaUsuario = '"+CuentaUsuario+"' AND CATUsuarioUTIC.Contrasena='"+Contrasena+"'");
           // rs = st.executeQuery("SELECT CATUsuarioUTIC.CuentaUsuario,CATUsuarioUTIC.Contrasena FROM PUB.CATUsuarioUTIC WHERE CATUsuarioUTIC.CuentaUsuario = '"+CuentaUsuario+"' AND CATUsuarioUTIC.Contrasena='"+Contrasena+"'");
           /* while(rs.next()){
            	usuarioutic.setCuentaUsuario(rs.getString(1));
            	usuarioutic.setContrasena(rs.getString(2));
            }*/
            rs = ps.executeQuery();
            status = rs.next();
            ct.close();

		}catch(Exception e){
			System.out.println(e);
		}
		return status;	
	}
	
	public Statement getSt(){
		return st;
	}
	
	public Connection getCt(){
		return ct;
	}
	
	public static void main(String[] sct){
		new DBConexion();
	}
}
