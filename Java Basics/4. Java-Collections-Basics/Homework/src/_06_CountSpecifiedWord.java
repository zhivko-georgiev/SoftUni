import java.util.Scanner;

public class _06_CountSpecifiedWord {

	public static void main(String[] args) {

		// Input
		Scanner input = new Scanner(System.in);
		
		// "[\\W\\d]+" = Set definition non-Word Character + any digit
		String[] words = input.nextLine().split("[\\W\\d]+");
		String wordInQuestion = input.nextLine().toLowerCase();
		
		// Main Logic
		int counter = 0;
		for (int i = 0; i < words.length; i++) {
			if (wordInQuestion.equals(words[i].toLowerCase())) {
				counter++;
			}
		}
		
		// Output
		System.out.println(counter);
	}
}
