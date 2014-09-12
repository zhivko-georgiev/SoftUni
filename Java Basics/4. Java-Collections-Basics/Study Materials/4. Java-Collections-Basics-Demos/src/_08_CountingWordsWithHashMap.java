import java.util.HashMap;
import java.util.Map;

public class _08_CountingWordsWithHashMap {
	public static void main(String[] args) {
		String[] words = { 
			"yes", "hi", "hello", "hi", "welcome", "yes", "yes",
			"welcome", "hi", "yes", "hello", "yes"
		};
		
		Map<String, Integer> wordsCount = 
				new HashMap<String, Integer>();
		for (String word : words) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0; 
			}
			wordsCount.put(word, count+1);
		}
		
		System.out.println(wordsCount);
		
		for (String word : wordsCount.keySet()) {
			int count = wordsCount.get(word);
			System.out.printf("%s -> %d times\n", word, count);
		}		
	}
}
