import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _09_CombineListOfLetters {

	public static void main(String[] args) {
		
		// Input
		Scanner input = new Scanner(System.in);
		
		List<Character> firstList = new ArrayList<>();
		List<Character> secondList = new ArrayList<>();
		List<Character> allTogether = new ArrayList<>();

		for (char ch : input.nextLine().toCharArray()) {
			firstList.add(ch);
		}
		for (char ch : input.nextLine().toCharArray()) {
			secondList.add(ch);
		}

		// Main Logic
		allTogether.addAll(firstList);

		for (int i = 0; i < secondList.size(); i++) {
			if (firstList.contains(secondList.get(i))) {
				continue;
			} else {
				allTogether.add(' ');
				allTogether.add(secondList.get(i));
			}
		}

		// Output
		for (char ch : allTogether) {
			System.out.print(ch);
		}
	}
}
