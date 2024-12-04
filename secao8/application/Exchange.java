package secao8.application;

import java.util.Locale;
import java.util.Scanner;

import secao8.util.CurrencyConverter;

public class Exchange {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What´s the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double quantityDollar = sc.nextDouble();
		 
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(dollarPrice, quantityDollar));
		
		sc.close();
		
		
	}

}
