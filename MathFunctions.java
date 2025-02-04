
public class MathFunctions {
	
	public static void main(String[] args) {
		
		// A = Math.sqrt(x);
		// A = Math.pow(x, y);
		// A = Math.abs(x);
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de " + z * z + " = " + Math.sqrt(z * z));
		System.out.println("Raiz quadrada de 25 = " + C);
		
		System.out.println();
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println(5.0 + " elevado a " + 2.0 + " = " + C);
		
		System.out.println();
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		System.out.println();
		
		System.out.println(Math.round(5.48032));
		
		System.out.println();
		
		B = 100;
		
		for(int i = 0; i < B; i++) {
			
			A = Math.round(Math.random() * 100);
			
			System.out.println("Raiz quadrada de " + A + " rep " + A + " = " + Math.sqrt(A));
			
		}
		
		
		
		
	}

}
