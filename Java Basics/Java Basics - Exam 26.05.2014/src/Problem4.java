import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		// Input
		Scanner input = new Scanner(System.in);
		String[] inputStrings = input.nextLine().split(" ");
		ArrayList<String> pairs = new ArrayList<>();

		Map<String, Integer> couplesMap = new LinkedHashMap<>();

		for (int i = 0; i < inputStrings.length - 1; i++) {
			String tempString = inputStrings[i] + " " + inputStrings[i + 1];
			pairs.add(tempString);
			tempString = null;
		}
		
		// Main Logic
		for (String pair : pairs) {
			Integer count = couplesMap.get(pair); 
			if (count == null) {
				count = 0;
			}
			couplesMap.put(pair, count + 1);
		}
		
		// Output
		for (Map.Entry<String, Integer> entry : couplesMap.entrySet()) {
			double precentage = (double) entry.getValue() * 100 / (inputStrings.length - 1);
			System.out.printf("%s -> %.2f%%\n", entry.getKey(), precentage);
		}
	}
}
