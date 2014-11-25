import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _08_SumNumbersFromTextFile {

	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(new FileReader(
				"Input.txt"))) {
			
			String line = null;
			double sum = 0;

			while ((line = reader.readLine()) != null) {
				sum += Double.parseDouble(line);
			}

			System.out.println(sum);
			
		} catch (IOException ioe) {
			System.out.println("Error:  " + ioe.getLocalizedMessage());
		}
	}
}
