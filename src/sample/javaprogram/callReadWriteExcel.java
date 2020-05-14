package sample.javaprogram;

import java.io.IOException;

public class callReadWriteExcel {

	public static void main(String[] args) throws IOException {
		String path;
		int rowcount;
		int colcount;

		// call ReadWriteExcel
		path = System.getProperty("user.dir") + "/SchoolGrade.xlsx";
		ReadWriteExcel.getExcelsheet(path, "Sheet1");
		rowcount = ReadWriteExcel.getRowCount();
		colcount = ReadWriteExcel.getColCount(1);
		// Read Excel Data (Grade of Students :A,B,C,D)
		String ExcelData[][] = new String[rowcount + 1][colcount];
		for (int i = 0; i < rowcount + 1; i++) {
			for (int j = 0; j < colcount; j++) {

				ExcelData[i][j] = ReadWriteExcel.getCellData(i, j);
			}
		}
		// Write Excel Data
		int gradeDcount;
		for (int i = 0; i < rowcount + 1; i++) {
			// To find failed Student
			gradeDcount = 0;
			System.out.println();
			for (int j = 0; j < colcount; j++) {
				// Print Excel Data
				System.out.print(ExcelData[i][j] + " ");
				if (ExcelData[i][j].matches("D")) {
					gradeDcount = gradeDcount + 1;
				}
			}

			// Write Data to Excel (if Student got D for 3 or more subjects became failed)
			if (gradeDcount >= 3) {
				ReadWriteExcel.setCellData(path, i, colcount, "Fail");
				ReadWriteExcel.setRed(path, i, colcount + 1);
			} else {
				ReadWriteExcel.setCellData(path, i, colcount, "Pass");
				ReadWriteExcel.setGreen(path, i, colcount + 1);
			}

		}
		ReadWriteExcel.closeExcelSheet();
	}

}
