package Super;

public class Parent {
	
	public Parent ()
	{
		System.out.println("Parent Constructor");
	}
	public Parent (int i)
	{
		System.out.println("Parent integer Constructor");
	}


	String empName ="Tom";
	int empNo =45345;
	
	public void getData()
	{
		System.out.println(empName);
		System.out.println(empNo);
	}
	

}
