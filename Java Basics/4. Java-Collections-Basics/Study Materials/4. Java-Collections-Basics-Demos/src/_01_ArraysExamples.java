public class _01_ArraysExamples {

	public static void main(String[] args) {
		int[] numbers = new int[10];

		for (int i=0; i<numbers.length; i++) {
		    numbers[i] = i+1;
		}
		
		numbers[3] = 20;
		numbers[5] = numbers[2] + numbers[7];

		for (int i = 0; i<numbers.length; i++) {
			System.out.printf("numbers[%d] = %d\n", i, numbers[i]);
		}
		
		for (int num : numbers) {
			System.out.println(num);
		}
		
		String[] names = { "Peter", "Maria", "Katya", "Todor" };
		
		for (int i = 0; i<names.length; i++) {
			System.out.printf("names[%d] = %s\n", i, names[i]);
		}
		
		for (String name : names) {
		  System.out.println(name);
		}

		names[4] = "Nakov"; // ArrayIndexOutOfBoundsException
		
		//names.length = 5; // array.length is read-only field
	}

}
