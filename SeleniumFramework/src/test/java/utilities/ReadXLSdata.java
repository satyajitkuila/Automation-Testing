package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadXLSdata {

//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		ReadXLSdata red = new ReadXLSdata();
//		red.getData("login");
//
//	}
	
	@DataProvider(name = "bvtdata")
	public String[][] getData(Method m) throws EncryptedDocumentException, IOException
	{
		String excelsheetname = m.getName();
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\LoginTest.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheetname =wb.getSheet(excelsheetname);
		//to get the no of rows
		int totalRows =sheetname.getLastRowNum();
		System.out.println(totalRows);
		Row rowCells =sheetname.getRow(0);
		int totalcols =rowCells.getLastCellNum();
		System.out.println(totalcols);
		
		DataFormatter df = new DataFormatter();
		String testData[][] = new String [totalRows][totalcols];
		
		for(int i=1;i<=totalRows;i++) {
			for(int j=0;j<totalcols;j++)
			{
				testData[i-1][j]=df.formatCellValue(sheetname.getRow(i).getCell(j));
				System.out.println(testData[i-1][j]);
			}
		}
		return testData;
	}

}
