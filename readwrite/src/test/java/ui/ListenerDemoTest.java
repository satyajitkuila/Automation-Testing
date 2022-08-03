package ui;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Common.BaseTest;

public class ListenerDemoTest extends BaseTest 
{
	
	
	
	@Test
	public void launchapp()
	{
		ExtentTest test = extent.createTest("verify extent report").assignAuthor("Satyajitkuila");
		driver.get("https://ebay.com");
		String url =driver.getCurrentUrl();
		System.out.println(url+"is the live url");
		String baseURL1="https://ebay.com";
		
		
		if(baseURL1==url) {
			test.pass("Testcase is passed");
		}
		else
		{
			test.fail("Test is failed");
		}
	}
	
	
	

}
