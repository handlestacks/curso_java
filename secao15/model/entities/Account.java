package secao15.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import secao15.model.exceptions.DomainException;

public class Account {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer number;
	private String holder;
	private String cpf;
	private Date dateBirth;
	private Double balance;

	public Account() {

	}

	public Account(Integer number, String holder, String cpf, Date dateBirth, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.cpf = cpf;
		this.dateBirth = dateBirth;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public void withdraw(Double amount) throws DomainException{
		if (amount > balance) {
			throw new DomainException("Unavailable balance");
		}
		balance -= amount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Number: " + number + "\n");
		sb.append("Holder: " + holder + "\n");
		sb.append("CPF: " + cpf + "\n");
		sb.append("Date of Birth: " + sdf.format(dateBirth) + "\n");
		sb.append("Balance: R$ " + String.format("%.2f", balance) + "\n");

		return sb.toString();
	}

}
