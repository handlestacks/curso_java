package secao15.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao15.model.entities.Account;

public class Bank {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter quantity: ");
		Integer quantity = sc.nextInt();
		sc.nextLine();
		List<Account> listAccount = new ArrayList<>();
		Account acc = null;

		try {
			

			for (int i = 0; i < quantity; i++) {

				System.out.print("Enter number: ");
				Integer number = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter holder: ");
				String holder = sc.nextLine();
				System.out.print("Enter CPF: ");
				String cpf = sc.nextLine();
				System.out.print("Enter date of birth (DOB): ");
				Date dateBirth = sdf.parse(sc.next());
				System.out.print("Enter balance: ");
				Double balance = sc.nextDouble();

				acc = new Account(number, holder, cpf, dateBirth, balance);

				listAccount.add(acc);
				
				System.out.println();

			}

			for (Account a : listAccount) {

				WriteFile(a);

			}

		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());

		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}
	
	public static void WriteFile(Account a) {
		String path;
		if (a.getBalance() < 10000) {
			path = "c:\\temp\\bank\\retail\\out.txt";
		} else {
			path = "c:\\temp\\bank\\premium\\out.txt";
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			bw.write(a.toString());
			bw.newLine();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
