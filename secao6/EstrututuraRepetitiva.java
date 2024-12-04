package secao6;

import java.util.Locale;
import java.util.Scanner;

public class EstrututuraRepetitiva {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, total = 0;
		System.out.print("Digite um número: ");
		x = sc.nextInt();
		
		while(x != 0) {
			System.out.print("Número diferente de zero, digite novamente: ");
			total += x;
			x = sc.nextInt();
		}
		
		System.out.println("\nSoma dos números digitados: " + total);
		
		sc.close();
		
	}

}
