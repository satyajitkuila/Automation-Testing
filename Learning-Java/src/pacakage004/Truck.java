package pacakage004;

public class Truck extends VehicleCommon {

	public static void main(String[] args) 
	{
		Truck tk = new Truck();
		tk.start();
		tk.stop();

	}
	
	public void loadCapacity()
	{
		System.out.println("Load capacity");
	}

}
