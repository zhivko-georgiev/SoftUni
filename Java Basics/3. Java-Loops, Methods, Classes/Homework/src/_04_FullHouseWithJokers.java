import java.util.HashSet;
import java.util.Set;

public class _04_FullHouseWithJokers {

	public static void main(String[] args) {

		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", };
		char[] suits = { '♣', '♦', '♥', '♠' };
		int count = 0;
		Set<String> setOfCards = new HashSet<String>();
		String[] results = new String[5];

		// Main Logic
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < cards.length; j++) {
				if (i == j) {
					continue;
				}
				for (int a = 0; a < suits.length; a++) {
					for (int b = a + 1; b < suits.length; b++) {
						for (int c = b + 1; c < suits.length; c++) {
							for (int d = 0; d < suits.length; d++) {
								for (int e = d + 1; e < suits.length; e++) {
									for (int combs = 0; combs <= Math.pow(2, 5) - 1; combs++) {
										int num = combs;
										for (int joker = 0; joker < 5; joker++) {
											if (num % 2 == 1) {
												results[joker] = "*";
												num /= 2;
											}
										}
										setOfCards.add("(" + results[4]
														+ results[3]
														+ results[2]
														+ results[1]
														+ results[0] + ")");
										results[4] = cards[i] + suits[a];
										results[3] = cards[i] + suits[b];
										results[2] = cards[i] + suits[c];
										results[1] = cards[j] + suits[d];
										results[0] = cards[j] + suits[e];
										count++;
									}
								}
							}
						}
					}
				}
			}
			for (String card : setOfCards) {
				System.out.println(card);
			}
		}
		System.out.println();
		System.out.println(count + " full houses");
	}
}
