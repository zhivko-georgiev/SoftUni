import java.util.Scanner;

public class _09_MethodsReturningValue {
	static double calcTriangleArea(double width, double height) {
		return width * height / 2;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter triangle width: ");
		double width = input.nextDouble();
		System.out.print("Enter triangle height: ");
		double height = input.nextDouble();
		System.out.println("Area = " + calcTriangleArea(width, height));
	}
}
