package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderMaster {
	
	
	@DataProvider(name="create")
	public Object[][] dataset1(Method m) //easy to understand and update
	{
		
		Object[][] testdata = null;
		if(m.getName().equals("test"))
		{
			testdata= new Object[][]
					{
					{"username","password"},
					{"username1","password1"},
					{"username2","password2"},
					{"username3","password3"}
					};
		}
		else if(m.getName().equals("test1"))
		{
			testdata= new Object[][]
					{
					{"username","password","third"},
					{"username1","password1","third1"},
					{"username2","password2","third2"},
					{"username3","password3","third3"}
					};
		}
		else if(m.getName().equals("test2"))
		{
			testdata= new Object[][]
					{
					{"username","password","third","Fourth"},
					{"username1","password1","third1","Fourth1"},
					{"username2","password2","third2","Fourth2"},
					{"username3","password3","third3","Fourth3"}
					};
		}
		return testdata;
			
		
	}

}
