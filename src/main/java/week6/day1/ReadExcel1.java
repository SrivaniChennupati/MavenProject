package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1  {

	public  String[][] readExcel(String ExcelName) throws IOException {
	
			
		// enter into the WorkBook
		
		XSSFWorkbook book = new XSSFWorkbook("./data/'"+ExcelName+"'.xlx");
		
		
		// enter into the sheet 
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		 int rowNum = sheet.getLastRowNum();
		 
		 short lastCellNum = sheet.getRow(0).getLastCellNum();
		 
		 String[][] data = new String[rowNum][lastCellNum];
		
		for (int i = 1; i <= rowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			
			
			for (int j = 0; j <lastCellNum ; j++) {
				XSSFCell cell = row.getCell(j);
				
				
				String value = cell.getStringCellValue();
				
				System.out.println(value);
				
				data[i-1][j] = value ;
			}
			
			
		
			
		}
		return data;
		
		
		
		
		
		
		
		
		
		
		

	}

}
