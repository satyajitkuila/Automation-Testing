package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest  {
	
	public static WebDriver driver = null;
	public static ExtentReports extent = new ExtentReports();
    public static ExtentSparkReporter spark = new ExtentSparkReporter("extent.html");      
    
	
	@BeforeSuite
	public void launchbrowser()
	{
//		extent.attachReporter(spark);
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
	}
	@AfterSuite
	public void Closebrowser()
	{
//		extent.flush();
		driver.close();
		
	}
	
	@BeforeClass
	public void abc() {
		extent.attachReporter(spark);
		
	}
	@AfterClass
	public void cde() {
		extent.flush();
	}

}
