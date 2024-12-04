package secao10.application;

import java.util.Locale;
import java.util.Scanner;

public class VetoresParte1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		System.out.printf("AVERAGE HEIGHT = %.2f%n", sum / vect.length);
		
		sc.close();
		
	}

}
