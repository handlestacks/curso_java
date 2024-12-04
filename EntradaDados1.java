import java.util.Scanner;

public class EntradaDados1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		char gender;
		double salary;
		System.out.print("Digite seu nome: ");
		name = sc.next();
		System.out.print("Digite sua idade: ");
		age = sc.nextInt();
		System.out.print("Digite o sexo: ");
		gender = sc.next().charAt(0);
		System.out.print("Digite sua pretensão salarial: ");
		salary = sc.nextDouble();
		
		System.out.printf(gender == 'M'? "Sou o %s e tenho %d anos. Salário será R$ %.2f" : "Sou a %s e tenho %d anos. Salário será R$ %.2f", name, age, salary);
		
		
		sc.close();

	}

}
