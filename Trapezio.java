
public class Trapezio {
	
	public static void main(String[] args) {
		
		/* Altura: 5
		 * Base menor: 6
		 * Base maior: 8
		 * 
		 * Fórmula: area = (b+B)/2*h
		 * 
		 * */
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.printf("A área do trapézio é %.2f%n", area);
		
		
	}

}
