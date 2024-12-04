package secao8.entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public void stock() {
		double total = this.price * this.quantity;
		System.out.printf("%nProduct data: %s, R$ %.2f, %d units, Total: R$ %.2f%n%n", this.name, this.price, this.quantity, total);
	}
	
	public void update(int quantity) {
		this.quantity += quantity;
		double total = this.price * this.quantity;
		System.out.printf("%nUpdate data: %s, R$ %.2f, %d units, Total: R$ %.2f%n%n", this.name, this.price, this.quantity, total);		
	}

}
