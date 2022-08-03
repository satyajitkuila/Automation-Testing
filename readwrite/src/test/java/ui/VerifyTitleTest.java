package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	@Test
	public void titleTest() 
	{
		SoftAssert softassert=new SoftAssert();
		String exptitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String exptText= "Search0";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		String acttitle=driver.getTitle();
		System.out.println("Verifying title");
		softassert.assertEquals(acttitle, exptitle,"Title verification failed");
		
		String actText=driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		System.out.println("Verifying text");
		softassert.assertEquals(actText, exptText,"Text verification failed");
		System.out.println("Closing Browser");
		driver.close();
		softassert.assertAll();
		
	}
	

}
