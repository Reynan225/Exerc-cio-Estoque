package entties;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product() { // Podemos também colocar o construtor padrão
		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { // (SobreCarga)quantity vai ser iniciado com 0, então não precisa colocar
		this.name = name;						// pois o java por padrão, já inicia os valores em 0
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalValueInStrock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		 this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStrock());
				
	}
	
}