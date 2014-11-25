import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a = ");
		int firstNumber = sc.nextInt();
		
		System.out.print("b = ");
		int secondNumber = sc.nextInt();
		
		// Output
		int result = firstNumber + secondNumber;
		System.out.printf("a + b = %d%n", result);
	}
}
