package properties;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteDataCSV {

	public static void main(String[] args) throws IOException {

		// Step 1: Create an object of FileReader Class
		File f =new File("D:\\\\Selenium\\\\Sel-Work-Space\\\\Learning Java\\\\src\\\\TestData001.csv");
		FileWriter fw = new FileWriter(f,true);
		
		// step 2: create object of buffered writer
		BufferedWriter br = new BufferedWriter(fw);
		
		//step 3: Write data
		
		for(int i=1;i<10;i++)
		{
			br.write("skuila academy "+",");
		}
		
		
		//step 4:
		br.close();
		

	}

}
