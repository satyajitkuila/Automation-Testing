//3.	Check when multiplying a six-digit number with 2 gives a number that has all the same numbers. For example, 142857 x 2 = 285714
package LearningJava;

import java.util.Arrays;
import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int a=sc.nextInt();
		int b=a*2;
		char[] ac = String.valueOf(a).toCharArray();
		Arrays.sort(ac);
		System.out.println(ac);
		char[] bc = String.valueOf(b).toCharArray();
		Arrays.sort(bc);
		System.out.println(bc);
		
		if(Arrays.equals(ac, bc))
		{
			System.out.println("Same Numbers");
		}
		else
		{
			System.out.println("Different nos");
		}
		sc.close();
	}

}
