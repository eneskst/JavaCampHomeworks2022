package classesWithAttributes;

public class Product {

	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı Blok Çalıştı.");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.stockAmount = stockAmount;
		this.description = description;

	}

	public Product() {
	}

	// Attribute or Field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	// Getter
	public int getId() {
		return id;
	}

	// Setter
	public void setId(int id) {
		this.id = id; // This classin içindeki değer
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public String getKod() {
		return this.name.substring(0, 1) + this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

}
