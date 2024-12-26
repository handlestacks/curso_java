package secao13.company.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao13.company.entities.Employee;
import secao13.company.entities.OutsourcedEmployee;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		List<Employee> staff = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			
			sc.nextLine();
			
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char ans = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();	
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			Employee emp = null;
			
			if(ans == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();				
				emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);		
			} else if(ans == 'n') {
				emp = new Employee(name, hours, valuePerHour);
			} else {
				System.out.println("Resposta inválida.");
			}
			
			staff.add(emp);
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee e : staff) {
			System.out.println(e.toString());
		}
		
		sc.close();
		
	}

}
