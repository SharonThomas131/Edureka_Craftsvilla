package com.craftsvilla.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static String[][] getData(String fileName, String sheetName) throws Exception
	{
		File file = new File(fileName);					//Fetch the file
		FileInputStream fin = new FileInputStream(file);				//Read the file
		
		//start working with the excel sheet, which is a workbook (with many sheets)
		Workbook wb = new XSSFWorkbook(fin);
		//get the sheet
		Sheet sh = wb.getSheet(sheetName);
		
		//before even reading the sheet, check how many rows are there. 
		int rnum = sh.getLastRowNum();
		int cnum= sh.getRow(0).getLastCellNum();
		
		String data[][] = new String[rnum][cnum];
		//start reading the sheet
		for(int i=0;i<rnum;i++)
		{
			Row row = sh.getRow(i);
			for(int j=0;j<cnum;j++)
			{
				Cell cell = row.getCell(j);
				String value = new DataFormatter().formatCellValue(cell);   //format the cell value to desired type
				data[i][j] = value;
			}
		}
		wb.close();
		return data;
	}
}
