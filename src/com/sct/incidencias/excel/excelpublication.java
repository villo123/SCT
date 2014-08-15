package com.sct.incidencias.excel;

import com.sct.incidencias.catalogos.CATUsuarioUTIC;
import com.sct.incidencias.Conexion.DBConexion;
import com.sun.rowset.internal.Row;

import java.sql.*;

import org.apache.poi.*;
import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class excelpublication {
	//создание из пример
	HSSFWorkbook wb = new HSSFWorkbook();
	//создать новый лист
	HSSFSheet sheet = wb.createSheet("Incidencias");
	//создать записей
	HSSFRow row = sheet.createRow((short)0);
	//создать 22 клетки 22 записей
	HSSFCell cell1 = row.createCell();
	folio.setCellValue(new String(ResultSet rsu = dba.getSt().executeQuery("SELECT CATUnidadResponsable.ildUnidadAdm,CATUnidadResponsable.DescUR FROM PUB.CATUnidadResponsable");
	while(rsu.next()){
	value="=rsu.getString(1)"=rsu.getString(2);
}));
	folio.setCellStyle(cellStyle);
	
	stat cell = row.createCell(1);
	stat.setCellValue(new String());
	stat.setCellStyle(cellStyle);
	
	prioridad cell = row.createCell(2);
	prioridad.setCellValue(new String());
	prioridad.setCellStyle(cellStyle);
	
	fechames cell = row.createCell(3);
	fechames.setCellValue(new Date());
	fehames.setCellStyle(cellStyle);
	
	horames	cell = row.createCell(4);
	horames.setCellValue(new Time());
	horames.setCellStyle(cellStyle);
	
	usrcat cell = row.createCell(5);
	usrcat.setCellValue(new String());
	usrcat.setCellStyle(cellStyle);
	
	cisco cell = row.createCell(6);
	cisco.setCellValue(new Int());
	cisco.setCellStyle(cellStyle);
	
	fechaten cell = row.createCell(7);
	fechaten.setCellValue(new Date());
	fechaten.setCellStyle(cellStyle);
	
	horaten	cell = row.createCell(8);
	horaten.setCellValue(new Time());
	horaten.setCellStyle(cellStyle);
	
	aten cell = row.createCell(9);
	aten.setCellValue(new String());
	aten.setCellStyle(cellStyle);
	
	centsct cell = row.createCell(10);
	centsct.setCellValue(new String());
	centsct.setCellStyle(cellStyle);
	
	descins cell = row.createCell(11);
	descins.setCellValue(new String());
	descins.setCellStyle(cellStyle);
	
	usrur cell = row.createCell(12);
	usrur.setCellValue(new String());
	usrut.setCellStyle(cellStyle);
	
	Cisco cell = row.createCell(13);
	Cisco.setCellValue(new Int());
	Cisco.setCellStyle(cellStyle);
	
	centrosct cell = row.createCell(14);
	centrosct.setCellValue(new String());
	centrosct.setCellStyle(cellStyle);
	
	depto cell = row.createCell(15);
	depto.setCellValue(new String());
	depto.setCellStyle(cellStyle);
	
	modul cell = row.createCell(16);
	modul.setCellValue(new String());
	modul.setCellStyle(cellStyle);
	
	proce cell = row.createCell(17);
	proce.setCellValue(new String());
	proce.setCellStyle(cellStyle);
	
	tipoin cell = row.createCell(18);
	tipoin.setCellValue(new String());
	tipoin.setCellStyle(cellStyle);
	
	tiposol cell = row.createCell(19);
	tiposol.setCellValue(new String());
	tiposol.setCellStyle(cellStyle);
	
	sist cell = row.createCell(20);
	sist.setCellValue(new String());
	sist.setCellStyle(cellStyle);
	
	form cell = row.createCell(21);
	form.setCellValue(new String());
	form.setCellStyle(cellStyle);
	
    FileOutputStream fileOut = new FileOutputStream("workbook.xls");
    wb.write(fileOut);
    fileOut.close();
}
