package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups="user-reg")
public class beforeafterGroup {
		
		
		@BeforeClass
		public void beforeclass()
		{
			System.out.println("run this before class");
			
		}
		@AfterClass
		public void afterclass()
		{
			System.out.println("run this after class");
			
		}
		@BeforeGroups(value="regression")
		public void beforegroup()
		{
			System.out.println("Run method before regression");
			
		}
		@AfterGroups(value="regression")
		public void aftergroup()
		{
			System.out.println("Run method after regression");
			
		}
		
	
	
		
		@Test(priority=1,groups="regression")	
		public void atest1()
		{
			System.out.println("test1");
			
		}
				
		@Test(priority=2,groups="regression")
		public void btest2()
		{
			System.out.println("test2");
			
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


