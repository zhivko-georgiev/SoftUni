
public class CharType {
	public static void main(String[] args) {
		char ch = 'a';
		System.out.println(ch);
		ch = 'þ';
		System.out.println(ch);
		ch = '\u03A9';
		System.out.println(ch);
		ch = 13;
		System.out.println(ch);
		ch = '\u265E';
		System.out.println(ch);
		ch = (char) (ch + 1);
		System.out.println(ch);
		
		System.out.println((int) ch);
		
		// Find more Unicode chars at http://unicode-table.com
	}
}
