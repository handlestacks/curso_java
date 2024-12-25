package secao12.store.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import secao12.store.entities.Client;
import secao12.store.entities.Order;
import secao12.store.entities.OrderItem;
import secao12.store.entities.Product;
import secao12.store.enums.OrderStatus;

public class Store {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();

		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

		System.out.print("How many items to this order? ");
		int quantityItems = sc.nextInt();

		for (int i = 1; i <= quantityItems; i++) {

			sc.nextLine();

			System.out.println("Enter #" + i + " data: ");
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();

			System.out.print("Product price: ");
			Double priceProduct = sc.nextDouble();

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			System.out.println();

			order.addItem(new OrderItem(quantity, priceProduct, new Product(nameProduct, priceProduct)));

		}
		
		System.out.println(order);

		sc.close();

	}

}
