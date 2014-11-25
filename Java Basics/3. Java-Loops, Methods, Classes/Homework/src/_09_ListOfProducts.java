import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _09_ListOfProducts {

	public static void main(String args[]) {

		List<Product> products = new ArrayList<Product>();

		try (BufferedReader reader = new BufferedReader(new FileReader(
				"List Of Products.txt"));
				BufferedWriter writer = new BufferedWriter(new FileWriter(
						"Sorted List Of Products.txt"));) {

			String input = null;

			while ((input = reader.readLine()) != null) {
				String[] splited = input.split(" ");
				products.add(new Product(splited[0], Double
						.parseDouble(splited[1])));
			}

			Collections.sort(products);

			for (Product product : products) {
				writer.write(product.getPrice() + " " + product.getName()
						+ "\n");
			}
		} catch (IOException ioe) {
			System.out.println("Error : " + ioe.getLocalizedMessage());
		}
	}
}