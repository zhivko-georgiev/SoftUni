public class _03_FullHouse {

	public static void main(String[] args) {

		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		char[] faces = { '♣', '♦', '♥', '♠' };
		int fullHouseCounter = 0;

		// Main Logic
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < cards.length; j++) {
				for (int card1 = 0; card1 < faces.length; card1++) {
					for (int card2 = card1 + 1; card2 < faces.length; card2++) {
						for (int card3 = card2 + 1; card3 < faces.length; card3++) {
							for (int card4 = 0; card4 < faces.length; card4++) {
								for (int card5 = card4 + 1; card5 < faces.length; card5++) {
									if (i != j) {
										System.out.printf(
												"(%s%c %s%c %s%c %s%c %s%c) ",
												cards[i], faces[card1],
												cards[i], faces[card2],
												cards[i], faces[card3],
												cards[j], faces[card4],
												cards[j], faces[card5]);
										fullHouseCounter++;
										System.out.println();
									}
								}
							}
						}
					}
				}
			}
		}

		// Printing the total count of all Full Houses combinations
		System.out.println();
		System.out.println(fullHouseCounter + " full houses");
	}
}
