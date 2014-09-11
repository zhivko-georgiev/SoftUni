import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class _13_TryWithResources {
	public static void main(String[] args) {
		String fileName = "src/_13_TryWithResources.java";
		try(
			BufferedReader fileReader = new BufferedReader(
				new FileReader(fileName));
		) {
			while (true) {
				String line = fileReader.readLine();
				if (line == null) {
					// End of file is reached
					break;
				}
				System.out.println(line);
			}
		} catch (IOException ioex) {
			System.err.println("Cannot read the file " + fileName);
			ioex.printStackTrace();
		}
	}
}
