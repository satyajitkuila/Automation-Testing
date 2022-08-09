package base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop =new Properties();
	public static Properties loc =new Properties();
	public static FileReader frl;
	public static FileReader fr;
	public static File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
	public static File fl = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");

	@BeforeMethod
	public void setup() throws IOException 
	{
		if(driver==null)
		{
			FileReader fr = new FileReader(f);
			FileReader frl = new FileReader(fl);
			prop.load(fr);
			loc.load(frl);
			
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
			
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			driver.get(prop.getProperty("testurl"));
			
		}	
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
		System.out.println("Successfully closed browser");
	}

}
