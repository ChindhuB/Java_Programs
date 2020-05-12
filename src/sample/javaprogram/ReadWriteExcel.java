package sample.javaprogram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static Workbook wb;
	public static Sheet ws;
	public static Row row;
	public static Cell cell;
	public static CellStyle style;

	// get Excel Sheet
	public static void getExcelsheet(String xlfile, String xlsheet) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		style = wb.createCellStyle();
		
	}

//get Last Row number
	public static int getRowCount() {
		int rowcount = ws.getLastRowNum();
		;
		return rowcount;
	}

	// get Last Column number
	public static int getColCount(int rownum) {
		row = ws.getRow(rownum);
		int colcount = row.getLastCellNum();
		return colcount;
	}

	// get Cell Data
	public static String getCellData(int row, int col) {

		String data = ws.getRow(row).getCell(col).getStringCellValue();
		return data;
	}

	// set Cell Data
	public static void setCellData(String xlfile,int rownum, int colnum, String setdata) throws IOException {
		row = ws.getRow(rownum);
		cell = row.createCell(colnum);
		cell.setCellValue(setdata);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		
	}

	// set Cell Color Green
	public static void setGreen(String xlfile,int rownum, int colnum) throws IOException {
		style=wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		row = ws.getRow(rownum);
		cell = row.createCell(colnum);
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
	}

	// set Cell Color Red
	public static void setRed(String xlfile,int rownum, int colnum) throws IOException {
		style=wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		row = ws.getRow(rownum);
		cell = row.createCell(colnum);
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
	}

	// Close Workbook
	public void closeExcelSheet() throws IOException {
		wb.close();
		fi.close();

	}

}
