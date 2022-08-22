package pacakage004;

public class MethodOverloading {

	public static void main(String[] args)
	{
		MethodOverloading mo=new MethodOverloading();
		mo.login(654756, "password",1234);

	}
	
	public void login (String s,String p)
	{
		System.out.println("login succesful using username & password");
		
	}
	
	public void login(int i,String s)
	{
		System.out.println("login succesful using Phone no & password");
		
	}
	public void login (int i,String s,int t)
	{
		System.out.println("login succesful using Phone no/pin & password");
		
	}



}
