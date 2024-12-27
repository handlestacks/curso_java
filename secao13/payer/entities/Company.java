package secao13.payer.entities;

public class Company extends Payer {

	private Integer employee;

	public Company() {
	}

	public Company(String name, Double anualIncome, Integer employee) {
		super(name, anualIncome);
		this.employee = employee;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	@Override
	public Double taxesPaid() {
		Double taxPaid = 0.0;
		if(employee > 10) {
			taxPaid = 0.14;
		} else {
			taxPaid = 0.16;
		}
		return super.getAnualIncome() * taxPaid;
	}

}
