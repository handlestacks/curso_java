package secao7;

import java.util.Locale;
import java.util.Scanner;

public class Modularizacao2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite 3 números na sequência: ");
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int higher = max(a, b, c);

		showResult(higher);

		sc.close();

	}
	
	public static int max(int x, int y, int z) {
		if(x > y && x > z) {
			return x;
		} else if(y > z) {
			return y;
		} else {
			return z;
		}
	}
	
	public static void showResult(int maior) {
		System.out.println("O maior é " + maior);
	}

}
