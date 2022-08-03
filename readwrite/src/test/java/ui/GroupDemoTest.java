package ui;

import org.testng.annotations.Test;

@Test(groups="user-reg")
public class GroupDemoTest {
	
	
		
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


