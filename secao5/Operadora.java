package secao5;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int minutos;
		double total;
		System.out.print("Digite os minutos consumidos: ");
		minutos = sc.nextInt();
		
		if(minutos <= 100) {
			total = 50;
		} else {
			total = 50 + ((minutos - 100) * 2.0);
		}		
		
		System.out.printf("Total da fatura: R$ %.2f", total);
		
		sc.close();
		
	}

}
