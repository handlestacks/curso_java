import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y, total;
		
		System.out.println("Soma entre 2 números:");
		System.out.print("Digite o primeiro número: ");
		x = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o segundo número: ");
		y = sc.nextInt();
		sc.nextLine();
		
		total = x + y;
		
		System.out.printf("SOMA = %d", total);		
		
		sc.close();
		
	}

}
