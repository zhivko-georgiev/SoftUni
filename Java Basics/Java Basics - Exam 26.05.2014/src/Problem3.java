import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


public class Problem3 {
	public static void main(String[] args) {
		// Input
		Scanner input = new Scanner(System.in);
		String[] rectanglesSides = input.nextLine().split("\\D+");
		ArrayList<Long> allSides = new ArrayList<>();

		BigInteger maxResult = new BigInteger("" + Integer.MIN_VALUE);
		int startIndex = 0;

		// Main Logic
		for (int i = 0; i < rectanglesSides.length; i++) {
			if (tryParseInt(rectanglesSides[i])) {
				allSides.add(Long.parseLong(rectanglesSides[i]));
			}
		}
		BigInteger result = new BigInteger("0");
		if (allSides.size() == 6) {
			BigInteger resultFirst = new BigInteger("" + allSides.get(0) * allSides.get(1));
			BigInteger resultSecond = new BigInteger("" +  allSides.get( 2) * allSides.get(3));
			BigInteger resultThird = new BigInteger("" +  allSides.get(4) * allSides.get(5));
			result = resultFirst.add(resultSecond).add(resultThird);
			System.out.println(result);
		}
		else {
			for (int j = 0; j <= allSides.size() / 2; j += 2) {
				BigInteger resultFirst = new BigInteger("" + allSides.get(j) * allSides.get(j + 1));
				BigInteger resultSecond = new BigInteger("" +  allSides.get(j + 2) * allSides.get(j + 3));
				BigInteger resultThird = new BigInteger("" +  allSides.get(j + 4) * allSides.get(j + 5));
				result = resultFirst.add(resultSecond).add(resultThird);

				if (result.compareTo(maxResult) > 0) {
					maxResult = result;
					startIndex = j;
				}
				result = BigInteger.ZERO;

			}
			System.out.println(maxResult);
		}
	}
	private static boolean tryParseInt(String value)  
	{  
		try  
		{  
			Long.parseLong(value);  
			return true;  
		} catch(NumberFormatException nfe)  
		{  
			return false;  
		}  
	}
}
