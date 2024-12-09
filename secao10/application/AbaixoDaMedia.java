package secao10.application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0.0;
		double media;
		
		for(int i=0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			double number;
			number = sc.nextDouble();
			vect[i] = number;
			sum += number;
		}
		
		media = sum/vect.length;
		
		System.out.println();		
		
		System.out.println("MEDIA DO VETOR = " + media);
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		for(int i=0; i < vect.length; i++) {
			if(vect[i] < media) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
		
		sc.close();
		
	}

}
