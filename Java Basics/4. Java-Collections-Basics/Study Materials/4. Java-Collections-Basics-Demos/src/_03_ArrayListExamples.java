import java.util.ArrayList;
import java.util.Arrays;

public class _03_ArrayListExamples {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>() {{
			add("Peter");
			add("Maria");
			add("Katya");
			add("Todor");			
		}};
		names.add("Nakov"); // Peter, Maria, Katya, Todor, Nakov
		names.remove(0); // Maria, Katya, Todor, Nakov
		names.remove(1); // Maria, Todor, Nakov
		names.remove("Todor"); // Maria, Nakov
		names.addAll(Arrays.asList("Alice", "Tedy")); // Maria, Nakov, Alice, Tedy
		names.add(3, "Sylvia"); // Maria, Nakov, Alice, Sylvia, Tedy
		names.set(2, "Mike"); // Maria, Nakov, Mike, Sylvia, Tedy
		System.out.println(names);

		for (String name : names)
		{
		    System.out.println(name);
		}
		
		
		// This will not compile!
		//ArrayList<int> intArr = new ArrayList<int>();
		
		
		ArrayList<Integer> nums = new ArrayList<>(
				Arrays.asList(5, -3, 10, 25));
		nums.add(55); // 5, -3, 10, 25, 55
		System.out.println(nums.get(0)); // 5
		System.out.println(nums); // [5, -3, 10, 25, 55]
		nums.remove(2); // 5, -3, 25, 55
		nums.set(0, 101); // 101, -3, 25, 55
		System.out.println(nums); // [101, -3, 25, 55]

		//System.out.println(nums[2]); // The indexer [] does not work
		//nums[2] = 5; // The indexer [] does not work
		
		nums.add(5); // 5, -3, 10, 25, 55, 5
		nums.add(15); // 5, -3, 10, 25, 55, 5, 15

		// Streaming API example with functional-style processing
		nums.stream()
			.filter(x -> x % 5 == 0)
			.sorted()
			.forEach(x -> System.out.println(x));
	}
}
