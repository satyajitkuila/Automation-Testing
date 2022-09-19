import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main
{
	public static void main(String[] args) {
		System.out.println( useRegex("+91 009040594305"));
	}
   public static boolean useRegex(final String input) 
   {
   // Compile regular expression
   final Pattern pattern = Pattern.compile("^(\\+\\d{1,3}[- ]?)?\\d{10}$");
   // Match regex against input
   final Matcher matcher = pattern.matcher(input);
    // Use results...
    return matcher.matches();
    }

}
