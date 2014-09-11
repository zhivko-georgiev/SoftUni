import java.util.Scanner;

public class _08_EqualBitPairsCounter {

	public static void main(String[] args) {
		
		// Input
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int numberDividedByTwo = number >> 1;
		System.out.println(Integer.toBinaryString(number));
		
		int pairOfZeros = 0;
		int pairOfOnes = 0;
		
		// Main Logic
		while (numberDividedByTwo != 0) {
			int bitFirstNumber = number & 1;
			int bitSecondNumber = numberDividedByTwo & 1;
			
			if (bitFirstNumber ==  1 && bitSecondNumber == 1) {
				pairOfOnes++;
			}
			if (bitFirstNumber == 0 && bitSecondNumber == 0) {
				pairOfZeros++;
			}
			number >>= 1;
			numberDividedByTwo >>= 1;
		}
		// Output - total number of pairs
		System.out.println(pairOfOnes + pairOfZeros);
	}
}
