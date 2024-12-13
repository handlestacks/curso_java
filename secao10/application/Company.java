package secao10.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao10.entities.Employee;

public class Company {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		Integer n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			
			System.out.print("ID: ");
			Integer id = sc.nextInt();	
			
			while(hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
				
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int findId = sc.nextInt();
		Employee findEmp = list.stream().filter(x -> x.getId() == findId).findFirst().orElse(null);
		
		if(findEmp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			findEmp.increaseSalary(percentage);
		}		
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee e : list) {
			System.out.println(e);
		}
		
		sc.close();
		
		
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
