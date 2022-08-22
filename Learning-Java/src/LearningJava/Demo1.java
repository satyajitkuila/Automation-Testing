package LearningJava;


	import java.io.*;
	import java.util.*;

	public class Demo1 
	{

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        int a=A.length();
	        int b=B.length();
	        String str1= A.substring(0, 1);
	        String str2= B.substring(0, 1);
	        System.out.println(a+b);
	        int x= A.compareTo(B);
	        System.out.println("lol"+x);
	        if(x>0){
	            System.out.println("Yes");
	        }
	        else
	        {
	            System.out.println("No");
	        }
	        
	        
	        
	       
	    }
	}






