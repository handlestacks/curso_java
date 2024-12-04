package secao8.entities;

public class ProductNelio {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return this.price * this.quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return this.name
				+ ", R$ "
				+ String.format("%.2f", this.price)
				+ ", "
				+ this.quantity
				+ " units, Total R$ "
				+ String.format("%.2f", this.totalValueInStock());
	}

}
