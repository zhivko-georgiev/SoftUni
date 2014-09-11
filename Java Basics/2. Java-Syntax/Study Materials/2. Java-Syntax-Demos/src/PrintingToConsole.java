import java.time.LocalDate;
import java.util.Locale;

public class PrintingToConsole {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT); 
		
		String name = "SoftUni";
		String location = "Sofia";
		double age = 0.5;
		System.out.print(name);
		System.out.println(" is " + age +
			" years old organization located in " +
			location + ".");
		
		System.out.printf(
			"%s is %.2f years old organization located in %s.\n",
			name, age, location);
		
		System.out.printf("Today is %1$td.%1$tm.%1$tY\n",
				LocalDate.now());
		
		
		
		
		System.out.printf("%1$d + %1$d = %2$d\n", 2, 4);
	}
}
