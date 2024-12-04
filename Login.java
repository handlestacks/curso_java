import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String user, password;
		System.out.println("Digite os dados de acesso: ");
		user = sc.nextLine();
		password = sc.nextLine();
		
		System.out.println("Credenciais: ");
		System.out.printf("User: %s%n", user);
		System.out.printf("Password: %s%n", password);
		
		sc.close();
		
		
	}

}
