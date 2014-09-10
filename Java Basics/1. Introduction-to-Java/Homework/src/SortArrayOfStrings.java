import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] arrayOfStrings = new String[n];
		
		arrayOfStrings[0] = sc.nextLine();
		for (int i = 0; i < n; i++) {
			arrayOfStrings[i] = sc.nextLine(); 	
		}
		
		// Sorting the array
		Arrays.sort(arrayOfStrings);
		// Printing the sorted array
		for (int i = 0; i < arrayOfStrings.length; i++) {
			System.out.println(arrayOfStrings[i]);
		}
		
	}

}
