package secao6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int password = 0;

		while (password != 2002) {
			password = sc.nextInt();
			System.out.println("Senha inválida");			
		}
		
		System.out.println("Acesso permitido");

		sc.close();

	}

}
