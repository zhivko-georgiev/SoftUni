import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter and integer number: ");
		int number = Integer.parseInt(scanner.nextLine());
		if (number % 2 == 0)
		{
		    System.out.println("This number is even.");
		}
		else
		{
		    System.out.println("This number is odd.");
		}
		
		System.out.print("Enter a day number: ");
		int day = scanner.nextInt();
		switch (day) {
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Saturday"); break;
			case 7: System.out.println("Sunday"); break;
			default: System.out.println("Invalid day!"); break;
		}
	}

}
