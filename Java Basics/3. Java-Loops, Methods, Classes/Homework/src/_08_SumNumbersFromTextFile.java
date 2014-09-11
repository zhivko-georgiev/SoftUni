import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _08_SumNumbersFromTextFile {

	public static void main(String[] args) throws IOException { 	

		try {
			BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));
			String line;
			double sum = 0;
			while ((line = reader.readLine()) != null) {
				sum += Double.parseDouble(line);
			}
			System.out.println(sum);
			reader.close();
		} catch (java.io.FileNotFoundException nfe) {
			System.out.println("Error");;
		}
	}
}
