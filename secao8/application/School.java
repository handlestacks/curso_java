package secao8.application;

import java.util.Locale;
import java.util.Scanner;

import secao8.entities.Student;

public class School {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.print("Digite o nome: "); 
		s.name = sc.nextLine();
		System.out.println("Digite as notas: ");
		s.grade1 = sc.nextDouble();
		s.grade2 = sc.nextDouble();
		s.grade3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + s);		
		
		sc.close();
		
		
	}

}
