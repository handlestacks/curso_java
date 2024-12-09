package secao10.application;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int quantity = sc.nextInt();
		int[] numbers = new int[quantity];
		
		for(int i=0; i < numbers.length; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println();
		int pares = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				System.out.print(numbers[i] + "  ");
				pares++;
			}				
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + pares);
		
		sc.close();
		
	}

}
