import java.util.Scanner;

public class _05_AngleUnitConverter2 {

	public static void main(String[] args) {

		// Input
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		// Main Logic
		for (int i = 0; i < n; i++) {
			double angle = scan.nextDouble();
			String measure = scan.next();
			if (measure.equals("deg")) {
				double angleInRadians = Math.toRadians(angle);
				System.out.printf("%.6f", angleInRadians);
				System.out.println(" rad");
			} else if (measure.equals("rad")) {
				double angleInDegrees = Math.toDegrees(angle);
				System.out.printf("%.6f", angleInDegrees);
				System.out.println(" deg");
			}
		}
	}
}
