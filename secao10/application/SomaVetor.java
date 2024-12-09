package secao10.application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int quantity = sc.nextInt();
		double[] vect = new double[quantity];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f  ", vect[i]);
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}		
		
		System.out.println();
		System.out.println("SOMA = " + sum);		
		System.out.println("MÉDIA = " + sum/vect.length);
		
		sc.close();
		
	}

}
