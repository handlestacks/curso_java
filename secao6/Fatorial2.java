package secao6;

import java.util.Locale;
import java.util.Scanner;

public class Fatorial2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int fatorial = 1;
		
		for(int i = 1; i <= x; i++) {
			fatorial *= i;
		}
		
		System.out.println("Fatorial de " + x + " é: " + fatorial);
		
		
		sc.close();
		
	}

}
