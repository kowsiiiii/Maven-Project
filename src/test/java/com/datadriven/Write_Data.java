package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void writeData() throws IOException {

		File f = new File("C:\\Users\\kowsalya\\OneDrive\\Desktop\\User_Name.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

//		Sheet createSheet = wb.createSheet("Student");
//		
//		Row createRow = createSheet.createRow(0);
//		
//		Cell createCell = createRow.createCell(0);
//		
//		createCell.setCellValue("James");

		wb.createSheet("Student").createRow(0).createCell(0).setCellValue("Username");

		wb.getSheet("Student").getRow(0).createCell(1).setCellValue("Password");

		wb.getSheet("Student").createRow(1).createCell(0).setCellValue("James");

		wb.getSheet("Student").getRow(1).createCell(1).setCellValue("James@123");

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		wb.close();

		//System.exit(0);

		System.out.println("write successfully");

	}
	
	public static void main(String[] args) throws IOException {
		
		writeData();
	}

}
