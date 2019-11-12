package entities;

public class Product {
	
	String name;
	double price;
	int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return quantity * price;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatusProduct(){
		return " Name: " + name 
				+ "\n Price " + String.format("%.2f", price) 
				+ "\n Quantity in stock: " + quantity
				+ "\n Currency stock: " + String.format("%.2f", totalValueInStock());
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	

}
