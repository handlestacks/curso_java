import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double raio, pi, area;
		
		pi = 3.14159;
		
		System.out.print("Digite o valor do raio, para calcular a área do círculo: ");
		raio = sc.nextDouble();
		sc.nextLine();
		
		area = pi * Math.pow(raio, 2.0);
		
		System.out.printf("Área do círculo: %.4f", area);
		
		sc.close();
		
	}

}
