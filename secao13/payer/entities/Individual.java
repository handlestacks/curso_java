package secao13.payer.entities;

public class Individual extends Payer {

	private Double healthExpenditures;

	public Individual() {

	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double taxesPaid() {
		Double taxPaid = 0.0;
		Double deduction = 0.0;
		if(super.getAnualIncome() < 20000.0) {
			taxPaid = 0.15;
		} else {
			taxPaid = 0.25;
		}
		
		if(healthExpenditures > 0) {
			deduction = healthExpenditures * 0.50;
		}
		
		return getAnualIncome() * taxPaid - deduction;
	}

}
