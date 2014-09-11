
public class TypeConversion {

	public static void main(String[] args) {
		int i = 5;
		long l = i; // Implicit type conversion
		
		long lng = 5;
		int intVal = (int) lng; // Explicit type conversion
		
		float heightInMeters = 1.74f; // Explicit conversion
		double maxHeight = heightInMeters; // Implicit
		double minHeight = (double) heightInMeters; // Explicit
		float actualHeight = (float) maxHeight; // Explicit
		//float maxHeightFloat = maxHeight; // Compilation error!
		
		// Explicit type conversion with data loss
		byte dataLoss = (byte)12345; // 57
		
		System.out.println(lng);
		System.out.println(intVal);
		System.out.println(heightInMeters);
		System.out.println(maxHeight);
		System.out.println(minHeight);
		System.out.println(actualHeight);
		System.out.println(dataLoss);
	}

}
