package LearningJava;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) 
	{
		int m, n, i, j;   
		Scanner sc=new Scanner(System.in);   
		System.out.print("Enter the number of rows: ");   
		//taking row as input  
		m = sc.nextInt();   
		System.out.print("Enter the number of columns: ");   
		//taking column as input  
		n = sc.nextInt();   
		int myint =2;
		int[]myintarray =new int[5];
		int[][]b=new int[m][n];
//		b[0][1]=20;
//		myintarray[0]=10;
//		myintarray[1]=20;
//		myintarray[2]=30;
//		myintarray[3]=40;
//		System.out.println(myintarray[3]);
//		System.out.println(myintarray.length);
//		int[] myintarray1= {10,20,30,40};
//		System.out.println(myintarray1[1]);
//		System.out.println(myintarray1.length);
		
//		for (i=0;i<myintarray.length;i++) {
//			System.out.println("enter the array details:");
//			int k=sc.nextInt();
//			myintarray[i]=k;
//			System.out.println(i);
//			
//			
//			
//			
//		}
//		for (i=0;i<myintarray.length;i++) 
//		{
//		System.out.print(myintarray[i]);
//		
//		}
		
		
		for (i = 0; i < m; i++) 
		{
			
			for (j = 0; j < n; j++) 
			{
				b[i][j] = sc.nextInt();

			}

		}
		for (i = 0; i < m; i++) 
		{
			
			for (j = 0; j < n; j++) 
			{
				System.out.print(b[i][j]);

			}
		
	}}
		

}
