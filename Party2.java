import java.util.Locale;
import java.util.Scanner;

public class Party2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String nome, rg;
		char sexo;
		int idade;
		double comanda;
		
		/*System.out.print("Digite seu nome completo: ");
		nome = sc.nextLine();
		
		System.out.print("Digite o RG sem ponto e traços: ");
		rg = sc.nextLine();*/
		
		System.out.print("Qual é a sua idade? ");
		idade = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.print("Digite o valor consumido: R$ ");
		comanda = sc.nextDouble();
		
		/*System.out.println("Sua comanda:");
		System.out.printf("Nome: %s%n", nome);
		System.out.printf("RG: %s%n", rg);*/
		System.out.printf("Idade: %d%n", idade);
		System.out.printf("Total da comanda: R$ %.2f%n", comanda);
		System.out.println("Total da comanda: R$ " + comanda);
		
		sc.close();
		
	}

}
