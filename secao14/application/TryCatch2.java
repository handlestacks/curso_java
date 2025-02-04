package secao14.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch2 {

	public static void main(String[] args) {

		method2();

		System.out.println("End of the program");

	}

	public static void method2() {

		System.out.println("********** Method2 start **********");

		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		} catch (InputMismatchException e) {
			System.out.println("Input error!");
		}

		sc.close();

		System.out.println("********** Method2 end **********");

	}

}
