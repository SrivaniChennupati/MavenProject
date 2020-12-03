package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel{

	public  String[][] readExcel(String ExcelName)throws IOException {
		
		
		
		XSSFWorkbook book = new XSSFWorkbook("./data/'"+ExcelName+"'.xlsx");
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		
		short colCount = sheet.getRow(1).getLastCellNum();
		
		String[][] data = new String[rowCount][colCount];
		
		
		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow firstrow = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell Cell = firstrow.getCell(j);
				String value = Cell.getStringCellValue();
				
				System.out.println(value);
				
				data[i-1][j] = value;
			}
		}
		
		
		return data;
		
		

	}

}
