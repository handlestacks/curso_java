
public class FuncoesMatematicas {
	
	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C, D;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		// ou com printf
		System.out.println("---");
		
		System.out.printf("Raiz quadrada de %.1f = %.1f%n", x, A);
		System.out.printf("Raiz quadrada de %.1f = %.1f%n", y, B);
		System.out.printf("Raiz quadrada de 25 = %.1f%n", C);
		
		System.out.println("---");
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		D = Math.pow(z, y);
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		System.out.println(y + " elevado a " + z + " = " + D);
		
		System.out.println("---");
		
		System.out.printf("%.1f elevado a %.1f = %.1f%n", x, y, A);
		System.out.printf("%.1f elevado ao quadrado = %.1f%n", x, B);
		System.out.printf("5 elevado ao quadrado = %.1f%n", C);
		System.out.printf("%.1f elevado a %.1f = %.1f%n", z, y, D);
		
		System.out.println("---");
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + y);
		System.out.println("Valor absoluto de " + z + " = " + z);
		
		System.out.println("---");
		
		System.out.printf("Valor absoluto de %.1f = %.1f%n", y, A);
		System.out.printf("Valor absoluto de %.1f = %.1f%n", z, B);
		
		
		
	}

}
