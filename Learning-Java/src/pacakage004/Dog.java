package pacakage004;

public class Dog extends Cat{

	public static void main(String[] args) {
		Cat c=new Cat();
		c.makeNoise();
		Dog d =new Dog();
		d.makeNoise();
		Animal a=new Animal();
		a.makeNoise();

	}
	

	

public void makeNoise()
{
	System.out.println("dog Woofs!");
}

}
