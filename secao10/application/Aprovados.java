package secao10.application;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		String[] names = new String[n];
		double[] grade1 = new double[n];
		double[] grade2 = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno");
			names[i] = sc.nextLine();
			grade1[i] = sc.nextDouble();
			grade2[i] = sc.nextDouble();
		}

		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < n; i++) {
			double media = (grade1[i] + grade2[i]) / 2;
			if (media >= 6.0) {
				System.out.println(names[i]);
			}
		}

		sc.close();

	}

}
