package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import TestNGSuperClass.ProjectSpecificMethods;

public class readExcel1 extends ProjectSpecificMethods{
	
	

	public String[][] ReadExcel(String excelName) throws IOException {
		
		
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+excelName+".xlsx");
		
		XSSFSheet sheet = wbook.getSheet("Sheet1");
		
		
		int rowcount = sheet.getLastRowNum();
		
		short colcount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowcount][colcount];
		
		for (int i=1;i<=rowcount;i++)
			
		{
		
		XSSFRow row = sheet.getRow(i);
	
		 for (int j=0;j<=colcount-1;j++)

		 {
		 
		XSSFCell cell = row.getCell(j);
		String stringCellValue = cell.getStringCellValue();
		
		System.out.println(stringCellValue);
		
		data[i-1][j] = stringCellValue;
		
		 }
		}

		return data;

}
}
