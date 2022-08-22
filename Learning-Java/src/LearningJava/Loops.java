package LearningJava;

public class Loops {

	public static void main(String[] args)
	{
		/*While Loop*/
		int i = 1;
		while (i <= 10) {

			System.out.print(i);
			i++;
		}
		
		/*do While Loop*/
		System.out.println(" while done");
		int j = 1;
		do {
			System.out.print(j);
			j++;
		} while (j <= 10);
		
		/*for Loop*/
		System.out.println(" do while loop done");
		for(int k=1;k<=10;k++) {
			System.out.print(k);
		}
		System.out.println(" for loop done ");
	}

}
