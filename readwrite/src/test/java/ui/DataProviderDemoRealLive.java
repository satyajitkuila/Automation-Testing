package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Common.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemoRealLive extends BaseTest{
	
		
	@Test(dataProvider="create")
	public void test1(String username,String password)
	{
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		
		

	}
	
	@DataProvider(name="create")
	public Object[][] dataset1()
	{
				
		return new Object[][]
				{
					{"standard_user","secret_sauce"},
					{"locked_out_user","secret_sauce"},
					{"problem_user","secret_sauce"},
					{"performance_glitch_user0","secret_sauce1"}
				};
	}

}
