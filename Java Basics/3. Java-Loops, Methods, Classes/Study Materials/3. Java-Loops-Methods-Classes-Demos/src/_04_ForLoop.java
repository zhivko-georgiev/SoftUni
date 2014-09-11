import java.math.BigInteger;

public class _04_ForLoop {
	public static void main(String[] args) {
		for (int number = 0; number < 10; number++) {
		    System.out.print(number + " ");
		}
		System.out.println();
		
		int n = 10;
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
		    factorial *= i;
		}
		System.out.printf("%d! = %s\n", n, factorial);
		
		n = 50;
		BigInteger factorialBig = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			BigInteger factor = new BigInteger("" + i); 
			factorialBig = factorialBig.multiply(factor);
		}
		System.out.printf("%d! = %s\n", n, factorialBig);
	}
}
