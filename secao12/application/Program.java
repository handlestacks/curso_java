package secao12.application;

import java.util.Date;
import java.util.Scanner;

import secao12.entities.Order;
import secao12.entities.enums.OrderStatus;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Order order = new Order(1000, new Date(), OrderStatus.PENDING_PAYMENTS);
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		String status = sc.nextLine();
		OrderStatus os2 = OrderStatus.valueOf(status);

		System.out.println(os1);
		System.out.println(os2);
		
		sc.close();
		
	}

}
