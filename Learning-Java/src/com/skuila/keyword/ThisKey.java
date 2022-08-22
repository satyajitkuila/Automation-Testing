package com.skuila.keyword;

public class ThisKey {

	int x = 10;
	int y = 20;
	String s = "CES";

	public ThisKey() {
		System.out.println("Default Output");
	}

	public ThisKey(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
		System.out.println("Default Output");
	}

	public static void main(String[] args) {
		ThisKey k = new ThisKey(10,12);
		k.getData();

	}

	public void getData() {
		int x = 110;
		int y = 210;
		System.out.println(this.x + this.y);
		System.out.println(x + y);
	}

}
