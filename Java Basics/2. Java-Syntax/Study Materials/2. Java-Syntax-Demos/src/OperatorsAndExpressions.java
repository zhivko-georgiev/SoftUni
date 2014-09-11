
public class OperatorsAndExpressions {

	public static void main(String[] args) {
		int x = 5, y = 2;
		int div = x / y; // 2 (integral division)
		float divFloat = (float)x / y; // 2.5 (floating-point division)
		long num = 567_972_874; // 567972874
		long mid3Digits = (num / 1000) % 1000; // 972
		int z = x++; // z = x = 5; x = x + 1 = 6
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("div = " + div);
		System.out.println("divFloat = " + divFloat);
		System.out.println("num = " + num);
		System.out.println("mid3Digits = " + mid3Digits);
		System.out.println("z = " + z);
		
		boolean t = true;
		boolean f = false;
		boolean or = t || f;
		boolean and = t && f;
		boolean not = !t;
		
		System.out.println("t = " + t);
		System.out.println("f = " + f);
		System.out.println("t or f = " + or);
		System.out.println("t and f = " + and);
		System.out.println("not t = " + not);
		
		System.out.println(12 / 3); // 4
		System.out.println(11 / 3); // 3
		
		System.out.println(11.0 / 3); // 3.6666666666666665
		System.out.println(11 / 3.0); // 3.6666666666666665
		System.out.println(11 % 3);   // 2
		System.out.println(11 % -3);  // 2
		System.out.println(-11 % 3);  // -2
		
		System.out.println(1.5 / 0.0);  // Infinity
		System.out.println(-1.5 / 0.0); // -Infinity
		System.out.println(0.0 / 0.0);  // NaN
		
		int zero = 0;
		//System.out.println(5 / zero); // ArithmeticException
		
		short a = 3;                 // 00000000 00000011
		short b = 5;                 // 00000000 00000101
		System.out.println( a | b);  // 00000000 00000111 --> 7
		System.out.println( a & b);  // 00000000 00000001 --> 1
		System.out.println( a ^ b);  // 00000000 00000110 --> 6
		System.out.println(~a & b);  // 00000000 00000100 --> 4
		System.out.println( a << 1); // 00000000 00000110 --> 6
		System.out.println( a >> 1); // 00000000 00000001 --> 1
		
		int first = 5;
		int second = 4;
		System.out.println(first >= second);   // true
		System.out.println(first != second);   // true
		System.out.println(first == second);   // false
		System.out.println(first == first);    // true
		System.out.println(first != ++second); // false
		System.out.println(first > second);    // false
		
		System.out.println(a < b ? "smaller" : "larger");

	}

}
