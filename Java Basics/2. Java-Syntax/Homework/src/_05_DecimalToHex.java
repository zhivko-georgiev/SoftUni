import java.util.Scanner;

public class _05_DecimalToHex {

	public static void main(String[] args) {
		
		// Input
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		// Output
		String hex = Integer.toHexString(number);
		System.out.println("The hexadecimal  value of " + number + " is " + hex.toUpperCase());
	}
}
