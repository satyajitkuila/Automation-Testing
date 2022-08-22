package hackerRank;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class numberformt {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String A = sc.next();
//		int len =A.length();
//		System.out.println(len);
//		String pal=A.substring(0, 0);
//		System.out.println(pal);
		
		
//		for (int i = 0; i <= len; i++) 
//		{
//			for (int j = 0; j <= len; j++) 
//			{
//				System.out.println("i"+i+"j"+j);
//				String pal=A.substring(i, j);
//				System.out.println(pal);
//				
//
//			}
//		}
		// Get the currency instance
        NumberFormat nF
            = NumberFormat
                  .getCurrencyInstance();
 
        // Sets the currency to Canadian Dollar
        nF.setCurrency(
            Currency.getInstance(
                Locale.CANADA));
		//System.out.println(A.substring(1,0));
		double payment=123456.45;
		Locale indiaLocale = new Locale("en", "IN");
		String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
		System.out.println(india);

	}

}
