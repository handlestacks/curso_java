package secao13.entities;

public class SavingsAccountPlus extends SavingsAccount {
	
	@Override
	public void withdraw(double amount) {
		balance += amount + 2.0;
	}

}
