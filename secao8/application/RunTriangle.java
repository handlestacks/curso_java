package secao8.application;

import java.util.Locale;
import java.util.Scanner;

import secao8.entities.Triangle;

public class RunTriangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		System.out.println("Larger area: " + higher(areaX, areaY));
		
		sc.close();		
		
	}
	
	public static String higher(double x, double y) {
		if(x > y) {
			return "X";
		} else {
			return "Y";
		}
	}
	
}
