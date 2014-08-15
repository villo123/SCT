package com.sct.incidencias.excel;
//количество в базу данных
import com.sct.incidencias.catalogos.CATUsuarioUTIC;
import com.sct.incidencias.Conexion.DBConexion;
import com.sun.rowset.internal.Row;
import java.sql.*;
//количество в Excel
import java.io.FileOutputStream;
import javafx.scene.layout.ColumnConstraints;
import org.apache.poi.*;
import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;

public class excelpublication {
	//создание из пример
	HSSFWorkbook wb = new HSSFWorkbook();
	//создать новый лист
	HSSFSheet sheet = wb.createSheet("Incidencias");
	//создать записей
	HSSFRow row = sheet.createRow((short)0);
	//создать 22 клетки 22 записей
	@SuppressWarnings("deprecation")
	HSSFCell cell1 = row.createCell((short)0);	
	HSSFCell cell2 = row.createCell((short)1);	
	HSSFCell cell3 = row.createCell((short)2);	
	HSSFCell cell4 = row.createCell((short)0);	
	HSSFCell cell5 = row.createCell((short)0);	
	HSSFCell cell6 = row.createCell((short)0);	
	HSSFCell cell7 = row.createCell((short)0);	
	HSSFCell cell8 = row.createCell((short)0);	
	HSSFCell cell9 = row.createCell((short)0);	
	HSSFCell cell10 = row.createCell((short)0);	
	HSSFCell cell11 = row.createCell((short)0);	
	HSSFCell cell12 = row.createCell((short)0);	
	HSSFCell cell13 = row.createCell((short)0);	
	HSSFCell cell14 = row.createCell((short)0);	
	HSSFCell cell15 = row.createCell((short)0);	
	HSSFCell cell16 = row.createCell((short)0);	
	HSSFCell cell17 = row.createCell((short)0);	
	HSSFCell cell18 = row.createCell((short)0);	
	HSSFCell cell19 = row.createCell((short)0);	
	HSSFCell cell20 = row.createCell((short)0);	
	HSSFCell cell21 = row.createCell((short)0);	
    FileOutputStream fileOut = new FileOutputStream("workbook.xls");
    fileOut="workbook.xls";
}
