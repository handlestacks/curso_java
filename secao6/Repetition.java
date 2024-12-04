package secao6;

import java.util.Locale;
import java.util.Scanner;

public class Repetition {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 1, soma = 0;
		
		while(x != 0) {
			x = sc.nextInt();
			soma += x;
			
		}
		
		System.out.println("Soma: " + soma);
		
		sc.close();
		
		
	}

}
