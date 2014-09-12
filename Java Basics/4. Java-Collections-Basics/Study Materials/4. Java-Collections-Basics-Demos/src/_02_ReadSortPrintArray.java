import java.util.Arrays;
import java.util.Scanner;

public class _02_ReadSortPrintArray {
	public static void main(String[] args) {		
		// Read a number n and n text lines
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] lines = new String[n];
		for (int i = 0; i < n; i++) {
			lines[i] = scanner.nextLine();
		}
		
		// Sort the array of strings
		Arrays.sort(lines);
		
		// Print the sorted array
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
		}
	}
}
