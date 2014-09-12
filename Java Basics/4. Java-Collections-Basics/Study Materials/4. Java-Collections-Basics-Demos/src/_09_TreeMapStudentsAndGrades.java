import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _09_TreeMapStudentsAndGrades {
	public static void main(String[] args) {		
		HashMap<String, ArrayList<Integer>> grades = new HashMap<>();
		grades.put("Peter", new ArrayList<>(Arrays.asList(5)));
		grades.put("George", new ArrayList<>(Arrays.asList(5, 5, 6)));
		grades.put("Maria", new ArrayList<>(Arrays.asList(5, 4, 4)));
		grades.get("Peter").add(6);
		grades.get("George").add(6);
		
		for (String key : grades.keySet()) {
			System.out.println("" + key + " -> " + grades.get(key));
		}
	}
}
