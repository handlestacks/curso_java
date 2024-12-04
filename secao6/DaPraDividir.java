package secao6;

import java.util.Locale;
import java.util.Scanner;

public class DaPraDividir {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double d, D;
		N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			d = sc.nextInt();
			D = sc.nextInt();
			if(D != 0) {
				System.out.printf("%.1f%n", d/D);
			} else {
				System.out.println("Divisão impossível");
			}
		}
		
		sc.close();
		
	}

}
