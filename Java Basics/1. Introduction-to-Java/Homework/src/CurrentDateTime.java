import java.util.Date;

public class CurrentDateTime {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.printf("The time is: %1$tH:%1$tM:%1$tS.%n", date);
		System.out.printf("The date in format Day/Month/Year is : "
				+ "%1$td/%1$tB/%1$tY.%n", date);
	}
}
