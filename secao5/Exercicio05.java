package secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int item, quantidade;
		double total;

		item = sc.nextInt();
		quantidade = sc.nextInt();

		if (item == 1) {
			total = quantidade * 4.0;
		} else if (item == 2) {
			total = quantidade * 4.50;
		} else if (item == 3) {
			total = quantidade * 5.0;
		} else if (item == 4) {
			total = quantidade * 2.0;
		} else if (item == 5) {
			total = quantidade * 1.50;
		} else {
			total = 0;
		}

		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();

	}

}
