package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	    static boolean isAnagram(String a, String b) {
			int l1=a.length();
			int l2=b.length();
			boolean status = false;
			if (l1!=l2) {
				
				status=false;
			}
			else{			
				
				char[] ac = a.toLowerCase().toCharArray();
			    char[] bc = b.toLowerCase().toCharArray();
				
				Arrays.sort(ac);
				Arrays.sort(bc);
				status = Arrays.equals(ac, bc);
				System.out.println(status);
				
			}
			return status;
			
	    }
	    
	

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}

