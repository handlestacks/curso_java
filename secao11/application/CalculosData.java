package secao11.application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosData {
	
	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2024-12-22");
		LocalDateTime d05 = LocalDateTime.parse("2024-12-22T10:03:00");
		Instant d06 = Instant.parse("2024-12-22T01:00:00Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(4);
		LocalDate nextYear = d04.plusYears(8);
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(4);
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
		Duration t3 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t4 = Duration.between(pastWeekInstant, d06);
		Duration t5 = Duration.between(d06, pastWeekInstant);

		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("nextYear = " + nextYear);
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDate);
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
		System.out.println("t5 dias = " + t5.toDays());
		
	}

}
