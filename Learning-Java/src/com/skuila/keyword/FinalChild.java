package com.skuila.keyword;

public class FinalChild extends FinalParent {

	public final int i = 10;

	public static void main(String[] args) {

		FinalChild fc = new FinalChild();
		System.out.println(fc.i);
		// fc.i=20;
		System.out.println(fc.i);
		fc.setData();

	}

}
