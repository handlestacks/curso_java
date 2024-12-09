package secao10.application;

import java.util.Locale;
import java.util.Scanner;

import secao10.entities.Pessoa;

public class Alturas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			vect[i] = new Pessoa(name, age, height);
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getHeight();
		}
		
		double media = sum / vect.length;
		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);
		
		int menores = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() < 16) {
				menores++;
			}
		}
		
		double percentage = menores * 100 / vect.length;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentage);
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
		
	}

}
