
public class Literals {

	public static void main(String[] args) {
		int dec = 5; // decimal value 5
		int hex = 0xFE; // hexadecimal value FE -> 254
		int bin = 0b11001; // binary value 11001 -> 25
		int bigNum = 1_250_000; // decimal value 1250000
		long num = 1234567890123456789L;
		long hexNum = 0x7FFF_FFFF_FFFF_FFFFL;
		boolean bool = true;
		float floatNum = 1.25e+7f; // 12500000
		double doubleNum = 6.02e+23; // 602000000000000000000000
		char newLine = '\n'; // Character <new line>
		char backSlash = '\\'; // Character: \
		char unicodeChar = '\u00F1'; // Character: ñ
		long fourBytes = 0b11010010_01101001_10010100_10010010; // -764832622
		String str = "Hello,\nI\'m Java.";										
		String nullStr = null; // null

		System.out.println(dec);
		System.out.println(hex);
		System.out.println(bin);
		System.out.println(bigNum);
		System.out.println(num);
		System.out.println(hexNum);
		System.out.println(bool);
		System.out.println(floatNum);
		System.out.println(doubleNum);
		System.out.println(newLine);
		System.out.println(backSlash);
		System.out.println(unicodeChar);
		System.out.println(fourBytes);
		System.out.println(str);
		System.out.println(nullStr);
	}

}
