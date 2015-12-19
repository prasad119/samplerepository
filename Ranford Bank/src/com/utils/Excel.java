package com.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel {
	
//	public static String folderPath="F:\\";
	public static Workbook objWorkbook;
	public static Sheet objSheet;
	public static WritableWorkbook  objWritableWorkbook;
	public static WritableSheet objWritableSheet;
	//set excel connection
	public static void setExcelConnection(String fileName)               
	{
		File file=new File(fileName);
		try {
			objWorkbook=Workbook.getWorkbook(file);
		} catch (BiffException | IOException e) {
			e.printStackTrace();
		}		
	}
	
	//select the sheet
	public static void selectSheet(String sheetName)
	{
		objSheet=objWorkbook.getSheet(sheetName);
	}
	
	//get number of rows count
	public static int getRowCount()
	{
		return objSheet.getRows();
	}
	
	//target the cell
	public static  String getCellData(int colNumber,int rowNumber)
	{
		 return  objSheet.getCell(colNumber,rowNumber).getContents();
	}
	   //writable mode conversion of excel
	
	public static void setWritableWorkbook(String fileName)
	{
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(new File(fileName));
			objWritableWorkbook=Workbook.createWorkbook(fos, objWorkbook);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 
		
	}
	
	
	   //writable mode conversion of excel
	
	public static void selectWritableSheet(String sheetName) 
	{
		
	    objWritableSheet=objWritableWorkbook.getSheet(sheetName);			
	}
	

	   //writing data to cell
	
	public static void writeTocell(int colNumber,int rowNumber,String result) 
	{
		Label label=new Label(colNumber, rowNumber,result);		
		try {
			objWritableSheet.addCell(label);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//save workbook
	public static void saveWorkbook() 
	{
		try {
			objWritableWorkbook.write();
			objWritableWorkbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
