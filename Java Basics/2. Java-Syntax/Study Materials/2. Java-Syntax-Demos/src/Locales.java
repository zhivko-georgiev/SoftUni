import java.util.Locale;
import java.util.Scanner;

public class Locales {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		System.out.printf("Root locale: %f\n", 0.5); // 0.500000
		System.out.println("Root locale: " + 0.5); // 0.5
		System.out.print("Enter a number (Root locale): ");
		Scanner inputRoot = new Scanner(System.in);
		double d = inputRoot.nextDouble();
		System.out.printf("You entered (Root locale): %.2f\n", d);

		Locale.setDefault(new Locale("BG", "BG"));
		System.out.printf("BG locale: %f\n", 0.5); // 0,500000
		System.out.println("BG locale: " + 0.5); // 0.5
		System.out.print("Enter a number (BG locale): ");
		Scanner inputBG = new Scanner(System.in);
		d = inputBG.nextDouble();
		System.out.printf("You entered (BG locale): %.2f\n", d);
	}

}
