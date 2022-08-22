package hackerRank;

//2. Given an input string = aabbbccccaaaaa, maintain the insertion order and
// output a2b3c4a5
import java.util.Arrays;

public class Q01InsertionOrder {

	public static void process(String mystring) {
		StringBuilder sb = new StringBuilder();
		char[] mychar = mystring.toCharArray();
		int count = 1;
		for (int i = 0; i < (mychar.length) - 1; i++) {
			System.out.println("mychar[p1]: " + mychar[i] + " mychar[p2]: " + mychar[i + 1]);

			if (mychar[i] == mychar[i + 1]) {
				count = count + 1;
				System.out.println("count: " + count);
			} else {
				System.out.println(sb);
				sb.append(mychar[i]);
				sb.append(count);
				count = 1;
			}
			if (i == (mychar.length) - 2) //0==(14)-2
			{ 
				System.out.println(sb);
				sb.append(mychar[i + 1]);
				sb.append(count);
				
			}
		}
		System.out.println("The sorted no : "+sb.toString());
	}

	public static void main(String[] args) {
		process("aabbbccccaaaaa");

	}

}
