import javax.print.attribute.standard.MediaSize.Other;

public class Product implements Comparable<Product> {

	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Product() {
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Product other) {
		return this.getPrice() == other.getPrice() ? 0
				: (this.getPrice() < other.getPrice() ? -1 : 1);
	}
}