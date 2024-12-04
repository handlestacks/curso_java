import java.util.Locale;

public class ExercicioFixacao3 {
	
	public static void main(String[] args) {
		
		String product1 = "Iphone 16";
		String product2 = "Samsung S24 Ultra";
		String product3 = "Galaxy Z Flip6";
		String product4 = "Galaxy Z Fold6";
		
		int age = 41;
		int code = 1023;
		char gender = 'M';
		
		double price1 = 15000;
		double price2 = 8000;
		double price3 = 5000;
		double price4 = 4000;
		
		double measure = 30.1589702463;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f %n", product1, price1);
		System.out.printf("%s, which price is $ %.2f %n", product2, price2);
		System.out.printf("%s, which price is $ %.2f %n", product3, price3);
		System.out.printf("%s, which price is $ %.2f %n\n", product4, price4);
		
		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
		
		System.out.printf("Measure with eight decimal places: %.8f%n%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("US decimal point: %.3f", measure);
		
		
		
	}

}
