import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _12_CardsFrequencies {

	public static void main(String[] args) {

		// Input
		Scanner input = new Scanner(System.in);
		String[] allCards = input.nextLine().split("[ ♥♣♦♠]+");
		Map<String, Integer> cardFaces = new LinkedHashMap<>();

		// Main Logic
		for (String card : allCards) {
			Integer count = cardFaces.get(card); // get the value of this key(card)
			if (count == null) {
				count = 0;
			}
			cardFaces.put(card, count + 1);
		}
		
		// Output
		for (Map.Entry<String, Integer> entry : cardFaces.entrySet()) {
			double precentage = ((double) entry.getValue() * 100) / allCards.length;
			System.out.printf("%s -> %.2f%%\n", entry.getKey(), precentage);
		}
	}
}
