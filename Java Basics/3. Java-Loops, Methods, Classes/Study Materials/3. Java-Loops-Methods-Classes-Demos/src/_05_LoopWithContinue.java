public class _05_LoopWithContinue {
	public static void main(String[] args) {
		int n = 100;
		int sum = 0;
		for (int i = 1; i <= n; i += 2) {
		   if (i % 7 == 0) {
		      continue;
		   }
		   sum += i;
		}
		System.out.println("sum = " + sum);
	}
}
