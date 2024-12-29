package secao14.application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import secao14.model.entities.Account;
import secao14.model.exceptions.DomainException;

public class Bank {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = null;
		
		try {			
			sc = new Scanner(System.in);
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, initialBalance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			acc.withdraw(amount);
			
			System.out.println("New balance: " + acc.getBalance());
			
		} catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch(Exception e){
			System.out.println("Unexpected error.");
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
		
		
		
		
		
		
	}

}
