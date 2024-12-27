package secao13.abstrata.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import secao13.abstrata.entities.Account;
import secao13.abstrata.entities.BusinessAccount;
import secao13.abstrata.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();

		list.add(new SavingsAccount(1001, "Roger", 500.0, 0.01));
		list.add(new BusinessAccount(2001, "Brito", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Santos", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Nego", 500.0, 500.0));

		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);

		for (Account acc : list) {
			acc.deposit(10.0);
		}

		for (Account acc : list) {
			System.out.printf("Updated balance for account: %.2f%n", acc.getBalance());
		}

	}

}
