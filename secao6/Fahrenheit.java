package secao6;

import java.util.Locale;
import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double C = 0.0, fahrenheit;
		char answer;

		do {

			System.out.print("Digite a temperatura em Celsius: ");
			C = sc.nextDouble();
			fahrenheit = (9 * C) / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			System.out.print("Deseja repetir (s/n)? ");
			answer = sc.next().charAt(0);

		} while (answer != 'n');

		sc.close();

	}

}
