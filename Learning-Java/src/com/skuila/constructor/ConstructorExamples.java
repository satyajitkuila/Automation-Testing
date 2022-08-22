package com.skuila.constructor;

public class ConstructorExamples {
	//no return types
	//and same name as class
	
	public ConstructorExamples() {
		System.out.println("no argument constructor");
	}
	public ConstructorExamples(int i) {
		System.out.println("integer constructor");
	}
	public ConstructorExamples(int i,int k) {
		System.out.println("2 integer constructor");
	}
	public ConstructorExamples(String s) {
		System.out.println("String constructor");
	}

	public static void main(String[] args) {
		ConstructorExamples ce =new ConstructorExamples(4,4);
		

	}

}
