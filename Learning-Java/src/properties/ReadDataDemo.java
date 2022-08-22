package properties;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataDemo {

	public static void main(String[] args) throws IOException {

		// Step 1: Create an object of FileReader Class
		
		//why: Reads the character file
//		FileReader fr = new FileReader("D:\\Selenium\\Sel-Work-Space\\Learning Java\\src\\TestData.properties");
		
		//why: Read streams of raw byte
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\src\\TestData.properties");
		
		
		// step 2: create an object of properties class
		Properties p = new Properties();
		// step 3: Load the file
		p.load(fi);
		// step 4: use get property method to get property
		System.out.println(p.getProperty("website"));
		
		System.out.println(System.getProperty("user.dir"));

	}

}
