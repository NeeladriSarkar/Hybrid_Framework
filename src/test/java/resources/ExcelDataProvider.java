package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook workbook;
	public ExcelDataProvider() throws IOException {
		
		File src = new File(".\\ExcelData.xlsx");
		FileInputStream file = new FileInputStream(src);
		workbook = new XSSFWorkbook(file);
		
	}
	
	public String getStringData(String sheet, int rowNum, int colNum) {
		return workbook.getSheet(sheet).getRow(rowNum).getCell(colNum).getStringCellValue();
	}
	
	public String getNumericData(String sheet, int rowNum, int colNum) {
		return NumberToTextConverter.toText(workbook.getSheet(sheet).getRow(rowNum).getCell(colNum).getNumericCellValue());
	}
	
}
