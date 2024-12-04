import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		System.out.println("Digite o valor de A, B, C na mesma linha:");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2;
		circulo = 3.14159 * Math.pow(C, 2.0);
		trapezio = (A + B) * C / 2;
		quadrado = Math.pow(B, 2.0);
		retangulo = A * B;
		
		System.out.println("A área do triângulo retângulo que tem A por base e C por altura:");
		System.out.printf("TRIÂNGULO: %.3f%n%n", triangulo);
		
		System.out.println("A área do círculo de raio C (pi = 3.14159):");
		System.out.printf("CÍRCULO: %.3f%n%n", circulo);
		
		System.out.println("A área do trapézio que tem A e B por bases e C por altura: ");
		System.out.printf("TRAPÉZIO: %.3f%n%n", trapezio);
		
		System.out.println("A área do quadrado que tem lado B: ");
		System.out.printf("QUADRADO: %.3f%n%n", quadrado);
		
		System.out.println("A área do retângulo que tem lados A e B: ");
		System.out.printf("RETÂNGULO: %.3f%n%n", retangulo);
		
		sc.close();
		
	}

}
