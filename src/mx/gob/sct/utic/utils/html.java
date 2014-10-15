package mx.gob.sct.utic.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.sct.incidencias.Conexion.DBConexion;
import com.sct.incidencias.catalogos.CATUnidadResponsable;
import com.sct.incidencias.catalogos.INCIDENCIA;

public class html {
	public html() {

	}

	@SuppressWarnings("static-access")
	public ArrayList<String[]> getIncidencias() throws ParseException {
		ArrayList<String[]> registros = new ArrayList<String[]>();
		Connection ct = null;
		ResultSet rs = null;
		new INCIDENCIA();
		new CATUnidadResponsable();
		DBConexion d = new DBConexion();
		try {
			ct = d.getCt();
			PreparedStatement ps2 = ct
					.prepareStatement(
							"SELECT Incidencia.Folio"
							+ ", CATUsuarioUnidadResponsable.NombreResponsable,CATUsuarioUnidadResponsable.APaterno,CATUsuarioUnidadResponsable.AMaterno "
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
							+ ", CATAtendio.NombreAtendio,CATAtendio.APaterno,CATAtendio.AMaterno "
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
			                        
			                        
			rs = ps2.executeQuery();
			while (rs.next()) {
				String[] campos = new String[26];
				campos[0] = rs.getString(1);
				campos[1] = rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4);
				campos[2] = rs.getString(5);
				campos[3] = rs.getString(6);
				campos[4] = rs.getString(7);
				campos[5] = rs.getString(8);
				campos[6] = rs.getString(9);
				campos[7] = rs.getString(10);
			    campos[8] = rs.getString(11);
				campos[9] = rs.getString(12);		
				campos[10] = rs.getString(13);
				campos[11] = rs.getString(14);
				Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(rs.getString(15));
				String HELab = new SimpleDateFormat("H:mm").format(date); // 9:00
				campos[12] = HELab;
				
				campos[13] = rs.getString(16)+ " " + rs.getString(17) + " " + rs.getString(18);
				
				//campos[14] = rs.getString(19)+ " " + rs.getString(20) + " " + rs.getString(21);
				if(rs.getString(19) == null && rs.getString(20) == null && rs.getString(21) == null){
					campos[14] = "";
				}else{
					campos[14] = rs.getString(19)+ " " + rs.getString(20) + " " + rs.getString(21);
				}
				
				campos[15] = rs.getString(22);
				if(campos[15] == null){
					campos[15] = "";
				}else{
					campos[15] = rs.getString(22);
				}
				
				campos[16] = rs.getString(23);
				if(campos[16] == null){
					campos[16] = "";
				}else{
					Date date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(rs.getString(23));
					String HAtencion = new SimpleDateFormat("H:mm").format(date2); // 9:00
					campos[16] = HAtencion;
				}
				
				campos[17] = rs.getString(24);
				if(campos[17] == null){
					campos[17] = "";
				}else{
					campos[17] = rs.getString(24);
				}
				
				campos[18] = rs.getString(25);
				if(campos[18] == null){
					campos[18] = "";
				}else{
					campos[18] = rs.getString(25);
				}
				
				campos[19] = rs.getString(26);
				campos[20] = rs.getString(27);
				
				campos[21] = rs.getString(28);
				if(campos[21] == null){
					campos[21] = "";
				}else{
					campos[21] = rs.getString(28);
				}
				
				
				campos[22] = rs.getString(29);
				if(campos[22] == null){
					campos[22] = "";
				}else{
					campos[22] = rs.getString(29);
				}
				
				
				
				campos[23] = rs.getString(30);
				if(campos[23] == null){
					campos[23] = "";
				}else{
					Date date3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(rs.getString(30));
					String HLlamada = new SimpleDateFormat("H:mm").format(date3); // 9:00
					campos[23] = HLlamada;
				}
				
				
				campos[24] = rs.getString(31);
				campos[25] = rs.getString(32);
				registros.add(campos);
			}
		} catch (SQLException e) {
			System.out.println();
		} finally {
			d.liberarConexion(ct);
		}
		return registros;
	}
}
