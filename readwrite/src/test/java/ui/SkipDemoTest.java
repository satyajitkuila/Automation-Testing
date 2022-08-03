package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	
	Boolean datasetup =true;
	
	@Test(enabled=false)
	public void skipTest1() 
	{
		System.out.println("skipping this test as it is not complete");
	}
	@Test
	public void skipTest2()
	{
		System.out.println("This is skipped skiptest2 forcefully");
		throw new SkipException("skipping Test2");
	}
	@Test
	public void skipTest3()
	{
		
		System.out.println("This is not skipped skiptest3");
		if(datasetup==false)
		{
			System.out.println("Execute Test3");
		}
		else
		{
			System.out.println("Do not execute test3");
			throw new SkipException("Do not execute further steps");
		}
	}

}
