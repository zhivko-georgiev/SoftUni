import java.util.Arrays;
import java.util.Scanner;

public class _01_SortingArrayOfNumbers {

	public static void main(String[] args) {

		// Input
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] inputIntegers = new int[n];

		// Main Logic
		input.nextLine();
		for (int i = 0; i < inputIntegers.length; i++) {
			inputIntegers[i] = input.nextInt();
		}
		Arrays.sort(inputIntegers);

		// Output
		for (int integer : inputIntegers) {
			System.out.print(integer + " ");
		}
	}
}
