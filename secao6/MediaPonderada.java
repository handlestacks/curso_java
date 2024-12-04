package secao6;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N;
		N = sc.nextInt();
		double x, y, z, mediaPonderada;

		for (int i = 1; i <= N; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();

			mediaPonderada = (x * 2 + y * 3 + z * 5) / 10;
			System.out.printf("%.1f", mediaPonderada);

		}

		sc.close();

	}

}
