public class _10_RecursiveCalls {
	public static void main(String[] args) {
		int n = 5;
		long factorial = calcFactorial(n);
		System.out.printf("%d! = %d", n, factorial);
	}
	
	private static long calcFactorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * calcFactorial(n-1);
	}
}
