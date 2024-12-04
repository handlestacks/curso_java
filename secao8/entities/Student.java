package secao8.entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public String isApproval() {
		if(finalGrade() >= 60)
			return "PASS";
		return "FAILED\n"
				+ "MISSING " 
				+ String.format("%.2f",(60 - finalGrade())) 
				+ " POINTS.";
	}
	
	public String toString() {
		return String.format("%.2f", finalGrade()) 
				+ "\n"
				+ isApproval();
	}

}
