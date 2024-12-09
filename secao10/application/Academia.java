package secao10.application;

import java.util.Locale;
import java.util.Scanner;

import secao10.entities.Aluno;

public class Academia {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas? ");
		int n = sc.nextInt();
		Aluno[] alunos = new Aluno[n];
		double comparaAltura = 0.0;
		double sumWomenHeight = 0.0;
		int sumCountWomen = 0;
		int sumCountMen = 0;
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			double altura;
			char sexo;
			System.out.print("Altura da " + (i + 1) + " pessoa: ");
			altura = sc.nextDouble();
			System.out.print("Gênero da " + (i + 1) + " pessoa: ");
			sexo = sc.next().charAt(0);
			alunos[i] = new Aluno(altura, sexo);
		}
		
		comparaAltura = alunos[0].getHeight();
		
		for(int i=0; i<n; i++) {
			if(alunos[i].getHeight() <= comparaAltura) {
				comparaAltura = alunos[i].getHeight();
			}
		}
		System.out.print("Menor altura = " + comparaAltura);
		System.out.println();
		
		comparaAltura = 0.00;
		
		for(int i=0; i<n; i++) {
			if(alunos[i].getHeight() >= comparaAltura) {
				comparaAltura = alunos[i].getHeight();
			}
		}
		
		System.out.println("Maior altura = " + comparaAltura);
		
		for(int i=0; i<n; i++) {
			if(alunos[i].getGender() == 'F') {
				sumWomenHeight += alunos[i].getHeight();
				sumCountWomen++;
			} else {
				sumCountMen++;
			}
		}
		System.out.printf("Média das alturas das mulheres = %.2f%n", sumWomenHeight/sumCountWomen);
		System.out.printf("Número de homens = %d", sumCountMen);
		sc.close();
		
	}

}
