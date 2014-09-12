import java.util.Scanner;

public class _07_CountSubstringOccurrences {

	public static void main(String[] args) {

		// Input
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine().toLowerCase();
		String wordInQuestion = input.nextLine().toLowerCase();
		int counter = 0;

		// Main Logic
		for (int i = 0; i <= sentence.length() - wordInQuestion.length(); i++) {
			if (sentence.substring(i, i + wordInQuestion.length()).equals(wordInQuestion)) {
				counter++;
			}
		}

		// Output
		System.out.println(counter);
	}
}
