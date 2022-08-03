package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseTest;


public class GroupDemoTest2 extends BaseTest
{
	
	
		@Test(priority=1,groups="regression")	
		public void atest1()
		{
			
			System.out.println("test1");
			
		}
				
		@Test(priority=2,groups="regression")
		public void btest2()
		{
			System.out.println("test2");
			driver.get("https://google.com");
			Assert.assertTrue(false);
			
		}
		
		@Test(groups={"regression","bvt"})
		public void btest3()
		{
			System.out.println("test3");
			
		}
		
		@Test(groups="bvt")
		public void btest4()
		{
			System.out.println("test4");
			
		}
	}



