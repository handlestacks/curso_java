import java.util.Locale;

public class Trapeze {

	public static void main(String[] args) {
		
		/*
		 * Trapeze
		 * 
		 * height: 5
		 * smaller base: 6
		 * larger base: 8
		 * area: (sB+lB)/2*h
		 * 
		 **/
		
		double h, sB, lB, area;
		
		h = 5.0;
		sB = 6.0;
		lB = 8.0;
		
		area = (sB+lB) / 2.0 * h;
		Locale.setDefault(Locale.US);
		System.out.printf("Trapeze area: %.2f", area);

	}

}
