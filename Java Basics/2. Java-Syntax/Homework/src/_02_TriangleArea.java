import java.util.Scanner;

public class _02_TriangleArea {

	public static void main(String[] args) {
		
		// Input
		Scanner input = new Scanner(System.in);
	
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		
		int x3 = input.nextInt();
		int y3 = input.nextInt();
		
		// Output
		int result = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2;
		System.out.println(Math.abs(result));
	}
}
