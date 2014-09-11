import java.util.Scanner;

public class _02_WordsGenerator {

	public static void main(String[] args) {

		// Input
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();

		// Main Logic
		for (int i = 0; i < inputString.length(); i++) {
			for (int j = 0; j < inputString.length(); j++) {
				for (int k = 0; k < inputString.length(); k++) {
					System.out.print(inputString.charAt(i) + ""
							+ inputString.charAt(j) + ""
							+ inputString.charAt(k) + " ");
				}
			}
		}
	}
}
