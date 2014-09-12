import java.util.Scanner;

public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {

		// Input
		Scanner input = new Scanner(System.in);
		String[] arrayOfStrings = input.nextLine().split(" ");

		// Main Logic
		for (int i = 0; i < arrayOfStrings.length - 1; i++) {
			System.out.print(arrayOfStrings[i] + " ");
			if (!(arrayOfStrings[i].equals(arrayOfStrings[i + 1]))) {
				System.out.println();
			}
		}
		
		// Printing the last member of the sequence
		System.out.println(arrayOfStrings[arrayOfStrings.length - 1]);
	}
}
