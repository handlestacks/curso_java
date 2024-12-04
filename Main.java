import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		
		String name = "Roger";
		int age = 41;
		float salary = 10f;
		double x = 10.68573;
		
		/* report */
		String nome = "Roger";
		int idade = 41;
		double renda = 500000;
		
		System.out.printf("%s%n", name);
		System.out.printf("%d%n", age);
		System.out.printf("%.2f%n", salary);
		System.out.printf("%.4f%n", x);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.5f%n", x);
		
		System.out.println("RESULTADO = " + x + " METROS");
		
		System.out.printf("RESULTADO = %.5f metros%n", x);
		
		System.out.println("------------------------");
		
		System.out.println("Relatório:");
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
