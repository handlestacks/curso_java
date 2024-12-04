package secao8.application;

import java.util.Locale;
import java.util.Scanner;

import secao8.entities.ProductNelio;

public class StoreNelio {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ProductNelio p = new ProductNelio();
		
		System.out.println("Enter data product: ");
		System.out.print("Name: ");
		p.name = sc.nextLine();
		System.out.print("Price: ");
		p.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		p.quantity = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		System.out.println("Product data: " + p);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		p.addProducts(sc.nextInt());
		System.out.println("Updated data: " + p);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		p.removeProducts(sc.nextInt());
		System.out.println("Updated data: " + p);
		
		sc.close();
		
	}

}
