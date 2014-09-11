import java.util.Scanner;

public class _02_LoopWihBreak {
	public static void main(String[] args)
	{
	    int n = new Scanner(System.in).nextInt();
	    // Calculate n! = 1 * 2 * ... * n
	    int result = 1;
	    while (true) {
	        if (n == 1)
	            break;
	        result *= n;
	        n--;
	    }
	    System.out.println("n! = " + result); 
	}
}
