package secao10.application;

import java.util.Locale;
import java.util.Scanner;

public class OnlyNegative {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int quantity = sc.nextInt();
		int[] vect = new int[quantity];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Números negativos: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < 0)
				System.out.println(vect[i]);
		}
		
		sc.close();
		
	}

}
