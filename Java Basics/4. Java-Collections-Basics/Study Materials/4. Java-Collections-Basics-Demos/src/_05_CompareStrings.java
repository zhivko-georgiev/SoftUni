public class _05_CompareStrings {
	public static void main(String[] args) {
		String[] words = "yes yes".split(" ");
		System.out.println("words[0] = " + words[0]);
		System.out.println("words[1] = " + words[0]);
		
		System.out.println(words[0] == words[1]); // false
		System.out.println(words[0].equals(words[1])); // true
		
		if (words[0] == words[1]) {
			System.out.println("words[0] == words[1]");
		} else {
			System.out.println("words[0] != words[1]");
		}
		
		if (words[0] == "yes") {
			System.out.println("words[0] == yes");
		} else {
			System.out.println("words[0] != yes");
		}
		
		if (words[0].equals(words[1])) {
			System.out.println("words[0].equals(words[1])");
		}
		
		if (words[0].equals("yes")) {
			System.out.println("words[0].equals(\"yes\")");
		}
		
		System.out.println("Alice".compareTo("Mike")); // < 0
		System.out.println("Alice".compareTo("Alice")); // == 0
		System.out.println("Mike".compareTo("Alice")); // > 0

		if ("Alice".compareTo("Mike") < 0) {
			System.out.println("Alice < Mike");
		}
		
		if ("Alice".compareTo("Alice") == 0) {
			System.out.println("Alice == Alice");
		}		

		if ("Mike".compareTo("Alice") > 0) {
			System.out.println("Mike > Alice");
		}
	}
}
