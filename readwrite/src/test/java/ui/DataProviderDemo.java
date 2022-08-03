package ui;

import org.testng.annotations.Test;

public class DataProviderDemo 
{
	
	@Test(dataProvider="create",dataProviderClass=DataProviderMaster.class)
	public void test(String username,String password)
	{
		System.out.println(username+"===="+password);
	}
	
	@Test(dataProvider="create",dataProviderClass=DataProviderMaster.class)
	public void test1(String username,String password,String test)
	{
		System.out.println(username+"===="+password+"===="+test);
	}
	
	@Test(dataProvider="create",dataProviderClass=DataProviderMaster.class)
	public void test2(String username,String password,String test,String test1)
	{
		System.out.println(username+"===="+password+"===="+test+"===="+test1);
	}
	
	
}
