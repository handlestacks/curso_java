package secao6;

import java.util.Locale;
import java.util.Scanner;

public class DadosDoN {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double linha = sc.nextInt();
		
		for(int i=1; i <= linha; i++) {
			
			System.out.printf("%d %.0f %.0f%n", i, Math.pow(i, 2), Math.pow(i, 3));
			
		}
		
		sc.close();
		
		
	}

}
