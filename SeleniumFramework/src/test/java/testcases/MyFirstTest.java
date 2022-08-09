package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class MyFirstTest extends BaseTest {

	@Test(dataProviderClass = ReadXLSdata.class,dataProvider="bvtdata")
	public static void LoginTest(String username,String pswd) throws InterruptedException {
		driver.findElement(By.className(loc.getProperty("signin"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(loc.getProperty("mailfield"))).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("nextbttn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("pwdfield"))).sendKeys(pswd);
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("loginbttn"))).click();
		Thread.sleep(8000);
	}

	


}
