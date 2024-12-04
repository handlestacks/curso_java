package secao8.application;

import java.util.Locale;
import java.util.Scanner;

import secao8.entities.Product;

public class Store {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		p.name = sc.nextLine();
		System.out.print("Price: ");
		p.price = sc.nextDouble();
		System.out.print("Quantity: ");
		p.quantity = sc.nextInt();
		sc.nextLine();
		
		p.stock();
		
		System.out.print("Enter the number of products to be added in stock: ");
		
		p.update(sc.nextInt());
		
		System.out.print("Enter the number of products to be removed from stock: ");
		
		p.update(-sc.nextInt());
		
		sc.close();
		
	}

}
