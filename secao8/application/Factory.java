package secao8.application;

import java.util.Locale;
import java.util.Scanner;

import secao8.entities.Employee;

public class Factory {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		double percentage;
		
		System.out.print("Name: ");
		e.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		e.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		e.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + e);
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		percentage = sc.nextDouble();
		e.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + e);
		
		
		sc.close();
		
	}

}
