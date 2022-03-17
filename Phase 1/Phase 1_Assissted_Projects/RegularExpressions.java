package projects;
import java.util.regex.*;
public class RegularExpressions {
	

	

	public static void main(String[] args) {

		String pattern = "[a-z]+";
		String check = "Purushotham Porus";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
	}
}
	


