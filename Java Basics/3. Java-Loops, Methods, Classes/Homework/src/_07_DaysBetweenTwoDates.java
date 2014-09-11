import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _07_DaysBetweenTwoDates {

	public static void main(String[] args) throws ParseException {

		// Dates input
		Scanner scan = new Scanner(System.in);
		String datet1 = scan.nextLine();
		String date2 = scan.nextLine();
		// Parsing dates
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date startDate = df.parse(datet1);
		Date endDate = df.parse(date2);
		
		// Output
		System.out.println((int) computeDaysBetweenDates(startDate, endDate) + " days");
	}

	public static double computeDaysBetweenDates(Date startDate, Date endDate) {
		long diff;
		diff = endDate.getTime() - startDate.getTime();
		return ((double) diff) / (86400.0 * 1000.0); // 24 hours = 86400 seconds
	}
}
