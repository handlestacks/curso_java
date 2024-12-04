package secao6;

import java.util.Locale;
import java.util.Scanner;

public class Fatorial3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		long fatorial = 1;
		int i = 1;
		
		while(i <= numero) {
			fatorial *= i;
			// fatorial = fatorial * i;
			i++;
		}
		
		System.out.println("Fatorial de " + numero + " é: " + fatorial);
		
		sc.close();
		
		
	}

}
