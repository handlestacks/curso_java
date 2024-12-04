package secao6;

import java.util.Scanner;

public class FatorialRecursivo {

	public static void main(String[] args) {

		int numero;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número: ");
		numero = sc.nextInt();

		System.out.println("O fatorial de " + numero + " é " + fatorial(numero) + ".");

		sc.close();

	}

	public static int fatorial(int num) {
		if (num <= 0) {
			return 1;
		} else {
			return num * fatorial(num - 1);
		}
	}

}
