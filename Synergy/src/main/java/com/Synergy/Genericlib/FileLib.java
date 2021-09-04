package com.Synergy.Genericlib;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String readPropertyData(String proppath,String key)throws Throwable {
		FileInputStream fis= new FileInputStream(proppath);
		Properties prop = new Properties();
		prop.load(fis);
		String propvalue = prop.getProperty(key,"Incorrect Key");
		return propvalue;
		
	}
public int getRowCount(String path,String sheet) throws Throwable {
	FileInputStream fis= new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	int rowCount = wb.getSheet(sheet).getLastRowNum();
	return rowCount;
	
}
public String readExcelData(String path,String sheetname,int row,int cell)throws Throwable {
	FileInputStream fis= new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	String excelvalue = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
	return excelvalue; 
	
}
public void writeExcelData(String path,String sheetname,int row,int cell,String data) throws Throwable {
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheetname).getRow(row).createCell(cell).setCellValue(data);
	FileOutputStream fos = new FileOutputStream(path);
}
}

	
	
	
	
	
	


