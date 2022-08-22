package Super;

public class Child extends Parent {
	
	public Child () {
		super(2);
	}
	String empName ="Wesley";
	int empNo =65478;

	public static void main(String[] args) {
		Child c = new Child();
		c.getData();

	}
	
	public void getData()
	{
//		super.getData();
		System.out.println(empName);
		System.out.println(empNo);
	}

}
