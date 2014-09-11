import java.util.Arrays;
import java.util.Scanner;

public class _04_SmallestOfThreeNumbers {

	public static void main(String[] args) {

		// Input
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		
		// Main Logic
		double[] arrayOfDoubles = {a, b, c};
		double max = Double.MAX_VALUE;
		
		for (int i = 0; i < arrayOfDoubles.length; i++) {
			if (arrayOfDoubles[i] < max) {
				max = arrayOfDoubles[i];
			}
		}
		
		// Output
		System.out.println(max);
		
		// Another variant - sorting the array and printing the element at position 0
//		Arrays.sort(arrayOfDoubles);
//		System.out.println(arrayOfDoubles[0]);
	}
}
