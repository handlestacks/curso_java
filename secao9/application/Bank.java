package secao9.application;

import java.util.Locale;
import java.util.Scanner;

import secao9.utilities.Account;

public class Bank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there a initial deposit (s/n)? ");
		char depositAnswer = sc.nextLine().charAt(0);
		
		Account account;
		
		if(depositAnswer == 's' || depositAnswer == 'S') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			account = new Account(number, holder, balance);
		} else {
			account = new Account(number, holder);
		}		
		
		System.out.println("Account data: \n" + account);
		
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		
		System.out.print("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		
		sc.close();
		
	}
	
}
