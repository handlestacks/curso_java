package secao10.application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();		
		double[] vect = new double[n];
		double sum = 0.0;
		int nPares = 0;
		
		for(int i=0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			double number = sc.nextDouble();
			vect[i] = number;
			if(vect[i] % 2 == 0) {
				sum += number;
				nPares++;
			}
		}
		
		if(sum == 0.0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			System.out.println("MEDIA DOS PARES = " + sum/nPares);
		}
		
		sc.close();
		
	}

}
