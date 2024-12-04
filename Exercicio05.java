import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codigo1, pecas1, codigo2, pecas2;
		double valorUnitario1, valorUnitario2, TOTAL;
		
		System.out.println("Digite o código, número de peças e valor unitário de cada produto, linha por linha: ");
		codigo1 = sc.nextInt();
		pecas1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		sc.nextLine();
		
		codigo2 = sc.nextInt();
		pecas2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		sc.nextLine();
		
		TOTAL = pecas1 * valorUnitario1 + pecas2 * valorUnitario2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", TOTAL);
		
		sc.close();
		
	}

}
