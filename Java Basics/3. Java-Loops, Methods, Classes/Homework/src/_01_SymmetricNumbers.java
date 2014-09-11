import java.util.Scanner;

public class _01_SymmetricNumbers {
	public static void main(String args[]) {

		// Input
		Scanner input = new Scanner(System.in);
		int startNumber = input.nextInt();
		int endNumber = input.nextInt();

		// Main Logic
		for (int i = startNumber; i <= endNumber; i++) {
			if (isSymmetrical(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean isSymmetrical(int i) {
		String number = i + "";

		if (number.length() % 2 == 0) {
			for (int j = 0, k = number.length() - 1; j < number.length() / 2; j++, k--) {
				if (!(number.charAt(j) == number.charAt(k))) {
					return false;
				}
			}
			return true;
		} else {
			for (int j = 0, l = number.length() - 1; j < number.length() / 2 + 1; j++, l--) {
				if (!(number.charAt(j) == number.charAt(l))) {
					return false;
				}
			}
			return true;
		}
	}
}
