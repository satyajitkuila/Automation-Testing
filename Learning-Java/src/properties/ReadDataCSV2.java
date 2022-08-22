package properties;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ReadDataCSV2 {

	public static void main(String[] args) throws IOException {

		File f =new File("D:\\\\Selenium\\\\Sel-Work-Space\\\\Learning Java\\\\src\\\\Test1.txt");

		// Step 1: Create an object of FileReader Class
		FileReader fr = new FileReader(f);
		
		// step 2: create object of buffered writer
		BufferedReader br = new BufferedReader(fr);
		
		//step 3: Read data
		for(int i=1;i<=10;i++) {
		System.out.println(br.readLine());
		}
		
		//step 4: close the file
		System.out.println("Read success");
		br.close();
		

	}

}
