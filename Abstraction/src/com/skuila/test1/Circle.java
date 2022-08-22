package com.skuila.test1;

public class Circle extends Shapes {

	public static void main(String[] args) 
	{
		Circle c =new Circle();
		c.drawShape();
		c.colorShape();
		c.moveShape();
		

	}

	@Override
	public void drawShape() {
		System.out.println("Drawing Circle");
		
	}

	@Override
	public void colorShape() {
		System.out.println("Coloring Circle");
		
	}

	@Override
	public void moveShape() {
		System.out.println("Moving Circle");
		
	}

}
