package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void loginapp() {
		System.out.println("login frm app ###");
		
	}
	
	@AfterTest
	public void logoutapp() {
		System.out.println("logout frm app ###");
		
	}
	
	@BeforeMethod
	 public void connectDB() {
		 System.out.println("DB connected");
	 }
	 
	@AfterMethod
	 public void disconnectDB() {
		 System.out.println("DB disconnected");
	 }
	
	@Test(priority=1,description="login test running")	
	public void logintest1()
	{
		System.out.println("Login is succesful1");
		
	}
	
	
	@Test(priority=2,description="logout test running")
	public void logouttest2()
	{
		System.out.println("logout is succesful2");
		
	}
}
