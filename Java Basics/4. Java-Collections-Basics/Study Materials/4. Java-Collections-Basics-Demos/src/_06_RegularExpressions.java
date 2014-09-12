import java.util.regex.*;

public class _06_RegularExpressions {

	public static void main(String[] args) {
		String text = 
			"Hello, my number in Sofia is +359 894 11 22 33, " +
			"but in Munich my number is +49 89 975-99222.";
		String phoneRegEx = "\\+\\d{1,3}([ -]*[0-9]+)+";
		Pattern phonePattern = Pattern.compile(phoneRegEx);
		Matcher matcher = phonePattern.matcher(text);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
		System.out.println("+359 2 981-981".matches(phoneRegEx));
		System.out.println("invalid number".matches(phoneRegEx));
		System.out.println("+359 123-".matches(phoneRegEx));
		System.out.println("+359 (2) 981 981".matches(phoneRegEx));
		System.out.println("+44 280 11 11".matches(phoneRegEx));
		System.out.println("++44 280 11 11".matches(phoneRegEx));
		System.out.println("(+49) 325 908 44".matches(phoneRegEx));
		System.out.println("+49 325 908-40-40".matches(phoneRegEx));
	}

}
