import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {

		// Input
		Scanner input = new Scanner(System.in);
		String[] inpuStrings = input.nextLine().split(" ");

		Map<String, Integer> uniqueElements = new HashMap<>();

		// Main Logic
		// Adding each string into the HashMap and counting how many times it
		// appears in the sequence
		for (String str : inpuStrings) {
			if (uniqueElements.containsKey(str)) {
				int value = uniqueElements.get(str) + 1;
				uniqueElements.put(str, value);
			} else {
				uniqueElements.put(str, 1);
			}
		}

		// Finding the longest sequence of equal strings
		String mostFrequentElement = null;
		int frequency = 0;
		
		for (String key : uniqueElements.keySet()) {
			int count = uniqueElements.get(key);
			if (count > frequency) {
				frequency = count;
				mostFrequentElement = key;
			}
		}

		// Output
		for (int i = 0; i < frequency; i++) {
			System.out.print(mostFrequentElement + " ");
		}
	}
}
