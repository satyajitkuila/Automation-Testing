//Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
//We define a token to be one or more consecutive English alphabetic letters. 
//Then, print the number of tokens, followed by each token on a new line.
//He is a very very good boy, isn't he?
package hackerRank;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
       
        String[] arrOfStr = s.split("[, '?.@]+");
        
       
        
        scan.close();
        for (String a : arrOfStr)
            System.out.println(a);

	}

}
