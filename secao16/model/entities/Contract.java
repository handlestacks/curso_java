package secao16.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private Integer number;
	private LocalDate date;
	private Double totalValue;
	private List<Installment> installments = new ArrayList<>();

	public Contract() {
	}

	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

}
