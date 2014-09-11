import java.util.Scanner;

public class _07_CountOfBitOne {

	public static void main(String[] args) {

		// Input
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		/*
		 * returns the string representation of the unsigned integer value
		 * represented by the argument in binary (base 2)
		 */
		System.out.println("Binary = " + Integer.toBinaryString(n));

		// Integer.bitCount(n) - Returns the count of one-bits
		// System.out.println("Number of one bits = " + Integer.bitCount(n));

		int counterOfOnes = 0;
		while (n != 0) {
			int bit = n & 1;
			if (bit == 1) {
				counterOfOnes++;
			}
			n = n >> 1;
		}
		System.out.println(counterOfOnes);
	}
}
