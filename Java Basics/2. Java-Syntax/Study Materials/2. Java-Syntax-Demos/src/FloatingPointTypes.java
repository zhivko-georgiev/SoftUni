import java.math.BigDecimal;

public class FloatingPointTypes {
	public static void main(String[] args) {
		float f = 0.33f;
		double d = 1.67;
		double sum = f + d;
		//float fSum = f + d; // This will not compile
		double infinity = 3.14 / 0;

		System.out.println(f); // 0.33
		System.out.println(d); // 1.67
		System.out.println(sum); // 2.000000013113022
		System.out.println(infinity); // Infinity
		
		BigDecimal bigF = new BigDecimal("0.33");
		BigDecimal bigD = new BigDecimal("1.67");
		BigDecimal bigSum = bigF.add(bigD);
		System.out.println(bigSum);
	}
}
