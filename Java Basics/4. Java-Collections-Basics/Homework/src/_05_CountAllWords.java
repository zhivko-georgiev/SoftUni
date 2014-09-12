import java.util.Arrays;
import java.util.Scanner;

public class _05_CountAllWords {

	public static void main(String[] args) {
		
		// Input
		Scanner input = new Scanner(System.in);
		
		// "[\\W\\d]+" = Set definition non-Word Character + any digit
		String[] words = input.nextLine().split("[\\W\\d]+"); 
		
		// Output
		System.out.println(words.length);
		System.out.println(Arrays.toString(words));
	}
}
