import java.util.Scanner;

public class _03_PointsInsideAFigure {

	public static void main(String[] args) {
		
		// Input
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();

		// Main Logic
		if (isInsideTheFirstFigure(x, y) || isInsideTheSecondFigure(x, y) ||
				isInsideTheThirdFigure(x, y)) {
			System.out.println("Inside");
		}
		else {
			System.err.println("Outside");
		}
	}
	// Methods for checking whether the points are inside each of the sub-figures
	public static boolean isInsideTheFirstFigure(double x, double y) {
		return (x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5);
	}
	
	public static boolean isInsideTheSecondFigure(double x, double y) {
		return (x >= 12.5 && x <= 22.5 && y >= 6 && y <= 8.5);
	}
	
	public static boolean isInsideTheThirdFigure(double x, double y) {
		return (x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5); 
	}
}
