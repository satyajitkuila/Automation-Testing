package hackerRank;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("enter word to check palindrome");
		Scanner sc = new Scanner(System.in);
		String p = sc.next();
		String reverse = "";
		int length = p.length();
			System.out.println(length);
		for (int i = length-1 ; i >= 0; i--) {
			reverse = reverse + p.charAt(i);
			System.out.println(reverse);
		}
		if (p.equals(reverse))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");

	}

}
