package com.excel;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel
{

	public int row_count() throws IOException 
	{
		FileInputStream fil=new FileInputStream(new File("src/test/resources/TestData/Data.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("details");
		int rowcount=sheet.getLastRowNum();//count the number of rows
		System.out.println(rowcount);
		
		return rowcount;
	}
	public String excel_emailid(int x) throws IOException 
	{
		FileInputStream fil=new FileInputStream(new File("src/test/resources/TestData/Data.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("details");

		
		XSSFRow row=sheet.getRow(x);
    	XSSFCell cell=row.getCell(0);
    	String un=cell.getStringCellValue();
    	
    	return un;
	}
	
	public String excel_password(int y) throws IOException 
	{
		FileInputStream fil=new FileInputStream(new File("src/test/resources/TestData/Data.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("details");

		
		XSSFRow row=sheet.getRow(y);
		XSSFCell cell1=row.getCell(1);
    	String pwd=cell1.getStringCellValue();
    	
    	return pwd;
	}


}
