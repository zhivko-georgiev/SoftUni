import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		
		// Input
		Scanner input = new Scanner(System.in);
		String[] inpuStrings = input.nextLine().split(" ");
		
		Map<String, Integer> uniqueElementsCount = new HashMap<>();
		
		// Main Logic
		// Adding each string into the HashMap and counting how many times it appears in the sequence
		for (String str : inpuStrings) {
			if (uniqueElementsCount.containsKey(str)) {
				int newValue = uniqueElementsCount.get(str) + 1;
				uniqueElementsCount.put(str, newValue);
			}
			else {
				uniqueElementsCount.put(str, 1);
			}
		}
		
		// Finding the longest sequence of equal strings
		String mostFrequentElement = "";
		int frequency = 0;
		for (String key : uniqueElementsCount.keySet()) {
			int count = uniqueElementsCount.get(key);
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
