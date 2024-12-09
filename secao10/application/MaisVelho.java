package secao10.application;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		String nomes[] = new String[n];
		int[] idades = new int[n];
		int maioridade = 0;
		int maisVelho = 0;
		
		for(int i=0; i < n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();			
		}
		
		for(int i=0; i < n; i++) {
			if(idades[i] > maioridade) {
				maioridade = idades[i];
				maisVelho = i;
			}
			System.out.println("idades" + idades[i]);
			System.out.println("maisvelho" + maisVelho);
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nomes[maisVelho]);
		
		sc.close();
		
		
	}

}
