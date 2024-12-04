package secao10.application;

import java.util.Locale;
import java.util.Scanner;

import secao10.entities.Product;

public class VetoresParte2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Digite um nome: ");
			String name = sc.nextLine();
			System.out.print("Digite o preço: ");
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		
		System.out.printf("AVERAGE PRICE = %.2f%n", sum / vect.length);
		
		sc.close();
		
	}

}
