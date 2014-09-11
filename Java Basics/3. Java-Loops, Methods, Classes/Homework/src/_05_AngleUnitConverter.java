import java.util.Scanner;

public class _05_AngleUnitConverter {

	public static void main(String[] args) {
		
		// Input
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String input = "";
		String measure = "";

		// Main Logic
		for (int i = 0; i <= n; i++) {
			input = in.nextLine();
			input = input.replaceAll("\\s+", ""); // removing any whitespace
			measure = input.replaceAll("\\d+", ""); // removing any character
			measure = measure.replace(".", ""); // removing the dot('.')
			input = input.replaceAll("[^0-9.,]+", ""); // removing the rad/deg text

			// Output
			if (measure.equals("deg")) {
				System.out.format("%.6f rad%n", degreesToRadians(Double.parseDouble(input)));
			} else if (measure.equals("rad")) {
				System.out.format("%.6f deg%n", radiansToDegrees(Double.parseDouble(input)));
			}
		}
	}

	public static double degreesToRadians(double degrees) {
		double convertedValue = degrees * 0.0174532925;
		return convertedValue;
	}

	public static double radiansToDegrees(double degrees) {
		double convertedValue = degrees / 0.0174532925;
		return convertedValue;
	}
}