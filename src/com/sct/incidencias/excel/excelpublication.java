package com.sct.incidencias.excel;
import org.apache.poi.POIDocument;
import org.apache.poi.poifs.common.POIFSBigBlockSize;
import org.apache.poi.hsmf.parsers.POIFSChunkParser;
import org.apache.poi.poifs.filesystem.POIFSDocumentPath;
import org.apache.poi.poifs.dev.POIFSDump;
import org.apache.poi.poifs.eventfilesystem.POIFSReader;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.poifs.dev.POIFSHeaderDumper;
import org.apache.poi.poifs.dev.POIFSLister;
import org.apache.poi.poifs.dev.POIFSViewer;
import org.apache.poi.ss.util.WorkbookUtil;

public class excelpublication {
	Workbook wb = new HSSFWorkbook();
    FileOutputStream fileOut = new FileOutputStream("workbook.xls");
    wb.write(fileOut);
    fileOut.close();

    Workbook wb = new XSSFWorkbook();
    FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
    wb.write(fileOut);
    fileOut.close();
    
    Workbook wb = new HSSFWorkbook();  // or new XSSFWorkbook();
    Sheet sheet1 = wb.createSheet("new sheet");
    
    // Note that sheet name is Excel must not exceed 31 characters
    // and must not contain any of the any of the following characters:
    // 0x0000
    // 0x0003
    // colon (:)
    // backslash (\)
    // asterisk (*)
    // question mark (?)
    // forward slash (/)
    // opening square bracket ([)
    // closing square bracket (])

    // You can use org.apache.poi.ss.util.WorkbookUtil#createSafeSheetName(String nameProposal)}
    // for a safe way to create valid names, this utility replaces invalid characters with a space (' ')
    String safeName = WorkbookUtil.createSafeSheetName("[O'Brien's sales*?]"); // returns " O'Brien's sales   "
    Sheet sheet3 = wb.createSheet(safeName);

    FileOutputStream fileOut = new FileOutputStream("workbook.xls");
    wb.write(fileOut);
    fileOut.close();
    
    Workbook wb = new HSSFWorkbook();
    //Workbook wb = new XSSFWorkbook();
    CreationHelper createHelper = wb.getCreationHelper();
    Sheet sheet = wb.createSheet("new sheet");

    // Create a row and put some cells in it. Rows are 0 based.
    Row row = sheet.createRow((short)0);
    // Create a cell and put a value in it.
    Cell cell = row.createCell(0);
    cell.setCellValue(1);

    // Or do it on one line.
    row.createCell(1).setCellValue(1.2);
    row.createCell(2).setCellValue(
         createHelper.createRichTextString("This is a string"));
    row.createCell(3).setCellValue(true);

    // Write the output to a file
    FileOutputStream fileOut = new FileOutputStream("workbook.xls");
    wb.write(fileOut);
    fileOut.close();
    
    Workbook wb = new HSSFWorkbook();
    //Workbook wb = new XSSFWorkbook();
    CreationHelper createHelper = wb.getCreationHelper();
    Sheet sheet = wb.createSheet("new sheet");

    // Create a row and put some cells in it. Rows are 0 based.
    Row row = sheet.createRow(0);

    // Create a cell and put a date value in it.  The first cell is not styled
    // as a date.
    Cell cell = row.createCell(0);
    cell.setCellValue(new Date());

    // we style the second cell as a date (and time).  It is important to
    // create a new cell style from the workbook otherwise you can end up
    // modifying the built in style and effecting not only this cell but other cells.
    CellStyle cellStyle = wb.createCellStyle();
    cellStyle.setDataFormat(
        createHelper.createDataFormat().getFormat("m/d/yy h:mm"));
    cell = row.createCell(1);
    cell.setCellValue(new Date());
    cell.setCellStyle(cellStyle);

    //you can also set date as java.util.Calendar
    cell = row.createCell(2);
    cell.setCellValue(Calendar.getInstance());
    cell.setCellStyle(cellStyle);

    // Write the output to a file
    FileOutputStream fileOut = new FileOutputStream("workbook.xls");
    wb.write(fileOut);
    fileOut.close();
    
    Workbook wb = new HSSFWorkbook();
    Sheet sheet = wb.createSheet("new sheet");
    Row row = sheet.createRow((short)2);
    row.createCell(0).setCellValue(1.1);
    row.createCell(1).setCellValue(new Date());
    row.createCell(2).setCellValue(Calendar.getInstance());
    row.createCell(3).setCellValue("a string");
    row.createCell(4).setCellValue(true);
    row.createCell(5).setCellType(Cell.CELL_TYPE_ERROR);

    // Write the output to a file
    FileOutputStream fileOut = new FileOutputStream("workbook.xls");
    wb.write(fileOut);
    fileOut.close();
}
