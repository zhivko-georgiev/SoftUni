public class _08_MethodPrintAsterix {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			printAsterix(i);
		}
	}
	
	private static void printAsterix(int count) {
		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println();		
	}
}
