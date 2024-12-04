package secao5;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.print("Digite um número inteiro: ");
		numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.printf("%d é par", numero);
		} else {
			System.out.printf("%d é ímpar", numero);
		}
		
		sc.close();
		
	}

}
