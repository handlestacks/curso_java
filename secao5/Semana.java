package secao5;

import java.util.Locale;
import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int dia;
		dia = sc.nextInt();
		
		switch(dia) {
			case 1: {
				System.out.println("Domingo");
				break;
			}
			case 2: {
				System.out.println("Segunda");
				break;
			}
			case 3: {
				System.out.println("Terça");
				break;
			}
			case 4: {
				System.out.println("Quarta");
				break;
			}
			case 5: {
				System.out.println("Quinta");
				break;
			}
			case 6: {
				System.out.println("Sexta");
				break;
			}
			case 7: {
				System.out.println("Sábado");
				break;
			}
				
			default: System.out.println("Digite de 1-7");
		}
		
		sc.close();
		
	}
	
}
