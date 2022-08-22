package pacakage003;

public class Common {

	private int length;
	private int width;
	private int height;

	public void setBoxDimension(int l, int b, int h) 
	{
		if(l>=1 && b>=1 && h>=1)
		{
			System.out.println("Vox created with dimension: " + l + " " + b + " " + h);
		}
		else
		{
			System.out.println("Invalid Dimension");
		}
		
		
	}

	public int setLength(int l) 
	{
		if(l>=1)
		{
			length = l;
		}
		else
		{
			System.out.println("Invalid length");
		}
		return length;

	}

	public int setWidth(int w) {
		width = w;
		return width;

	}

	public int setHeight(int h) {
		height = h;
		return height;

	}

	public int getlength() {

		return length;

	}

	public int getWidth() {

		return width;

	}

	public int getHeight() {

		return height;

	}

}
