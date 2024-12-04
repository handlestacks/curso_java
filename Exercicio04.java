import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int matricula, horasTrabalhadas;
		double valorHora, salario;
		
		System.out.print("Digite a matrícula do funcionário: ");
		matricula = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite as horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o valor hora: ");
		valorHora = sc.nextDouble();
		sc.nextLine();
		
		salario = horasTrabalhadas * valorHora;
		
		System.out.printf("Matrícula: %d%n", matricula);
		System.out.printf("Salário: U$ %.2f%n", salario);
		
		sc.close();
		
	}

}
