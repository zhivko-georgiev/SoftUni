import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class _09_ListOfProducts {

	public static void main(String args[]) {

		// Create an Array list of type 'Product' to store the products
		ArrayList<Product> products = new ArrayList<Product>();
		// Open the file 'List Of Products.txt' to read from it and copy/write
		// to file 'Sorted List Of Products.txt'
		try {
			BufferedReader reader = new BufferedReader(new FileReader("List Of Products.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("Sorted List Of Products.txt"));
			
			String input;
			while ((input = reader.readLine()) != null) {
				String[] splited = input.split(" ");
				products.add(new Product(splited[0], Double
						.parseDouble(splited[1])));
			}

			Collections.sort(products);

			for (Product product : products) {
				writer.write(product.getPrice() + " " + product.getName() + "\r\n");
			}
			reader.close();
			writer.close();
		} catch (IOException exception) {
			System.out.println("Error");
			exception.printStackTrace();
		}
	}
}