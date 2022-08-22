package LearningJava;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) 
	{
		/*
		 * switch(expression) case1: statements case2 statements dafult: //none of the
		 * cases satisfy then executed statements:
		 */
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Day number- ");  
		int day= sc.nextInt(); 
		
		
		
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("None of the case satisfy");
		}

	}

}
