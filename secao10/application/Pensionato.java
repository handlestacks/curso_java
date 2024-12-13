package secao10.application;

import java.util.Locale;
import java.util.Scanner;

import secao10.entities.Rent;

public class Pensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int guests = sc.nextInt();
		sc.nextLine();
		Rent[] rent = new Rent[10];		
		int i = 1;

		while (i <= guests) {
			
			int shuffleRoom = (int) Math.round(Math.random() * 9);
			
			if (rent[shuffleRoom] == null) {
				System.out.println("Rent #" + i + ":");
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();

				rent[shuffleRoom] = new Rent(name, email);
				
				i++;
			}

		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (i = 0; i < rent.length; i++) {
			
			if(rent[i] != null) {
				
				System.out.println(i + ": " + rent[i]);
				
			}
		}

		sc.close();

	}

}
