package secao11.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateGlobalToLocal {
	
	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2024-12-22");
		LocalDateTime d05 = LocalDateTime.parse("2024-12-22T10:03:00");
		Instant d06 = Instant.parse("2024-12-22T01:00:00Z");

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Asia/Choibalsan"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Africa/Tripoli"));

		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 mês = " + d04.getYear());
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minuto = " + d05.getMinute());
		
		
		
	}

}
