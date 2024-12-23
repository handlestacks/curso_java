package secao8.application;

import java.util.Locale;
import java.util.Scanner;

import secao8.util.CalculatorStatic;

public class CalculatorV3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = CalculatorStatic.circumference(radius);

		double v = CalculatorStatic.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CalculatorStatic.PI);

		sc.close();

	}

}
