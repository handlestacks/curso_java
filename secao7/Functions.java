package secao7;

import java.util.Locale;
import java.util.Scanner;

public class Functions {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name, email;
		int age, id;
		
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Email: ");
		email = sc.nextLine();
		System.out.print("Age: ");
		age = sc.nextInt();		
		sc.nextLine();
		System.out.print("RG: ");
		id = sc.nextInt();
		
		showScreen(name, email, age, id);
		
		sc.close();
		
	}
	
	public static void showScreen(String name, String email, int age, int id) {
		System.out.printf("Name: %s%n", name);
		System.out.printf("Email: %s%n", email);
		System.out.printf("Age: %d%n", age);
		System.out.printf("RG: %d%n", id);
		
		System.out.println("Matrícula: " + showMatricula(id+age));
		
	}
	
	public static String showMatricula(int matricula) {
		return "" + matricula;
	}

}
