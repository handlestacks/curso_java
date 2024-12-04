package secao6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, alcool = 0, gasolina = 0, diesel = 0;	
		
		x = sc.nextInt();
		
		while(x != 4) {
			
			switch(x) {
				case 1:
					alcool++;
					break;
				case 2:
					gasolina++;
					break;
				case 3:
					diesel++;
					break;
				default:
			}
			
			x = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
		

	}

}
