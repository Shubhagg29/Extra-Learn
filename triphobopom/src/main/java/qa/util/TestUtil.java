package qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtil {
	
	public static long PAGE_LOAD_TIMEOUT=30;
	public static long IMPLICIT_WAIT=10;
	static Sheet sheet;
	static Workbook book;
	static String TEST_DATA_SHEET_PATH = "/Users/shubhagg/Documents/Details.xlsx";
	
	public static void main (String args[]) throws IOException {
		
		File fp= new File(TEST_DATA_SHEET_PATH);
		FileInputStream fs= new FileInputStream(fp);
	
		book=WorkbookFactory.create(fp);	
		 sheet= book.getSheetAt(0);
		 Object[][] data  = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		int RowCount= sheet.getLastRowNum();
	int colcount=	 sheet.getRow(0).getLastCellNum();
		 for(int i=0;i<RowCount;i++) {
			 for(int j=0;j<colcount;j++) {
				 data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
				 
				 System.out.println(data[i][j]); 
			 }
		 }
		String val= sheet.getRow(1).getCell(0).getStringCellValue();
		
		 
		
	
		 
	}
}
