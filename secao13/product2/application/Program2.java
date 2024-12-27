package secao13.product2.application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao13.product2.entities.ImportedProduct;
import secao13.product2.entities.Product;
import secao13.product2.entities.UsedProduct;

public class Program2 {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> store = new ArrayList<>();
		Product p = null;
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			
			sc.nextLine();
			
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ans = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();

			if(ans == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				p = new ImportedProduct(name, price, customsFee);				
			} else if(ans == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");				
				LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				p = new UsedProduct(name, price, manufactureDate);
			} else {
				p = new Product(name, price);
			}
			
			store.add(p);
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product prod : store) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
		
	}

}
