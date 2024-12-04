package secao6;

import java.util.Locale;
import java.util.Scanner;

public class Debug3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int i;
			int loop = sc.nextInt();

			for (i = 1; i <= loop; i++) {
				System.out.printf("O i agora vale %d%n", i); 
			}

			sc.close();
		}

	}

}
