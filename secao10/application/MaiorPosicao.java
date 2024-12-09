package secao10.application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int quantity = sc.nextInt();
		double[] numbers = new double[quantity];
		
		for(int i=0; i < numbers.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		double higher = 0.0;
		int position = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > higher) {
				higher = numbers[i];
				position = i;
			}
		}
		System.out.println("MAIOR VALOR = " + higher);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + position);
		
		sc.close();
		
		
	}

}
