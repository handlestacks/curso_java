package secao13.payer.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao13.payer.entities.Company;
import secao13.payer.entities.Individual;
import secao13.payer.entities.Payer;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Payer> payers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		for(int i=1; i <= n; i++) {

			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ans = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if(ans == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				payers.add(new Individual(name, anualIncome, healthExpenditures));
			} else if (ans == 'c'){
				System.out.print("Number of employees: ");
				Integer numberEmployees = sc.nextInt();
				payers.add(new Company(name, anualIncome, numberEmployees));
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		Double sum = 0.0;
		for(Payer p : payers) {
			System.out.println(p.getName() + ": $ " + String.format("%.2f", p.taxesPaid()));
			sum += p.taxesPaid();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
		
	}

}
