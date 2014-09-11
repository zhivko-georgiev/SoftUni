import java.util.Random;
import java.util.Scanner;

public class _06_RandomHandsOfFiveCards {

	public static void main(String[] args) {

		// Input
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A"};
		char[] faces = {'♣', '♦', '♥', '♠'};
		
		// Main Logic
		Random randomNumber = new Random();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				int randomCard = randomNumber.nextInt(13);
				int randomFace = randomNumber.nextInt(4);
				System.out.printf("%s%c ", cards[randomCard], faces[randomFace]);
			}
			System.out.println();
		}
	}
}
