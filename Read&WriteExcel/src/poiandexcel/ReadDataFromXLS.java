package poiandexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromXLS {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File("D:\\Selenium\\Sel-Work-Space\\Read&WriteExcel\\src\\data001\\TestDataRead.xls");
		FileInputStream fi = new FileInputStream(f);

		Workbook wb = WorkbookFactory.create(fi);
		Sheet sheet0 = wb.getSheetAt(0);

//		Row row0 = sheet0.getRow(0);
//		Cell cell0 = row0.getCell(0);
//		System.out.println(cell0);
		
		for(Row row:sheet0)
		{
			for(Cell cell:row)
			{
				switch(cell.getCellType())
				{
				case STRING:
					System.out.print(cell.getStringCellValue()+"  ");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue()+"  ");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+"  ");
					break;
				default:
					break;
				}
			}
			System.out.println();
		}
		fi.close();
		

	}

}
