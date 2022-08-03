package ui;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Common.BaseTest;

public class ReportsTest extends BaseTest
{
	@Test
	public void reporterTest1()
	{
		System.out.println("This is Test1");
		driver.get("https://sa;esforce.com");
		Assert.assertTrue(false);
	}
	
	@Test
	public void reporterTest2()
	{
		Reporter.log("Test2 is Compiled");
		System.out.println("This is Test2");
	}
	
	@Test
	public void reporterTest3()
	{
		System.out.println("This is Test3");
	}
	
	@Test
	public void reporterTest4()
	{
		System.out.println("This is Test4");
	}
	

}
