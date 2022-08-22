package poiandexcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("Sheet1");
		
		Row r0 = sheet1.createRow(0);
		Cell c0 = r0.createCell(0);
		c0.setCellValue("skuila academy");
		
		Row r1 = sheet1.createRow(1);
		Cell c1 = r1.createCell(1);
		c1.setCellValue("skuila academy 12346");
		
		File f =new File("D:\\Selenium\\Sel-Work-Space\\Read&WriteExcel\\src\\data001\\TestData.xls");
		FileOutputStream fo =new FileOutputStream(f);
		workbook.write(fo);
		fo.close();
		workbook.close();
		System.out.println("File written success");
		
	}

}
