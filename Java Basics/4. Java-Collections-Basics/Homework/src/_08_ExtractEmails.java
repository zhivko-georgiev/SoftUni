import java.util.Scanner;
import java.util.regex.*;

public class _08_ExtractEmails {

	public static void main(String[] args) {
	
		// Input
		Scanner input = new Scanner(System.in);
		String inputText = input.nextLine();

		// Main Logic
		Pattern emailsPattern = Pattern.compile("[_A-Za-z0-9-]+"
				+ "(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+"
				+ "(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})");
		Matcher emailsMatcher = emailsPattern.matcher(inputText);

		while (emailsMatcher.find()) {
			System.out.println(emailsMatcher.group());
		}
	}
}
