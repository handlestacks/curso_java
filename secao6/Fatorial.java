package secao6;

import java.util.Locale;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, multi = 1;
		N = sc.nextInt();
		System.out.println(N + "!");

		for (int i = N; i <= N; i--) {
			if (i > 0) {
				multi *= N;
				N--;
			}

		}

		System.out.println(multi);

		sc.close();

	}

}
