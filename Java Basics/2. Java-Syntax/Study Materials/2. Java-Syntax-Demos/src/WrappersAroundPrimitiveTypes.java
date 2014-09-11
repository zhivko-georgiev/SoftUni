
public class WrappersAroundPrimitiveTypes {
	public static void main(String[] args) {
		Integer i = 5; // Integer value: 5
		System.out.println(i);
		i = i + 1; // Integer value: 6
		System.out.println(i);
		i = null; // No value (null)
		System.out.println(i);
		i = i + 1; // NullPointerException
		System.out.println(i);
	}
}
