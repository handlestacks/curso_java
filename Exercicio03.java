import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int A, B, C, D, DIFERENCA;
		
		System.out.print("Digite o valor de A: ");
		A = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o valor de B: ");
		B = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o valor de C: ");
		C = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o valor de D: ");
		D = sc.nextInt();
		sc.nextLine();
		
		DIFERENCA = (A * B - C * D);
		
		System.out.printf("%n(A * B - C * D) = %d", DIFERENCA);
		
		sc.close();
		
	}

}
