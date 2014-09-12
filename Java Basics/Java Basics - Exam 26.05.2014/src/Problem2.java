import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		// Input
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] allNumbers = new int[n];

		for (int i = 0; i < allNumbers.length; i++) {
			allNumbers[i] = scan.nextInt();
		}
		int resultsCounter = 0;

		// Main Logic
		for (int i = 0; i < allNumbers.length; i++) {
			for (int j = 0; j < allNumbers.length; j++) {
				for (int k = 0; k < allNumbers.length; k++) {
					if (FindPythagoreanNumbers(allNumbers[i], allNumbers[j], allNumbers[k])) {
						if (allNumbers[i] <= allNumbers[j]
								&& allNumbers[i] <= allNumbers[k]) {
							System.out.println(allNumbers[i] + "*" + allNumbers[i] + " + " 
								+ allNumbers[j] + "*" + allNumbers[j] + " = "
									+ allNumbers[k] + "*" + allNumbers[k]);
							resultsCounter++;
						}
					}
				}
			}
		}

		// Output
		if (resultsCounter == 0) {
			System.out.println("No");
		}
	}

	private static boolean FindPythagoreanNumbers(int i, int j, int k) {
		if ((i * i) + (j * j) == k * k) {
			return true;
		}
		return false;
	}
}
