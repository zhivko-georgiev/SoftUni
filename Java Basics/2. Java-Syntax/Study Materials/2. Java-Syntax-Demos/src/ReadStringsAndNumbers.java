import java.util.Scanner;

public class ReadStringsAndNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstWord = input.next("\\w+");
		String secondWord = input.next("\\w+");
		int numInt = input.nextInt();
		double numDouble1 = input.nextDouble();
		double numDouble2 = input.nextDouble();
		input.nextLine(); // Skip to the line end
		String str = input.nextLine();
		
		System.out.println("firstWord = " + firstWord);
		System.out.println("secondWord = " + secondWord);
		System.out.println("numInt = " + numInt);
		System.out.println("numDouble1 = " + numDouble1);
		System.out.println("numDouble2 = " + numDouble2);		
		System.out.println("str = " + str);		
	}
}
