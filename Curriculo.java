import java.util.Scanner;

public class Curriculo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String endereco;
		String numero;
		String bairro;
		String cidade;
		String estado;
		String email;
		String dataNascimento;
		String experiencias;
		int idade;
		char sexo;
		double pretensao;
		
		System.out.print("Digite o nome completo: ");
		nome = sc.next();
		
		sc.nextLine();
		
		System.out.print("Digite o endereço: ");
		endereco = sc.next();
		
		sc.nextLine();
		
		System.out.print("Digite o número: ");
		numero = sc.next();
		
		sc.nextLine();
		
		System.out.print("Digite o bairro: ");
		bairro = sc.next();
		
		sc.nextLine();
		
		System.out.print("Digite a cidade: ");
		cidade = sc.next();
		
		sc.nextLine();
		
		System.out.print("Digite o estado: ");
		estado = sc.next();
		
		sc.nextLine();
		
		System.out.print("Digite o email: ");
		email = sc.next();
		
		sc.nextLine();
		
		System.out.print("Data de nascimento: ");
		dataNascimento = sc.next();
		
		sc.nextLine();
		
		System.out.print("Digite as experiências: ");
		experiencias = sc.next();
		
		sc.nextLine();
		
		System.out.print("Digite a idade: ");
		idade = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Digite o sexo (M/F): ");
		sexo = sc.next().charAt(0);
		
		sc.nextLine();
		
		System.out.print("Digite a pretenção salarial (R$): ");
		pretensao = sc.nextDouble();
		
		System.out.println("Currículo: ");
		System.out.printf("Nome: %s%n", nome);
		System.out.printf("Endereço: %s, %s%n", endereco, numero);
		System.out.printf("Bairro: %s, %s/%s%n", bairro, cidade, estado);
		System.out.printf("Email: %s%n", email);
		System.out.printf("Data de nascimento: %s%n", dataNascimento);
		System.out.printf("Experiências profissionais: %s%n", experiencias);
		System.out.printf("Idade: %d%n", idade);
		System.out.printf("Sexo: %s%n", sexo);
		System.out.printf("Pretensão salarial: R$ %.2f", pretensao);
		
		
	}

}
