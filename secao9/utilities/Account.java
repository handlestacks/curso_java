package secao9.utilities;

public class Account {

	private int number;
	private String holder;
	private double balance;

	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.deposit(balance);
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public void deposit(double value) {
		if (this.balance != 0) {
			this.balance += value;
			if (this.balance != 0)
				System.out.println("Updated account data: \n" + this.toString());
		} else {
			this.balance += value;
		}

	}

	public void withdraw(double value) {
		if (this.balance != 0) {
			this.balance -= value + 5.0;
		} else {
			this.balance -= value + 5.0;
			if (this.balance != 0)
				System.out.println("Updated account data: \n" + this.toString());
		}

	}

	public String toString() {
		return "Account " 
				+ number 
				+ ", " 
				+ "Holder: " 
				+ holder 
				+ ", " 
				+ "Balance: $ "
				+ String.format("%.2f%n", balance);
	}

}
