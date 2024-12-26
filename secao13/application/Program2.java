package secao13.application;

import secao13.entities.Account;
import secao13.entities.BusinessAccount;
import secao13.entities.SavingsAccount;

public class Program2 {

	public static void main(String[] args) {

		Account acc1 = new Account(2001, "Brito", 1000.0);
		acc1.withdraw(200.0);		
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(3001, "Santos", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(4001, "Roger", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());

	}

}
