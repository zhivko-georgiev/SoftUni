import java.util.Scanner;


public class _12_HandlingExceptions {
	public static void main(String[] args) {
	    String str = new Scanner(System.in).nextLine();
	    try {
	        int i = Integer.parseInt(str);
	        System.out.printf(
	           "You entered a valid integer number %d.\n", i);
	    }
	    catch (NumberFormatException nfex) {
	        System.out.println("Invalid integer number: " + nfex);
	    }
	}
}
