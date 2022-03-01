package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void read_ParticularData() throws IOException {

		File f = new File("C:\\Users\\kowsalya\\eclipse-workspace\\Maven_8pm\\excel\\User_Name.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(2);

		Cell cell = row.getCell(1);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {

			String value = cell.getStringCellValue();

			System.out.println(value);

		}

		else if (cellType.equals(CellType.NUMERIC)) {

			double numeric = cell.getNumericCellValue();

			int data = (int) numeric;

			System.out.println(data);

		}

	}

	public static void main(String[] args) throws IOException {

		read_ParticularData();

	}

}
