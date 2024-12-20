package secao11.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Calendario {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2025-01-28");
		LocalDateTime d05 = LocalDateTime.parse("2025-01-10T08:00:03");
		Instant d06 = Instant.parse("2024-12-27T09:05:50Z");
		Instant d07 = Instant.parse("2024-12-27T15:06:20-03:00");
		LocalDate d08 = LocalDate.parse("27/12/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDateTime d09 = LocalDateTime.parse("27/12/2024 10:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDate d10 = LocalDate.of(2024, 12, 25);
		LocalDateTime d11 = LocalDateTime.of(2024, 12, 22, 10, 0);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
	}

}
