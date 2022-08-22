package hackerRank;

import java.util.Scanner;

public class lexographic {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "welcometojava";
        int k = 2;
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

	    public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        
	        

	        String[] list = new String[s.length() - k + 1];
	        System.out.println(s.length() - k + 1);
	        for (int i = 0; i <= s.length() - k; i++) {
	            String str = s.substring(i, i+k);
	            list[i] = str;
	        }

	        smallest = list[0];
	        largest = list[0];
	        for(int i = 1; i < list.length; i++) {
	            if (list[i].compareTo(smallest) < 0) {
	                smallest = list[i];
	            }

	            if (list[i].compareTo(largest) > 0){
	                largest = list[i];
	            }
	        }

	        return smallest + "\n" + largest;
	    }


	}


