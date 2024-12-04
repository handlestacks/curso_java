package secao7;

import java.util.Locale;
import java.util.Scanner;

public class Modularizacao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite 3 números na sequência: ");
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a > b && a > c) {
			System.out.println(a + " é maior");
		} else if(b > c) {
			System.out.println(b + " é maior");
		} else {
			System.out.println(c + " é maior");
		}
		
		sc.close();
		
		
	}

}
