package properties;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteDataDemo {

	public static void main(String[] args) throws IOException {

		// Step 1: Create an object of FileReader Class
		
		//why: Reads the character file
//		FileReader fr = new FileReader("D:\\Selenium\\Sel-Work-Space\\Learning Java\\src\\TestData.properties");
		
		//why: Read streams of raw byte
//		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\src\\TestData.properties");
		
		FileWriter fw = new FileWriter("D:\\\\Selenium\\\\Sel-Work-Space\\\\Learning Java\\\\src\\\\TestData001.properties",true);
		
		
		// step 2: create an object of properties class
		Properties p = new Properties();
		
		// step 3: use set property  method
		p.setProperty("url", "google.com");
		p.store(fw, "Sample comments");
		

	}

}
