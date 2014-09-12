import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class _07_SetsExample {

	public static void main(String[] args) {
		// Try also HashSet<String>
		Set<String> set = new HashSet<String>();
		
		set.add("Peter");
		set.add("Tosho");
		set.add("Peter");
		set.add("George");
		set.add("Maria");
		set.add("Alice");
		
		set.remove("Peter");
		
		System.out.println(set); // [George, Alice, Tosho, Maria]

		System.out.println(set.contains("Maria"));
		
		System.out.println();
		
		for (String element : set) {
			System.out.println(element);
		}
		System.out.println();
		
		set.forEach(x -> System.out.println(x));
		
		System.out.println();
		
		TreeSet<String> orderedSet = new TreeSet(set);
		List<String> orderedList = 
            orderedSet.stream()
            .filter(x -> !x.equals("Maria"))
            .collect(Collectors.toList());
		
		 orderedList.forEach(x -> System.out.println(x));
	}

}
