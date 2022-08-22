package wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		int i =10;
		Integer int1 = new Integer(i); //wrapping
		System.out.println(int1);
		
		int j =int1; //unwrapping
		System.out.println(j);

	}

}
