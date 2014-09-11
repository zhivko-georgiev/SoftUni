import java.util.Scanner;

public class _01_RectangleArea {

	public static void main(String[] args) {
		
		// Input
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		// Main Logic
		String[] numbers = input.split(" ");
		int a = Integer.parseInt(numbers[0]);
		int b = Integer.parseInt(numbers[1]);
	
		// Output
		System.out.println("The Rectangle's area is equal to " + a * b);
	}
}
