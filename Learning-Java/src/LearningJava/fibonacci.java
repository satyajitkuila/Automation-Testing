package LearningJava;

import java.util.Scanner;

public class fibonacci {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the limit for fibo series :");
		int k=sc.nextInt();
		fibonacci f =new fibonacci();
		f.Fibo(k);
		
	}
	
	public void Fibo(int k) {
		int a=0;
		int b=0;
		int c=1;
		int count=k;
		for(int i=0;i<=count;i++)
		{
			System.out.print(a+",");
			a=b;
			b=c;
			c=a+b;
		}
	}

}
