package secao5;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Digite 2 números (mesma linha): ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x % y == 0 || y % x == 0) {
			System.out.println("São múltiplos entre si.");
		} else {
			System.out.println("Não são múltiplos.");
		}
		
		sc.close();
		
	}

}
