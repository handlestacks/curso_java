package secao6;

import java.util.Locale;
import java.util.Scanner;

public class DivisoresDeN {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		long numero = sc.nextInt();		
		
		for(int i=1; i<= numero; i++) {
			if(numero % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
		
	}

}
