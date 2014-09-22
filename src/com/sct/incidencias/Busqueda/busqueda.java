package com.sct.incidencias.Busqueda;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.management.modelmbean.RequiredModelMBean;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sct.incidencias.Conexion.DBConexion;;
@WebServlet("/busqueda")
public class busqueda extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	DBConexion d = new DBConexion();
	

    public busqueda() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @return 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PreparedStatement psbf = null;
		ResultSet rsbf = null;
		String folio = request.getParameter("Foliotxt");
		//ArrayList<String[]> registros = new ArrayList<String[]>();
		
		
		
		
		if(folio == "Foliotxt"){
			@SuppressWarnings("unchecked")
			ArrayList<String[]> registros = new ArrayList<String[]>();
			registros = (ArrayList<String[]>) request.getSession().getAttribute("busqueda");
			try {
				psbf = d.getCt().prepareStatement(
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
								+ "WHERE WHERE Folio = ?");
				psbf.setString(1, folio);
				rsbf = psbf.executeQuery();
				while (rsbf.next()) {
					String[] campos = new String[26];
					campos[0] = rsbf.getString(1);
					campos[1] = rsbf.getString(2) + " " + rsbf.getString(3) + " " + rsbf.getString(4);
					campos[2] = rsbf.getString(5);
					campos[3] = rsbf.getString(6);
					campos[4] = rsbf.getString(7);
					campos[5] = rsbf.getString(8);
					campos[6] = rsbf.getString(9);
					campos[7] = rsbf.getString(10);
				    campos[8] = rsbf.getString(11);
					campos[9] = rsbf.getString(12);		
					campos[10] = rsbf.getString(13);
					campos[11] = rsbf.getString(14);
					Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(rsbf.getString(15));
					String HELab = new SimpleDateFormat("H:mm").format(date); // 9:00
					campos[12] = HELab;					
					campos[13] = rsbf.getString(16)+ " " + rsbf.getString(17) + " " + rsbf.getString(18);
					campos[14] = rsbf.getString(19)+ " " + rsbf.getString(20) + " " + rsbf.getString(21);
					campos[15] = rsbf.getString(22);
					/*Date date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(rs.getString(23));
					String HAtencion = new SimpleDateFormat("H:mm").format(date2); // 9:00*/
					campos[16] = rsbf.getString(23);
					campos[17] = rsbf.getString(24);
					campos[18] = rsbf.getString(25);
					campos[19] = rsbf.getString(26);
					campos[20] = rsbf.getString(27);
					campos[21] = rsbf.getString(28);
					campos[22] = rsbf.getString(29);
					campos[23] = rsbf.getString(30);
					campos[24] = rsbf.getString(31);
					campos[25] = rsbf.getString(32);

					registros.add(campos);
					return;
				}
			
			} catch (SQLException | ParseException e) {
				e.printStackTrace();
			}finally{
				try{
					if(psbf != null){
						psbf.close();
					}else if(d != null){
						DBConexion.liberarConexion(d.getCt());
					}else if (rsbf != null){
						rsbf.close();
					}
				}catch (SQLException e){
					e.printStackTrace();
				}
			}
		}//fin del if
		
		response.sendRedirect("vistaBusqueda.jsp");
		//RequestDispatcher rd = request.getRequestDispatcher("vistaBusqueda.jsp");
		//rd.forward(request, response);
		
	}

}
