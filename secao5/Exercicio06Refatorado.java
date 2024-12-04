package secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06Refatorado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x;
		
		System.out.print("Digite um valor (pode ser decimal): ");
		x = sc.nextDouble();
		
		if(x < 0 || x > 100) {
			System.out.println("Fora do intervalo.");
		} else if (x <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (x <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if (x <= 75.0) {
			System.out.println("Intervalo (50,75]");
		} else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();
		

	}

}
