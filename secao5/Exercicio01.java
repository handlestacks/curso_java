package secao5;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		if(numero > 0) {
			System.out.println("Número positivo.");
		} else {
			System.out.println("Número negativo.");
		}
		
		sc.close();
		
	}

}
