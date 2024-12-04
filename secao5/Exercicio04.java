package secao5;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inicio, fim, duracao;
		
		System.out.print("Digite a hora inicial e final: ");
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		duracao = fim - inicio;
		
		if(inicio < fim) {
			duracao = fim - inicio;
		} else {
			duracao = 24 - inicio + fim;
		}
		
		System.out.println("O jogo durou " + duracao + " hora(s).");
		
		
		sc.close();
		
	}

}
