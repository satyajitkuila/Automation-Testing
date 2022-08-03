package ui;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DependencyTest 
{
	@Test
	public void userRegistration()
	{
		System.out.println("This is Test1");
		Assert.assertTrue(false);
		
	}
	
	@Test(dependsOnMethods="userRegistration",alwaysRun=true)
	public void userSearch()
	{
		
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
