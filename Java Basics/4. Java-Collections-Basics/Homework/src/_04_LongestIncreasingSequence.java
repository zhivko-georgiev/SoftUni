import java.util.Scanner;

public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {

		// Input
		Scanner input = new Scanner(System.in);
		String[] numbersAsString = input.nextLine().split(" ");

		int[] numbers = new int[numbersAsString.length];
		
		for (int i = 0; i < numbersAsString.length; i++) {
			numbers[i] = Integer.parseInt(numbersAsString[i]);
		}

		int startMaxSequence = 0;
		int lengthMaxSequence = 0;
		
		int startSequence = 0;
		int endSequence = 0;
		int lengthSequence = 0;
		
		// Main Logic
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] < numbers[i + 1]) {
				System.out.print(numbers[i] + " ");
			} else {
				System.out.println(numbers[i]);
				endSequence = i;
				lengthSequence = endSequence - startSequence + 1;
				
				// Checking whether the current sequence is the longest one
				if (lengthSequence > lengthMaxSequence) {
					lengthMaxSequence = lengthSequence;
					startMaxSequence = startSequence;
				}
				startSequence = i + 1;
			}
		}
		
		// Last Element
		int  lastIndexOfTheSequence = numbers.length - 1;
		System.out.println(numbers[lastIndexOfTheSequence]);
		endSequence = lastIndexOfTheSequence;
		lengthSequence = endSequence - startSequence + 1;

		if (lengthSequence > lengthMaxSequence) {
			lengthMaxSequence = lengthSequence;
			startMaxSequence = startSequence;
		}

		// Output
		System.out.print("Longest: ");
		for (int i = startMaxSequence; i < startMaxSequence + lengthMaxSequence; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
